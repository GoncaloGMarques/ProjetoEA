package com.projetoea.escolasfutebol;

import com.vaadin.annotations.DesignRoot;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.ThemeResource;
import com.vaadin.ui.*;
import com.vaadin.ui.declarative.Design;

import static com.projetoea.escolasfutebol.EscolasfutebolApplication.VaadinUI.MAINVIEW;

@DesignRoot
public class MainView extends VerticalLayout implements View {
    // Menu navigation button listener
    class ButtonListener implements Button.ClickListener {
        String menuitem;
        public ButtonListener(String menuitem) {
            this.menuitem = menuitem;
        }

        @Override
        public void buttonClick(Button.ClickEvent event) {
            // Navigate to a specific state
            UI.getCurrent().getNavigator().navigateTo(MAINVIEW + "/" + menuitem);
        }
    }

    VerticalLayout menuContent;
    Panel equalPanel;
    Button logout;

    public MainView() {
        // Allow going back to the start

        Button button = new Button("Logout",
                (Button.ClickListener) event -> UI.getCurrent().getNavigator().navigateTo(""));
        addComponent(button);
        setComponentAlignment(button, Alignment.MIDDLE_CENTER);
    }

    @DesignRoot
    class AnimalViewer extends VerticalLayout {
        Label watching;
        Embedded pic;
        Label back;

        public AnimalViewer(String animal) {
            Design.read(this);

            watching.setValue("You are currently watching a " +
                    animal);
            pic.setSource(new ThemeResource(
                    "img/" + animal + "-128px.png"));
            back.setValue("and " + animal +
                    " is watching you back");
        }
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        if (event.getParameters() == null
                || event.getParameters().isEmpty()) {
            equalPanel.setContent(
                    new Label("Nothing to see here, " +
                            "just pass along."));
            return;
        } else
            equalPanel.setContent(new AnimalViewer(
                    event.getParameters()));
    }
}
