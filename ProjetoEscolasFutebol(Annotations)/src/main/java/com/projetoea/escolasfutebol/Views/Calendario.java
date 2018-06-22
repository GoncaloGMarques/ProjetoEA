package com.projetoea.escolasfutebol.Views;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;

@SpringView
public class Calendario extends Composite implements View {
    public Calendario() {
        setCompositionRoot(new Label("Esta é a página do calendario"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
