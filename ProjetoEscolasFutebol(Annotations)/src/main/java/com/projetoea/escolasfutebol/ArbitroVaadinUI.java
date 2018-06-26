package com.projetoea.escolasfutebol;

import com.projetoea.escolasfutebol.Beans.UserBean;
import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.projetoea.escolasfutebol.Views.*;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinSession;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

import static java.lang.System.out;

@Theme("darktheme")
@SpringUI(path = "EscolasFutebol/Arbitro")
public class ArbitroVaadinUI extends UI {

    private static ArbitroVaadinUI instance = null;
    public ArbitroVaadinUI() {
        // Exists only to defeat instantiation.
    }

    public static ArbitroVaadinUI getInstance() {
        if(instance == null) {
            instance = new ArbitroVaadinUI();
        }
        return instance;
    }

    public Label userName;
    UserBean userBean;


    public static boolean logged = false;
    static VerticalLayout menuLinks;
    @Override
    protected void init(VaadinRequest vaadinRequest) {

        Utilizador utilizador = getSession().getAttribute(Utilizador.class);
        out.println("Arbitro LOG: " + getSession().getAttribute(Utilizador.class) + "   STATUS: " + getSession().getState());

        Label title = new Label("Menu");
        userName = new Label("ERROR");

        if(utilizador != null) userName.setValue("Arbitro " + utilizador.getNome());
        else return;

        menuLinks = new VerticalLayout();
        addMenuEntry(menuLinks, "Paging Inicial", "");
        addMenuEntry(menuLinks, "Logout", "logout");
        addMenuEntry(menuLinks, "Calendário", "calendario");
        addMenuEntry(menuLinks, "Torneios", "torneios");
        addMenuEntry(menuLinks, "Campeonato", "campeonato");
        addMenuEntry(menuLinks, "Gerir Jogos", "gerirjogos");


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
        navigator.addView("calendario", Calendario.class);
        navigator.addView("torneios", Torneios.class);
        navigator.addView("campeonato", Campeonato.class);
        navigator.addView("gerirjogos", GerirJogosView.class);
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
