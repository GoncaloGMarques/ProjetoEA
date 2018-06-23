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

public class JogoDAO {
	public static Jogo loadJogoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadJogoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo getJogoByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getJogoByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo loadJogoByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadJogoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo getJogoByORMID(int ID, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return getJogoByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo loadJogoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Jogo) session.load(Jogo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo getJogoByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Jogo) session.get(Jogo.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo loadJogoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Jogo) session.load(Jogo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo getJogoByORMID(PersistentSession session, int ID, LockMode lockMode) throws PersistentException {
		try {
			return (Jogo) session.get(Jogo.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJogo(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryJogo(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJogo(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryJogo(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo[] listJogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listJogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo[] listJogoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return listJogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryJogo(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Jogo as Jogo");
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
	
	public static List queryJogo(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Jogo as Jogo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Jogo", lockMode);
			return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo[] listJogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		try {
			List list = queryJogo(session, condition, orderBy);
			return (Jogo[]) list.toArray(new Jogo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo[] listJogoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			List list = queryJogo(session, condition, orderBy, lockMode);
			return (Jogo[]) list.toArray(new Jogo[list.size()]);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo loadJogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadJogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo loadJogoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadJogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo loadJogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		Jogo[] jogos = listJogoByQuery(session, condition, orderBy);
		if (jogos != null && jogos.length > 0)
			return jogos[0];
		else
			return null;
	}
	
	public static Jogo loadJogoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		Jogo[] jogos = listJogoByQuery(session, condition, orderBy, lockMode);
		if (jogos != null && jogos.length > 0)
			return jogos[0];
		else
			return null;
	}
	
	public static java.util.Iterator iterateJogoByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateJogoByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJogoByQuery(String condition, String orderBy, LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateJogoByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateJogoByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Jogo as Jogo");
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
	
	public static java.util.Iterator iterateJogoByQuery(PersistentSession session, String condition, String orderBy, LockMode lockMode) throws PersistentException {
		StringBuffer sb = new StringBuffer("From Jogo as Jogo");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
			query.setLockMode("Jogo", lockMode);
			return query.iterate();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo createJogo() {
		return new Jogo();
	}
	
	public static boolean save(Jogo jogo) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().saveObject(jogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(Jogo jogo) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().deleteObject(jogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Jogo jogo)throws PersistentException {
		try {
			if (jogo.getArbitro() != null) {
				jogo.getArbitro().jogo.remove(jogo);
			}
			
			if (jogo.getEquipaCasa() != null) {
				jogo.getEquipaCasa().jogo.remove(jogo);
			}
			
			if (jogo.getEquipaFora() != null) {
				jogo.getEquipaFora().jogo1.remove(jogo);
			}
			
			if (jogo.getVencedor() != null) {
				jogo.getVencedor().jogo2.remove(jogo);
			}
			
			if (jogo.getRondatorneio() != null) {
				jogo.getRondatorneio().jogo.remove(jogo);
			}
			
			if (jogo.getCampo() != null) {
				jogo.getCampo().jogo.remove(jogo);
			}
			
			if (jogo.getRondacampeonato() != null) {
				jogo.getRondacampeonato().jogo.remove(jogo);
			}
			
			Eventojogo[] lEventojogos = jogo.eventojogo.toArray();
			for(int i = 0; i < lEventojogos.length; i++) {
				lEventojogos[i].setJogo(null);
			}
			return delete(jogo);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(Jogo jogo, PersistentSession session)throws PersistentException {
		try {
			if (jogo.getArbitro() != null) {
				jogo.getArbitro().jogo.remove(jogo);
			}
			
			if (jogo.getEquipaCasa() != null) {
				jogo.getEquipaCasa().jogo.remove(jogo);
			}
			
			if (jogo.getEquipaFora() != null) {
				jogo.getEquipaFora().jogo1.remove(jogo);
			}
			
			if (jogo.getVencedor() != null) {
				jogo.getVencedor().jogo2.remove(jogo);
			}
			
			if (jogo.getRondatorneio() != null) {
				jogo.getRondatorneio().jogo.remove(jogo);
			}
			
			if (jogo.getCampo() != null) {
				jogo.getCampo().jogo.remove(jogo);
			}
			
			if (jogo.getRondacampeonato() != null) {
				jogo.getRondacampeonato().jogo.remove(jogo);
			}
			
			Eventojogo[] lEventojogos = jogo.eventojogo.toArray();
			for(int i = 0; i < lEventojogos.length; i++) {
				lEventojogos[i].setJogo(null);
			}
			try {
				session.delete(jogo);
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
	
	public static boolean refresh(Jogo jogo) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().refresh(jogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(Jogo jogo) throws PersistentException {
		try {
			EscolasFutebolBetterPersistentManager.instance().getSession().evict(jogo);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Jogo loadJogoByCriteria(JogoCriteria jogoCriteria) {
		Jogo[] jogos = listJogoByCriteria(jogoCriteria);
		if(jogos == null || jogos.length == 0) {
			return null;
		}
		return jogos[0];
	}
	
	public static Jogo[] listJogoByCriteria(JogoCriteria jogoCriteria) {
		return jogoCriteria.listJogo();
	}
}
