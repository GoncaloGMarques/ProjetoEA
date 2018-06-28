package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.DiretorAssociacaoBean;
import com.projetoea.escolasfutebol.Beans.GuestBean;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.projetoea.escolasfutebol.classesjava.Equipa;
import com.projetoea.escolasfutebol.classesjava.Torneio;
import com.projetoea.escolasfutebol.classesjava.TorneioDAO;
import com.vaadin.data.*;
import com.vaadin.data.validator.DateTimeRangeValidator;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.*;
import com.vaadin.shared.ui.window.WindowMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import javax.swing.text.LabelView;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.EventObject;
import java.util.List;

import static com.projetoea.escolasfutebol.EscolasfutebolApplication.*;

@SpringView
public class GerirTorneiosView extends Composite implements View {

    private HorizontalLayout horizontalLayout;
    private VerticalLayout verticalLayoutLeft ;
    private VerticalLayout verticalLayoutRight;

    private Grid<Torneio> proximosTorneiosGrid;
    private Grid<Torneio> torneiosLiveGrid;
    private Grid<Torneio> torneiosTerminadosGrid;

    private Grid<Equipa> equipasLivres; //Todas as equipas que podem entrar neste torneio
    private Grid<Equipa> equipasNoTorneio; //Estas equipas estao no torneio que esta a ser criado agora

    private Panel proximosTorneiosPanel;
    private Panel torneiosLivePanel;
    private Panel torneiosTerminadosPanel;
    private Label createError;

    private Button criarTorneio;

    private DiretorAssociacaoBean diretorAssociacaoBean = applicationBeansContext.getBean(
            "DiretorAssociacaoBean",DiretorAssociacaoBean.class);

    public GerirTorneiosView() {
        horizontalLayout = new HorizontalLayout();
        horizontalLayout.setSizeFull();
        horizontalLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        verticalLayoutRight = new VerticalLayout();
        verticalLayoutLeft = new VerticalLayout();

        horizontalLayout.addComponent(verticalLayoutLeft);
        horizontalLayout.addComponent(verticalLayoutRight);

        proximosTorneiosPanel = new Panel("Proximos Torneios");
        proximosTorneiosPanel.setSizeUndefined();
        proximosTorneiosGrid = new Grid<>();
        proximosTorneiosGrid.setSizeFull();
        setGridColumns(proximosTorneiosGrid);
        proximosTorneiosPanel.setContent(proximosTorneiosGrid);

        torneiosLivePanel = new Panel("Torneios a decorrer");
        torneiosLivePanel.setSizeUndefined();
        torneiosLiveGrid = new Grid<>();
        torneiosLiveGrid.setSizeFull();
        setGridColumns(torneiosLiveGrid);
        torneiosLivePanel.setContent(torneiosLiveGrid);

        torneiosTerminadosPanel = new Panel("Torneios terminados");
        torneiosTerminadosPanel.setSizeUndefined();
        torneiosTerminadosGrid = new Grid<>();
        torneiosTerminadosGrid.setSizeFull();
        setGridColumns(torneiosTerminadosGrid);
        torneiosTerminadosPanel.setContent(torneiosTerminadosGrid);

        criarTorneio = new Button("Criar Torneio", VaadinIcons.PLUS);
        criarTorneio.addClickListener((Button.ClickListener) event -> {
            getUI().getUI().addWindow(createWindow());
        });

        /*
        TODO: Ver informacoes de um Campeonato numa outra window
        */
        verticalLayoutLeft.addComponent(criarTorneio);
        verticalLayoutLeft.addComponent(proximosTorneiosPanel);

        verticalLayoutRight.addComponent(torneiosLivePanel);
        verticalLayoutRight.addComponent(torneiosTerminadosPanel);

        setCompositionRoot(horizontalLayout);
    }


