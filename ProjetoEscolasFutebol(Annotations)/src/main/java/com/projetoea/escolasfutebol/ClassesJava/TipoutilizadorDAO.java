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

public class TipoutilizadorDAO {
	public static Tipoutilizador loadTipoutilizadorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadTipoutilizadorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador getTipoutilizadorByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getTipoutilizadorByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador loadTipoutilizadorByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadTipoutilizadorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador getTipoutilizadorByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getTipoutilizadorByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador loadTipoutilizadorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Tipoutilizador) session.load(Tipoutilizador.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador getTipoutilizadorByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Tipoutilizador) session.get(Tipoutilizador.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador loadTipoutilizadorByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Tipoutilizador) session.load(Tipoutilizador.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador getTipoutilizadorByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Tipoutilizador) session.get(Tipoutilizador.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoutilizador(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryTipoutilizador(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoutilizador(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryTipoutilizador(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador[] listTipoutilizadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listTipoutilizadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador[] listTipoutilizadorByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listTipoutilizadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoutilizador(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tipoutilizador as Tipoutilizador");
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
	
	public static List queryTipoutilizador(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tipoutilizador as Tipoutilizador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipoutilizador", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador[] listTipoutilizadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipoutilizador(session, condition, orderBy);
			return (Tipoutilizador[]) list.toArray(new Tipoutilizador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador[] listTipoutilizadorByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipoutilizador(session, condition, orderBy, lockMode);
			return (Tipoutilizador[]) list.toArray(new Tipoutilizador[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador loadTipoutilizadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadTipoutilizadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador loadTipoutilizadorByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadTipoutilizadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador loadTipoutilizadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tipoutilizador[] tipoutilizadors = listTipoutilizadorByQuery(session, condition, orderBy);
		if (tipoutilizadors != null && tipoutilizadors.length > 0)
			return tipoutilizadors[0];
		else
			return null;
	}
	
	public static Tipoutilizador loadTipoutilizadorByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Tipoutilizador[] tipoutilizadors = listTipoutilizadorByQuery(session, condition, orderBy, lockMode);
		if (tipoutilizadors != null && tipoutilizadors.length > 0)
			return tipoutilizadors[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipoutilizadorByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateTipoutilizadorByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoutilizadorByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateTipoutilizadorByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoutilizadorByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tipoutilizador as Tipoutilizador");
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
	
	public static java.util.Iterator iterateTipoutilizadorByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Tipoutilizador as Tipoutilizador");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipoutilizador", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador createTipoutilizador() {
		return new Tipoutilizador();
	}
	
	public static boolean save(Tipoutilizador tipoutilizador) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().saveObject(tipoutilizador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Tipoutilizador tipoutilizador) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().deleteObject(tipoutilizador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Tipoutilizador tipoutilizador)throws PersistentException {
		try {
			Utilizador[] lUtilizadors = tipoutilizador.utilizador.toArray();
			for(int i = 0; i < lUtilizadors.length; i++) {
				lUtilizadors[i].setTipoutilizador(null);
			}
			return delete(tipoutilizador);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Tipoutilizador tipoutilizador, PersistentSession session)throws PersistentException {
		try {
			Utilizador[] lUtilizadors = tipoutilizador.utilizador.toArray();
			for(int i = 0; i < lUtilizadors.length; i++) {
				lUtilizadors[i].setTipoutilizador(null);
			}
			try {
				session.delete(tipoutilizador);
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
	
	public static boolean refresh(Tipoutilizador tipoutilizador) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().refresh(tipoutilizador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Tipoutilizador tipoutilizador) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().evict(tipoutilizador);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoutilizador loadTipoutilizadorByCriteria(TipoutilizadorCriteria tipoutilizadorCriteria) {
		Tipoutilizador[] tipoutilizadors = listTipoutilizadorByCriteria(tipoutilizadorCriteria);
		if(tipoutilizadors == null || tipoutilizadors.length == 0) {
			return null;
		}
		return tipoutilizadors[0];
	}
	
	public static Tipoutilizador[] listTipoutilizadorByCriteria(TipoutilizadorCriteria tipoutilizadorCriteria) {
		return tipoutilizadorCriteria.listTipoutilizador();
	}
}
