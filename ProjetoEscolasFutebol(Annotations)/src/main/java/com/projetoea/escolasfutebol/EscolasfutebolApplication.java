package com.projetoea.escolasfutebol;

import com.projetoea.escolasfutebol.Beans.AppConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Service;

@SpringBootApplication
public class EscolasfutebolApplication {

    public static AnnotationConfigApplicationContext applicationBeansContext;

    public static void main(String[] args) {
        applicationBeansContext = new AnnotationConfigApplicationContext(AppConfig.class);
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
