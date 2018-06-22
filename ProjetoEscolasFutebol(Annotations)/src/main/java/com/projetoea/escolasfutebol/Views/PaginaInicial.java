package com.projetoea.escolasfutebol.Views;

import com.vaadin.navigator.View;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Composite;
import com.vaadin.ui.GridLayout;
import com.vaadin.ui.Label;

@SpringView
public class PaginaInicial extends Composite implements View {

    public PaginaInicial() {
        GridLayout grid = new GridLayout(4,4);
        Label l1 = new Label("l1");
        Label l2 = new Label("l2");
        Label l3 = new Label("l3");
        Label l4 = new Label("l4");
        grid.addComponent(l1,0, 0);
        grid.addComponent(l2,0, 1);
        grid.addComponent(l3,1, 0);
        grid.addComponent(l4,1, 1);
        grid.setRowExpandRatio(1,1);
        grid.setRowExpandRatio(0,1);
        grid.setColumnExpandRatio(0,1);
        grid.setColumnExpandRatio(1,1);
        grid.setSizeFull();
        setCompositionRoot(grid);
    }
}
