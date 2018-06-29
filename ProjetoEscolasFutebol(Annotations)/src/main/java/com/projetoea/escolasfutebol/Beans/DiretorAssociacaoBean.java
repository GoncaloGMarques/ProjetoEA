package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.classesjava.*;
import javafx.util.converter.TimeStringConverter;
import org.orm.PersistentException;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

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
        for (int i = 0; i < rondatorneio.getFase().getNomefase(); i++) {
            criarJogo(inicioJogo, equipaCasa, equipaFora, rondatorneio);
        }
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
}
