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

public class TipoeventojogoDAO {
	public static Tipoeventojogo loadTipoeventojogoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadTipoeventojogoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo getTipoeventojogoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return getTipoeventojogoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo loadTipoeventojogoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadTipoeventojogoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo getTipoeventojogoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return getTipoeventojogoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo loadTipoeventojogoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Tipoeventojogo) session.load(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo getTipoeventojogoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Tipoeventojogo) session.get(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo loadTipoeventojogoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipoeventojogo) session.load(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo getTipoeventojogoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Tipoeventojogo) session.get(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoeventojogo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryTipoeventojogo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoeventojogo(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryTipoeventojogo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo[] listTipoeventojogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return listTipoeventojogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo[] listTipoeventojogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return listTipoeventojogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryTipoeventojogo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Tipoeventojogo as Tipoeventojogo");
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
	
	public static List queryTipoeventojogo(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Tipoeventojogo as Tipoeventojogo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipoeventojogo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo[] listTipoeventojogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryTipoeventojogo(session, condition, orderBy);
			return (Tipoeventojogo[]) list.toArray(new Tipoeventojogo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo[] listTipoeventojogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryTipoeventojogo(session, condition, orderBy, lockMode);
			return (Tipoeventojogo[]) list.toArray(new Tipoeventojogo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo loadTipoeventojogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadTipoeventojogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo loadTipoeventojogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadTipoeventojogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo loadTipoeventojogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Tipoeventojogo[] tipoeventojogos = listTipoeventojogoByQuery(session, condition, orderBy);
		if (tipoeventojogos != null && tipoeventojogos.length > 0)
			return tipoeventojogos[0];
		else
			return null;
	}
	
	public static Tipoeventojogo loadTipoeventojogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Tipoeventojogo[] tipoeventojogos = listTipoeventojogoByQuery(session, condition, orderBy, lockMode);
		if (tipoeventojogos != null && tipoeventojogos.length > 0)
			return tipoeventojogos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateTipoeventojogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateTipoeventojogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoeventojogoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateTipoeventojogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateTipoeventojogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Tipoeventojogo as Tipoeventojogo");
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
	
	public static java.util.Iterator iterateTipoeventojogoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Tipoeventojogo as Tipoeventojogo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Tipoeventojogo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo createTipoeventojogo() {
		return new com.projetoea.escolasfutebol.classesjava.Tipoeventojogo();
	}
	
	public static boolean save(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo tipoeventojogo) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().saveObject(tipoeventojogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo tipoeventojogo) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().deleteObject(tipoeventojogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo tipoeventojogo)throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.Eventojogo[] lEventojogos = tipoeventojogo.eventojogo.toArray();
			for(int i = 0; i < lEventojogos.length; i++) {
				lEventojogos[i].setTipoeventojogo(null);
			}
			return delete(tipoeventojogo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo tipoeventojogo, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.Eventojogo[] lEventojogos = tipoeventojogo.eventojogo.toArray();
			for(int i = 0; i < lEventojogos.length; i++) {
				lEventojogos[i].setTipoeventojogo(null);
			}
			try {
				session.delete(tipoeventojogo);
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
	
	public static boolean refresh(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo tipoeventojogo) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession().refresh(tipoeventojogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo tipoeventojogo) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession().evict(tipoeventojogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Tipoeventojogo loadTipoeventojogoByCriteria(TipoeventojogoCriteria tipoeventojogoCriteria) {
		Tipoeventojogo[] tipoeventojogos = listTipoeventojogoByCriteria(tipoeventojogoCriteria);
		if(tipoeventojogos == null || tipoeventojogos.length == 0) {
			return null;
		}
		return tipoeventojogos[0];
	}
	
	public static Tipoeventojogo[] listTipoeventojogoByCriteria(TipoeventojogoCriteria tipoeventojogoCriteria) {
		return tipoeventojogoCriteria.listTipoeventojogo();
	}
}
