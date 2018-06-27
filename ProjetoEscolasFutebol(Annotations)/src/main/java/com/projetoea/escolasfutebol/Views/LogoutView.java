package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.DefaultDeploymentConfiguration;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;

import java.net.URI;
import java.util.function.Consumer;

import static java.lang.System.out;

@SpringView
@Theme("darktheme")
public class LogoutView extends Composite implements View {

    private Label logoutLabel;

    public LogoutView(){
        logoutLabel = new Label("Logging Out");
        HorizontalLayout horizontalLayout = new HorizontalLayout(logoutLabel);
        setCompositionRoot(horizontalLayout);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

        out.println("Logout LOG: " + getSession().getAttribute(Utilizador.class));
        getSession().close();
        out.println("Logout LOG: " + getSession().getAttribute(Utilizador.class) + "   STATUS: " + getSession().getState());


        getUI().getPage().setLocation(URI.create("http://localhost:8080/EscolasFutebol"));
        getUI().close();
    }
}
