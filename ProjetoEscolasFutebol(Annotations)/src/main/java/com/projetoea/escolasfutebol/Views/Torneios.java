package com.projetoea.escolasfutebol.Views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

@SpringView
public class Torneios extends Composite implements View {
    public Torneios() {
        setCompositionRoot(new Label("Esta é a página dos torneios"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}
