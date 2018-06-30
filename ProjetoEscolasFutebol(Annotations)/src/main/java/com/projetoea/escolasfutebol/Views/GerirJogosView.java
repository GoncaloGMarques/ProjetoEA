package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.classesjava.Jogo;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringView
public class GerirJogosView extends Composite implements View {

    Panel listaJogosAEsperaPanel;

    public GerirJogosView() {
        HorizontalLayout ht = new HorizontalLayout();

        VerticalLayout leftSideVerticalLayout = new VerticalLayout();
        ht.addComponent(leftSideVerticalLayout);
        Label jogosAEsperaDadosLabel = new Label("Jogos à espera de dados");
        jogosAEsperaDadosLabel.setIcon(VaadinIcons.WARNING);
        leftSideVerticalLayout.addComponent(jogosAEsperaDadosLabel);
        listaJogosAEsperaPanel = new Panel();



        //todo right side
        VerticalLayout rightSideVerticalLayout = new VerticalLayout();
        ht.addComponent(rightSideVerticalLayout);

        setCompositionRoot(ht);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }

    private void ConstructJogosTable(Jogo[] listaJogos)
    {
        VerticalLayout listaJogoTabela = new VerticalLayout();
        for (Jogo jogo: listaJogos) {
            HorizontalLayout linhaTabela = new HorizontalLayout();
            AddLinha(LocalDate.from(jogo.getData().toLocalDateTime()).toString(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(LocalTime.from(jogo.getData().toLocalDateTime()).toString(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(jogo.getEquipaCasa().toString(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha("-", Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(jogo.getEquipaFora().toString(), Alignment.MIDDLE_CENTER, linhaTabela);
            listaJogoTabela.addComponent(linhaTabela);
            linhaTabela.setSizeFull();
        }
        listaJogosAEsperaPanel.setContent(listaJogoTabela);
    }

    private void AddLinha(String value, Alignment middleCenter, HorizontalLayout hl)
    {
        Label l = new Label(value);
        hl.addComponent(l);
        hl.setComponentAlignment(l, middleCenter);
    }
}
