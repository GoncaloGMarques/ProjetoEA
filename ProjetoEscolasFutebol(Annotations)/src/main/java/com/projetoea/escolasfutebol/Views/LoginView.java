package com.projetoea.escolasfutebol.Views;

import ch.qos.logback.core.util.ContentTypeUtil;
import com.projetoea.escolasfutebol.Beans.UserBean;
import com.projetoea.escolasfutebol.Beans.UserBeanConfig;
import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.projetoea.escolasfutebol.ClassesJava.UtilizadorDAO;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.projetoea.escolasfutebol.VaadinUI;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.shared.ui.ContentMode;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.spring.internal.SpringBeanUtil;
import com.vaadin.ui.*;
import org.orm.PersistentException;
import org.springframework.context.ApplicationContext;
import org.springframework.web.SpringServletContainerInitializer;

import java.beans.beancontext.BeanContext;

@SpringView
@Theme("darktheme")
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

        daoError = new Label("");
        daoError.addStyleName("v-error-label");

        errorUsernameLabel = new Label("");
        errorUsernameLabel.addStyleName("v-error-label");

        TextField usernameField = new TextField("Username");
        horizontalLayout.addComponent(usernameField);
        horizontalLayout.addComponent(errorUsernameLabel);

        TextField passwordField = new TextField("Password");
        horizontalLayout1.addComponent(passwordField);
        horizontalLayout1.addComponent(daoError);
        Button loginPresidenteBtn = new Button("Login Presidente", event -> {

        });
        Button loginArbitroBtn = new Button("Login Arbitro", event -> {

        });
        Button loginUserBtn = new Button("Login", event -> {

            daoError.setValue("");
            errorUsernameLabel.setValue("");

            Utilizador user = null;

            String username = usernameField.getValue();
            if (username == null || username.isEmpty()) {
                errorUsernameLabel.setValue(emptyUsername);
                return;
            }
            String password = passwordField.getValue();
            if (password == null || password.isEmpty()) password = "";
            UserBean userBean = EscolasfutebolApplication.applicationBeansContext.getBean("UserBean", UserBean.class);
            try {
                user = userBean.getUtilizador(username, password);
            } catch (PersistentException e) {
                e.printStackTrace();
            }

            if (user != null) {
                VaadinUI currentUI = (VaadinUI) UI.getCurrent();
                currentUI.userName.setValue(user.getNome());
                verticalLayout.addComponent(new Label("Logged in as " + user.getNome()));
            }
        });
        verticalLayout.addComponent(loginUserBtn);
        verticalLayout.addComponent(loginArbitroBtn);
        verticalLayout.addComponent(loginPresidenteBtn);

        setCompositionRoot(verticalLayout);
    }


    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {

    }
}
