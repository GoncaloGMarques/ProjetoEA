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

public class EventoJogoDAO {
	public static EventoJogo loadEventoJogoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadEventoJogoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo getEventoJogoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return getEventoJogoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo loadEventoJogoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadEventoJogoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo getEventoJogoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return getEventoJogoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo loadEventoJogoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventoJogo) session.load(EventoJogo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo getEventoJogoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (EventoJogo) session.get(EventoJogo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo loadEventoJogoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventoJogo) session.load(EventoJogo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo getEventoJogoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (EventoJogo) session.get(EventoJogo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEventoJogo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return queryEventoJogo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEventoJogo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return queryEventoJogo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo[] listEventoJogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return listEventoJogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo[] listEventoJogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return listEventoJogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEventoJogo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EventoJogo as EventoJogo");
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
	
	public static List queryEventoJogo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EventoJogo as EventoJogo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventoJogo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo[] listEventoJogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEventoJogo(session, condition, orderBy);
			return (EventoJogo[]) list.toArray(new EventoJogo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo[] listEventoJogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEventoJogo(session, condition, orderBy, lockMode);
			return (EventoJogo[]) list.toArray(new EventoJogo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo loadEventoJogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadEventoJogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo loadEventoJogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadEventoJogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo loadEventoJogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		EventoJogo[] eventoJogos = listEventoJogoByQuery(session, condition, orderBy);
		if (eventoJogos != null && eventoJogos.length > 0)
			return eventoJogos[0];
		else
			return null;
	}
	
	public static EventoJogo loadEventoJogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		EventoJogo[] eventoJogos = listEventoJogoByQuery(session, condition, orderBy, lockMode);
		if (eventoJogos != null && eventoJogos.length > 0)
			return eventoJogos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEventoJogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return iterateEventoJogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventoJogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return iterateEventoJogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEventoJogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EventoJogo as EventoJogo");
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
	
	public static java.util.Iterator iterateEventoJogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From EventoJogo as EventoJogo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("EventoJogo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static EventoJogo createEventoJogo() {
		return new EventoJogo();
	}
	
	public static boolean save(EventoJogo eventoJogo) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().saveObject(eventoJogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(EventoJogo eventoJogo) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().deleteObject(eventoJogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(EventoJogo eventoJogo)throws PersistentException {
		try {
			if (eventoJogo.getTipoDeEvento() != null) {
				eventoJogo.getTipoDeEvento().eventoJogo.remove(eventoJogo);
			}
			
			if (eventoJogo.getJogo() != null) {
				eventoJogo.getJogo().eventos.remove(eventoJogo);
			}
			
			return delete(eventoJogo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(EventoJogo eventoJogo, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (eventoJogo.getTipoDeEvento() != null) {
				eventoJogo.getTipoDeEvento().eventoJogo.remove(eventoJogo);
			}
			
			if (eventoJogo.getJogo() != null) {
				eventoJogo.getJogo().eventos.remove(eventoJogo);
			}
			
			try {
				session.delete(eventoJogo);
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
	
	public static boolean refresh(EventoJogo eventoJogo) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().getSession().refresh(eventoJogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(EventoJogo eventoJogo) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().getSession().evict(eventoJogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
