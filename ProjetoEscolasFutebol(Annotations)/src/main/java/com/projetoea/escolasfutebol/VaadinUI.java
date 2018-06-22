package com.projetoea.escolasfutebol;

import com.projetoea.escolasfutebol.Views.Calendario;
import com.projetoea.escolasfutebol.Views.Campeonato;
import com.projetoea.escolasfutebol.Views.PaginaInicial;
import com.projetoea.escolasfutebol.Views.Torneios;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@Theme("darktheme")
@SpringUI(path = "EscolasFutebol/*")
public class VaadinUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Label title = new Label("Menu");

        Button view1 = new Button("Página Inicial", e -> getNavigator().navigateTo(""));
        view1.setWidth("100%");
        view1.setStyleName("v-button-MenuLinks");
        Button view2 = new Button("Calendário", e -> getNavigator().navigateTo("calendario"));
        view2.setWidth("100%");
        view2.setStyleName("v-button-MenuLinks");
        Button view3 = new Button("Torneios", e -> getNavigator().navigateTo("torneios"));
        view3.setWidth("100%");
        view3.setStyleName("v-button-MenuLinks");
        Button view4 = new Button("Campeonato", e -> getNavigator().navigateTo("campeonato"));
        view4.setWidth("100%");
        view4.setStyleName("v-button-MenuLinks");


        VerticalLayout menuLinks = new VerticalLayout(view1, view2, view3, view4);
        menuLinks.setStyleName("v-horizontal-layout-menuLinks");

        VerticalLayout menu = new VerticalLayout(title, menuLinks);
        menu.setStyleName("v-horizontal-layout-menu");
        menu.setComponentAlignment(title, Alignment.MIDDLE_CENTER);

        VerticalLayout viewContainer = new VerticalLayout();

        HorizontalLayout mainLayout = new HorizontalLayout(menu, viewContainer);
        mainLayout.setSizeFull();
//        mainLayout.setExpandRatio(viewContainer, 1);

        setContent(mainLayout);
        mainLayout.setExpandRatio(menu, 2f);
        mainLayout.setExpandRatio(viewContainer, 8f);
        menu.setExpandRatio(menuLinks, 8f);
        menu.setExpandRatio(title, 2f);
        menu.setHeight("100%");
        viewContainer.setHeight("100%");

        Navigator navigator = new Navigator(this, viewContainer);
        navigator.addView("", PaginaInicial.class);
        navigator.addView("calendario", Calendario.class);
        navigator.addView("torneios", Torneios.class);
        navigator.addView("campeonato", Campeonato.class);
    }
}
