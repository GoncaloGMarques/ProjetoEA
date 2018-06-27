package com.projetoea.escolasfutebol.Beans;

import com.projetoea.escolasfutebol.ClassesJava.*;
import org.orm.PersistentException;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class DiretorAssociacaoBean extends UserBean {

    public void removerEscola(Escolas escola) throws PersistentException {
        EscolasDAO.deleteAndDissociate(escola);
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
}
