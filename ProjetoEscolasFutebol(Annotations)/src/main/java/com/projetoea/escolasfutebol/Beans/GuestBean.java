package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.classesjava.*;
import org.orm.PersistentException;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

@Component
public class GuestBean {

    public Jogo[] GetJogosHoje() throws PersistentException {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime aWeek = LocalDateTime.now().plus(10, ChronoUnit.DAYS);
        Jogo[] jogos = JogoDAO.listJogoByQuery("Data > '"+today.toString()+"' AND Data < '"+aWeek+"'" , "Data");
        return jogos;
    }

    public Jogo[] GetJogoByData(LocalDate data) throws PersistentException
    {
        LocalDateTime startOfDay = data.atStartOfDay();
        LocalDateTime emdOdDay = data.atStartOfDay().plus(1, ChronoUnit.DAYS);
        Jogo[] jogos = JogoDAO.listJogoByQuery("Data > '"+startOfDay.toString()+"' AND Data < '"+emdOdDay+"'" , "Data");
        return jogos;
    }

    public Torneio[] GetTorneiosEmJogo() throws PersistentException
    {
        Torneio[] torneios = TorneioDAO.listTorneioByQuery("datafim > CURRENT_TIMESTAMP() AND datainicio < CURRENT_TIMESTAMP()" , "datafim");
        return torneios;
    }

    public Torneio[] GetTorneiosTerminados() throws PersistentException
    {
        Torneio[] torneios = TorneioDAO.listTorneioByQuery("datafim < CURRENT_TIMESTAMP()" , "datafim");
        return torneios;
    }

    public Participantecampeonato[] GetParticipantesCampeonato() throws PersistentException
    {
        Participantecampeonato[] participantes = ParticipantecampeonatoDAO.listParticipantecampeonatoByQuery(null,null);
        return participantes;
    }
}
