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

public class GrupoDAO {
	public static Grupo loadGrupoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadGrupoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo getGrupoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getGrupoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadGrupoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo getGrupoByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getGrupoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Grupo) session.load(Grupo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo getGrupoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Grupo) session.get(Grupo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Grupo) session.load(Grupo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo getGrupoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Grupo) session.get(Grupo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryGrupo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryGrupo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo[] listGrupoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listGrupoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo[] listGrupoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listGrupoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryGrupo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Grupo as Grupo");
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
	
	public static List queryGrupo(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Grupo as Grupo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grupo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo[] listGrupoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryGrupo(session, condition, orderBy);
			return (Grupo[]) list.toArray(new Grupo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo[] listGrupoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryGrupo(session, condition, orderBy, lockMode);
			return (Grupo[]) list.toArray(new Grupo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadGrupoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadGrupoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Grupo[] grupos = listGrupoByQuery(session, condition, orderBy);
		if (grupos != null && grupos.length > 0)
			return grupos[0];
		else
			return null;
	}
	
	public static Grupo loadGrupoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Grupo[] grupos = listGrupoByQuery(session, condition, orderBy, lockMode);
		if (grupos != null && grupos.length > 0)
			return grupos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateGrupoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateGrupoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrupoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateGrupoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateGrupoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Grupo as Grupo");
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
	
	public static java.util.Iterator iterateGrupoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Grupo as Grupo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Grupo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo createGrupo() {
		return new Grupo();
	}
	
	public static boolean save(Grupo grupo) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().saveObject(grupo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Grupo grupo) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().deleteObject(grupo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Grupo grupo)throws PersistentException {
		try {
			if (grupo.getTorneio() != null) {
				grupo.getTorneio().grupo.remove(grupo);
			}
			
			Partcipantetorneio[] lPartcipantetorneios = grupo.partcipantetorneio.toArray();
			for(int i = 0; i < lPartcipantetorneios.length; i++) {
				lPartcipantetorneios[i].setGrupo(null);
			}
			return delete(grupo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Grupo grupo, PersistentSession session)throws PersistentException {
		try {
			if (grupo.getTorneio() != null) {
				grupo.getTorneio().grupo.remove(grupo);
			}
			
			Partcipantetorneio[] lPartcipantetorneios = grupo.partcipantetorneio.toArray();
			for(int i = 0; i < lPartcipantetorneios.length; i++) {
				lPartcipantetorneios[i].setGrupo(null);
			}
			try {
				session.delete(grupo);
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
	
	public static boolean refresh(Grupo grupo) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().refresh(grupo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Grupo grupo) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().evict(grupo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Grupo loadGrupoByCriteria(GrupoCriteria grupoCriteria) {
		Grupo[] grupos = listGrupoByCriteria(grupoCriteria);
		if(grupos == null || grupos.length == 0) {
			return null;
		}
		return grupos[0];
	}
	
	public static Grupo[] listGrupoByCriteria(GrupoCriteria grupoCriteria) {
		return grupoCriteria.listGrupo();
	}
}
