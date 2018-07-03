package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.DiretorEscolaBean;
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

import java.util.ArrayList;
import java.util.Arrays;

@SpringView
public class GerirEquipasView extends Composite implements View {
    Panel listaEquipasPanel;

    public GerirEquipasView() {
        VerticalLayout vt = new VerticalLayout();
        HorizontalLayout ht = new HorizontalLayout();
        ht.addComponent(new Label("Lista de equipas"));
        Button b =new Button("", VaadinIcons.PLUS);
        b.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                Window window = createEquipaWindow();
                jogadoresAdicionar = new ArrayList<>();
                jogadoresRemover = new ArrayList<>();
                jogadorNaEquipaArray = new ArrayList<>();
                jogadorsDisponiveisArray = new ArrayList<>();
                getUI().getUI().addWindow(window);
            }
        });
        ht.addComponent(b);
        listaEquipasPanel = new Panel();
        vt.addComponent(ht);
        vt.addComponent(listaEquipasPanel);
        setCompositionRoot(vt);
    }

    Equipa[] arrayEquipas;

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        DiretorEscolaBean diretorEscolaBean = EscolasfutebolApplication.applicationBeansContext.getBean("DiretorEscolaBean", DiretorEscolaBean.class);
        try {
            Utilizador user = getSession().getAttribute(Utilizador.class);
            arrayEquipas = diretorEscolaBean.getEquipasDeEscola(EscolasDAO.getEscolasByORMID(UtilizadorDAO.loadUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()).getORMID());
            ConstructEquipasTable(arrayEquipas);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    private void ConstructEquipasTable(Equipa[] listaEquipa)
    {
        VerticalLayout listaJogoTabela = new VerticalLayout();
        for (Equipa equipa: listaEquipa) {
            HorizontalLayout linhaTabela = new HorizontalLayout();
            AddLinha(equipa.getNome(), Alignment.MIDDLE_LEFT, linhaTabela);
            Button l = new Button("Edit");
            l.addClickListener(new Button.ClickListener() {
                @Override
                public void buttonClick(Button.ClickEvent clickEvent) {
                    Window window = editWindow(equipa);
                    jogadoresAdicionar = new ArrayList<>();
                    jogadoresRemover = new ArrayList<>();
                    jogadorNaEquipaArray = new ArrayList<>();
                    jogadorsDisponiveisArray = new ArrayList<>();
                    getUI().getUI().addWindow(window);
                }
            });
            linhaTabela.addComponent(l);
            linhaTabela.setComponentAlignment(l, Alignment.MIDDLE_RIGHT);
            listaJogoTabela.addComponent(linhaTabela);
            linhaTabela.setSizeFull();
        }
        listaEquipasPanel.setContent(listaJogoTabela);
    }

    private void AddLinha(String value, Alignment middleCenter, HorizontalLayout hl)
    {
        Label l = new Label(value);
        hl.addComponent(l);
        hl.setComponentAlignment(l, middleCenter);
    }

    private Window createWindow(String value){
        Window window = new Window(value);
        window.setWidth("50%");
        window.setHeight("50%");
        window.center();
        window.setModal(true);

        HorizontalLayout content = new HorizontalLayout();
        content.setMargin(true);
        window.setContent(content);

        return window;
    }

    ArrayList<Jogador> jogadoresAdicionar = new ArrayList<>();
    ArrayList<Jogador> jogadoresRemover = new ArrayList<>();
    ArrayList<Jogador> jogadorNaEquipaArray = new ArrayList<>();
    ArrayList<Jogador> jogadorsDisponiveisArray = new ArrayList<>();


    private Window editWindow(Equipa equipa)
    {
        Window window = createWindow("Editar Equipa");
        HorizontalLayout content = (HorizontalLayout) window.getContent();
        content.setSizeFull();
        VerticalLayout leftSideVerticalLayout = new VerticalLayout();
        leftSideVerticalLayout.setSizeFull();
        content.addComponent(leftSideVerticalLayout);
        Label nomeEquipaLabel = new Label(equipa.getNome());
        leftSideVerticalLayout.addComponent(nomeEquipaLabel);
        Label jogadoresJaNaEquipa = new Label("Jogadores já na equipa:");
        leftSideVerticalLayout.addComponent(jogadoresJaNaEquipa);
        Panel listaJogadoresEquipa = new Panel();
        listaJogadoresEquipa.setSizeFull();
        leftSideVerticalLayout.addComponent(listaJogadoresEquipa);
        leftSideVerticalLayout.setExpandRatio(listaJogadoresEquipa, 0.9f);
        VerticalLayout listaJogadores = new VerticalLayout();
        listaJogadores.setWidth("100%");
        try {
            equipa = EquipaDAO.getEquipaByORMID(equipa.getORMID());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        Jogador[] jogadors = new Jogador[0];
        try {
            jogadors = JogadorDAO.listJogadorByQuery("equipaID = "+ equipa.getORMID(),null);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        Utilizador user = getSession().getAttribute(Utilizador.class);
        if (jogadoresAdicionar.size()== 0 && jogadoresRemover.size() ==0) {
            jogadorNaEquipaArray = new ArrayList<>(Arrays.asList(jogadors));
            jogadorsDisponiveisArray = new ArrayList<>();
            Jogador[] jogadoresDisponiveisDB = new Jogador[0];
            try {
                int i = EscolasDAO.getEscolasByORMID(UtilizadorDAO.getUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()).getORMID();
                jogadoresDisponiveisDB = JogadorDAO.listJogadorByQuery("escolasID = "+ EscolasDAO.getEscolasByORMID(UtilizadorDAO.getUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()).getORMID()+" AND equipaID = null", null);
            } catch (PersistentException e) {
                e.printStackTrace();
            }

            for (Jogador jogadorIter:jogadoresDisponiveisDB) {
                if (jogadorIter.getEquipa() == null) {
                    jogadorsDisponiveisArray.add(jogadorIter);
                }
            }
        }
        VerticalLayout listaJogadoresDisponiveisVT = new VerticalLayout();
        Panel listaJogadoresDisponiveis = new Panel();

        for (Jogador jogador: jogadorNaEquipaArray) {
            HorizontalLayout linhaJogador = createLinhaEquipa("Remover", jogador, equipa, window);
            listaJogadores.addComponent(linhaJogador);
        }
        listaJogadoresEquipa.setContent(listaJogadores);

        VerticalLayout rightSideVerticalLayout = new VerticalLayout();
        rightSideVerticalLayout.setSizeFull();
        content.addComponent(rightSideVerticalLayout);
        Label jogadoresDisponiveis = new Label("Jogadores Disponiveis");
        rightSideVerticalLayout.addComponent(jogadoresDisponiveis);
        listaJogadoresDisponiveis.setSizeFull();
        rightSideVerticalLayout.addComponent(listaJogadoresDisponiveis);
        rightSideVerticalLayout.setExpandRatio(listaJogadoresDisponiveis, 0.9f);
        listaJogadoresDisponiveisVT.setWidth("100%");

        for (Jogador jogador: jogadorsDisponiveisArray) {
            HorizontalLayout linhaJogador = createLinhaEquipa("Adicionar", jogador,equipa, window);
            listaJogadoresDisponiveisVT.addComponent(linhaJogador);
        }
        listaJogadoresDisponiveis.setContent(listaJogadoresDisponiveisVT);

        HorizontalLayout guardarHorizontalLayout = new HorizontalLayout();
        Button guardarLabel = new Button("Guardar equipa", VaadinIcons.CHECK);
        guardarHorizontalLayout.addComponent(guardarLabel);
        Equipa finalEquipa = equipa;
        guardarLabel.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                DiretorEscolaBean diretorEscolaBean = EscolasfutebolApplication.applicationBeansContext.getBean("DiretorEscolaBean", DiretorEscolaBean.class);
                try {
                    for (Jogador jogador:jogadoresAdicionar) {
                        diretorEscolaBean.setEquipa(finalEquipa, jogador);
                        EscolasDAO.refresh(EscolasDAO.getEscolasByORMID(UtilizadorDAO.getUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()));
                        arrayEquipas = diretorEscolaBean.getEquipasDeEscola(EscolasDAO.getEscolasByORMID(UtilizadorDAO.loadUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()).getORMID());
                        UpdateTable();
                    }
                    for (Jogador jogador: jogadoresRemover)
                    {
                        diretorEscolaBean.removeFromEquipa(jogador);
                        EscolasDAO.refresh(EscolasDAO.getEscolasByORMID(UtilizadorDAO.getUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()));
                        arrayEquipas = diretorEscolaBean.getEquipasDeEscola(EscolasDAO.getEscolasByORMID(UtilizadorDAO.loadUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()).getORMID());
                        UpdateTable();
                    }
                    window.close();
                    Notifications.showSuccessNotification("Equipa editada");
                } catch (PersistentException e) {
                    e.printStackTrace();
                    window.close();
                    Notifications.showErrorNotification("Erro ao editar. Por favor tente outra vez");
                }
            }
        });
        rightSideVerticalLayout.addComponent(guardarHorizontalLayout);
        return window;
    }

    private HorizontalLayout createLinhaEquipa(String value, Jogador jogador, Equipa equipa, Window window)
    {
        HorizontalLayout linhaJogador = new HorizontalLayout();
        linhaJogador.addComponent(new Label(jogador.getNome()));
        Button b = new Button(value);
        linhaJogador.addComponent(b);
        b.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                if(value== "Adicionar") {
                    jogadoresAdicionar.add(jogador);
                    jogadorNaEquipaArray.add(jogador);
                    jogadorsDisponiveisArray.remove(jogador);
                    if(equipa == null)
                    {
                        getUI().getUI().removeWindow(window);
                        getUI().getUI().addWindow(createEquipaWindow());
                    }
                    else
                    {
                        getUI().getUI().removeWindow(window);
                        getUI().getUI().addWindow(editWindow(equipa));
                    }
                }
                else
                {
                    jogadoresRemover.add(jogador);
                    jogadorNaEquipaArray.remove(jogador);
                    jogadorsDisponiveisArray.add(jogador);
                    getUI().getUI().removeWindow(window);
                    getUI().getUI().addWindow(editWindow(equipa));

                }
            }
        });
        return linhaJogador;

    }

    public void UpdateTable()
    {
        DiretorEscolaBean diretorEscolaBean = EscolasfutebolApplication.applicationBeansContext.getBean("DiretorEscolaBean", DiretorEscolaBean.class);
        try {
            Utilizador user = getSession().getAttribute(Utilizador.class);
            arrayEquipas = diretorEscolaBean.getEquipasDeEscola(EscolasDAO.getEscolasByORMID(UtilizadorDAO.loadUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()).getORMID());
            ConstructEquipasTable(arrayEquipas);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    String nomeEquipaTemp;

    private Window createEquipaWindow()
    {
        Window window = createWindow("Criar Equipa");
        HorizontalLayout content = (HorizontalLayout) window.getContent();
        content.setSizeFull();
        VerticalLayout leftSideVerticalLayout = new VerticalLayout();
        leftSideVerticalLayout.setSizeFull();
        content.addComponent(leftSideVerticalLayout);
        HorizontalLayout nomeEquipaHT = new HorizontalLayout();
        leftSideVerticalLayout.addComponent(nomeEquipaHT);
        Label nomeEquipaLabel = new Label("Nome da Equipa");
        nomeEquipaHT.addComponent(nomeEquipaLabel);
        TextField nomeEquipaTextField = new TextField("Nome");
        if(nomeEquipaTemp != null)
        {
            nomeEquipaTextField.setValue(nomeEquipaTemp);
        }
        nomeEquipaTextField.addValueChangeListener(new HasValue.ValueChangeListener<String>() {
            @Override
            public void valueChange(HasValue.ValueChangeEvent<String> valueChangeEvent) {
                nomeEquipaTemp = nomeEquipaTextField.getValue();
            }
        });
        nomeEquipaHT.addComponent(nomeEquipaTextField);

        Label jogadoresJaNaEquipa = new Label("Jogadores já na equipa:");
        leftSideVerticalLayout.addComponent(jogadoresJaNaEquipa);
        Panel listaJogadoresEquipa = new Panel();
        listaJogadoresEquipa.setSizeFull();
        leftSideVerticalLayout.addComponent(listaJogadoresEquipa);
        leftSideVerticalLayout.setExpandRatio(listaJogadoresEquipa, 0.9f);
        VerticalLayout listaJogadores = new VerticalLayout();
        listaJogadores.setWidth("100%");
        VerticalLayout listaJogadoresDisponiveisVT = new VerticalLayout();
        Panel listaJogadoresDisponiveis = new Panel();
        for (Jogador jogador: jogadorNaEquipaArray) {
            HorizontalLayout linhaJogador = createLinhaEquipa("Remover", jogador, null, window);
            listaJogadores.addComponent(linhaJogador);
        }
        listaJogadoresEquipa.setContent(listaJogadores);

        VerticalLayout rightSideVerticalLayout = new VerticalLayout();
        rightSideVerticalLayout.setSizeFull();
        content.addComponent(rightSideVerticalLayout);
        Label jogadoresDisponiveis = new Label("Jogadores Disponiveis");
        rightSideVerticalLayout.addComponent(jogadoresDisponiveis);
        listaJogadoresDisponiveis.setSizeFull();
        rightSideVerticalLayout.addComponent(listaJogadoresDisponiveis);
        rightSideVerticalLayout.setExpandRatio(listaJogadoresDisponiveis, 0.9f);
        listaJogadoresDisponiveisVT.setWidth("100%");
        Utilizador user = getSession().getAttribute(Utilizador.class);
        if (jogadoresAdicionar.size()== 0 && jogadoresRemover.size() ==0) {
            jogadorsDisponiveisArray = new ArrayList<>();
            Jogador[] jogadoresDisponiveisDB = new Jogador[0];
            try {
                jogadoresDisponiveisDB = JogadorDAO.listJogadorByQuery("escolasID = "+ user.getEscolas().getORMID()+" AND equipaID = null", null);
            } catch (PersistentException e) {
                e.printStackTrace();
            }

            for (Jogador jogadorIter:jogadoresDisponiveisDB) {
                if (jogadorIter.getEquipa() == null) {
                    jogadorsDisponiveisArray.add(jogadorIter);
                }
            }
        }

        for (Jogador jogador: jogadorsDisponiveisArray) {
            HorizontalLayout linhaJogador = createLinhaEquipa("Adicionar", jogador, null, window);
            listaJogadoresDisponiveisVT.addComponent(linhaJogador);
        }
        listaJogadoresDisponiveis.setContent(listaJogadoresDisponiveisVT);

        HorizontalLayout guardarHorizontalLayout = new HorizontalLayout();
        Button guardarLabel = new Button("Guardar equipa", VaadinIcons.CHECK);
        guardarHorizontalLayout.addComponent(guardarLabel);
        guardarLabel.addClickListener(new Button.ClickListener() {
            @Override
            public void buttonClick(Button.ClickEvent clickEvent) {
                DiretorEscolaBean diretorEscolaBean = EscolasfutebolApplication.applicationBeansContext.getBean("DiretorEscolaBean", DiretorEscolaBean.class);
                try {
                    diretorEscolaBean.createEquipa(user.getEscolas().getORMID(), jogadoresAdicionar,nomeEquipaTextField.getValue());
                    EscolasDAO.refresh(EscolasDAO.getEscolasByORMID(UtilizadorDAO.getUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()));
                    arrayEquipas = diretorEscolaBean.getEquipasDeEscola(EscolasDAO.getEscolasByORMID(UtilizadorDAO.loadUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()).getORMID());
                    UpdateTable();
                    Notifications.showSuccessNotification("Equipa adicionada");
                    window.close();

                } catch (PersistentException e) {
                    e.printStackTrace();
                }
                getUI().getNavigator().getCurrentView().enter(null);
                System.out.println("dw");
            }
        });
        rightSideVerticalLayout.addComponent(guardarHorizontalLayout);

        return window;
    }

}
