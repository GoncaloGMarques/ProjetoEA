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

public class EquipaDAO {
	public static Equipa loadEquipaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadEquipaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa getEquipaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return getEquipaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadEquipaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa getEquipaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return getEquipaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Equipa) session.load(Equipa.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa getEquipaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Equipa) session.get(Equipa.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Equipa) session.load(Equipa.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa getEquipaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Equipa) session.get(Equipa.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEquipa(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return queryEquipa(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEquipa(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return queryEquipa(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa[] listEquipaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return listEquipaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa[] listEquipaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return listEquipaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEquipa(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Equipa as Equipa");
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
	
	public static List queryEquipa(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Equipa as Equipa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Equipa", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa[] listEquipaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryEquipa(session, condition, orderBy);
			return (Equipa[]) list.toArray(new Equipa[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa[] listEquipaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryEquipa(session, condition, orderBy, lockMode);
			return (Equipa[]) list.toArray(new Equipa[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadEquipaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadEquipaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Equipa[] equipas = listEquipaByQuery(session, condition, orderBy);
		if (equipas != null && equipas.length > 0)
			return equipas[0];
		else
			return null;
	}
	
	public static Equipa loadEquipaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Equipa[] equipas = listEquipaByQuery(session, condition, orderBy, lockMode);
		if (equipas != null && equipas.length > 0)
			return equipas[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateEquipaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return iterateEquipaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEquipaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return iterateEquipaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEquipaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Equipa as Equipa");
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
	
	public static java.util.Iterator iterateEquipaByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Equipa as Equipa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Equipa", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa createEquipa() {
		return new Equipa();
	}
	
	public static boolean save(Equipa equipa) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().saveObject(equipa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Equipa equipa) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().deleteObject(equipa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Equipa equipa)throws PersistentException {
		try {
			if (equipa.getEscola() != null) {
				equipa.getEscola().equipas.remove(equipa);
			}
			
			if (equipa.getCampo() != null) {
				equipa.getCampo().equipas.remove(equipa);
			}
			
			Jogador[] lJogadoress = equipa.jogadores.toArray();
			for(int i = 0; i < lJogadoress.length; i++) {
				lJogadoress[i].setEquipa(null);
			}
			Torneio[] lTorneioss = equipa.torneios.toArray();
			for(int i = 0; i < lTorneioss.length; i++) {
				lTorneioss[i].equipas.remove(equipa);
			}
			if (equipa.getCampeonato() != null) {
				equipa.getCampeonato().setEquipa(null);
			}
			
			return delete(equipa);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Equipa equipa, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (equipa.getEscola() != null) {
				equipa.getEscola().equipas.remove(equipa);
			}
			
			if (equipa.getCampo() != null) {
				equipa.getCampo().equipas.remove(equipa);
			}
			
			Jogador[] lJogadoress = equipa.jogadores.toArray();
			for(int i = 0; i < lJogadoress.length; i++) {
				lJogadoress[i].setEquipa(null);
			}
			Torneio[] lTorneioss = equipa.torneios.toArray();
			for(int i = 0; i < lTorneioss.length; i++) {
				lTorneioss[i].equipas.remove(equipa);
			}
			if (equipa.getCampeonato() != null) {
				equipa.getCampeonato().setEquipa(null);
			}
			
			try {
				session.delete(equipa);
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
	
	public static boolean refresh(Equipa equipa) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().getSession().refresh(equipa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Equipa equipa) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().getSession().evict(equipa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
