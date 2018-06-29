package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.DiretorEscolaBean;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.projetoea.escolasfutebol.classesjava.*;
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
            arrayEquipas = diretorEscolaBean.getEquipasDeEscola(user.getEscolas().getID());
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

    private Window editWindow(Equipa equipa)
    {
        ArrayList<Jogador> jogadoresAdicionar = new ArrayList<>();
        ArrayList<Jogador> jogadoresRemover = new ArrayList<>();
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
            equipa = EquipaDAO.getEquipaByORMID(equipa.getID());
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        ArrayList<Jogador> jogadorNaEquipaArray = new ArrayList<>(Arrays.asList(equipa.jogador.toArray()));
        ArrayList<Jogador> jogadorsDisponiveisArray = new ArrayList<>();
        VerticalLayout listaJogadoresDisponiveisVT = new VerticalLayout();
        Panel listaJogadoresDisponiveis = new Panel();

        for (Jogador jogador: jogadorNaEquipaArray) {
            HorizontalLayout linhaJogador = new HorizontalLayout();
            linhaJogador.addComponent(new Label(jogador.getNome()));
            Button b = new Button("Remover");
            linhaJogador.addComponent(b);
            b.addClickListener(new Button.ClickListener() {
                @Override
                public void buttonClick(Button.ClickEvent clickEvent) {
                    jogadoresRemover.add(jogador);
                    jogadorNaEquipaArray.remove(jogador);
                    jogadorsDisponiveisArray.add(jogador);
                    listaJogadores.removeAllComponents();
                    for (Jogador jogador: jogadorNaEquipaArray) {
                        Label nome = new Label(jogador.getNome());
                        listaJogadores.addComponent(nome);
                    }
                    listaJogadoresEquipa.setContent(listaJogadores);
                    listaJogadoresDisponiveisVT.removeAllComponents();
                    for (Jogador jogador: jogadorsDisponiveisArray) {
                        Label nome = new Label(jogador.getNome());
                        listaJogadoresDisponiveisVT.addComponent(nome);
                    }
                    listaJogadoresDisponiveis.setContent(listaJogadoresDisponiveisVT);
                }
            });
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
        Jogador[] jogadoresDisponiveisDB =  user.getEscolas().jogador.toArray();

        for (Jogador jogadorIter:jogadoresDisponiveisDB) {
            if (jogadorIter.getEquipa() == null) {
                jogadorsDisponiveisArray.add(jogadorIter);
            }
        }

        for (Jogador jogador: jogadorsDisponiveisArray) {
            HorizontalLayout linhaJogador = new HorizontalLayout();
            linhaJogador.addComponent(new Label(jogador.getNome()));
            Button b = new Button("Adicionar");
            linhaJogador.addComponent(b);
            b.addClickListener(new Button.ClickListener() {
                @Override
                public void buttonClick(Button.ClickEvent clickEvent) {
                    jogadoresAdicionar.add(jogador);
                    jogadorNaEquipaArray.add(jogador);
                    jogadorsDisponiveisArray.remove(jogador);
                    listaJogadores.removeAllComponents();
                    for (Jogador jogador: jogadorNaEquipaArray) {
                        Label nome = new Label(jogador.getNome());
                        listaJogadores.addComponent(nome);
                    }
                    listaJogadoresEquipa.setContent(listaJogadores);
                    listaJogadoresDisponiveisVT.removeAllComponents();
                    for (Jogador jogador: jogadorsDisponiveisArray) {
                        Label nome = new Label(jogador.getNome());
                        listaJogadoresDisponiveisVT.addComponent(nome);
                    }
                    listaJogadoresDisponiveis.setContent(listaJogadoresDisponiveisVT);
                }
            });
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
                        EscolasDAO.refresh(EscolasDAO.getEscolasByORMID(UtilizadorDAO.getUtilizadorByORMID(user.getID()).getEscolas().getID()));
                        arrayEquipas = diretorEscolaBean.getEquipasDeEscola(user.getEscolas().getID());
                        ConstructEquipasTable(arrayEquipas);
                    }
                    for (Jogador jogador: jogadoresRemover)
                    {
                        diretorEscolaBean.removeFromEquipa(jogador);
                        EscolasDAO.refresh(user.getEscolas());
                        arrayEquipas = diretorEscolaBean.getEquipasDeEscola(user.getEscolas().getID());
                        ConstructEquipasTable(arrayEquipas);
                    }
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
