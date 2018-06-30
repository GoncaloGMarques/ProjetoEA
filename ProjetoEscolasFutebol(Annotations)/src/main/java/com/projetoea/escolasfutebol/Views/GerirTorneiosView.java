package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.DiretorAssociacaoBean;
import com.projetoea.escolasfutebol.Beans.GuestBean;
import com.projetoea.escolasfutebol.classesjava.*;
import com.vaadin.data.Binder;
import com.vaadin.data.Validator;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.SerializablePredicate;
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

import static com.projetoea.escolasfutebol.EscolasfutebolApplication.applicationBeansContext;

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
    private GuestBean gueastBean = applicationBeansContext.getBean(
            "GuestBean",GuestBean.class);

    private int pageCounter = 0;
    private List<Equipa> equipasEscolhidas = new ArrayList<>();
    private List<Equipa> equipasSemTorneio = null;

    public GerirTorneiosView() {
        horizontalLayout = new HorizontalLayout();
        horizontalLayout.setSizeFull();
        horizontalLayout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);

        verticalLayoutRight = new VerticalLayout();
        verticalLayoutLeft = new VerticalLayout();

        horizontalLayout.addComponent(verticalLayoutLeft);
        horizontalLayout.addComponent(verticalLayoutRight);

        proximosTorneiosPanel = new Panel("Proximos Torneios");
        proximosTorneiosGrid = new Grid<>();
        //proximosTorneiosGrid.setSizeFull();
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
            getUI().getUI().addWindow(createWindow());
        });

        /*
        TODO: Ver informacoes de um Campeonato numa outra window
        */
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
        createTorneioWindow.center();

        HorizontalLayout mainLayout = new HorizontalLayout();
        VerticalLayout verticalLayout = new VerticalLayout();
        VerticalLayout leftVerticalLayout = new VerticalLayout();
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

                //Criar Torneio
                Torneio newTorneio = diretorAssociacaoBean.criarTorneio(torneio.getNome(), torneio.getDatainicio(), torneio.getDatafim());

                //Criar Grupo
                Grupo grupoTorneio = diretorAssociacaoBean.criarGrupoTorneio("Grupo0", newTorneio);

                //Adicionar equipas ao torneio
                //TODO: Todas as equipas ficam no mesmo Grupo
                equipasEscolhidas.forEach(equipa -> {
                    try {
                        diretorAssociacaoBean.adicionarEquipasToTorneio(equipa, grupoTorneio, newTorneio);
                    } catch (PersistentException e) {
                        e.printStackTrace();
                    }
                });

                //Criar Rondas dependendo das equipas
                Rondatorneio rondatorneio = diretorAssociacaoBean.criarRondaTorneio(equipasEscolhidas.size(), newTorneio);

                for (int i = 0; i < equipasEscolhidas.size(); i+=2) {
                    diretorAssociacaoBean.criarJogosRonda(
                            newTorneio.getDatainicio().toLocalDateTime().plus(1, ChronoUnit.DAYS),
                            equipasEscolhidas.get(i), equipasEscolhidas.get(i + 1), rondatorneio);
                }

            } catch (PersistentException e) {
                createError.setValue("Erro ao criar o Torneio! Tente de novo");
                e.printStackTrace();
            }
            createTorneioWindow.close();
        });
        createTorneio.setEnabled(false);
        binderTorneio.addStatusChangeListener(event -> createTorneio.setEnabled(binderTorneio.isValid()));
        ///////////////
        //CENAS TORNEIO
        //////////////


        //////////////
        //CENAS EQUIPAS
        /////////////

        HorizontalLayout panelPageSelector = new HorizontalLayout();

        Panel teamsPanel = new Panel();
        VerticalLayout panelVerticalLayout = new VerticalLayout();
        panelVerticalLayout.setSizeFull();
        teamsPanel.setContent(panelVerticalLayout);
        teamsPanel.setSizeFull();

        Label pageLabel = new Label();
        pageLabel.setValue(String.valueOf(pageCounter));
        Button advance = new Button(null, VaadinIcons.ARROW_RIGHT);
        Button back = new Button(null, VaadinIcons.ARROW_LEFT);
        advance.addClickListener(onClick -> {
            pageCounter += 1;
            pageLabel.setValue(String.valueOf(pageCounter));
            equipasSemTorneio.clear();
            try {
                equipasSemTorneio = diretorAssociacaoBean.getEquipasSemTorneio(pageCounter, 20);
                if(equipasSemTorneio.size() < 10) {
                    advance.setEnabled(false);
                    back.setEnabled(true);
                }
            } catch (PersistentException e) {
                e.printStackTrace();
            }
            updateGrid(panelVerticalLayout);
        });
        back.addClickListener(onClick -> {
            pageCounter -= 1;
            pageLabel.setValue(String.valueOf(pageCounter));
            equipasSemTorneio.clear();
            try {
                equipasSemTorneio = diretorAssociacaoBean.getEquipasSemTorneio(pageCounter, 20);
                if(pageCounter == 0){
                    back.setEnabled(false);
                    advance.setEnabled(true);
                }
            } catch (PersistentException e) {
                e.printStackTrace();
            }
            updateGrid(panelVerticalLayout);
        });

        panelPageSelector.addComponent(back);
        panelPageSelector.addComponent(pageLabel);
        panelPageSelector.addComponent(advance);

        try {
            equipasSemTorneio = diretorAssociacaoBean.getEquipasSemTorneio(pageCounter, 20);
        } catch (PersistentException e) {
            e.printStackTrace();
        }

        if(pageCounter == 0) {
            back.setEnabled(false);
        }

        if(equipasSemTorneio.size() < 10) {
            advance.setEnabled(false);
        }

        updateGrid(panelVerticalLayout);

        //////////////
        //CENAS EQUIPAS
        /////////////
        verticalLayout.addComponent(torneioHeader);
        verticalLayout.addComponent(nomeTorneioField);
        verticalLayout.addComponent(dateTimeFieldInicio);
        verticalLayout.addComponent(dateTimeFieldFim);

        horizontalLayout.addComponents(createTorneio,createError);

        verticalLayout.addComponent(horizontalLayout);

        leftVerticalLayout.addComponent(teamsPanel);

        leftVerticalLayout.addComponent(panelPageSelector);

        mainLayout.addComponent(leftVerticalLayout);
        mainLayout.addComponent(verticalLayout); //Este e o Right Vertical Layout

        createTorneioWindow.setContent(mainLayout);
        return createTorneioWindow;
    }

    private void updateGrid(Layout panelLayout){
        panelLayout.removeAllComponents();
        Objects.requireNonNull(equipasSemTorneio).forEach(e -> {
            if(equipasSemTorneio.indexOf(e) >= 10) return;
            HorizontalLayout itemHorizontalLayout = new HorizontalLayout();

            CheckBox boxLinha = new CheckBox(null, false);
            if(equipasEscolhidas
                    .stream()
                    .anyMatch(equipa -> equipa.getID() == e.getID())){
                boxLinha.setValue(true);
            }


            boxLinha.addValueChangeListener(checked -> {

                //TODO: Review this
                //Criar um novo objeto de equipa para
                //prevenir que ao limpar a lista de equipas
                //sem torneio seja apagada tbem a lista de equipas escolhidas
                Equipa equipa = new Equipa();
                equipa.setCampo(e.getCampo());
                equipa.setEscalao(e.getEscalao());
                equipa.setEscolas(e.getEscolas());
                equipa.setNome(e.getNome());
                equipa.setID(e.getID());
                if(checked.getValue()) {
                    equipasEscolhidas.add(equipa);
                }
                else equipasEscolhidas.removeIf(iterEquipa -> iterEquipa.getID() == equipa.getID());
            });

            addComponentLinha(boxLinha, itemHorizontalLayout);
            addLinha(e.getNome(), itemHorizontalLayout);
            addLinha(e.getEscolas().getNome(), itemHorizontalLayout);
            //panelVerticalLayout
            panelLayout.addComponent(itemHorizontalLayout);
            itemHorizontalLayout.setSizeFull();
        });
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

    private void addComponentLinha(Component component, HorizontalLayout hl){
        hl.addComponent(component);
        hl.setComponentAlignment(component, Alignment.MIDDLE_CENTER);
    }

    private void addLinha(String value, HorizontalLayout hl)
    {
        Label l = new Label(value);
        hl.addComponent(l);
        hl.setComponentAlignment(l, Alignment.MIDDLE_CENTER);
    }
}
