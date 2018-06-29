package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.classesjava.*;
import org.orm.PersistentException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;

@Component
public class DiretorEscolaBean {
    public Equipa[] getEquipasDeEscola(int id) throws PersistentException {
        Equipa[] equipas = EquipaDAO.listEquipaByQuery("escolasID = '" + id + "'", null);
        return equipas;
    }

    public boolean setEquipa(Equipa equipa, Jogador jogador) throws PersistentException {
        JogadorDAO.getJogadorByORMID(jogador.getORMID()).setEquipa(EquipaDAO.getEquipaByORMID(equipa.getORMID()));
        JogadorDAO.save(JogadorDAO.getJogadorByORMID(jogador.getORMID()));
        JogadorDAO.refresh(JogadorDAO.getJogadorByORMID(jogador.getORMID()));
        EquipaDAO.refresh(EquipaDAO.getEquipaByORMID(equipa.getORMID()));
        return true;
    }

    public void createEquipa(int id, ArrayList<Jogador> jogadoresAdicionar, String nomeEquipa) throws PersistentException {
        Equipa equipa = EquipaDAO.createEquipa();
        equipa.setCampo(CampoDAO.getCampoByORMID(1));
        equipa.setEscolas(EscolasDAO.loadEscolasByQuery("ID = "+ id, null));
        equipa.setNome(nomeEquipa);
        EquipaDAO.save(equipa);
        for (Jogador jogador: jogadoresAdicionar) {
            JogadorDAO.getJogadorByORMID(jogador.getORMID()).setEquipa(EquipaDAO.getEquipaByORMID(equipa.getORMID()));
            JogadorDAO.save(JogadorDAO.getJogadorByORMID(jogador.getORMID()));
        }
    }

    public boolean removeFromEquipa(Jogador jogador) throws PersistentException
    {
        JogadorDAO.getJogadorByORMID(jogador.getORMID()).setEquipa(null);
        JogadorDAO.save(JogadorDAO.getJogadorByORMID(jogador.getORMID()));
        JogadorDAO.refresh(JogadorDAO.getJogadorByORMID(jogador.getORMID()));
        return true;
    }

}
