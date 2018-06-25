package com.projetoea.escolasfutebol;

import com.projetoea.escolasfutebol.ClassesJava.Tipoeventojogo;
import com.projetoea.escolasfutebol.ClassesJava.TipoeventojogoDAO;
import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.projetoea.escolasfutebol.ClassesJava.UtilizadorDAO;
import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.server.SerializableSupplier;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;
import org.hibernate.cfg.Configuration;
import org.orm.PersistentException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
public class EscolasfutebolApplication {

    public static void main(String[] args) throws PersistentException {
        SpringApplication.run(EscolasfutebolApplication.class, args);
    }

    @Service
    public static class MyService {
        public String sayHi() {
            return "Hello Spring Initialized!";
        }

    }

//    @SpringUI(path = "EscolasFutebol/*")
//    public class VaadinUI extends UI {
//
//        public Navigator navigator;
//        protected static final String MAINVIEW = "campos";
//
//        @Override
//        protected void init(VaadinRequest request) {
//            navigator = new Navigator(this, this);
//            navigator.addView("campos", CamposView.class);
//            System.out.println("init do VaadinUI começou");
//            VerticalLayout layout = new VerticalLayout();
//            Label label = new Label("Página Inicial");
//            layout.addComponent(label);
//            layout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
//            Button btn = new Button("Go to 'Campos'");
//            btn.addClickListener(new Button.ClickListener() {
//                @Override
//                public void buttonClick(Button.ClickEvent clickEvent) {
//                    navigator.navigateTo(MAINVIEW);
//                }
//            });
//            layout.addComponent(btn);
//            setContent(layout);
//        }
//    }
}
