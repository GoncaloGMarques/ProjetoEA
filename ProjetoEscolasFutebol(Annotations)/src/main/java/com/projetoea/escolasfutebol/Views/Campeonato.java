package com.projetoea.escolasfutebol.Views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

@SpringView
public class Campeonato extends Composite implements View {
    public Campeonato() {
        setCompositionRoot(new Label("Esta é a página do Campeonato"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        //Load Campeonatos here
        //ou pedir a um bean que trate disso?
    }
}
