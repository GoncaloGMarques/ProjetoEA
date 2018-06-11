package com.projetoea.escolasfutebol;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
public class EscolasfutebolApplication {

    public static void main(String[] args) {
        SpringApplication.run(EscolasfutebolApplication.class, args);
    }

    @Service
    public static class MyService {
        public String sayHi() {
            return "Hello Spring Initializr!";
        }

    }
    @Theme("valo")
    @SpringUI(path = "")
    public static class VaadinUI extends UI {

        @Autowired
        MyService myService;

        Navigator navigator;
        protected static final String MAINVIEW = "main";

        @Override
        protected void init(VaadinRequest request) {
            getPage().setTitle("Navigation Example");
            navigator = new Navigator(this, this);

            // Create and register the views
            UI.getCurrent().getNavigator().addView("", new StartView());
            UI.getCurrent().getNavigator().addView(MAINVIEW, new MainView());
        }


    }

    @WebServlet(urlPatterns = "/*", name = "MyUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = VaadinUI.class, productionMode = false)
    public static class MyUIServlet extends VaadinServlet {
    }
}
