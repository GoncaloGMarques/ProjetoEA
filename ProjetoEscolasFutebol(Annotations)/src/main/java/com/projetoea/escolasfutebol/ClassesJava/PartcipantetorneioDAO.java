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

public class PartcipantetorneioDAO {
	public static Partcipantetorneio loadPartcipantetorneioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadPartcipantetorneioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio getPartcipantetorneioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getPartcipantetorneioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio loadPartcipantetorneioByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadPartcipantetorneioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio getPartcipantetorneioByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getPartcipantetorneioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio loadPartcipantetorneioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Partcipantetorneio) session.load(Partcipantetorneio.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio getPartcipantetorneioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Partcipantetorneio) session.get(Partcipantetorneio.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio loadPartcipantetorneioByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Partcipantetorneio) session.load(Partcipantetorneio.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio getPartcipantetorneioByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Partcipantetorneio) session.get(Partcipantetorneio.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartcipantetorneio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryPartcipantetorneio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartcipantetorneio(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryPartcipantetorneio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio[] listPartcipantetorneioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listPartcipantetorneioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio[] listPartcipantetorneioByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listPartcipantetorneioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryPartcipantetorneio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Partcipantetorneio as Partcipantetorneio");
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
	
	public static List queryPartcipantetorneio(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Partcipantetorneio as Partcipantetorneio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Partcipantetorneio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio[] listPartcipantetorneioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryPartcipantetorneio(session, condition, orderBy);
			return (Partcipantetorneio[]) list.toArray(new Partcipantetorneio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio[] listPartcipantetorneioByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryPartcipantetorneio(session, condition, orderBy, lockMode);
			return (Partcipantetorneio[]) list.toArray(new Partcipantetorneio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio loadPartcipantetorneioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadPartcipantetorneioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio loadPartcipantetorneioByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadPartcipantetorneioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio loadPartcipantetorneioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Partcipantetorneio[] partcipantetorneios = listPartcipantetorneioByQuery(session, condition, orderBy);
		if (partcipantetorneios != null && partcipantetorneios.length > 0)
			return partcipantetorneios[0];
		else
			return null;
	}
	
	public static Partcipantetorneio loadPartcipantetorneioByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Partcipantetorneio[] partcipantetorneios = listPartcipantetorneioByQuery(session, condition, orderBy, lockMode);
		if (partcipantetorneios != null && partcipantetorneios.length > 0)
			return partcipantetorneios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iteratePartcipantetorneioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iteratePartcipantetorneioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePartcipantetorneioByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iteratePartcipantetorneioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iteratePartcipantetorneioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Partcipantetorneio as Partcipantetorneio");
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
	
	public static java.util.Iterator iteratePartcipantetorneioByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Partcipantetorneio as Partcipantetorneio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Partcipantetorneio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio createPartcipantetorneio() {
		return new Partcipantetorneio();
	}
	
	public static boolean save(Partcipantetorneio partcipantetorneio) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().saveObject(partcipantetorneio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Partcipantetorneio partcipantetorneio) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().deleteObject(partcipantetorneio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Partcipantetorneio partcipantetorneio)throws PersistentException {
		try {
			if (partcipantetorneio.getTorneio() != null) {
				partcipantetorneio.getTorneio().partcipantetorneio.remove(partcipantetorneio);
			}
			
			if (partcipantetorneio.getEquipa() != null) {
				partcipantetorneio.getEquipa().partcipantetorneio.remove(partcipantetorneio);
			}
			
			if (partcipantetorneio.getGrupo() != null) {
				partcipantetorneio.getGrupo().partcipantetorneio.remove(partcipantetorneio);
			}
			
			return delete(partcipantetorneio);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Partcipantetorneio partcipantetorneio, PersistentSession session)throws PersistentException {
		try {
			if (partcipantetorneio.getTorneio() != null) {
				partcipantetorneio.getTorneio().partcipantetorneio.remove(partcipantetorneio);
			}
			
			if (partcipantetorneio.getEquipa() != null) {
				partcipantetorneio.getEquipa().partcipantetorneio.remove(partcipantetorneio);
			}
			
			if (partcipantetorneio.getGrupo() != null) {
				partcipantetorneio.getGrupo().partcipantetorneio.remove(partcipantetorneio);
			}
			
			try {
				session.delete(partcipantetorneio);
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
	
	public static boolean refresh(Partcipantetorneio partcipantetorneio) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().refresh(partcipantetorneio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Partcipantetorneio partcipantetorneio) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().evict(partcipantetorneio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Partcipantetorneio loadPartcipantetorneioByCriteria(PartcipantetorneioCriteria partcipantetorneioCriteria) {
		Partcipantetorneio[] partcipantetorneios = listPartcipantetorneioByCriteria(partcipantetorneioCriteria);
		if(partcipantetorneios == null || partcipantetorneios.length == 0) {
			return null;
		}
		return partcipantetorneios[0];
	}
	
	public static Partcipantetorneio[] listPartcipantetorneioByCriteria(PartcipantetorneioCriteria partcipantetorneioCriteria) {
		return partcipantetorneioCriteria.listPartcipantetorneio();
	}
}
