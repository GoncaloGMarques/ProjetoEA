package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.GuestBean;
import com.projetoea.escolasfutebol.classesjava.Participantecampeonato;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

@SpringView
public class CampeonatoView extends Composite implements View {
    Panel classificacaoPanel;

    public CampeonatoView() {
        VerticalLayout vt = new VerticalLayout();
        vt.setSizeFull();
        Label classificacaoLabel = new Label("Classificacao:");
        vt.addComponent(classificacaoLabel);
        Panel descriptionEmJogo = new Panel();
        HorizontalLayout DetalhesTabela = new HorizontalLayout();
        Label hora = new Label("Equipa");
        DetalhesTabela.addComponent(hora);
        DetalhesTabela.setComponentAlignment(hora, Alignment.MIDDLE_CENTER);
        Label equipaA = new Label("Pontos");
        DetalhesTabela.addComponent(equipaA);
        DetalhesTabela.setComponentAlignment(equipaA, Alignment.MIDDLE_CENTER);
        Label empty = new Label("Golos Marcados");
        DetalhesTabela.addComponent(empty);
        DetalhesTabela.setComponentAlignment(empty, Alignment.MIDDLE_CENTER);
        Label equipaB = new Label("GolosSofridos");
        DetalhesTabela.addComponent(equipaB);
        DetalhesTabela.setComponentAlignment(equipaB, Alignment.MIDDLE_CENTER);
        descriptionEmJogo.setContent(DetalhesTabela);
        DetalhesTabela.setSizeFull();
        vt.addComponent(descriptionEmJogo);
        classificacaoPanel = new Panel();
        classificacaoPanel.setSizeFull();
        vt.addComponent(classificacaoPanel);
        vt.setExpandRatio(classificacaoPanel, 0.9f);
        setCompositionRoot(vt);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        GuestBean guestBean = EscolasfutebolApplication.applicationBeansContext.getBean("GuestBean", GuestBean.class);
        try {
            Participantecampeonato[] test = guestBean.GetParticipantesCampeonato();
            ConstructParticipantesTable(test, classificacaoPanel);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    private void ConstructParticipantesTable(Participantecampeonato[] listaJogos, Panel panel)
    {
        VerticalLayout listaJogoTabela = new VerticalLayout();
        for (Participantecampeonato participantecampeonato: listaJogos) {
            HorizontalLayout linhaTabela = new HorizontalLayout();
            AddLinha(participantecampeonato.getEquipa().getNome(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(String.valueOf(participantecampeonato.getPontos()), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(String.valueOf(participantecampeonato.getGolosmarcados()), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(String.valueOf(participantecampeonato.getGolossofridos()), Alignment.MIDDLE_CENTER, linhaTabela);
            listaJogoTabela.addComponent(linhaTabela);
            linhaTabela.setSizeFull();
        }
        if (listaJogos.length == 0)
        {
            Label noJogosWarning = new Label("Não existem jogos no dia selecionado");
            listaJogoTabela.addComponent(noJogosWarning);
            listaJogoTabela.setComponentAlignment(noJogosWarning, Alignment.MIDDLE_CENTER);
            panel.setContent(listaJogoTabela);
        }
        else
        {
            panel.setContent(listaJogoTabela);
        }
    }

    private void AddLinha(String value, Alignment middleCenter, HorizontalLayout hl)
    {
        Label l = new Label(value);
        hl.addComponent(l);
        hl.setComponentAlignment(l, middleCenter);
    }
}
