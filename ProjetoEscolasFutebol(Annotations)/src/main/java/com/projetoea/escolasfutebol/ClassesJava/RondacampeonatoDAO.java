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

public class RondacampeonatoDAO {
	public static Rondacampeonato loadRondacampeonatoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadRondacampeonatoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato getRondacampeonatoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getRondacampeonatoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato loadRondacampeonatoByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadRondacampeonatoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato getRondacampeonatoByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getRondacampeonatoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato loadRondacampeonatoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Rondacampeonato) session.load(Rondacampeonato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato getRondacampeonatoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Rondacampeonato) session.get(Rondacampeonato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato loadRondacampeonatoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Rondacampeonato) session.load(Rondacampeonato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato getRondacampeonatoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Rondacampeonato) session.get(Rondacampeonato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRondacampeonato(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryRondacampeonato(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRondacampeonato(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryRondacampeonato(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato[] listRondacampeonatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listRondacampeonatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato[] listRondacampeonatoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listRondacampeonatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRondacampeonato(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Rondacampeonato as Rondacampeonato");
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
	
	public static List queryRondacampeonato(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Rondacampeonato as Rondacampeonato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Rondacampeonato", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato[] listRondacampeonatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRondacampeonato(session, condition, orderBy);
			return (Rondacampeonato[]) list.toArray(new Rondacampeonato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato[] listRondacampeonatoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryRondacampeonato(session, condition, orderBy, lockMode);
			return (Rondacampeonato[]) list.toArray(new Rondacampeonato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato loadRondacampeonatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadRondacampeonatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato loadRondacampeonatoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadRondacampeonatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato loadRondacampeonatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Rondacampeonato[] rondacampeonatos = listRondacampeonatoByQuery(session, condition, orderBy);
		if (rondacampeonatos != null && rondacampeonatos.length > 0)
			return rondacampeonatos[0];
		else
			return null;
	}
	
	public static Rondacampeonato loadRondacampeonatoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Rondacampeonato[] rondacampeonatos = listRondacampeonatoByQuery(session, condition, orderBy, lockMode);
		if (rondacampeonatos != null && rondacampeonatos.length > 0)
			return rondacampeonatos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRondacampeonatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateRondacampeonatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRondacampeonatoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateRondacampeonatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRondacampeonatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Rondacampeonato as Rondacampeonato");
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
	
	public static java.util.Iterator iterateRondacampeonatoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Rondacampeonato as Rondacampeonato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Rondacampeonato", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato createRondacampeonato() {
		return new Rondacampeonato();
	}
	
	public static boolean save(Rondacampeonato rondacampeonato) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().saveObject(rondacampeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Rondacampeonato rondacampeonato) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().deleteObject(rondacampeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Rondacampeonato rondacampeonato)throws PersistentException {
		try {
			if (rondacampeonato.getCampeonato() != null) {
				rondacampeonato.getCampeonato().rondacampeonato.remove(rondacampeonato);
			}
			
			Jogo[] lJogos = rondacampeonato.jogo.toArray();
			for(int i = 0; i < lJogos.length; i++) {
				lJogos[i].setRondacampeonato(null);
			}
			return delete(rondacampeonato);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Rondacampeonato rondacampeonato, PersistentSession session)throws PersistentException {
		try {
			if (rondacampeonato.getCampeonato() != null) {
				rondacampeonato.getCampeonato().rondacampeonato.remove(rondacampeonato);
			}
			
			Jogo[] lJogos = rondacampeonato.jogo.toArray();
			for(int i = 0; i < lJogos.length; i++) {
				lJogos[i].setRondacampeonato(null);
			}
			try {
				session.delete(rondacampeonato);
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
	
	public static boolean refresh(Rondacampeonato rondacampeonato) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().refresh(rondacampeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Rondacampeonato rondacampeonato) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().evict(rondacampeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondacampeonato loadRondacampeonatoByCriteria(RondacampeonatoCriteria rondacampeonatoCriteria) {
		Rondacampeonato[] rondacampeonatos = listRondacampeonatoByCriteria(rondacampeonatoCriteria);
		if(rondacampeonatos == null || rondacampeonatos.length == 0) {
			return null;
		}
		return rondacampeonatos[0];
	}
	
	public static Rondacampeonato[] listRondacampeonatoByCriteria(RondacampeonatoCriteria rondacampeonatoCriteria) {
		return rondacampeonatoCriteria.listRondacampeonato();
	}
}
