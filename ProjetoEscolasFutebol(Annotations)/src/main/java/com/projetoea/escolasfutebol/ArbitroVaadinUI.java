package com.projetoea.escolasfutebol;

import com.projetoea.escolasfutebol.Beans.UserBean;
import com.projetoea.escolasfutebol.classesjava.Utilizador;
import com.projetoea.escolasfutebol.Views.*;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

import java.util.Iterator;

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

        //out.println("Arbitro LOG: " + getSession().getAttribute(Utilizador.class) + "   STATUS: " + getSession().getState());

        Label title = new Label("Menu");
        userName = new Label("ERROR");

        if(utilizador != null) userName.setValue("Arbitro " + utilizador.getNome());
        else return;

        Notifications.showSuccessNotification("Entrou como: Arbitro\nBem Vindo");

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
        navigator.addView("calendario", CalendarioView.class);
        navigator.addView("torneios", TorneiosView.class);
        navigator.addView("campeonato", CampeonatoView.class);
        navigator.addView("gerirjogos", GerirJogosView.class);
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

    public static void UpdateLoginStatus()
    {
        menuLinks.getComponent(1).setCaption("Logout");
    }
}
