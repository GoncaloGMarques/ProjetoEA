package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.classesjava.*;
import org.orm.PersistentException;

import java.util.ArrayList;

public class ArbitroBean {
    public Jogo[] getJogosComFaltaDados(Arbitro arbitro) throws PersistentException {
        Jogo[] jogos = JogoDAO.listJogoByQuery("arbitroID ="+ arbitro.getORMID()+" AND golosEquipaCasa = null AND CURRENT_TIMESTAMP > Data", null);
        return jogos;
    }

    public Jogo[] getProximosJogos(Arbitro arbitro) throws PersistentException {
        Jogo[] jogos = JogoDAO.listJogoByQuery("arbitroID ="+ arbitro.getORMID()+" AND CURRENT_TIMESTAMP < Data", null);
        return jogos;
    }

    public void setEventosJogo(ArrayList<Eventojogo> eventosJogo) throws PersistentException {
        int equipaCasaGolos=0;
        int equipaForaGolos=0;

        for (Eventojogo eventojogo : eventosJogo) {
            Eventojogo novoEventoJogo = EventojogoDAO.createEventojogo();
            novoEventoJogo.setTipoeventojogo(TipoeventojogoDAO.loadTipoeventojogoByORMID(eventojogo.getTipoeventojogo().getORMID()));
            novoEventoJogo.setJogo(JogoDAO.getJogoByORMID(eventojogo.getJogo().getORMID()));
            novoEventoJogo.setMinuto(eventojogo.getMinuto());
            novoEventoJogo.setJogador(JogadorDAO.getJogadorByORMID(eventojogo.getJogador().getORMID()));
            EventojogoDAO.save(novoEventoJogo);
            if (eventojogo.getTipoeventojogo().getNome().equals("Golo"))
            {
                if (eventojogo.getJogador().getEquipa() == eventojogo.getJogo().getEquipaCasa())
                {
                    equipaCasaGolos++;
                }
                else
                {
                    equipaForaGolos++;
                }
            }
        }

        JogoDAO.loadJogoByORMID(eventosJogo.get(0).getJogo().getORMID()).setGolosEquipaCasa(equipaCasaGolos);
        JogoDAO.loadJogoByORMID(eventosJogo.get(0).getJogo().getORMID()).setGolosEquipaFora(equipaForaGolos);
        if (equipaCasaGolos> equipaForaGolos)
        {
            JogoDAO.loadJogoByORMID(eventosJogo.get(0).getJogo().getORMID()).setVencedor(EquipaDAO.getEquipaByORMID(eventosJogo.get(0).getJogo().getEquipaCasa().getORMID()));
        }
        else if (equipaCasaGolos< equipaForaGolos)
        {
            JogoDAO.loadJogoByORMID(eventosJogo.get(0).getJogo().getORMID()).setVencedor(EquipaDAO.getEquipaByORMID(eventosJogo.get(0).getJogo().getEquipaFora().getORMID()));
        }
        JogoDAO.save(JogoDAO.loadJogoByORMID(eventosJogo.get(0).getJogo().getORMID()));
    }
}
