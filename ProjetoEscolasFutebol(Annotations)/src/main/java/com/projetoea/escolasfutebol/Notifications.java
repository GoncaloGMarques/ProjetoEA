package com.projetoea.escolasfutebol;

import com.vaadin.server.Page;
import com.vaadin.ui.Notification;

public class Notifications {

    public static void showErrorNotification(String whatHappened){
        Notification errorNotification = new Notification("Erro", null, Notification.Type.ERROR_MESSAGE);
        errorNotification.setCaption(whatHappened);
        errorNotification.show(Page.getCurrent());
    }

    private static void showWarningNotification(String warningMessage){
        Notification warningNotification = new Notification("Importante", null, Notification.Type.WARNING_MESSAGE);
        warningNotification.setCaption(warningMessage);
        warningNotification.show(Page.getCurrent());
    }

    public static void showSuccessNotification(String whatDidGoRight) {
        Notification warningNotification = new Notification("Importante", null, Notification.Type.WARNING_MESSAGE);
        warningNotification.setCaption(whatDidGoRight);
        warningNotification.show(Page.getCurrent());
    }
}
