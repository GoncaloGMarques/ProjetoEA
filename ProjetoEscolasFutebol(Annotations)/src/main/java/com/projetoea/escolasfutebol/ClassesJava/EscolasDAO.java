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

public class EscolasDAO {
	public static Escolas loadEscolasByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEscolasByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas getEscolasByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getEscolasByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas loadEscolasByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEscolasByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas getEscolasByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getEscolasByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas loadEscolasByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Escolas) session.load(Escolas.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas getEscolasByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Escolas) session.get(Escolas.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas loadEscolasByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Escolas) session.load(Escolas.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas getEscolasByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Escolas) session.get(Escolas.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEscolas(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryEscolas(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEscolas(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryEscolas(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas[] listEscolasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listEscolasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas[] listEscolasByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listEscolasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEscolas(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Escolas as Escolas");
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
	
	public static List queryEscolas(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Escolas as Escolas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Escolas", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas[] listEscolasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEscolas(session, condition, orderBy);
			return (Escolas[]) list.toArray(new Escolas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas[] listEscolasByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryEscolas(session, condition, orderBy, lockMode);
			return (Escolas[]) list.toArray(new Escolas[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas loadEscolasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEscolasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas loadEscolasByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEscolasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas loadEscolasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Escolas[] escolases = listEscolasByQuery(session, condition, orderBy);
		if (escolases != null && escolases.length > 0)
			return escolases[0];
		else
			return null;
	}
	
	public static Escolas loadEscolasByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Escolas[] escolases = listEscolasByQuery(session, condition, orderBy, lockMode);
		if (escolases != null && escolases.length > 0)
			return escolases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEscolasByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateEscolasByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEscolasByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateEscolasByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEscolasByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Escolas as Escolas");
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
	
	public static java.util.Iterator iterateEscolasByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Escolas as Escolas");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Escolas", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas createEscolas() {
		return new Escolas();
	}
	
	public static boolean save(Escolas escolas) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().saveObject(escolas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Escolas escolas) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().deleteObject(escolas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Escolas escolas)throws PersistentException {
		try {
			if (escolas.getAssociacao() != null) {
				escolas.getAssociacao().escolas.remove(escolas);
			}
			
			if (escolas.getDiretorEscola() != null) {
				escolas.getDiretorEscola().setEscolas(null);
			}
			
			Equipa[] lEquipas = escolas.equipa.toArray();
			for(int i = 0; i < lEquipas.length; i++) {
				lEquipas[i].setEscolas(null);
			}
			return delete(escolas);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Escolas escolas, PersistentSession session)throws PersistentException {
		try {
			if (escolas.getAssociacao() != null) {
				escolas.getAssociacao().escolas.remove(escolas);
			}
			
			if (escolas.getDiretorEscola() != null) {
				escolas.getDiretorEscola().setEscolas(null);
			}
			
			Equipa[] lEquipas = escolas.equipa.toArray();
			for(int i = 0; i < lEquipas.length; i++) {
				lEquipas[i].setEscolas(null);
			}
			try {
				session.delete(escolas);
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
	
	public static boolean refresh(Escolas escolas) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().refresh(escolas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Escolas escolas) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().evict(escolas);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Escolas loadEscolasByCriteria(EscolasCriteria escolasCriteria) {
		Escolas[] escolases = listEscolasByCriteria(escolasCriteria);
		if(escolases == null || escolases.length == 0) {
			return null;
		}
		return escolases[0];
	}
	
	public static Escolas[] listEscolasByCriteria(EscolasCriteria escolasCriteria) {
		return escolasCriteria.listEscolas();
	}
}
