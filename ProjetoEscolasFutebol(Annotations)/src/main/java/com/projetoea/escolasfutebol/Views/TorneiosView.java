package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.GuestBean;
import com.projetoea.escolasfutebol.ClassesJava.Torneio;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import java.time.LocalDate;

@SpringView
public class TorneiosView extends Composite implements View {
    Panel panelTorneiosEmJogo;
    Panel panelTorneiosTerminados;

    public TorneiosView() {
        HorizontalLayout ht = new HorizontalLayout();
        VerticalLayout vtTorneiosEmJogo = new VerticalLayout();
        vtTorneiosEmJogo.addComponent(new Label("Torneios em Jogo:"));
        Panel descriptionEmJogo = new Panel();
        HorizontalLayout DetalhesTabela = new HorizontalLayout();
        Label data = new Label("Nome");
        DetalhesTabela.addComponent(data);
        DetalhesTabela.setComponentAlignment(data, Alignment.MIDDLE_CENTER);
        Label hora = new Label("Data Inicio");
        DetalhesTabela.addComponent(hora);
        DetalhesTabela.setComponentAlignment(hora, Alignment.MIDDLE_CENTER);
        Label equipaA = new Label("Data Fim");
        DetalhesTabela.addComponent(equipaA);
        DetalhesTabela.setComponentAlignment(equipaA, Alignment.MIDDLE_CENTER);
        descriptionEmJogo.setContent(DetalhesTabela);
        DetalhesTabela.setSizeFull();
        vtTorneiosEmJogo.addComponent(descriptionEmJogo);
        panelTorneiosEmJogo = new Panel();
        vtTorneiosEmJogo.addComponent(panelTorneiosEmJogo);
        vtTorneiosEmJogo.setSizeFull();
        vtTorneiosEmJogo.setExpandRatio(panelTorneiosEmJogo, 0.9f);
        panelTorneiosEmJogo.setSizeFull();

        VerticalLayout vtTorneiosTerminados = new VerticalLayout();
        vtTorneiosTerminados.addComponent(new Label("Torneios Terminados:"));
        Panel descriptionTerminados = new Panel();
        DetalhesTabela = new HorizontalLayout();
        data = new Label("Nome");
        DetalhesTabela.addComponent(data);
        DetalhesTabela.setComponentAlignment(data, Alignment.MIDDLE_CENTER);
        hora = new Label("Data Inicio");
        DetalhesTabela.addComponent(hora);
        DetalhesTabela.setComponentAlignment(hora, Alignment.MIDDLE_CENTER);
        equipaA = new Label("Data Fim");
        DetalhesTabela.addComponent(equipaA);
        DetalhesTabela.setComponentAlignment(equipaA, Alignment.MIDDLE_CENTER);
        descriptionTerminados.setContent(DetalhesTabela);
        DetalhesTabela.setSizeFull();
        vtTorneiosTerminados.addComponent(descriptionTerminados);
        panelTorneiosTerminados = new Panel();
        vtTorneiosTerminados.addComponent(panelTorneiosTerminados);
        vtTorneiosTerminados.setSizeFull();
        panelTorneiosTerminados.setSizeFull();
        vtTorneiosTerminados.setExpandRatio(panelTorneiosTerminados, 0.9f);
        ht.addComponent(vtTorneiosEmJogo);
        ht.addComponent(vtTorneiosTerminados);
        ht.setSizeFull();
        setCompositionRoot(ht);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        GuestBean guestBean = EscolasfutebolApplication.applicationBeansContext.getBean("GuestBean", GuestBean.class);
        try {
            Torneio[] TorneiosEmJogo = guestBean.GetTorneiosEmJogo();
            Torneio[] TorneiosTerminados = guestBean.GetTorneiosTerminados();
            ConstructTorneiosTable(TorneiosEmJogo, panelTorneiosEmJogo);
            ConstructTorneiosTable(TorneiosTerminados, panelTorneiosTerminados);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }

    private void ConstructTorneiosTable(Torneio[] listaJogos, Panel panel)
    {
        VerticalLayout listaJogoTabela = new VerticalLayout();
        for (Torneio torneio: listaJogos) {
            HorizontalLayout linhaTabela = new HorizontalLayout();
            AddLinha(torneio.getNome(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(LocalDate.from(torneio.getDatainicio().toLocalDateTime()).toString(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(LocalDate.from(torneio.getDatafim().toLocalDateTime()).toString(), Alignment.MIDDLE_CENTER, linhaTabela);
            listaJogoTabela.addComponent(linhaTabela);
            linhaTabela.setSizeFull();
        }
        panel.setContent(listaJogoTabela);
    }

    private void AddLinha(String value, Alignment middleCenter, HorizontalLayout hl)
    {
        Label l = new Label(value);
        hl.addComponent(l);
        hl.setComponentAlignment(l, middleCenter);
    }
}
