package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.ClassesJava.Utilizador;
import com.projetoea.escolasfutebol.ClassesJava.UtilizadorDAO;
import com.vaadin.server.VaadinSession;
import org.orm.PersistentException;

public class UserBean {

    public Utilizador getUtilizador(String name, String password) throws PersistentException {
        Utilizador user = tryLogin(name,password);
        return user;
    }

    private Utilizador tryLogin(String username, String password) throws PersistentException {
        String condition = " Nome = '" + username + "'";
        if(!password.isEmpty()) {
            condition += " and Password = '" + password + "'";
        }
        return UtilizadorDAO.loadUtilizadorByQuery(condition,"Nome");
    }
}
