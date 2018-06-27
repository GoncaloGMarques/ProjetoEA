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
package com.projetoea.escolasfutebol.ClassesJava;

import org.orm.*;
import org.hibernate.Query;
import org.hibernate.LockMode;
import java.util.List;

public class ParticipantecampeonatoDAO {
	public static Participantecampeonato loadParticipantecampeonatoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadParticipantecampeonatoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato getParticipantecampeonatoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return getParticipantecampeonatoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato loadParticipantecampeonatoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadParticipantecampeonatoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato getParticipantecampeonatoByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return getParticipantecampeonatoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato loadParticipantecampeonatoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Participantecampeonato) session.load(com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato getParticipantecampeonatoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Participantecampeonato) session.get(com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato loadParticipantecampeonatoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Participantecampeonato) session.load(com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato getParticipantecampeonatoByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Participantecampeonato) session.get(com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParticipantecampeonato(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryParticipantecampeonato(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParticipantecampeonato(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryParticipantecampeonato(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato[] listParticipantecampeonatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return listParticipantecampeonatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato[] listParticipantecampeonatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return listParticipantecampeonatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryParticipantecampeonato(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato as Participantecampeonato");
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
	
	public static List queryParticipantecampeonato(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato as Participantecampeonato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Participantecampeonato", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato[] listParticipantecampeonatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryParticipantecampeonato(session, condition, orderBy);
			return (Participantecampeonato[]) list.toArray(new Participantecampeonato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato[] listParticipantecampeonatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			List list = queryParticipantecampeonato(session, condition, orderBy, lockMode);
			return (Participantecampeonato[]) list.toArray(new Participantecampeonato[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato loadParticipantecampeonatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadParticipantecampeonatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato loadParticipantecampeonatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadParticipantecampeonatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato loadParticipantecampeonatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Participantecampeonato[] participantecampeonatos = listParticipantecampeonatoByQuery(session, condition, orderBy);
		if (participantecampeonatos != null && participantecampeonatos.length > 0)
			return participantecampeonatos[0];
		else
			return null;
	}
	
	public static Participantecampeonato loadParticipantecampeonatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		Participantecampeonato[] participantecampeonatos = listParticipantecampeonatoByQuery(session, condition, orderBy, lockMode);
		if (participantecampeonatos != null && participantecampeonatos.length > 0)
			return participantecampeonatos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateParticipantecampeonatoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateParticipantecampeonatoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParticipantecampeonatoByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateParticipantecampeonatoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateParticipantecampeonatoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato as Participantecampeonato");
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
	
	public static java.util.Iterator iterateParticipantecampeonatoByQuery(PersistentSession session, String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato as Participantecampeonato");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Participantecampeonato", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato createParticipantecampeonato() {
		return new com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato();
	}
	
	public static boolean save(com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato participantecampeonato) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().saveObject(participantecampeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato participantecampeonato) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().deleteObject(participantecampeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato participantecampeonato)throws PersistentException {
		try {
			if (participantecampeonato.getCampeonato() != null) {
				participantecampeonato.getCampeonato().participantecampeonato.remove(participantecampeonato);
			}
			
			if (participantecampeonato.getEquipa() != null) {
				participantecampeonato.getEquipa().participantecampeonato.remove(participantecampeonato);
			}
			
			return delete(participantecampeonato);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato participantecampeonato, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (participantecampeonato.getCampeonato() != null) {
				participantecampeonato.getCampeonato().participantecampeonato.remove(participantecampeonato);
			}
			
			if (participantecampeonato.getEquipa() != null) {
				participantecampeonato.getEquipa().participantecampeonato.remove(participantecampeonato);
			}
			
			try {
				session.delete(participantecampeonato);
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
	
	public static boolean refresh(com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato participantecampeonato) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession().refresh(participantecampeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.projetoea.escolasfutebol.ClassesJava.Participantecampeonato participantecampeonato) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession().evict(participantecampeonato);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Participantecampeonato loadParticipantecampeonatoByCriteria(ParticipantecampeonatoCriteria participantecampeonatoCriteria) {
		Participantecampeonato[] participantecampeonatos = listParticipantecampeonatoByCriteria(participantecampeonatoCriteria);
		if(participantecampeonatos == null || participantecampeonatos.length == 0) {
			return null;
		}
		return participantecampeonatos[0];
	}
	
	public static Participantecampeonato[] listParticipantecampeonatoByCriteria(ParticipantecampeonatoCriteria participantecampeonatoCriteria) {
		return participantecampeonatoCriteria.listParticipantecampeonato();
	}
}
