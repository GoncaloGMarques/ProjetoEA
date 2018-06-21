package com.projetoea.escolasfutebol;

import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.*;

public class View1 extends Composite implements View {
    public View1() {
        Panel panel = new Panel();
        HorizontalLayout panelContent = new HorizontalLayout();
        Label lbl = new Label("Nome: ");
        TextField txF = new TextField("Nome");
        panelContent.addComponent(lbl);
        panelContent.addComponent(txF);
        panel.setContent(panelContent);
        setCompositionRoot(panel);
        panelContent.setSizeUndefined();
        panel.setSizeUndefined();
        // this is not needed for a Composite
        setSizeUndefined();
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
