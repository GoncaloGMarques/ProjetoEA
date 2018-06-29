package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.classesjava.*;
import org.orm.PersistentException;

import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

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
        Torneio[] torneios = TorneioDAO.listTorneioByQuery(
                "datafim > CURRENT_TIMESTAMP() AND datainicio > CURRENT_TIMESTAMP()" , "datainicio");
        return torneios;
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

    public Grupo criarGrupoTorneio(String nomeGrupo, Torneio torneio){
        Grupo grupo = GrupoDAO.createGrupo();
        grupo.setTorneio(torneio);
        if(nomeGrupo.contains(torneio.getNome() + "_"))
            nomeGrupo = torneio.getNome() + "_" + nomeGrupo;
        grupo.setNome(nomeGrupo);
        return grupo;
    }

    public Partcipantetorneio addicionarEquipasToTorneio(Equipa equipa, Grupo grupo, Torneio torneio) throws PersistentException {
        Partcipantetorneio partcipantetorneio = PartcipantetorneioDAO.createPartcipantetorneio();
        partcipantetorneio.setEquipa(null);
        partcipantetorneio.setGrupo(null);
        partcipantetorneio.setTorneio(null);
        PartcipantetorneioDAO.save(partcipantetorneio);
        return partcipantetorneio;
    }
}
