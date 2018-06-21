package com.projetoea.escolasfutebol;

import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.SingleComponentContainer;

public class FontController {

    public static void route(VaadinRequest request, SingleComponentContainer components) {
        String path = VaadinRequest.getCurrent().getPathInfo();
        System.out.println(VaadinRequest.getCurrent().getParameter("campos"));
        if ("campos".equals(path))
        {
            System.out.println("Queres os campos");
        }
        else if ("escolas".equals(path))
        {
            System.out.println("Queres as escolas");
        }
    }
}
