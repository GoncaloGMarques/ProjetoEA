package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.classesjava.Tipoutilizador;
import com.projetoea.escolasfutebol.classesjava.TipoutilizadorDAO;
import com.projetoea.escolasfutebol.classesjava.Utilizador;
import com.projetoea.escolasfutebol.classesjava.UtilizadorDAO;
import org.orm.PersistentException;

public class UserBean {

    public Utilizador createUtilizador(String nome, String email, String password, int tipoUtilizador) throws PersistentException {
        Utilizador newUser = UtilizadorDAO.createUtilizador();
        newUser.setNome(nome);
        newUser.setEmail(email);
        newUser.setPassword(password);
        Tipoutilizador tipoutilizador = TipoutilizadorDAO.loadTipoutilizadorByQuery("ID = " + tipoUtilizador, null);
        newUser.setTipoutilizador(tipoutilizador);
        UtilizadorDAO.save(newUser);
        return newUser;
    }

    public Utilizador getUtilizadorByID(int ID) throws PersistentException {
        return UtilizadorDAO.loadUtilizadorByQuery("ID = " + ID, "ID");
    }

    public Utilizador getUtilizador(String name, String password) throws PersistentException {
        return tryLogin(name,password);
    }

    private Utilizador tryLogin(String username, String password) throws PersistentException {
        String condition = " Nome = '" + username + "'";
        if(!password.isEmpty()) {
            condition += " and Password = '" + password + "'";
        }
        return UtilizadorDAO.loadUtilizadorByQuery(condition,"Nome");
    }
}
