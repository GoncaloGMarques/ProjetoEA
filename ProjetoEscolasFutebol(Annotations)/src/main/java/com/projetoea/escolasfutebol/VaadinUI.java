package com.projetoea.escolasfutebol;

import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.projetoea.escolasfutebol.ClassesJava.UtilizadorDAO;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import com.vaadin.ui.themes.ValoTheme;
import org.orm.PersistentException;

@Theme("darktheme")
@SpringUI(path = "EscolasFutebol/*")
public class VaadinUI extends UI {

    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Label title = new Label("Menu");

        Utilizador ut = UtilizadorDAO.createUtilizador();
        ut.setNome("dnwn");
        try {
            UtilizadorDAO.save(ut);
        } catch (PersistentException e) {
            e.printStackTrace();
        }

        Button view1 = new Button("View 1", e -> getNavigator().navigateTo("view1"));
        view1.setWidth("100%");
        view1.setStyleName("v-button-MenuLinks");
        Button view2 = new Button("View 2", e -> getNavigator().navigateTo("view2"));
        view2.setWidth("100%");
        view2.setStyleName("v-button-MenuLinks");


        VerticalLayout menuLinks = new VerticalLayout(view1, view2);
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
        navigator.addView("", DefaultView.class);
        navigator.addView("view1", View1.class);
        navigator.addView("view2", View2.class);
    }
}
