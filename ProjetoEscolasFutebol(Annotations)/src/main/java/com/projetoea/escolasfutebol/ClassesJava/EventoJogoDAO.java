/**
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
package com.projetoea.escolasfutebol.classesjava;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class EventojogoDAO {
	public static Eventojogo loadEventojogoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEventojogoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo getEventojogoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return getEventojogoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo loadEventojogoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEventojogoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo getEventojogoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return getEventojogoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo loadEventojogoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Eventojogo) session.load(com.projetoea.escolasfutebol.classesjava.Eventojogo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo getEventojogoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Eventojogo) session.get(com.projetoea.escolasfutebol.classesjava.Eventojogo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo loadEventojogoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Eventojogo) session.load(com.projetoea.escolasfutebol.classesjava.Eventojogo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo getEventojogoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Eventojogo) session.get(com.projetoea.escolasfutebol.classesjava.Eventojogo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEventojogo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryEventojogo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEventojogo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryEventojogo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo[] listEventojogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return listEventojogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo[] listEventojogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return listEventojogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEventojogo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Eventojogo as Eventojogo");
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
	
	public static List queryEventojogo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Eventojogo as Eventojogo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Eventojogo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo[] listEventojogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEventojogo(session, condition, orderBy);
			return (Eventojogo[]) list.toArray(new Eventojogo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo[] listEventojogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEventojogo(session, condition, orderBy, lockMode);
			return (Eventojogo[]) list.toArray(new Eventojogo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo loadEventojogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEventojogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo loadEventojogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEventojogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo loadEventojogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Eventojogo[] eventojogos = listEventojogoByQuery(session, condition, orderBy);
		if (eventojogos != null && eventojogos.length > 0)
			return eventojogos[0];
		else
			return null;
	}
	
	public static Eventojogo loadEventojogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Eventojogo[] eventojogos = listEventojogoByQuery(session, condition, orderBy, lockMode);
		if (eventojogos != null && eventojogos.length > 0)
			return eventojogos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEventojogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateEventojogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventojogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateEventojogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventojogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Eventojogo as Eventojogo");
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
	
	public static java.util.Iterator iterateEventojogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Eventojogo as Eventojogo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Eventojogo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo createEventojogo() {
		return new com.projetoea.escolasfutebol.classesjava.Eventojogo();
	}
	
	public static boolean save(com.projetoea.escolasfutebol.classesjava.Eventojogo eventojogo) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().saveObject(eventojogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.projetoea.escolasfutebol.classesjava.Eventojogo eventojogo) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().deleteObject(eventojogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.projetoea.escolasfutebol.classesjava.Eventojogo eventojogo)throws PersistentException {
		try {
			if (eventojogo.getJogo() != null) {
				eventojogo.getJogo().eventojogo.remove(eventojogo);
			}
			
			if (eventojogo.getTipoeventojogo() != null) {
				eventojogo.getTipoeventojogo().eventojogo.remove(eventojogo);
			}
			
			if (eventojogo.getJogador() != null) {
				eventojogo.getJogador().eventojogo.remove(eventojogo);
			}
			
			return delete(eventojogo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.projetoea.escolasfutebol.classesjava.Eventojogo eventojogo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (eventojogo.getJogo() != null) {
				eventojogo.getJogo().eventojogo.remove(eventojogo);
			}
			
			if (eventojogo.getTipoeventojogo() != null) {
				eventojogo.getTipoeventojogo().eventojogo.remove(eventojogo);
			}
			
			if (eventojogo.getJogador() != null) {
				eventojogo.getJogador().eventojogo.remove(eventojogo);
			}
			
			try {
				session.delete(eventojogo);
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
	
	public static boolean refresh(com.projetoea.escolasfutebol.classesjava.Eventojogo eventojogo) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession().refresh(eventojogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.projetoea.escolasfutebol.classesjava.Eventojogo eventojogo) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession().evict(eventojogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Eventojogo loadEventojogoByCriteria(EventojogoCriteria eventojogoCriteria) {
		Eventojogo[] eventojogos = listEventojogoByCriteria(eventojogoCriteria);
		if(eventojogos == null || eventojogos.length == 0) {
			return null;
		}
		return eventojogos[0];
	}
	
	public static Eventojogo[] listEventojogoByCriteria(EventojogoCriteria eventojogoCriteria) {
		return eventojogoCriteria.listEventojogo();
	}
}
