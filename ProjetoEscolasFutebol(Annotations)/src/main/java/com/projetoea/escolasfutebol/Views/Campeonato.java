package com.projetoea.escolasfutebol.Views;

import com.vaadin.navigator.View;
import com.vaadin.ui.Composite;
import com.vaadin.ui.Label;

public class Campeonato extends Composite implements View {
    public Campeonato() {
        setCompositionRoot(new Label("Esta é a página do Campeonato"));
    }
}
