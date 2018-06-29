package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.classesjava.Equipa;
import com.projetoea.escolasfutebol.classesjava.EquipaDAO;
import com.projetoea.escolasfutebol.classesjava.Jogador;
import com.projetoea.escolasfutebol.classesjava.JogadorDAO;
import org.orm.PersistentException;
import org.springframework.stereotype.Component;

@Component
public class DiretorEscolaBean {
    public Equipa[] getEquipasDeEscola(int id) throws PersistentException {
        Equipa[] equipas = EquipaDAO.listEquipaByQuery("escolasID = '" + id + "'", null);
        return equipas;
    }

    public boolean setEquipa(Equipa equipa, Jogador jogador) throws PersistentException {
        JogadorDAO.getJogadorByORMID(jogador.getID()).setEquipa(EquipaDAO.getEquipaByORMID(equipa.getID()));
        JogadorDAO.save(JogadorDAO.getJogadorByORMID(jogador.getID()));
        JogadorDAO.refresh(JogadorDAO.getJogadorByORMID(jogador.getID()));
        EquipaDAO.refresh(EquipaDAO.getEquipaByORMID(equipa.getID()));
        return true;
    }

    public boolean removeFromEquipa(Jogador jogador) throws PersistentException
    {
        JogadorDAO.getJogadorByORMID(jogador.getID()).setEquipa(null);
        JogadorDAO.save(JogadorDAO.getJogadorByORMID(jogador.getID()));
        JogadorDAO.refresh(JogadorDAO.getJogadorByORMID(jogador.getID()));
        return true;
    }

}
