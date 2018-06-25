package com.projetoea.escolasfutebol.Views;

import ch.qos.logback.core.util.ContentTypeUtil;
import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.projetoea.escolasfutebol.ClassesJava.UtilizadorDAO;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

@SpringView
public class LoginView  extends Composite implements View {

    private VerticalLayout verticalLayout;

    private Label errorUsernameLabel;
    private Label daoError;

    private String emptyUsername = "Username cannot be empty!";

    public LoginView(){
        verticalLayout = new VerticalLayout();
        HorizontalLayout horizontalLayout = new HorizontalLayout();
        HorizontalLayout horizontalLayout1 = new HorizontalLayout();

        verticalLayout.addComponent(horizontalLayout);
        verticalLayout.addComponent(horizontalLayout1);

        daoError = new Label("", ContentMode.HTML);
        daoError.addStyleName("Red");

        errorUsernameLabel = new Label("", ContentMode.HTML);
        errorUsernameLabel.addStyleName("Red");

        TextField usernameField = new TextField("Username");
        horizontalLayout.addComponent(usernameField);
        horizontalLayout.addComponent(errorUsernameLabel);

        TextField passwordField = new TextField("Password");
        horizontalLayout1.addComponent(passwordField);
        horizontalLayout.addComponent(daoError);

        Button loginBtn = new Button("Login", event -> {

            daoError.setValue("");
            errorUsernameLabel.setValue("");
            Utilizador user = null;
            String username = usernameField.getValue();
            if(username == null || username.isEmpty()) {
                errorUsernameLabel.setValue(emptyUsername);
                return;
            }
            String password = passwordField.getValue();
            if(password == null || password.isEmpty()) password = "";
            try {
                user = tryLogin(username, password);
            } catch (PersistentException e) {
                daoError.setValue(e.getMessage());
            }

            if(user != null)
                verticalLayout.addComponent(new Label("Logged in as " + user.getNome()));
        });
        verticalLayout.addComponent(loginBtn);

        setCompositionRoot(verticalLayout);
    }

    private Utilizador tryLogin(String username, String password) throws PersistentException {
        String condition = " Nome = '" + username + "'";
        if(!password.isEmpty()) {
            condition += " and Password = '" + password + "'";
        }
        getSession().setAttribute("myValue", 1);
        return UtilizadorDAO.loadUtilizadorByQuery(condition,"Nome");
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
