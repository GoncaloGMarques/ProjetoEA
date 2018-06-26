package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.UserBean;
import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.projetoea.escolasfutebol.VaadinUI;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinSession;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import javax.rmi.CORBA.Util;
import java.io.Console;
import java.util.AbstractMap;

import static java.lang.System.out;

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

    private Button loginUserBtn;

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

        loginUserBtn = new Button("Login", event -> {
            if(login()) {
                switch (user.getTipoutilizador().getID()){
                    case 1:{updateUI("EscolasFutebol/DiretorAssociacao");} break;
                    case 2:{updateUI("EscolasFutebol/DiretorEscola");} break;
                    case 3:{updateUI("EscolasFutebol/Arbitro");} break;
                    default:{
                        daoError.setValue("Error Parsing 'Tipo Utilizador'");
                    } break;
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
        if(!link.isEmpty()) {
            getUI().getPage().setLocation(link);

            /* Set a new Session Attribute */
            getSession().setAttribute(Utilizador.class, user);
            out.println("LOGIN LOG: " + getSession().getAttribute(Utilizador.class)
                    + "   STATUS: " + getSession().getState()
                    + "   LINK: " + getUI().getPage().getLocation().toString()
                    + "   NEXT: " + link);
        }

        verticalLayout.addComponent(new Label("Logged in as " + user.getNome()));
    }

    private boolean login() {
        loginUserBtn.setEnabled(false);

        AbstractMap.SimpleEntry<String, String> loginPair = verifyInput();
        if(loginPair.getKey().isEmpty()) return false;
        user = tryGetUser(loginPair.getKey(), loginPair.getValue());

        loginUserBtn.setEnabled(true);
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
