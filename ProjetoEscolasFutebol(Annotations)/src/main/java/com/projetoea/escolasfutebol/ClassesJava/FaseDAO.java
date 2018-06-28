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

public class FaseDAO {
	public static Fase loadFaseByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadFaseByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase getFaseByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return getFaseByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase loadFaseByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadFaseByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase getFaseByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return getFaseByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase loadFaseByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Fase) session.load(com.projetoea.escolasfutebol.classesjava.Fase.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase getFaseByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Fase) session.get(com.projetoea.escolasfutebol.classesjava.Fase.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase loadFaseByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fase) session.load(com.projetoea.escolasfutebol.classesjava.Fase.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase getFaseByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Fase) session.get(com.projetoea.escolasfutebol.classesjava.Fase.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFase(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryFase(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFase(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryFase(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase[] listFaseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return listFaseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase[] listFaseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return listFaseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryFase(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Fase as Fase");
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
	
	public static List queryFase(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Fase as Fase");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Fase", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase[] listFaseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryFase(session, condition, orderBy);
			return (Fase[]) list.toArray(new Fase[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase[] listFaseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryFase(session, condition, orderBy, lockMode);
			return (Fase[]) list.toArray(new Fase[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase loadFaseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadFaseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase loadFaseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadFaseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase loadFaseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Fase[] fases = listFaseByQuery(session, condition, orderBy);
		if (fases != null && fases.length > 0)
			return fases[0];
		else
			return null;
	}
	
	public static Fase loadFaseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Fase[] fases = listFaseByQuery(session, condition, orderBy, lockMode);
		if (fases != null && fases.length > 0)
			return fases[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateFaseByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateFaseByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFaseByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateFaseByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateFaseByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Fase as Fase");
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
	
	public static java.util.Iterator iterateFaseByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Fase as Fase");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Fase", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase createFase() {
		return new com.projetoea.escolasfutebol.classesjava.Fase();
	}
	
	public static boolean save(com.projetoea.escolasfutebol.classesjava.Fase fase) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().saveObject(fase);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.projetoea.escolasfutebol.classesjava.Fase fase) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().deleteObject(fase);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.projetoea.escolasfutebol.classesjava.Fase fase)throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.Rondatorneio[] lRondatorneios = fase.rondatorneio.toArray();
			for(int i = 0; i < lRondatorneios.length; i++) {
				lRondatorneios[i].setFase(null);
			}
			return delete(fase);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.projetoea.escolasfutebol.classesjava.Fase fase, org.orm.PersistentSession session)throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.Rondatorneio[] lRondatorneios = fase.rondatorneio.toArray();
			for(int i = 0; i < lRondatorneios.length; i++) {
				lRondatorneios[i].setFase(null);
			}
			try {
				session.delete(fase);
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
	
	public static boolean refresh(com.projetoea.escolasfutebol.classesjava.Fase fase) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession().refresh(fase);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.projetoea.escolasfutebol.classesjava.Fase fase) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession().evict(fase);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Fase loadFaseByCriteria(FaseCriteria faseCriteria) {
		Fase[] fases = listFaseByCriteria(faseCriteria);
		if(fases == null || fases.length == 0) {
			return null;
		}
		return fases[0];
	}
	
	public static Fase[] listFaseByCriteria(FaseCriteria faseCriteria) {
		return faseCriteria.listFase();
	}
}
