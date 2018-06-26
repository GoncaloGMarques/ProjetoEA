package com.projetoea.escolasfutebol;

import com.projetoea.escolasfutebol.Beans.UserBean;
import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.projetoea.escolasfutebol.Views.*;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@Theme("darktheme")
@SpringUI(path = "EscolasFutebol/DiretorEscola")
public class DiretorEscolaVaadinUI extends UI {

    private static DiretorEscolaVaadinUI instance = null;
    public DiretorEscolaVaadinUI() {
        // Exists only to defeat instantiation.
    }

    public static DiretorEscolaVaadinUI getInstance() {
        if(instance == null) {
            instance = new DiretorEscolaVaadinUI();
        }
        return instance;
    }

    public Label userName;
    UserBean userBean;


    public static boolean logged = false;
    static VerticalLayout menuLinks;
    @Override
    protected void init(VaadinRequest vaadinRequest) {
        Label title = new Label("Menu");
        Utilizador user = getSession().getAttribute(Utilizador.class);
        userName = new Label();
        if(user != null) userName.setValue("Diretor " + user.getNome());
        else userName.setValue("YOU SHOULD NOT BE HERE");

        menuLinks = new VerticalLayout();
        addMenuEntry(menuLinks, "Página Inicial", "");
        addMenuEntry(menuLinks, "Logout", "");
        addMenuEntry(menuLinks, "Calendário", "calendario");
        addMenuEntry(menuLinks, "Torneios", "torneios");
        addMenuEntry(menuLinks, "Campeonato", "campeonato");
        addMenuEntry(menuLinks, "Gerir Equipas", "gerirequipas");


        menuLinks.setStyleName("v-horizontal-layout-menuLinks");

        VerticalLayout menu = new VerticalLayout(title, userName, menuLinks);
        menu.setStyleName("v-horizontal-layout-menu");
        menu.setComponentAlignment(title, Alignment.MIDDLE_CENTER);
        menu.setComponentAlignment(userName, Alignment.MIDDLE_CENTER);


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
        navigator.addView("", PaginaInicialView.class);
        navigator.addView("login", LoginView.class);
        navigator.addView("calendario", Calendario.class);
        navigator.addView("torneios", Torneios.class);
        navigator.addView("campeonato", Campeonato.class);
        navigator.addView("gerirequipas", GerirEquipasView.class);
    }



    private void addMenuEntry(Layout layout, String caption, String navigateTo){
        Button view1 = new Button(caption, e -> getNavigator().navigateTo(navigateTo));
        view1.setWidth("100%");
        view1.setStyleName("v-button-MenuLinks");
        layout.addComponent(view1);
    }

    public static void UpdateLoginStatus()
    {
        menuLinks.getComponent(1).setCaption("Logout");
    }
}
