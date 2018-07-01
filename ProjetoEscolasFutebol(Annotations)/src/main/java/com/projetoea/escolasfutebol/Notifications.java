package com.projetoea.escolasfutebol;

import com.vaadin.server.Page;
import com.vaadin.ui.Notification;

public class Notifications {

    public static Notification errorNotification = new Notification("Erro", null, Notification.Type.ERROR_MESSAGE);
    public static Notification warningNotification = new Notification("Importante", null, Notification.Type.WARNING_MESSAGE);
    public static Notification humanizedNotification = new Notification("Sucesso", null, Notification.Type.HUMANIZED_MESSAGE);

    public static void showErrorNotification(String whatHappened){
        errorNotification.setCaption(whatHappened);
        errorNotification.show(Page.getCurrent());
    }

    private static void showWarningNotification(String warningMessage){
        warningNotification.setCaption(warningMessage);
        warningNotification.show(Page.getCurrent());
    }

    public static void showSuccessNotification(String whatDidGoRight) {
        warningNotification.setCaption(whatDidGoRight);
        warningNotification.show(Page.getCurrent());
    }

}
