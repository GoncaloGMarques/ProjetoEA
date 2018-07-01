package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.classesjava.*;
import org.orm.PersistentException;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;
import java.util.List;

@Component
public class GuestBean {

    public Jogo[] getJogosHoje() throws PersistentException {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime aWeek = LocalDateTime.now().plus(10, ChronoUnit.DAYS);
        Jogo[] jogos = JogoDAO.listJogoByQuery("Data > '"+today.toString()+"' AND Data < '"+aWeek+"'" , "Data");
        return jogos;
    }

    public Jogo[] getJogoByData(LocalDate data) throws PersistentException
    {
        LocalDateTime startOfDay = data.atStartOfDay();
        LocalDateTime emdOdDay = data.atStartOfDay().plus(1, ChronoUnit.DAYS);
        Jogo[] jogos = JogoDAO.listJogoByQuery("Data > '"+startOfDay.toString()+"' AND Data < '"+emdOdDay+"'" , "Data");
        return jogos;
    }

    public Torneio[] getTorneiosEmJogo() throws PersistentException
    {
        Torneio[] torneios = TorneioDAO.listTorneioByQuery("datafim > CURRENT_TIMESTAMP() AND datainicio < CURRENT_TIMESTAMP()" , "datafim");
        return torneios;
    }

    public Torneio[] getTorneiosTerminados() throws PersistentException
    {
        Torneio[] torneios = TorneioDAO.listTorneioByQuery("datafim < CURRENT_TIMESTAMP()" , "datafim");
        return torneios;
    }


    public Participantecampeonato[] getParticipantesByCampeonato(Campeonato campeonato) throws PersistentException {
        return ParticipantecampeonatoDAO.listParticipantecampeonatoByQuery("ID = " + campeonato.getID(),null);
    }

    public Participantecampeonato[] getParticipantesCampeonato() throws PersistentException
    {
        Participantecampeonato[] participantes = ParticipantecampeonatoDAO.listParticipantecampeonatoByQuery(null,null);
        return participantes;
    }

    public List<Campeonato> getCampeonatos() throws PersistentException{
        return Arrays.asList(CampeonatoDAO.listCampeonatoByQuery(null, null));
    }
}
