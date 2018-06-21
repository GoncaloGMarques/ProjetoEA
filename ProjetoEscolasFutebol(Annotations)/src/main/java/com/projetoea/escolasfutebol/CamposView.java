package com.projetoea.escolasfutebol;

import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@Theme("valo")
@SpringUI(path = "EscolasFutebol/campos")
public class CamposView extends UI implements View {

    public CamposView()
    {
        VerticalLayout layout = new VerticalLayout();
        Label label = new Label("Página dos campo");
        layout.addComponent(label);
        layout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
    }

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        System.out.println("Main View init was called");
    }
}
