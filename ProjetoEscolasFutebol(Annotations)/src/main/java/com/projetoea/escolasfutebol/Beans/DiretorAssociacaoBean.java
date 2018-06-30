package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.classesjava.*;
import org.orm.PersistentException;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DiretorAssociacaoBean extends UserBean {

    public void removerEscola(Escolas escola) throws PersistentException {
        EscolasDAO.deleteAndDissociate(EscolasDAO.getEscolasByORMID(escola.getID()));
    }

    public Escolas criarEscola(String Nome, int associacaoId, int diretorEscolaID) throws PersistentException {
        Utilizador diretorEscola = UtilizadorDAO.loadUtilizadorByQuery("ID = " + diretorEscolaID, "ID");
        return criarEscola(Nome, associacaoId, diretorEscola);
    }

    public Escolas criarEscola(String Nome, int associacaoId, Utilizador diretorEscola) throws PersistentException {
        Escolas newEscola = EscolasDAO.createEscolas();
        newEscola.setDiretorEscola(diretorEscola);
        newEscola.setNome(Nome);
        newEscola.setAssociacao(AssociacaoDAO.loadAssociacaoByQuery("ID = " + associacaoId, "ID"));
        EscolasDAO.save(newEscola);
        return newEscola;
    }

    public Escolas getEscola(String nomeEscola) throws PersistentException {
        return EscolasDAO.loadEscolasByQuery("Nome = " + nomeEscola, "ID");
    }

    public List<Escolas> getEscolas() throws PersistentException {
        Escolas[] escolas = EscolasDAO.listEscolasByQuery(null, null);
        return Arrays.asList(escolas);
    }

    public Torneio[] getFuturosTorneios() throws PersistentException
    {
        return TorneioDAO.listTorneioByQuery(
                "datafim > CURRENT_TIMESTAMP() AND datainicio > CURRENT_TIMESTAMP()" , "datainicio");
    }

    public Torneio criarTorneio(String nome, Timestamp dataInicio, Timestamp dataFim) throws PersistentException {
        Torneio torneio = TorneioDAO.createTorneio();
        torneio.setNome(nome);
        torneio.setDatainicio(dataInicio);
        torneio.setDatafim(dataFim);
        TorneioDAO.save(torneio);
        return torneio;
    }

    public Equipa getEquipa(String nome) throws PersistentException {
        return EquipaDAO.loadEquipaByQuery("Nome = " + nome, null);
    }

    //TODO: Test this method
    public Grupo criarGrupoTorneio(String nomeGrupo, Torneio torneio) throws PersistentException {
        Grupo grupo = GrupoDAO.createGrupo();
        grupo.setTorneio(torneio);
        if(nomeGrupo.contains(torneio.getNome() + "_"))
            nomeGrupo = torneio.getNome() + "_" + nomeGrupo;
        grupo.setNome(nomeGrupo);
        GrupoDAO.save(grupo);
        return grupo;
    }

    //TODO: Test this method
    public Partcipantetorneio adicionarEquipasToTorneio(Equipa equipa, Grupo grupo, Torneio torneio) throws PersistentException {
        Partcipantetorneio partcipantetorneio = PartcipantetorneioDAO.createPartcipantetorneio();
        partcipantetorneio.setEquipa(equipa);
        partcipantetorneio.setGrupo(grupo);
        partcipantetorneio.setTorneio(torneio);
        PartcipantetorneioDAO.save(partcipantetorneio);
        return partcipantetorneio;
    }

    public List<Equipa> getEquipasSemTorneio(int page, int entriesPerPage) throws PersistentException {
        boolean teamFound;
        List<Partcipantetorneio> participantesTorneio;
        List<Equipa> equipas;
        List<Equipa> equipasSemTorneio = new ArrayList<>();

        int start;
        int end = 0;

        int equipasTableSize = EquipaDAO.queryEquipaEntriesCount();
        Equipa auxLoopEquipa;
        while (end < equipasTableSize) {

            start = page * entriesPerPage;
            end = start + entriesPerPage;

            participantesTorneio = Arrays.asList(PartcipantetorneioDAO.listPartcipantetorneioByQuery(
                    null, null, String.valueOf(entriesPerPage), String.valueOf(start)));
            equipas = Arrays.asList(EquipaDAO.listEquipaByQuery(
                    null, null, String.valueOf(entriesPerPage), String.valueOf(start)));
            if(equipas.size() == 0)
                break;

            for (Equipa equipa : equipas)
            {
                auxLoopEquipa = equipa;
                teamFound = true;
                for (Partcipantetorneio equipaTorneio : participantesTorneio)
                {
                    if (equipa.getID() == equipaTorneio.getEquipa().getID())
                    {
                        teamFound = false;
                        break;
                    }
                }
                if (teamFound)
                    equipasSemTorneio.add(auxLoopEquipa);
            }
            if (equipasSemTorneio.size() > entriesPerPage / 2) break;
            else page += 1;
        }
        return equipasSemTorneio.stream().limit(entriesPerPage).collect(Collectors.toList());
    }

    public Stream<Equipa> getEquipas() throws PersistentException {
        Equipa[] equipas = EquipaDAO.listEquipaByQuery(null, null);
        return Arrays.stream(equipas);
    }


    public Rondatorneio criarRondaTorneio(int numEquipas, Torneio torneio) throws PersistentException {
        Rondatorneio newRonda = RondatorneioDAO.createRondatorneio();
        int fase = numEquipas / 2;
        Fase faseDO = FaseDAO.loadFaseByQuery("nomefase = " + fase, null);
        newRonda.setFase(faseDO);
        newRonda.setTorneio(torneio);
        RondatorneioDAO.save(newRonda);
        return newRonda;
    }

    public void criarJogosRonda(LocalDateTime inicioJogo, Equipa equipaCasa, Equipa equipaFora, Rondatorneio rondatorneio) throws PersistentException {
        criarJogo(inicioJogo, equipaCasa, equipaFora, rondatorneio);
    }

    public Jogo criarJogo(LocalDateTime inicioJogo, Equipa equipaCasa, Equipa equipaFora, Rondatorneio rondatorneio) throws PersistentException {
        Jogo newJogo = JogoDAO.createJogo();
        newJogo.setEquipaCasa(equipaCasa);
        newJogo.setEquipaFora(equipaFora);
        newJogo.setArbitro(ArbitroDAO.getArbitroByORMID(1));
        newJogo.setRondatorneio(rondatorneio);
        newJogo.setCampo(equipaCasa.getCampo());
        newJogo.setData(Timestamp.valueOf(inicioJogo));
        JogoDAO.save(newJogo);
        return newJogo;
    }

    public void criarJogosCampeonato(List<Equipa> participantes, Rondacampeonato rondacampeonato) throws PersistentException {

        int year = LocalDateTime.now().getYear();
        LocalDateTime localDateTimeStart = LocalDateTime.of(year, 9, 2, 21, 0);
        LocalDateTime localDataTimeEnd = LocalDateTime.of(year + 1, 5, 21, 0, 0);

        int counter = 0;
        int gamesCounter = 0;

        while(true) {
            LocalDateTime weekStart = localDateTimeStart.plus(counter, ChronoUnit.WEEKS);

            if(weekStart.isAfter(localDataTimeEnd)){ break; }
            int gamesPerDay = 4;
            for (int i = 0; i < participantes.size(); i += 2) {

                Jogo jogoCampeonato = JogoDAO.createJogo();

                jogoCampeonato.setRondacampeonato(rondacampeonato);

                Equipa equipaCasa = participantes.get(i);
                jogoCampeonato.setEquipaCasa(equipaCasa);
                jogoCampeonato.setEquipaFora(participantes.get(i + 1));

                jogoCampeonato.setCampo(equipaCasa.getCampo());
                jogoCampeonato.setArbitro(ArbitroDAO.getArbitroByORMID(1));

                if(gamesPerDay == gamesCounter) {
                    jogoCampeonato.setData(Timestamp.valueOf(weekStart.plus(1, ChronoUnit.DAYS)));
                    gamesCounter = 0;
                } else {
                    jogoCampeonato.setData(Timestamp.valueOf(weekStart));
                    gamesCounter += 1;
                }

                JogoDAO.save(jogoCampeonato);
            }
            counter += 1;
        }
    }

    public Rondacampeonato criarRondaCampeonato(Campeonato campeonato) {
        Rondacampeonato rondacampeonato = RondacampeonatoDAO.createRondacampeonato();
        rondacampeonato.setCampeonato(campeonato);
        try { RondacampeonatoDAO.save(rondacampeonato); }
        catch (PersistentException e) { e.printStackTrace(); }
        return rondacampeonato;
    }

    public void criarParticipantes(Campeonato campeonato, Collection<Equipa> participantes){
        participantes.forEach(participante -> {
            Participantecampeonato participantecampeonato = ParticipantecampeonatoDAO.createParticipantecampeonato();
            participantecampeonato.setCampeonato(campeonato);
            participantecampeonato.setEquipa(participante);

            participantecampeonato.setPontos(0);
            participantecampeonato.setGolosmarcados(0);
            participantecampeonato.setGolossofridos(0);
            try {
                ParticipantecampeonatoDAO.save(participantecampeonato);
            } catch (PersistentException e) { e.printStackTrace(); }
        });
    }

    public Campeonato criarCampeonato(String nome) throws PersistentException {
        Campeonato newCampeonato = CampeonatoDAO.createCampeonato();
        newCampeonato.setNome(nome);
        CampeonatoDAO.save(newCampeonato);
        return newCampeonato;
    }
}
