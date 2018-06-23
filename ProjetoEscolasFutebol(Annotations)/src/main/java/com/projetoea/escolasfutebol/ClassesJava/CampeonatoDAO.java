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

public class CampeonatoDAO {
	public static Campeonato loadCampeonatoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadCampeonatoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato getCampeonatoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getCampeonatoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato loadCampeonatoByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadCampeonatoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato getCampeonatoByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getCampeonatoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato loadCampeonatoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Campeonato) session.load(Campeonato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato getCampeonatoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Campeonato) session.get(Campeonato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato loadCampeonatoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Campeonato) session.load(Campeonato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato getCampeonatoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Campeonato) session.get(Campeonato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCampeonato(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryCampeonato(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCampeonato(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryCampeonato(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato[] listCampeonatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listCampeonatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato[] listCampeonatoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listCampeonatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryCampeonato(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Campeonato as Campeonato");
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
	
	public static List queryCampeonato(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Campeonato as Campeonato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Campeonato", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato[] listCampeonatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryCampeonato(session, condition, orderBy);
			return (Campeonato[]) list.toArray(new Campeonato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato[] listCampeonatoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryCampeonato(session, condition, orderBy, lockMode);
			return (Campeonato[]) list.toArray(new Campeonato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato loadCampeonatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadCampeonatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato loadCampeonatoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadCampeonatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato loadCampeonatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Campeonato[] campeonatos = listCampeonatoByQuery(session, condition, orderBy);
		if (campeonatos != null && campeonatos.length > 0)
			return campeonatos[0];
		else
			return null;
	}
	
	public static Campeonato loadCampeonatoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Campeonato[] campeonatos = listCampeonatoByQuery(session, condition, orderBy, lockMode);
		if (campeonatos != null && campeonatos.length > 0)
			return campeonatos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateCampeonatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateCampeonatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCampeonatoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateCampeonatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateCampeonatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Campeonato as Campeonato");
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
	
	public static java.util.Iterator iterateCampeonatoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Campeonato as Campeonato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Campeonato", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato createCampeonato() {
		return new Campeonato();
	}
	
	public static boolean save(Campeonato campeonato) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().saveObject(campeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Campeonato campeonato) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().deleteObject(campeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Campeonato campeonato)throws PersistentException {
		try {
			Participantecampeonato[] lParticipantecampeonatos = campeonato.participantecampeonato.toArray();
			for(int i = 0; i < lParticipantecampeonatos.length; i++) {
				lParticipantecampeonatos[i].setCampeonato(null);
			}
			Rondacampeonato[] lRondacampeonatos = campeonato.rondacampeonato.toArray();
			for(int i = 0; i < lRondacampeonatos.length; i++) {
				lRondacampeonatos[i].setCampeonato(null);
			}
			return delete(campeonato);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Campeonato campeonato, PersistentSession session)throws PersistentException {
		try {
			Participantecampeonato[] lParticipantecampeonatos = campeonato.participantecampeonato.toArray();
			for(int i = 0; i < lParticipantecampeonatos.length; i++) {
				lParticipantecampeonatos[i].setCampeonato(null);
			}
			Rondacampeonato[] lRondacampeonatos = campeonato.rondacampeonato.toArray();
			for(int i = 0; i < lRondacampeonatos.length; i++) {
				lRondacampeonatos[i].setCampeonato(null);
			}
			try {
				session.delete(campeonato);
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
	
	public static boolean refresh(Campeonato campeonato) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().refresh(campeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Campeonato campeonato) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().evict(campeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Campeonato loadCampeonatoByCriteria(CampeonatoCriteria campeonatoCriteria) {
		Campeonato[] campeonatos = listCampeonatoByCriteria(campeonatoCriteria);
		if(campeonatos == null || campeonatos.length == 0) {
			return null;
		}
		return campeonatos[0];
	}
	
	public static Campeonato[] listCampeonatoByCriteria(CampeonatoCriteria campeonatoCriteria) {
		return campeonatoCriteria.listCampeonato();
	}
}
