package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.GuestBean;
import com.projetoea.escolasfutebol.classesjava.Jogo;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringView
public class PaginaInicialView extends Composite implements View {

    VerticalLayout vt;
    Panel JogosHojePanel;

    public PaginaInicialView() throws PersistentException {
        VerticalLayout vt = new VerticalLayout();
        Panel description = new Panel();
        HorizontalLayout descriptionLinha = new HorizontalLayout();
        Label data = new Label("Data");
        descriptionLinha.addComponent(data);
        descriptionLinha.setComponentAlignment(data, Alignment.MIDDLE_CENTER);
        Label hora = new Label("Hora");
        descriptionLinha.addComponent(hora);
        descriptionLinha.setComponentAlignment(hora, Alignment.MIDDLE_CENTER);
        Label equipaA = new Label("Equipa A");
        descriptionLinha.addComponent(equipaA);
        descriptionLinha.setComponentAlignment(equipaA, Alignment.MIDDLE_CENTER);
        Label empty = new Label("");
        descriptionLinha.addComponent(empty);
        descriptionLinha.setComponentAlignment(empty, Alignment.MIDDLE_CENTER);
        Label equipaB = new Label("Equipa B");
        descriptionLinha.addComponent(equipaB);
        descriptionLinha.setComponentAlignment(equipaB, Alignment.MIDDLE_CENTER);
        description.setContent(descriptionLinha);
        descriptionLinha.setSizeFull();
        JogosHojePanel = new Panel();
        vt.addComponent(description);
        vt.addComponent(JogosHojePanel);
        setCompositionRoot(vt);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        Jogo[] test;
        GuestBean guestBean = EscolasfutebolApplication.applicationBeansContext.getBean("GuestBean", GuestBean.class);
        try {
            test = guestBean.getJogosHoje();
            ConstructJogosTable(test);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
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
        JogosHojePanel.setContent(listaJogoTabela);
    }

    private void AddLinha(String value, Alignment middleCenter, HorizontalLayout hl)
    {
        Label l = new Label(value);
        hl.addComponent(l);
        hl.setComponentAlignment(l, middleCenter);
    }
}
