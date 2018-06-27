package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.GuestBean;
import com.projetoea.escolasfutebol.ClassesJava.Jogo;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.vaadin.data.HasValue;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import java.time.LocalDate;
import java.time.LocalTime;

@SpringView
public class CalendarioView extends Composite implements View {
    Panel panelListaJogos;
    InlineDateField date;

    public CalendarioView() {
        HorizontalLayout ht = new HorizontalLayout();
        ht.setWidth("100%");
        ht.setHeight("100%");
        date = new InlineDateField();
        date.addValueChangeListener(new HasValue.ValueChangeListener<LocalDate>() {
            @Override
            public void valueChange(HasValue.ValueChangeEvent<LocalDate> valueChangeEvent) {
                GuestBean guestBean = EscolasfutebolApplication.applicationBeansContext.getBean("GuestBean", GuestBean.class);
                try {
                    Jogo[] test = guestBean.GetJogoData(date.getValue());
                    ConstructJogosTable(test);
                } catch (PersistentException e) {
                    e.printStackTrace();
                }
            }
        });
        date.setSizeFull();
        ht.addComponent(date);
        ht.setExpandRatio(date,1f);
        panelListaJogos = new Panel();
        Label label = new Label("wj");
        panelListaJogos.setContent(label);
        panelListaJogos.setSizeFull();
        ht.addComponent(panelListaJogos);
        ht.setExpandRatio(date, 1f);
        ht.setExpandRatio(panelListaJogos, 2f);
        setCompositionRoot(ht);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        date.setValue(LocalDate.now());
        GuestBean guestBean = EscolasfutebolApplication.applicationBeansContext.getBean("GuestBean", GuestBean.class);
        try {
            Jogo[] test = guestBean.GetJogoData(date.getValue());
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
            AddLinha(jogo.getEquipaCasa().toString(), Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha("-", Alignment.MIDDLE_CENTER, linhaTabela);
            AddLinha(jogo.getEquipaFora().toString(), Alignment.MIDDLE_CENTER, linhaTabela);
            listaJogoTabela.addComponent(linhaTabela);
            linhaTabela.setSizeFull();
        }
        if (listaJogos.length == 0)
        {
            Label noJogosWarning = new Label("Não existem jogos no dia selecionado");
            listaJogoTabela.addComponent(noJogosWarning);
            listaJogoTabela.setComponentAlignment(noJogosWarning, Alignment.MIDDLE_CENTER);
            panelListaJogos.setContent(listaJogoTabela);
        }
        else
        {
            panelListaJogos.setContent(listaJogoTabela);
        }
    }

    private void AddLinha(String value, Alignment middleCenter, HorizontalLayout hl)
    {
        Label l = new Label(value);
        hl.addComponent(l);
        hl.setComponentAlignment(l, middleCenter);
    }
}
