package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.UserBean;
import com.projetoea.escolasfutebol.VaadinUI;
import com.vaadin.annotations.Theme;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.Composite;
import com.vaadin.ui.HorizontalLayout;
import com.vaadin.ui.Label;
import com.vaadin.ui.UI;

import java.net.URI;

import static com.projetoea.escolasfutebol.EscolasfutebolApplication.applicationBeansContext;

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
        UI.getCurrent().getSession().close();
        UI.getCurrent().getPage().setLocation(URI.create("http://localhost:8080/EscolasFutebol"));
        UI.getCurrent().close();
    }
}
