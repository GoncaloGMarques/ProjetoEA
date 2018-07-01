package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.DiretorAssociacaoBean;
import com.projetoea.escolasfutebol.Beans.GuestBean;
import com.projetoea.escolasfutebol.classesjava.Equipa;
import com.projetoea.escolasfutebol.classesjava.Grupo;
import com.projetoea.escolasfutebol.classesjava.Rondatorneio;
import com.projetoea.escolasfutebol.classesjava.Torneio;
import com.vaadin.data.*;
import com.vaadin.event.selection.MultiSelectionEvent;
import com.vaadin.event.selection.MultiSelectionListener;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.projetoea.escolasfutebol.EscolasfutebolApplication.applicationBeansContext;
import static com.projetoea.escolasfutebol.Notifications.showErrorNotification;
import static com.projetoea.escolasfutebol.Notifications.showSuccessNotification;

@SpringView
public class GerirTorneiosView extends Composite implements View, MultiSelectionListener<Equipa> {

    private HorizontalLayout horizontalLayout;
    private VerticalLayout verticalLayoutLeft ;
    private VerticalLayout verticalLayoutRight;

    private Grid<Torneio> proximosTorneiosGrid;
    private Grid<Torneio> torneiosLiveGrid;
    private Grid<Torneio> torneiosTerminadosGrid;

    private Grid<Equipa> equipasLivresGrid; //Todas as equipas que podem entrar neste torneio

    private Panel proximosTorneiosPanel;
    private Panel torneiosLivePanel;
    private Panel torneiosTerminadosPanel;
    private Button criarTorneio;

    private DiretorAssociacaoBean diretorAssociacaoBean = applicationBeansContext.getBean(
            "DiretorAssociacaoBean",DiretorAssociacaoBean.class);
    private GuestBean gueastBean = applicationBeansContext.getBean(
            "GuestBean",GuestBean.class);

    private int pageCounter = 0;
    private List<Equipa> currentlyEditing;
    //private List<Equipa> equipasSemTorneio = null;
    private Button createTorneio;
    private Binder<Torneio> binderTorneio;


    public GerirTorneiosView() {
        horizontalLayout = new HorizontalLayout();
        horizontalLayout.setSizeFull();
        horizontalLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        verticalLayoutRight = new VerticalLayout();
        verticalLayoutLeft = new VerticalLayout();

        horizontalLayout.addComponent(verticalLayoutLeft);
        horizontalLayout.addComponent(verticalLayoutRight);

        proximosTorneiosPanel = new Panel("Proximos Torneios");
        proximosTorneiosPanel.setResponsive(true);
        proximosTorneiosPanel.setWidth(100.0f, Unit.PERCENTAGE);
        proximosTorneiosGrid = new Grid<>();
        proximosTorneiosGrid.setSizeFull();
        setGridColumns(proximosTorneiosGrid);
        proximosTorneiosPanel.setContent(proximosTorneiosGrid);

        torneiosLivePanel = new Panel("Torneios a decorrer");
        torneiosLivePanel.setSizeUndefined();
        torneiosLiveGrid = new Grid<>();
        //torneiosLiveGrid.setSizeFull();
        setGridColumns(torneiosLiveGrid);
        torneiosLivePanel.setContent(torneiosLiveGrid);

        torneiosTerminadosPanel = new Panel("Torneios terminados");
        torneiosTerminadosPanel.setSizeUndefined();
        torneiosTerminadosGrid = new Grid<>();
        //torneiosTerminadosGrid.setSizeFull();
        setGridColumns(torneiosTerminadosGrid);
        torneiosTerminadosPanel.setContent(torneiosTerminadosGrid);

        criarTorneio = new Button("Criar Torneio", VaadinIcons.PLUS);
        criarTorneio.addClickListener((Button.ClickListener) event -> {
            Window window = createWindow();
            getUI().addWindow(window);
        });

        /* TODO: Ver informacoes de um Torneio numa outra window */
        verticalLayoutLeft.addComponent(criarTorneio);
        verticalLayoutLeft.addComponent(proximosTorneiosPanel);

        verticalLayoutRight.addComponent(torneiosLivePanel);
        verticalLayoutRight.addComponent(torneiosTerminadosPanel);

        proximosTorneiosPanel.setSizeFull();
        verticalLayoutRight.setExpandRatio(torneiosLivePanel, 100.0f);
        verticalLayoutRight.setExpandRatio(torneiosTerminadosPanel, 100.0f);
        verticalLayoutLeft.setExpandRatio(proximosTorneiosPanel,100.0f);

        setCompositionRoot(horizontalLayout);
    }

