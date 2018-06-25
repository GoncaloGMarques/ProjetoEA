package com.projetoea.escolasfutebol.Views;

import com.mchange.v2.collection.MapEntry;
import com.projetoea.escolasfutebol.Beans.UserBean;
import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.projetoea.escolasfutebol.DiretorAssociacaoVaadinUI;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.projetoea.escolasfutebol.VaadinUI;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import java.util.AbstractMap;
import java.util.Map;

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

        verticalLayout.addComponent(horizontalLayout);
        verticalLayout.addComponent(horizontalLayout1);

        daoError = new Label("");
        daoError.addStyleName("v-error-label");

        errorUsernameLabel = new Label("");
        errorUsernameLabel.addStyleName("v-error-label");

        usernameField = new TextField("Username");
        horizontalLayout.addComponent(usernameField);
        horizontalLayout.addComponent(errorUsernameLabel);

        passwordField = new TextField("Password");
        horizontalLayout1.addComponent(passwordField);
        horizontalLayout1.addComponent(daoError);
        Button loginPresidenteBtn = new Button("Login Presidente", event -> {
            if(login()) {
                updateUI("EscolasFutebol/DiretorAssociacao");
            }else {
                daoError.setValue("Could Not Login");
            }
        });
        Button loginArbitroBtn = new Button("Login Arbitro", event -> {
            //if(login()) {
            daoError.setValue("Could Not Login as 'Arbitro'  (NOT IMPLEMENTED YET) ");
            //}
        });
        Button loginUserBtn = new Button("Login", event -> {
            if(login()) {
                updateUI("");
            }else {
                daoError.setValue("Could Not Login");
            }
        });
        verticalLayout.addComponent(loginUserBtn);
        verticalLayout.addComponent(loginArbitroBtn);
        verticalLayout.addComponent(loginPresidenteBtn);

        setCompositionRoot(verticalLayout);
    }

    //"EscolasFutebol/DiretorAssociacao"
    private void updateUI(String link) {
        VaadinUI currentUI = (VaadinUI) UI.getCurrent();
        currentUI.userName.setValue(user.getNome());

        if(!link.isEmpty()) {
            //UI.setCurrent(DiretorAssociacaoVaadinUI.getInstance());
            UI.getCurrent().getPage().setLocation(link);
        }
        //currentUI.getNavigator().navigateTo(link);

        verticalLayout.addComponent(new Label("Logged in as " + user.getNome()));
    }

    private boolean login() {
        AbstractMap.SimpleEntry<String, String> loginPair = verifyInput();
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
        daoError = new Label("");
        errorUsernameLabel = new Label("");

        usernameField.setValue("");
        passwordField.setValue("");
    }
}
