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

public class JogadorDAO {
	public static Jogador loadJogadorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadJogadorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador getJogadorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return getJogadorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador loadJogadorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadJogadorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador getJogadorByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return getJogadorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador loadJogadorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Jogador) session.load(Jogador.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador getJogadorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Jogador) session.get(Jogador.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador loadJogadorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Jogador) session.load(Jogador.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador getJogadorByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Jogador) session.get(Jogador.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJogador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return queryJogador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJogador(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return queryJogador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador[] listJogadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return listJogadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador[] listJogadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return listJogadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJogador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Jogador as Jogador");
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
	
	public static List queryJogador(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Jogador as Jogador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Jogador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador[] listJogadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryJogador(session, condition, orderBy);
			return (Jogador[]) list.toArray(new Jogador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador[] listJogadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryJogador(session, condition, orderBy, lockMode);
			return (Jogador[]) list.toArray(new Jogador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador loadJogadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadJogadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador loadJogadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return loadJogadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador loadJogadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Jogador[] jogadors = listJogadorByQuery(session, condition, orderBy);
		if (jogadors != null && jogadors.length > 0)
			return jogadors[0];
		else
			return null;
	}
	
	public static Jogador loadJogadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Jogador[] jogadors = listJogadorByQuery(session, condition, orderBy, lockMode);
		if (jogadors != null && jogadors.length > 0)
			return jogadors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateJogadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return iterateJogadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJogadorByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolPersistentManager.instance().getSession();
			return iterateJogadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJogadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Jogador as Jogador");
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
	
	public static java.util.Iterator iterateJogadorByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Jogador as Jogador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Jogador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogador createJogador() {
		return new Jogador();
	}
	
	public static boolean save(Jogador jogador) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().saveObject(jogador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Jogador jogador) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().deleteObject(jogador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Jogador jogador)throws PersistentException {
		try {
			if (jogador.getEquipa() != null) {
				jogador.getEquipa().jogadores.remove(jogador);
			}
			
			return delete(jogador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Jogador jogador, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (jogador.getEquipa() != null) {
				jogador.getEquipa().jogadores.remove(jogador);
			}
			
			try {
				session.delete(jogador);
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
	
	public static boolean refresh(Jogador jogador) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().getSession().refresh(jogador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Jogador jogador) throws PersistentException {
		try {
			EscolasFutebolPersistentManager.instance().getSession().evict(jogador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
}