    private Window createWindow() {
        Window createTorneioWindow = new Window("Criar Torneio");
        createTorneioWindow.setWidth(500f, Unit.PIXELS);
        createTorneioWindow.setModal(true);
        createTorneioWindow.center();

        VerticalLayout verticalLayout = new VerticalLayout();
        HorizontalLayout horizontalLayout = new HorizontalLayout();

        Label torneioHeader = new Label("Torneio");
        torneioHeader.setIcon(VaadinIcons.TROPHY);
        torneioHeader.setStyleName("v-header-label");

        Binder<Torneio> binderTorneio = new Binder<>();

        //Nome
        TextField nomeTorneioField = new TextField("Nome");
        nomeTorneioField.setPlaceholder("Torneio00");

        //DataInicio
        DateTimeField dateTimeFieldInicio = new DateTimeField("Data Inicio");
        dateTimeFieldInicio.setValue(LocalDateTime.now());

        //Data fim
        DateTimeField dateTimeFieldFim = new DateTimeField("Data Fim");


        binderTorneio.setBean(new Torneio());

        ///////////////
        //CENAS TORNEIO
        //////////////
        binderTorneio.forField(nomeTorneioField)
                .asRequired("Nome tem de ser preenchido")
                .bind(Torneio::getNome, Torneio::setNome);

        binderTorneio.forField(dateTimeFieldInicio)
                .asRequired("Tem de ser inidicada uma data para o Inicio do Evento")
                .bind(torneio -> {
                            if(torneio.getDatainicio() == null) return null;
                            return torneio.getDatainicio().toLocalDateTime();
                        },
                        (torneio, value) -> torneio.setDatainicio(Timestamp.valueOf(value)));

        binderTorneio.forField(dateTimeFieldFim)
                .asRequired("Tem de ser inidicada uma data para o Fim do Evento")
                .bind(torneio -> {
                            if(torneio.getDatafim() == null) return null;
                            return torneio.getDatafim().toLocalDateTime();
                        },
                        (torneio, localDateTime) -> torneio.setDatafim(Timestamp.valueOf(localDateTime)));

        binderTorneio.withValidator(Validator.from((SerializablePredicate<Torneio>)
                torneio ->
                !torneio.getDatainicio().after(torneio.getDatainicio())
                        && !torneio.getDatainicio().equals(torneio.getDatafim()),
                "Data inicio tem de ser apos a de Fim"));

        createError = new Label(null);
        createError.setStyleName("v-error-label");
        Button createTorneio = new Button("Criar Torneio", event -> {
            try {
                Torneio torneio = binderTorneio.getBean();
                diretorAssociacaoBean.criarTorneio(torneio.getNome(), torneio.getDatainicio(), torneio.getDatafim());
            } catch (PersistentException e) {
                createError.setValue("Erro ao criar o Torneio! Tente de novo");
                e.printStackTrace();
            }
        });
        createTorneio.setEnabled(false);
        binderTorneio.addStatusChangeListener(event -> createTorneio.setEnabled(binderTorneio.isValid()));
        ///////////////
        //CENAS TORNEIO
        //////////////


        //////////////
        //CENAS EQUIPAS
        /////////////

        /*
          TODO: Criar duas tabelas SIDE by SIDE para por as equipas no Torneio
          TODO: Carregar as equipas que podem participar em Torneios pode ser necessario (Se forem muitas equipas)
                handle that shit
        */
        //////////////
        //CENAS EQUIPAS
        /////////////
        verticalLayout.addComponent(torneioHeader);
        verticalLayout.addComponent(nomeTorneioField);
        verticalLayout.addComponent(dateTimeFieldInicio);
        verticalLayout.addComponent(dateTimeFieldFim);
        horizontalLayout.addComponents(createTorneio,createError);
        verticalLayout.addComponent(horizontalLayout);

        createTorneioWindow.setContent(verticalLayout);
        return createTorneioWindow;
    }

    private void setGridColumns(Grid<Torneio> grid){
        grid.addColumn(Torneio::getNome).setCaption("Nome");
        grid.addColumn(Torneio::getDatainicio).setCaption("Data Inicio");
        grid.addColumn(Torneio::getDatafim).setCaption("Data Fim");
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        GuestBean guestBean = applicationBeansContext.getBean("GuestBean", GuestBean.class);
        DiretorAssociacaoBean diretorAssociacaoBean = applicationBeansContext.getBean("DiretorAssociacaoBean",
                DiretorAssociacaoBean.class);

        List<Torneio> torneiosEmJogo;
        List<Torneio> torneiosTerminados;
        List<Torneio> futurosTorneios;
        try {
            torneiosEmJogo = Arrays.asList(guestBean.getTorneiosEmJogo());
            torneiosTerminados = Arrays.asList(guestBean.getTorneiosTerminados());
            futurosTorneios = Arrays.asList(diretorAssociacaoBean.getFuturosTorneios());

            proximosTorneiosGrid.setItems(futurosTorneios);
            torneiosLiveGrid.setItems(torneiosEmJogo);
            torneiosTerminadosGrid.setItems(torneiosTerminados);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }
}
