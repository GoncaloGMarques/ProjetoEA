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

public class RondatorneioDAO {
	public static Rondatorneio loadRondatorneioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadRondatorneioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio getRondatorneioByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getRondatorneioByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio loadRondatorneioByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadRondatorneioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio getRondatorneioByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getRondatorneioByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio loadRondatorneioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Rondatorneio) session.load(Rondatorneio.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio getRondatorneioByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Rondatorneio) session.get(Rondatorneio.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio loadRondatorneioByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Rondatorneio) session.load(Rondatorneio.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio getRondatorneioByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Rondatorneio) session.get(Rondatorneio.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRondatorneio(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryRondatorneio(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRondatorneio(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryRondatorneio(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio[] listRondatorneioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listRondatorneioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio[] listRondatorneioByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listRondatorneioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryRondatorneio(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Rondatorneio as Rondatorneio");
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
	
	public static List queryRondatorneio(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Rondatorneio as Rondatorneio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Rondatorneio", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio[] listRondatorneioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryRondatorneio(session, condition, orderBy);
			return (Rondatorneio[]) list.toArray(new Rondatorneio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio[] listRondatorneioByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryRondatorneio(session, condition, orderBy, lockMode);
			return (Rondatorneio[]) list.toArray(new Rondatorneio[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio loadRondatorneioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadRondatorneioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio loadRondatorneioByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadRondatorneioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio loadRondatorneioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Rondatorneio[] rondatorneios = listRondatorneioByQuery(session, condition, orderBy);
		if (rondatorneios != null && rondatorneios.length > 0)
			return rondatorneios[0];
		else
			return null;
	}
	
	public static Rondatorneio loadRondatorneioByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Rondatorneio[] rondatorneios = listRondatorneioByQuery(session, condition, orderBy, lockMode);
		if (rondatorneios != null && rondatorneios.length > 0)
			return rondatorneios[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateRondatorneioByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateRondatorneioByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRondatorneioByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateRondatorneioByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateRondatorneioByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Rondatorneio as Rondatorneio");
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
	
	public static java.util.Iterator iterateRondatorneioByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Rondatorneio as Rondatorneio");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Rondatorneio", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio createRondatorneio() {
		return new Rondatorneio();
	}
	
	public static boolean save(Rondatorneio rondatorneio) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().saveObject(rondatorneio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Rondatorneio rondatorneio) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().deleteObject(rondatorneio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Rondatorneio rondatorneio)throws PersistentException {
		try {
			if (rondatorneio.getFase() != null) {
				rondatorneio.getFase().rondatorneio.remove(rondatorneio);
			}
			
			if (rondatorneio.getTorneio() != null) {
				rondatorneio.getTorneio().rondatorneio.remove(rondatorneio);
			}
			
			Jogo[] lJogos = rondatorneio.jogo.toArray();
			for(int i = 0; i < lJogos.length; i++) {
				lJogos[i].setRondatorneio(null);
			}
			return delete(rondatorneio);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Rondatorneio rondatorneio, PersistentSession session)throws PersistentException {
		try {
			if (rondatorneio.getFase() != null) {
				rondatorneio.getFase().rondatorneio.remove(rondatorneio);
			}
			
			if (rondatorneio.getTorneio() != null) {
				rondatorneio.getTorneio().rondatorneio.remove(rondatorneio);
			}
			
			Jogo[] lJogos = rondatorneio.jogo.toArray();
			for(int i = 0; i < lJogos.length; i++) {
				lJogos[i].setRondatorneio(null);
			}
			try {
				session.delete(rondatorneio);
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
	
	public static boolean refresh(Rondatorneio rondatorneio) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().refresh(rondatorneio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Rondatorneio rondatorneio) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().evict(rondatorneio);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Rondatorneio loadRondatorneioByCriteria(RondatorneioCriteria rondatorneioCriteria) {
		Rondatorneio[] rondatorneios = listRondatorneioByCriteria(rondatorneioCriteria);
		if(rondatorneios == null || rondatorneios.length == 0) {
			return null;
		}
		return rondatorneios[0];
	}
	
	public static Rondatorneio[] listRondatorneioByCriteria(RondatorneioCriteria rondatorneioCriteria) {
		return rondatorneioCriteria.listRondatorneio();
	}
}
