package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.ArbitroBean;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.projetoea.escolasfutebol.Notifications;
import com.projetoea.escolasfutebol.classesjava.*;
import com.vaadin.data.HasValue;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

@SpringView
public class GerirJogosView extends Composite implements View {

    Panel listaJogosAEsperaPanel;
    Label jogosAEsperaDadosLabel;
    Panel listaProximosJogosPanel;

    ArbitroBean arbitroBean = EscolasfutebolApplication.applicationBeansContext.getBean("ArbitroBean", ArbitroBean.class);

    public GerirJogosView() {
        VerticalLayout ht = new VerticalLayout();
        ht.setSizeFull();
        VerticalLayout leftSideVerticalLayout = new VerticalLayout();
        ht.addComponent(leftSideVerticalLayout);
        leftSideVerticalLayout.setSizeFull();
        jogosAEsperaDadosLabel = new Label("Jogos à espera de dados:");
        leftSideVerticalLayout.addComponent(jogosAEsperaDadosLabel);
        listaJogosAEsperaPanel = new Panel();
        listaJogosAEsperaPanel.setSizeFull();
        leftSideVerticalLayout.addComponent(listaJogosAEsperaPanel);
        leftSideVerticalLayout.setExpandRatio(listaJogosAEsperaPanel, 0.9f);

        VerticalLayout rightSideVerticalLayout = new VerticalLayout();
        rightSideVerticalLayout.setSizeFull();
        Label proximosJogosLabel = new Label("Próximos Jogos:");
        rightSideVerticalLayout.addComponent(proximosJogosLabel);
        listaProximosJogosPanel = new Panel();
        listaProximosJogosPanel.setSizeFull();
        rightSideVerticalLayout.addComponent(listaProximosJogosPanel);
        rightSideVerticalLayout.setExpandRatio(listaProximosJogosPanel, 0.9f);
        ht.addComponent(rightSideVerticalLayout);
        setCompositionRoot(ht);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        Jogo[] test;
        try {
            Utilizador user = getSession().getAttribute(Utilizador.class);
            test = arbitroBean.getJogosComFaltaDados(user.getArbitro());
            if (test.length== 0)
            {
                listaJogosAEsperaPanel.setContent(new Label("Não existem jogos à espera de dados"));
            }
            else {
                jogosAEsperaDadosLabel.setIcon(VaadinIcons.WARNING);
                ConstructJogosTable(test, listaJogosAEsperaPanel, "Editar");
            }
            test = arbitroBean.getProximosJogos(user.getArbitro());
            if (test.length== 0)
            {
                listaProximosJogosPanel.setContent(new Label("Não existem jogos proximos jogos"));
            }
            else {
                ConstructJogosTable(test, listaProximosJogosPanel, "+info");
            }
        } catch (PersistentException e) {
            e.printStackTrace();
            Notifications.showErrorNotification("Nao foi possivel mostrar jogos");
        }
    }

    private Jogo currentJogo;

