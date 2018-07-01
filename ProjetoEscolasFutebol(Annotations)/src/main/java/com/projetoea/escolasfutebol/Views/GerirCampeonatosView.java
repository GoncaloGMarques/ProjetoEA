package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.AppConfig;
import com.projetoea.escolasfutebol.Beans.DiretorAssociacaoBean;
import com.projetoea.escolasfutebol.Beans.GuestBean;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.projetoea.escolasfutebol.Notifications;
import com.projetoea.escolasfutebol.classesjava.Campeonato;
import com.projetoea.escolasfutebol.classesjava.Equipa;
import com.projetoea.escolasfutebol.classesjava.Rondacampeonato;
import com.vaadin.data.*;
import com.vaadin.event.selection.MultiSelectionEvent;
import com.vaadin.event.selection.MultiSelectionListener;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import com.vaadin.ui.Button.ClickListener;
import org.orm.PersistentException;

import javax.xml.soap.Text;
import java.lang.ref.Reference;
import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.projetoea.escolasfutebol.EscolasfutebolApplication.applicationBeansContext;
import static com.projetoea.escolasfutebol.EscolasfutebolApplication.main;

@SpringView
public class GerirCampeonatosView extends Composite implements View, MultiSelectionListener<Equipa> {

    private DiretorAssociacaoBean diretorAssociacaoBean = applicationBeansContext.getBean("DiretorAssociacaoBean",
            DiretorAssociacaoBean.class);
    private GuestBean guestBean = applicationBeansContext.getBean("GuestBean", GuestBean.class);

    private VerticalLayout mainVerticalLayout = new VerticalLayout();
    private Button criarCampeonatoUpper;
    private Button criarCampeonatoDown;
    private Panel mainPanel;

    private Set<Equipa> currentlyEditing;
    private Window criarCampeonatoWindow;

    private Grid<Campeonato> campeonatos;

    private ClickListener criarCampeonatoOnClick = (ClickListener) event -> {
        criarCampeonatoWindow = getCriarCampeonatoWindow();
        UI.getCurrent().addWindow(criarCampeonatoWindow);
    };

    private Label generalErrorLabel = new Label(null);
    private Label generalWarningLabel = new Label(null);
    private Label generalSuccessLabel = new Label(null);

    private Label windowGeneralErrorLabel = new Label(null);
    private Label windowGeneralWarningLabel = new Label(null);
    private Label windowGeneralSuccessLabel = new Label(null);

    private Binder<Campeonato> binderCampeonato;
    private Button criarGravarCampeonato;
    private Label teamSelectionNotValid;
    private Grid<Equipa> equipas; //Equipas escolhidas para o campeonato

    public GerirCampeonatosView() {
        mainPanel = new Panel("Campeonatos");
        mainVerticalLayout.setSizeFull();
        mainPanel.setSizeFull();

        generalErrorLabel.setStyleName("v-error-label");
        generalWarningLabel.setStyleName("v-warning-label");
        generalSuccessLabel.setStyleName("v-success-label");

        criarCampeonatoUpper = new Button("Criar Campeonato", VaadinIcons.PLUS);
        criarCampeonatoDown = new Button("Criar Campeonato", VaadinIcons.PLUS);

        criarCampeonatoUpper.addClickListener(criarCampeonatoOnClick);
        criarCampeonatoDown.addClickListener(criarCampeonatoOnClick);

        campeonatos = new Grid<>();
        campeonatos.setSelectionMode(Grid.SelectionMode.NONE);
        campeonatos.setSizeFull();
        campeonatos.addColumn(Campeonato::getNome).setCaption("Nome Campeonato");
        campeonatos.addColumn((ValueProvider<Campeonato, Integer>)
                campeonato -> campeonato.participantecampeonato.getCollection().size()).setCaption("Numero Equipas");

        mainVerticalLayout.addComponent(generalErrorLabel);
        mainVerticalLayout.addComponent(generalWarningLabel);
        mainVerticalLayout.addComponent(generalSuccessLabel);

        VerticalLayout panelVerticalLayout = new VerticalLayout();
        panelVerticalLayout.addComponent(campeonatos);
        mainPanel.setContent(panelVerticalLayout);

        mainVerticalLayout.addComponent(criarCampeonatoUpper);
        mainVerticalLayout.addComponent(mainPanel);
        mainVerticalLayout.addComponent(criarCampeonatoDown);

        mainVerticalLayout.setExpandRatio(mainPanel,100.0f);
        setCompositionRoot(mainVerticalLayout);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        try {
            List<Campeonato> campeonatosList = guestBean.getCampeonatos();
            campeonatos.setItems(campeonatosList);
        } catch (PersistentException e) {
            e.printStackTrace();
            generalErrorLabel.setValue("Nao foi possivel carregar os campeonatos");
        }
    }

