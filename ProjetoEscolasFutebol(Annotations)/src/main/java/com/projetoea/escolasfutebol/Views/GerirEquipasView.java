package com.projetoea.escolasfutebol.Views;

import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;

@SpringView
public class GerirEquipasView extends Composite implements View {
    public GerirEquipasView() {
        VerticalLayout vt = new VerticalLayout();
        HorizontalLayout ht = new HorizontalLayout();
        ht.addComponent(new Label("Lista de equipas"));
        Button b =new Button("", VaadinIcons.PLUS);
        ht.addComponent(b);
        Panel listaEquipasPanel = new Panel();
        vt.addComponent(ht);
        vt.addComponent(listaEquipasPanel);
        setCompositionRoot(vt);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        //Load Campeonatos here
        //ou pedir a um bean que trate disso?
    }
}
