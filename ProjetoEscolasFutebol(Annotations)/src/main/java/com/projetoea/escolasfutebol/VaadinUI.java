package com.projetoea.escolasfutebol;

import com.projetoea.escolasfutebol.Views.*;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

import java.util.Iterator;
import java.util.Set;

@Theme("darktheme")
@SpringUI(path = "EscolasFutebol")
public class VaadinUI extends UI {

    public Label userName;

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Label title = new Label("Menu");
        userName = new Label("Not Logged in");

        VerticalLayout menuLinks = new VerticalLayout();
        addMenuEntry(menuLinks, "Página Inicial", "");
        addMenuEntry(menuLinks, "Login", "login");
        addMenuEntry(menuLinks, "Calendário", "calendario");
        addMenuEntry(menuLinks, "Torneios", "torneios");
        addMenuEntry(menuLinks, "Campeonato", "campeonato");

        menuLinks.setStyleName("v-horizontal-layout-menuLinks");

        VerticalLayout menu = new VerticalLayout(title, userName, menuLinks);
        menu.setStyleName("v-horizontal-layout-menu");
        menu.setComponentAlignment(title, Alignment.MIDDLE_CENTER);
        menu.setComponentAlignment(userName, Alignment.MIDDLE_CENTER);

        VerticalLayout viewContainer = new VerticalLayout();

        HorizontalLayout mainLayout = new HorizontalLayout(menu, viewContainer);
        mainLayout.setSizeFull();

        setContent(mainLayout);
        mainLayout.setExpandRatio(menu, 2f);
        mainLayout.setExpandRatio(viewContainer, 8f);
        menu.setExpandRatio(menuLinks, 8f);
        menu.setExpandRatio(title, 2f);
        menu.setHeight("100%");
        viewContainer.setHeight("100%");

        Navigator navigator = new Navigator(this, viewContainer);
        navigator.addView("", PaginaInicial.class);
        navigator.addView("login", LoginView.class);
        navigator.addView("calendario", Calendario.class);
        navigator.addView("torneios", Torneios.class);
        navigator.addView("campeonato", Campeonato.class);
    }



    private void addMenuEntry(Layout layout, String caption, String navigateTo){
        Button view1 = new Button(caption, e -> {
            getNavigator().navigateTo(navigateTo);
            SetSelectedButton(e.getButton());
        });
        view1.setWidth("100%");
        view1.setStyleName("v-button-MenuLinks");
        layout.addComponent(view1);
    }

    private void SetSelectedButton(Button triggered)
    {
        for (Iterator<Component> it = triggered.getParent().iterator(); it.hasNext(); ) {
            Component bt = it.next();
            bt.setStyleName("v-button-MenuLinks");
        }
        triggered.setStyleName("v-button-MenuLinks-Selected");
    }
}