    private Window getCriarCampeonatoWindow() {
        currentlyEditing = new HashSet<>();
        Window criarCampeonatoWindow = new Window("Criar Campeonato");
        criarCampeonatoWindow.center();
        criarCampeonatoWindow.setModal(true);

        windowGeneralErrorLabel.setStyleName("v-error-label");
        windowGeneralWarningLabel.setStyleName("v-warning-label");
        windowGeneralSuccessLabel.setStyleName("v-success-label");

        HorizontalLayout mainVerticalLayout = new HorizontalLayout();
        VerticalLayout mainLeftVerticalLayout = new VerticalLayout();
        VerticalLayout mainRightVerticalLayout = new VerticalLayout();
        mainVerticalLayout.addComponents(mainLeftVerticalLayout, mainRightVerticalLayout);

        binderCampeonato = new Binder<>();
        binderCampeonato.setBean(new Campeonato());

        mainLeftVerticalLayout = (VerticalLayout) createLeftLayout(mainLeftVerticalLayout);
        mainRightVerticalLayout = (VerticalLayout) createRightLayout(mainRightVerticalLayout);

        mainVerticalLayout.addComponent(mainLeftVerticalLayout);
        mainVerticalLayout.addComponent(mainRightVerticalLayout);

        criarCampeonatoWindow.setContent(mainVerticalLayout);

        return criarCampeonatoWindow;
    }

    //TODO://////////////////////
    //TODO: LEFT VERTICAL STUFF//
    //TODO://////////////////////
    private Layout createLeftLayout(VerticalLayout verticalLeftLayout){

        teamSelectionNotValid = new Label(null);
        teamSelectionNotValid.setStyleName("v-error-label");
        teamSelectionNotValid.setVisible(false);

        windowGeneralSuccessLabel.setVisible(false);
        windowGeneralErrorLabel.setVisible(false);
        windowGeneralWarningLabel.setVisible(false);

        Stream<Equipa> equipasStream = null;
        try {
            equipasStream = diretorAssociacaoBean.getEquipas();
        } catch (PersistentException e) {
            e.printStackTrace();
        }

        equipas = new Grid<>("Equipas para o Campeonato");
        equipas.setSelectionMode(Grid.SelectionMode.MULTI);

        equipas.setItems(Objects.requireNonNull(equipasStream).collect(Collectors.toList()));

        equipas.addColumn(Equipa::getNome).setCaption("Nome Equipa");
        equipas.addColumn(Equipa::getEscolas).setCaption("Escola");
        equipas.asMultiSelect().addSelectionListener(this);

        verticalLeftLayout.addComponents(
                windowGeneralErrorLabel,
                windowGeneralWarningLabel,
                windowGeneralSuccessLabel,
                teamSelectionNotValid,
                equipas);

        return verticalLeftLayout;
    }
    //TODO://////////////////////
    //TODO: LEFT VERTICAL STUFF//
    //TODO://////////////////////



    //TODO:///////////////////////
    //TODO: RIGHT VERTICAL STUFF//
    //TODO:///////////////////////
    private Layout createRightLayout(VerticalLayout verticalRightLayout){

        TextField nomeCampeonatoField = new TextField("Nome Campeonato");
        verticalRightLayout.addComponent(nomeCampeonatoField);

        criarGravarCampeonato = new Button("Gravar / Criar Campeonato");
        criarGravarCampeonato.setEnabled(false);
        criarGravarCampeonato.addClickListener(onClick -> {

            Notification.show("Pode levar algum tempo a executar esta operacao", Notification.Type.TRAY_NOTIFICATION);

            //Data base stuff
            try {
                //Nao permitir fechar a window
                criarCampeonatoWindow.setClosable(false);

                Campeonato campeonato = diretorAssociacaoBean.criarCampeonato(nomeCampeonatoField.getValue());
                diretorAssociacaoBean.criarParticipantes(campeonato, currentlyEditing);
                Rondacampeonato rondacampeonato = diretorAssociacaoBean.criarRondaCampeonato(campeonato);
                diretorAssociacaoBean.criarJogosCampeonato(new ArrayList<>(currentlyEditing), rondacampeonato);

                //Sucesso
                Notifications.showSuccessNotification("Campeonato criado com sucesso");
                criarGravarCampeonato.setEnabled(false);

                criarCampeonatoWindow.setClosable(true);
            } catch (PersistentException e) {
                e.printStackTrace();
                criarCampeonatoWindow.close();
                Notifications.showErrorNotification("Erro ao criar Campeonato (Tente de novo)");
            }
        });

        Objects.requireNonNull(binderCampeonato).forField(nomeCampeonatoField)
                .asRequired("O nome tem de ser preenchido")
                .bind(Campeonato::getNome, Campeonato::setNome);

        verticalRightLayout.addComponent(criarGravarCampeonato);

        return verticalRightLayout;
    }
    //TODO:///////////////////////
    //TODO: RIGHT VERTICAL STUFF//
    //TODO:///////////////////////


    @Override
    public void selectionChange(MultiSelectionEvent<Equipa> event) {
        currentlyEditing = event.getAllSelectedItems();
        if(currentlyEditing.size() % 2 == 0) {
            criarGravarCampeonato.setEnabled(true);
            teamSelectionNotValid.setValue(null);
            teamSelectionNotValid.setVisible(false);
        } else {
            teamSelectionNotValid.setValue("Tem de ter um numero PAR de equipas selecionadas");
            criarGravarCampeonato.setEnabled(false);
            teamSelectionNotValid.setVisible(true);
        }
    }
}