    private void ConstructJogosTable(Jogo[] listaJogos, Panel panelInserir, String value)
    {
        VerticalLayout listaJogoTabela = new VerticalLayout();
        for (Jogo jogo: listaJogos) {
            HorizontalLayout linhaTabela = new HorizontalLayout();
            AddLinha(LocalDate.from(jogo.getData().toLocalDateTime()).toString(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(LocalTime.from(jogo.getData().toLocalDateTime()).toString(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(jogo.getEquipaCasa().getNome(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha("-", Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(jogo.getEquipaFora().getNome(), Alignment.MIDDLE_CENTER, linhaTabela);
            if(value.equals("+info"))
            {
                Button b = new Button(value);
                b.addClickListener(new Button.ClickListener() {
                    @Override
                    public void buttonClick(Button.ClickEvent clickEvent) {
                        currentJogo = jogo;
                        Window window = createInformacaoJogos();
                        getUI().addWindow(window);
                    }
                });
                linhaTabela.addComponent(b);
            }
            else
            {
                Button b = new Button(value);
                b.addClickListener(new Button.ClickListener() {
                    @Override
                    public void buttonClick(Button.ClickEvent clickEvent) {
                        currentJogo = jogo;
                        Window window = null;
                        try {
                            window = createEditJogos();
                        } catch (PersistentException e) {
                            Notifications.showErrorNotification("Erro ao criar ou editar jogos");
                            e.printStackTrace();
                        }
                        getUI().addWindow(window);
                    }
                });
                linhaTabela.addComponent(b);
            }
            listaJogoTabela.addComponent(linhaTabela);
            linhaTabela.setSizeFull();
        }
        panelInserir.setContent(listaJogoTabela);
    }

    private Window createWindow(String value){
        Window window = new Window(value);
        window.setWidth("40%");
        window.setHeight("30%");
        window.center();
        window.setModal(true);

        return window;
    }

    private Window createInformacaoJogos()
    {
        Window window = createWindow("Detalhes do Jogo");
        VerticalLayout content = new VerticalLayout();
        content.setSizeFull();
        HorizontalLayout linhaEquipasHT = new HorizontalLayout();
        linhaEquipasHT.setWidth("70%");
        Label equipaA = new Label(currentJogo.getEquipaCasa().getNome());
        linhaEquipasHT.addComponent(equipaA);
        linhaEquipasHT.setComponentAlignment(equipaA, Alignment.MIDDLE_CENTER);
        Label empty = new Label(" - ");
        linhaEquipasHT.addComponent(empty);
        linhaEquipasHT.setComponentAlignment(empty, Alignment.MIDDLE_CENTER);
        Label equipaB = new Label(currentJogo.getEquipaFora().getNome());
        linhaEquipasHT.addComponent(equipaB);
        linhaEquipasHT.setComponentAlignment(equipaB, Alignment.MIDDLE_CENTER);
        content.addComponent(linhaEquipasHT);
        content.setComponentAlignment(linhaEquipasHT, Alignment.MIDDLE_CENTER);

        HorizontalLayout linhaDetalhesJogo = new HorizontalLayout();
        linhaDetalhesJogo.setWidth("70%");

        Label dataLabel = new Label(currentJogo.getData().toString());
        linhaDetalhesJogo.addComponent(dataLabel);
        linhaDetalhesJogo.setComponentAlignment(dataLabel, Alignment.MIDDLE_CENTER);
        Label campoLabel = new Label(currentJogo.getCampo().getNome());
        linhaDetalhesJogo.addComponent(campoLabel);
        linhaDetalhesJogo.setComponentAlignment(campoLabel, Alignment.MIDDLE_CENTER);
        content.addComponent(linhaDetalhesJogo);
        content.setComponentAlignment(linhaDetalhesJogo, Alignment.MIDDLE_CENTER);
        window.setContent(content);
        return window;
    }

    Panel listaEventosPanel;
    ArrayList<Eventojogo> listaEventosArray;

    private Window createEditJogos() throws PersistentException {
        Window window = createWindow("Editar Eventos de Jogo");
        listaEventosArray = new ArrayList<>();
        HorizontalLayout content = new HorizontalLayout();
        HorizontalLayout leftSideHT = new HorizontalLayout();
        leftSideHT.setSizeFull();
        content.addComponent(leftSideHT);

        VerticalLayout listaEventos = new VerticalLayout();
        leftSideHT.addComponent(listaEventos);
        listaEventos.setSizeFull();
        Label eventosLabel = new Label("Eventos do Jogo:");
        listaEventos.addComponent(eventosLabel);

        Panel listaEventosDescricao = new Panel();
        listaEventos.addComponent(listaEventosDescricao);
        HorizontalLayout listaEventosDescricaoHT = new HorizontalLayout();
        listaEventosDescricao.setContent(listaEventosDescricaoHT);
        listaEventosDescricaoHT.setSizeFull();
        Label minutoLabel = new Label("Minuto");
        listaEventosDescricaoHT.addComponent(minutoLabel);
        listaEventosDescricaoHT.setComponentAlignment(minutoLabel, Alignment.MIDDLE_CENTER);
        Label tipoEventoLabel = new Label("Tipo Evento");
        listaEventosDescricaoHT.addComponent(tipoEventoLabel);
        listaEventosDescricaoHT.setComponentAlignment(tipoEventoLabel, Alignment.MIDDLE_CENTER);
        Label equipaLabel = new Label("Equipa");
        listaEventosDescricaoHT.addComponent(equipaLabel);
        listaEventosDescricaoHT.setComponentAlignment(equipaLabel, Alignment.MIDDLE_CENTER);
        Label numeroJogadorLabel = new Label("Nome Jogador");
        listaEventosDescricaoHT.addComponent(numeroJogadorLabel);
        listaEventosDescricaoHT.setComponentAlignment(numeroJogadorLabel, Alignment.MIDDLE_CENTER);

        listaEventosPanel = new Panel();
        listaEventosPanel.setSizeFull();
        listaEventosPanel.setContent(new Label("Ainda não existem eventos neste jogo"));
        listaEventos.addComponent(listaEventosPanel);
        listaEventos.setExpandRatio(listaEventosPanel, 1f);

        HorizontalLayout rightSideHT = new HorizontalLayout();
        content.addComponent(rightSideHT);
        rightSideHT.setSizeFull();
        VerticalLayout novoEventoVT = new VerticalLayout();
        rightSideHT.addComponent(novoEventoVT);
        Label novoEventoLabel = new Label("Novo Evento");
        novoEventoVT.addComponent(novoEventoLabel);

        HorizontalLayout linhaEquipa = new HorizontalLayout();
        Label equipaSelecionarLabel = new Label("Equipa:");
        linhaEquipa.setSizeFull();
        linhaEquipa.addComponent(equipaSelecionarLabel);
        ComboBox<Equipa> equipaComboBox = new ComboBox<>();
        linhaEquipa.addComponent(equipaComboBox);
        List<Equipa> listaEquipaArray= new ArrayList<>();
        listaEquipaArray.add(currentJogo.getEquipaCasa());
        listaEquipaArray.add(currentJogo.getEquipaFora());
        equipaComboBox.setItems(listaEquipaArray);
        equipaComboBox.setItemCaptionGenerator(Equipa::getNome);
        novoEventoVT.addComponent(linhaEquipa);

        HorizontalLayout numeroJogadorHT = new HorizontalLayout();
        numeroJogadorHT.setSizeFull();
        novoEventoVT.addComponent(numeroJogadorHT);
        Label numeroJogadorLabelNE = new Label("Nome do Jogador");
        numeroJogadorHT.addComponent(numeroJogadorLabelNE);
        ComboBox<Jogador> jogadorComboBox = new ComboBox<>();
        numeroJogadorHT.addComponent(jogadorComboBox);
        equipaComboBox.addValueChangeListener(new HasValue.ValueChangeListener<Equipa>() {
            @Override
            public void valueChange(HasValue.ValueChangeEvent<Equipa> valueChangeEvent) {
                jogadorComboBox.setItems(equipaComboBox.getValue().jogador.toArray());
                jogadorComboBox.setItemCaptionGenerator(Jogador::getNome);
            }
        });

        HorizontalLayout tipoEventoHT = new HorizontalLayout();
        tipoEventoHT.setSizeFull();
        novoEventoVT.addComponent(tipoEventoHT);
        tipoEventoHT.addComponent(new Label("Tipo de Evento:"));
        ComboBox<Tipoeventojogo> tipoeventojogoComboBox = new ComboBox<>();
        tipoEventoHT.addComponent(tipoeventojogoComboBox);
        tipoeventojogoComboBox.setItems(TipoeventojogoDAO.listTipoeventojogoByQuery(null, null));
        tipoeventojogoComboBox.setItemCaptionGenerator(Tipoeventojogo::getNome);

        HorizontalLayout minutoEventoHT = new HorizontalLayout();
        minutoEventoHT.setSizeFull();
        novoEventoVT.addComponent(minutoEventoHT);
        minutoEventoHT.addComponent(new Label("Minuto do evento"));
        TextField minutoTextField = new TextField();
        minutoEventoHT.addComponent(minutoTextField);

        Button buttonGravarEvento = new Button("Gravar evento");
        novoEventoVT.addComponent(buttonGravarEvento);
        buttonGravarEvento.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                Eventojogo eventojogo = new Eventojogo();
                eventojogo.setJogo(currentJogo);
                eventojogo.setTipoeventojogo(tipoeventojogoComboBox.getValue());
                eventojogo.setMinuto(Integer.parseInt(minutoTextField.getValue()));
                eventojogo.setJogador(jogadorComboBox.getValue());
                listaEventosArray.add(eventojogo);
                updateListaEventos();
            }
        });

        Button buttonGravarJogo = new Button("Gravar jogo");
        novoEventoVT.addComponent(buttonGravarJogo);
        buttonGravarJogo.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                try {
                    arbitroBean.setEventosJogo(listaEventosArray);
                    window.close();
                    Notifications.showSuccessNotification("Jogo gravado");
                } catch (PersistentException e) {
                    e.printStackTrace();
                }
            }
        });

        content.setExpandRatio(leftSideHT, 0.7f);
        content.setExpandRatio(rightSideHT, 0.3f);
        content.setSizeFull();
        window.setContent(content);
        window.setWidth("80%");
        window.setHeight("60%");
        return window;
    }

    private void updateListaEventos()
    {
        VerticalLayout listaEventosVT = new VerticalLayout();
        for (Eventojogo eventojogo: listaEventosArray) {
            HorizontalLayout linhaTabela = new HorizontalLayout();
            AddLinha(String.valueOf(eventojogo.getMinuto()), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(String.valueOf(eventojogo.getTipoeventojogo().getNome()), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(eventojogo.getJogador().getEquipa().getNome(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(eventojogo.getJogador().getNome(), Alignment.MIDDLE_CENTER, linhaTabela);
            listaEventosVT.addComponent(linhaTabela);
            linhaTabela.setSizeFull();
        }
        listaEventosPanel.setContent(listaEventosVT);
    }

    private void AddLinha(String value, Alignment middleCenter, HorizontalLayout hl)
    {
        Label l = new Label(value);
        hl.addComponent(l);
        hl.setComponentAlignment(l, middleCenter);
    }
}