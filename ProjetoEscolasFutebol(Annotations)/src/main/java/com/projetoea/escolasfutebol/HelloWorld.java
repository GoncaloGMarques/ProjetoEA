package com.projetoea.escolasfutebol;

import com.projetoea.escolasfutebol.classesjava.Campo;
import com.projetoea.escolasfutebol.classesjava.CampoDAO;
import org.orm.PersistentException;

public class HelloWorld {
    private String message;

    public void setMessage(String message){
        this.message  = message;
    }
    public String getMessage(){
        try {
            Campo[] l = CampoDAO.listCampoByQuery(null, null);
            message = l[0].getNome();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return message;
    }
}
