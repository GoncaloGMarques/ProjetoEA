package com.projetoea.escolasfutebol;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.navigator.Navigator;
import com.vaadin.navigator.View;
import com.vaadin.server.VaadinRequest;
import com.vaadin.server.VaadinServlet;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.*;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@Theme("valo")
public class StartView implements View {

//    public StartView() {
//        VerticalLayout layout = new VerticalLayout();
//        Label label = new Label("Página Inicial");
//        layout.addComponent(label);
//        layout.setDefaultComponentAlignment(Alignment.MIDDLE_CENTER);
//        Button btn = new Button("Go to 'Campos'");
//        btn.addClickListener(new Button.ClickListener() {
//            @Override
//            public void buttonClick(Button.ClickEvent clickEvent) {
//                navigador().navigateTo(MAINVIEW);
//            }
//        });
//        layout.addComponent(btn);
//    }
//
//    @WebServlet(urlPatterns = "EscolasFutebol/")
//    @VaadinServletConfiguration(ui = EscolasfutebolApplication.VaadinUI.class, productionMode =    false)
//    public class Servlet extends VaadinServlet
//    {
//
//    }


}
