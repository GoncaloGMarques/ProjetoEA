package com.projetoea.escolasfutebol;

import com.projetoea.escolasfutebol.Beans.UserBean;
import com.projetoea.escolasfutebol.classesjava.Utilizador;
import com.projetoea.escolasfutebol.Views.*;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

@Theme("darktheme")
@SpringUI(path = "EscolasFutebol/DiretorAssociacao")
public class DiretorAssociacaoVaadinUI extends UI {

    private static DiretorAssociacaoVaadinUI instance = null;
    public DiretorAssociacaoVaadinUI() {
        // Exists only to defeat instantiation.
    }

    public static DiretorAssociacaoVaadinUI getInstance() {
        if(instance == null) {
            instance = new DiretorAssociacaoVaadinUI();
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
        userName = new Label();

        Utilizador user = getSession().getAttribute(Utilizador.class);

        if(user != null) userName.setValue("Presidente " + user.getNome());
        else userName.setValue("YOU SHOULD NOT BE HERE");

        menuLinks = new VerticalLayout();
        addMenuEntry(menuLinks, "Página Inicial", "");
        addMenuEntry(menuLinks, "Logout", "logout");
        addMenuEntry(menuLinks, "Calendário", "calendario");
        addMenuEntry(menuLinks, "Torneios", "torneios");
        addMenuEntry(menuLinks, "Campeonato", "campeonato");
        addMenuEntry(menuLinks, "Gerir Escolas", "gerirescolas");
        addMenuEntry(menuLinks, "Gerir Torneios", "gerirtorneios");
        addMenuEntry(menuLinks, "Gerir Campeonatos", "gerircampeonatos");

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
        navigator.addView("logout", LogoutView.class);
        navigator.addView("calendario", CalendarioView.class);
        navigator.addView("torneios", TorneiosView.class);
        navigator.addView("campeonato", CampeonatoView.class);
        navigator.addView("gerirescolas", GerirEscolasView.class);
        navigator.addView("gerirtorneios", GerirTorneiosView.class);
        navigator.addView("gerircampeonatos", GerirCampeonatosView.class);
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
