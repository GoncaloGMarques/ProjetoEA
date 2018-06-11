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

public class TipoEventoJogoDAO {
	public static TipoEventoJogo loadTipoEventoJogoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadTipoEventoJogoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo getTipoEventoJogoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return getTipoEventoJogoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo loadTipoEventoJogoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadTipoEventoJogoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo getTipoEventoJogoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return getTipoEventoJogoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo loadTipoEventoJogoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (TipoEventoJogo) session.load(TipoEventoJogo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo getTipoEventoJogoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (TipoEventoJogo) session.get(TipoEventoJogo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo loadTipoEventoJogoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipoEventoJogo) session.load(TipoEventoJogo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo getTipoEventoJogoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (TipoEventoJogo) session.get(TipoEventoJogo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoEventoJogo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return queryTipoEventoJogo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoEventoJogo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return queryTipoEventoJogo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo[] listTipoEventoJogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return listTipoEventoJogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo[] listTipoEventoJogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return listTipoEventoJogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoEventoJogo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From TipoEventoJogo as TipoEventoJogo");
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
	
	public static List queryTipoEventoJogo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From TipoEventoJogo as TipoEventoJogo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipoEventoJogo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo[] listTipoEventoJogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipoEventoJogo(session, condition, orderBy);
			return (TipoEventoJogo[]) list.toArray(new TipoEventoJogo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo[] listTipoEventoJogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipoEventoJogo(session, condition, orderBy, lockMode);
			return (TipoEventoJogo[]) list.toArray(new TipoEventoJogo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo loadTipoEventoJogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadTipoEventoJogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo loadTipoEventoJogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadTipoEventoJogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo loadTipoEventoJogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		TipoEventoJogo[] tipoEventoJogos = listTipoEventoJogoByQuery(session, condition, orderBy);
		if (tipoEventoJogos != null && tipoEventoJogos.length > 0)
			return tipoEventoJogos[0];
		else
			return null;
	}
	
	public static TipoEventoJogo loadTipoEventoJogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		TipoEventoJogo[] tipoEventoJogos = listTipoEventoJogoByQuery(session, condition, orderBy, lockMode);
		if (tipoEventoJogos != null && tipoEventoJogos.length > 0)
			return tipoEventoJogos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipoEventoJogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return iterateTipoEventoJogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoEventoJogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return iterateTipoEventoJogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoEventoJogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From TipoEventoJogo as TipoEventoJogo");
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
	
	public static java.util.Iterator iterateTipoEventoJogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From TipoEventoJogo as TipoEventoJogo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("TipoEventoJogo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static TipoEventoJogo createTipoEventoJogo() {
		return new TipoEventoJogo();
	}
	
	public static boolean save(TipoEventoJogo tipoEventoJogo) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().saveObject(tipoEventoJogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(TipoEventoJogo tipoEventoJogo) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().deleteObject(tipoEventoJogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(TipoEventoJogo tipoEventoJogo)throws PersistentException {
		try {
			EventoJogo[] lEventoJogos = tipoEventoJogo.eventoJogo.toArray();
			for(int i = 0; i < lEventoJogos.length; i++) {
				lEventoJogos[i].setTipoDeEvento(null);
			}
			return delete(tipoEventoJogo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(TipoEventoJogo tipoEventoJogo, org.orm.PersistentSession session)throws PersistentException {
		try {
			EventoJogo[] lEventoJogos = tipoEventoJogo.eventoJogo.toArray();
			for(int i = 0; i < lEventoJogos.length; i++) {
				lEventoJogos[i].setTipoDeEvento(null);
			}
			try {
				session.delete(tipoEventoJogo);
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
	
	public static boolean refresh(TipoEventoJogo tipoEventoJogo) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().getSession().refresh(tipoEventoJogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(TipoEventoJogo tipoEventoJogo) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().getSession().evict(tipoEventoJogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
