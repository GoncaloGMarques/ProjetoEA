package com.projetoea.escolasfutebol;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

public class View2 extends Composite implements View {
    public View2() {


        setCompositionRoot(new Label("This is view 1"));
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
    }
}
