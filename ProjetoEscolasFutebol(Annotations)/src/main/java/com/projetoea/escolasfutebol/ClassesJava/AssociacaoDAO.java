package com.projetoea.escolasfutebol.ClassesJava; /**
 * "Visual Paradigm: DO NOT MODIFY THIS FILE!"
 * 
 * This is an automatic generated file. It will be regenerated every time 
 * you generate persistence class.
 * 
 * Modifying its content may cause the program not work, or your work may lost.
 */

/**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class AssociacaoDAO {
	public static Associacao loadAssociacaoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadAssociacaoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao getAssociacaoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getAssociacaoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao loadAssociacaoByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadAssociacaoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao getAssociacaoByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getAssociacaoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao loadAssociacaoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Associacao) session.load(Associacao.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao getAssociacaoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Associacao) session.get(Associacao.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao loadAssociacaoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Associacao) session.load(Associacao.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao getAssociacaoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Associacao) session.get(Associacao.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAssociacao(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryAssociacao(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAssociacao(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryAssociacao(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao[] listAssociacaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listAssociacaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao[] listAssociacaoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listAssociacaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAssociacao(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Associacao as Associacao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryAssociacao(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Associacao as Associacao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Associacao", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao[] listAssociacaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryAssociacao(session, condition, orderBy);
			return (Associacao[]) list.toArray(new Associacao[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao[] listAssociacaoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryAssociacao(session, condition, orderBy, lockMode);
			return (Associacao[]) list.toArray(new Associacao[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao loadAssociacaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadAssociacaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao loadAssociacaoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadAssociacaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao loadAssociacaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Associacao[] associacaos = listAssociacaoByQuery(session, condition, orderBy);
		if (associacaos != null && associacaos.length > 0)
			return associacaos[0];
		else
			return null;
	}
	
	public static Associacao loadAssociacaoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Associacao[] associacaos = listAssociacaoByQuery(session, condition, orderBy, lockMode);
		if (associacaos != null && associacaos.length > 0)
			return associacaos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateAssociacaoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateAssociacaoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAssociacaoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateAssociacaoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAssociacaoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Associacao as Associacao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateAssociacaoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Associacao as Associacao");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Associacao", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao createAssociacao() {
		return new Associacao();
	}
	
	public static boolean save(Associacao associacao) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().saveObject(associacao);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Associacao associacao) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().deleteObject(associacao);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Associacao associacao)throws PersistentException {
		try {
			if (associacao.getDiretorAssociacao() != null) {
				associacao.getDiretorAssociacao().setAssociacao(null);
			}
			
			Escolas[] lEscolass = associacao.escolas.toArray();
			for(int i = 0; i < lEscolass.length; i++) {
				lEscolass[i].setAssociacao(null);
			}
			return delete(associacao);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Associacao associacao, PersistentSession session)throws PersistentException {
		try {
			if (associacao.getDiretorAssociacao() != null) {
				associacao.getDiretorAssociacao().setAssociacao(null);
			}
			
			Escolas[] lEscolass = associacao.escolas.toArray();
			for(int i = 0; i < lEscolass.length; i++) {
				lEscolass[i].setAssociacao(null);
			}
			try {
				session.delete(associacao);
				return true;
			} catch (Exception e) {
				return false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean refresh(Associacao associacao) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().refresh(associacao);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Associacao associacao) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().evict(associacao);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Associacao loadAssociacaoByCriteria(AssociacaoCriteria associacaoCriteria) {
		Associacao[] associacaos = listAssociacaoByCriteria(associacaoCriteria);
		if(associacaos == null || associacaos.length == 0) {
			return null;
		}
		return associacaos[0];
	}
	
	public static Associacao[] listAssociacaoByCriteria(AssociacaoCriteria associacaoCriteria) {
		return associacaoCriteria.listAssociacao();
	}
}
