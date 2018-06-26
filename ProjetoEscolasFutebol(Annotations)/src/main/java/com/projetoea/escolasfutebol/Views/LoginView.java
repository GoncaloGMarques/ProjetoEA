package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.UserBean;
import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.projetoea.escolasfutebol.VaadinUI;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import javax.rmi.CORBA.Util;
import java.util.AbstractMap;

@SpringView
@Theme("darktheme")
public class LoginView  extends Composite implements View {

    private VerticalLayout verticalLayout;
    private Label errorUsernameLabel;
    private Label daoError;
    private String emptyUsername = "Username cannot be empty!";

    private TextField usernameField;
    private TextField passwordField;

    private Utilizador user = null;

    private String username;
    private String password;

    public LoginView(){
        verticalLayout = new VerticalLayout();
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        HorizontalLayout horizontalLayout1 = new HorizontalLayout();
        HorizontalLayout horizontalLayout2 = new HorizontalLayout();

        verticalLayout.addComponent(horizontalLayout);
        verticalLayout.addComponent(horizontalLayout1);
        verticalLayout.addComponent(horizontalLayout2);

        daoError = new Label("");
        daoError.addStyleName("v-error-label");

        errorUsernameLabel = new Label("");
        errorUsernameLabel.addStyleName("v-error-label-Input");

        usernameField = new TextField("Username");
        horizontalLayout.addComponent(usernameField);
        horizontalLayout.addComponent(errorUsernameLabel);

        passwordField = new TextField("Password");
        horizontalLayout1.addComponent(passwordField);

        Button loginUserBtn = new Button("Login", event -> {
            if(login()) {
                switch (user.getTipoutilizador().getID()){
                    case 1:{updateUI("EscolasFutebol/DiretorAssociacao");}
                    case 2:{updateUI("EscolasFutebol/DiretorEscola");}
                    case 3:{updateUI("EscolasFutebol/Arbitro");}
                    default:{
                        daoError.setValue("Error Parsing 'Tipo Utilizador'");
                    }
                }
            }else {
                daoError.setValue("Could Not Login");
            }
        });

        horizontalLayout2.addComponent(loginUserBtn);
        horizontalLayout2.addComponent(daoError);
        setCompositionRoot(verticalLayout);
    }

    private void updateUI(String link) {
        VaadinUI currentUI = (VaadinUI) UI.getCurrent();
        currentUI.userName.setValue(user.getNome());

        if(!link.isEmpty()) {
            UI.getCurrent().getPage().setLocation(link);
            UI.getCurrent().getSession().setAttribute(Utilizador.class, user);
        }

        verticalLayout.addComponent(new Label("Logged in as " + user.getNome()));
    }

    private boolean login() {
        AbstractMap.SimpleEntry<String, String> loginPair = verifyInput();
        if(loginPair.getKey().isEmpty()) return false;
        user = tryGetUser(loginPair.getKey(), loginPair.getValue());
        return user != null;
    }

    private AbstractMap.SimpleEntry<String, String> verifyInput() {
        daoError.setValue("");
        errorUsernameLabel.setValue("");

        username = usernameField.getValue();
        if (username == null || username.isEmpty()) {
            errorUsernameLabel.setValue(emptyUsername);
            return new AbstractMap.SimpleEntry<>("", "");
        }
        password = passwordField.getValue();
        return new AbstractMap.SimpleEntry<>(username, password);
    }

    private Utilizador tryGetUser(String username, String password) {
        UserBean userBean = EscolasfutebolApplication.applicationBeansContext.getBean("UserBean", UserBean.class);
        try {
            user = userBean.getUtilizador(username, password);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return user;
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        daoError.setValue("");
        errorUsernameLabel.setValue("");

        usernameField.setValue("");
        passwordField.setValue("");
    }
}
