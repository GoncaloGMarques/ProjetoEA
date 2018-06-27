package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.ClassesJava.Jogo;
import com.projetoea.escolasfutebol.ClassesJava.JogoDAO;
import org.orm.PersistentException;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.*;

@Component
public class GuestBean {

    public Jogo[] GetJogosHoje() throws PersistentException {
        LocalDateTime today = LocalDateTime.now();
        LocalDateTime aWeek = LocalDateTime.now().plus(10, ChronoUnit.DAYS);
        Jogo[] jogos = JogoDAO.listJogoByQuery("Data > '"+today.toString()+"' AND Data < '"+aWeek+"'" , "Data");
        return jogos;
    }

    public Jogo[] GetJogoData(LocalDate data) throws PersistentException
    {
        LocalDateTime startOfDay = data.atStartOfDay();
        LocalDateTime emdOdDay = data.atStartOfDay().plus(1, ChronoUnit.DAYS);
        Jogo[] jogos = JogoDAO.listJogoByQuery("Data > '"+startOfDay.toString()+"' AND Data < '"+emdOdDay+"'" , "Data");
        return jogos;
    }
}