    private Window createWindow() {
        Window createTorneioWindow = new Window("Criar Torneio");
        createTorneioWindow.setWidth(1000f, Unit.PIXELS);
        createTorneioWindow.setModal(true);

        Label infoLabel = new Label("INFORMACAO: Tem de ter mais de 1 equipa e o numero de equipas tem de ser par");

        equipasLivresGrid = new Grid<>("Equipas disponiveis");
        equipasLivresGrid.addColumn(Equipa::getNome).setCaption("Nome");
        equipasLivresGrid.addColumn((ValueProvider<Equipa, Object>) equipa -> equipa.getEscolas().getNome()).setCaption("Escola");
        equipasLivresGrid.addColumn((ValueProvider<Equipa, Object>) Equipa::getEscalao).setCaption("Escalao");

        Stream<Equipa> equipasStream = null;
        try {
            equipasStream = diretorAssociacaoBean.getEquipas();
        } catch (PersistentException e) {
            e.printStackTrace();
        }

        equipasLivresGrid.setItems(Objects.requireNonNull(equipasStream).collect(Collectors.toList()));
        equipasLivresGrid.setSelectionMode(Grid.SelectionMode.MULTI);
        equipasLivresGrid.asMultiSelect().addSelectionListener(this);


        HorizontalLayout mainLayout = new HorizontalLayout();
        VerticalLayout verticalLayout = new VerticalLayout();
        VerticalLayout leftVerticalLayout = new VerticalLayout();
        HorizontalLayout horizontalLayout = new HorizontalLayout();

        verticalLayout.addComponent(infoLabel);

        Label torneioHeader = new Label("Torneio");
        torneioHeader.setIcon(VaadinIcons.TROPHY);
        torneioHeader.setStyleName("v-header-label");

        createTorneio = new Button("Criar Torneio");

        binderTorneio = new Binder<>();
        binderTorneio.addStatusChangeListener((StatusChangeListener)
                event -> createTorneio.setEnabled(event.getBinder().isValid()));

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
                .withValidator((Validator<LocalDateTime>) (value, context) -> {
                    if(value.isBefore(LocalDateTime.now()))
                        return ValidationResult.error("Data deve ser depois de hoje");
                    if(value.isBefore(dateTimeFieldInicio.getValue()))
                        return ValidationResult.error("Data deve ser depois da data de inicio");
                    else return ValidationResult.ok();
                })
                .bind(torneio -> {
                            if(torneio.getDatafim() == null) return null;
                            return torneio.getDatafim().toLocalDateTime();
                        },
                        (torneio, localDateTime) -> torneio.setDatafim(Timestamp.valueOf(localDateTime)));


        //createError = new Label(null);
        //createError.setStyleName("v-error-label");
       createTorneio.addClickListener(event -> {
            try {
                Torneio torneio = binderTorneio.getBean();

                //Criar Torneio
                Torneio newTorneio = diretorAssociacaoBean.criarTorneio(torneio.getNome(), torneio.getDatainicio(), torneio.getDatafim());

                //Criar Grupo
                Grupo grupoTorneio = diretorAssociacaoBean.criarGrupoTorneio("Grupo0", newTorneio);

                //Adicionar equipas ao torneio
                //TODO: Todas as equipas ficam no mesmo Grupo
                currentlyEditing.forEach(equipa -> {
                    try {
                        diretorAssociacaoBean.adicionarEquipasToTorneio(equipa, grupoTorneio, newTorneio);
                    } catch (PersistentException e) {
                        showErrorNotification("Erro ao criar o Torneio! Tente de novo");
                        e.printStackTrace();
                    }
                });

                //Criar Rondas dependendo das equipas
                Rondatorneio rondatorneio = diretorAssociacaoBean.criarRondaTorneio(currentlyEditing.size(), newTorneio);

                for (int i = 0; i < currentlyEditing.size(); i+=2) {
                    diretorAssociacaoBean.criarJogosRonda(
                            newTorneio.getDatainicio().toLocalDateTime().plus(1, ChronoUnit.DAYS),
                            currentlyEditing.get(i), currentlyEditing.get(i + 1), rondatorneio);
                }
                showSuccessNotification("Torneio criado com sucesso");
            } catch (PersistentException e) {
                showErrorNotification("Erro ao criar o Torneio! Tente de novo");
                e.printStackTrace();
            }
            createTorneioWindow.close();
        });
        createTorneio.setEnabled(false);
        binderTorneio.addStatusChangeListener(event -> {
            createTorneio.setEnabled(binderTorneio.isValid());
        });
        ///////////////
        //CENAS TORNEIO
        //////////////


        ///////////////
        //CENAS EQUIPAS
        ///////////////
        HorizontalLayout panelPageSelector = new HorizontalLayout();

        Panel teamsPanel = new Panel();
        VerticalLayout panelVerticalLayout = new VerticalLayout();
        panelVerticalLayout.setSizeFull();
        teamsPanel.setContent(panelVerticalLayout);
        teamsPanel.setSizeFull();

        teamsPanel.setContent(equipasLivresGrid);

        //////////////
        //CENAS EQUIPAS
        /////////////
        verticalLayout.addComponent(torneioHeader);
        verticalLayout.addComponent(nomeTorneioField);
        verticalLayout.addComponent(dateTimeFieldInicio);
        verticalLayout.addComponent(dateTimeFieldFim);

        horizontalLayout.addComponents(createTorneio);

        verticalLayout.addComponent(horizontalLayout);

        leftVerticalLayout.addComponent(teamsPanel);

        leftVerticalLayout.addComponent(panelPageSelector);

        mainLayout.addComponent(leftVerticalLayout);
        mainLayout.addComponent(verticalLayout); //Este e o Right Vertical Layout

        createTorneioWindow.setContent(mainLayout);
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

    @Override
    public void selectionChange(MultiSelectionEvent<Equipa> event) {
        currentlyEditing = new ArrayList<>(event.getAllSelectedItems());
        createTorneio.setEnabled(!(currentlyEditing.size() <= 1) && (currentlyEditing.size() % 2 == 0) && binderTorneio.isValid());
    }
}
