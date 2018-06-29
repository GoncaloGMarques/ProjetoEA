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

import org.hibernate.criterion.Projections;
import org.orm.*;
import org.hibernate.Query;

import javax.persistence.EntityManager;
import java.util.List;

public class EquipaDAO {
	public static Equipa loadEquipaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEquipaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa getEquipaByORMID(int ID) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return getEquipaByORMID(session, ID);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEquipaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa getEquipaByORMID(int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return getEquipaByORMID(session, ID, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Equipa) session.load(com.projetoea.escolasfutebol.classesjava.Equipa.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa getEquipaByORMID(PersistentSession session, int ID) throws PersistentException {
		try {
			return (Equipa) session.get(com.projetoea.escolasfutebol.classesjava.Equipa.class, new Integer(ID));
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Equipa) session.load(com.projetoea.escolasfutebol.classesjava.Equipa.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa getEquipaByORMID(PersistentSession session, int ID, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			return (Equipa) session.get(com.projetoea.escolasfutebol.classesjava.Equipa.class, new Integer(ID), lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEquipa(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryEquipa(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static List queryEquipa(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return queryEquipa(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa[] listEquipaByQuery(String condition, String orderBy) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return listEquipaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

    public static Equipa[] listEquipaByQuery(String condition, String orderBy, String limit, String offset) throws PersistentException {
        try {
            PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
            return listEquipaByQuery(session, condition, orderBy, limit, offset);
        }
        catch (Exception e) {
            e.printStackTrace();
            throw new PersistentException(e);
        }
    }
	
	public static Equipa[] listEquipaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return listEquipaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static int queryEquipaEntriesCount() throws PersistentException {
        PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
        Number equipaCount = 0;
        try {
            equipaCount = (Number) session.createCriteria(Equipa.class)
                    .setProjection(Projections.rowCount())
                    .uniqueResult();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return equipaCount.intValue();
    }

	public static List queryEquipa(PersistentSession session, String condition, String orderBy, String limit, String offset) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Equipa as Equipa");
		if (condition != null)
			sb.append(" Where ").append(condition);
		if (orderBy != null)
			sb.append(" Order By ").append(orderBy);
		try {
			Query query = session.createQuery(sb.toString());
            if(limit != null)
                query.setMaxResults(Integer.parseInt(limit));
            if(offset != null)
                query.setFirstResult(Integer.parseInt(offset));
            return query.list();
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}

	public static List queryEquipa(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Equipa as Equipa");
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
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Equipa as Equipa");
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

    public static Equipa[] listEquipaByQuery(PersistentSession session, String condition, String orderBy, String limit, String offset) throws PersistentException {
        try {
            List list = queryEquipa(session, condition, orderBy, limit, offset);
            return (Equipa[]) list.toArray(new Equipa[list.size()]);
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
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return loadEquipaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
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
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateEquipaByQuery(session, condition, orderBy);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEquipaByQuery(String condition, String orderBy, org.hibernate.LockMode lockMode) throws PersistentException {
		try {
			PersistentSession session = com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession();
			return iterateEquipaByQuery(session, condition, orderBy, lockMode);
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static java.util.Iterator iterateEquipaByQuery(PersistentSession session, String condition, String orderBy) throws PersistentException {
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Equipa as Equipa");
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
		StringBuffer sb = new StringBuffer("From com.projetoea.escolasfutebol.classesjava.Equipa as Equipa");
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
		return new com.projetoea.escolasfutebol.classesjava.Equipa();
	}
	
	public static boolean save(com.projetoea.escolasfutebol.classesjava.Equipa equipa) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().saveObject(equipa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean delete(com.projetoea.escolasfutebol.classesjava.Equipa equipa) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().deleteObject(equipa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.projetoea.escolasfutebol.classesjava.Equipa equipa)throws PersistentException {
		try {
			if (equipa.getCampo() != null) {
				equipa.getCampo().equipa.remove(equipa);
			}
			
			if (equipa.getEscolas() != null) {
				equipa.getEscolas().equipa.remove(equipa);
			}
			
			com.projetoea.escolasfutebol.classesjava.Jogador[] lJogadors = equipa.jogador.toArray();
			for(int i = 0; i < lJogadors.length; i++) {
				lJogadors[i].setEquipa(null);
			}
			com.projetoea.escolasfutebol.classesjava.Jogo[] lJogos = equipa.jogo.toArray();
			for(int i = 0; i < lJogos.length; i++) {
				lJogos[i].setEquipaCasa(null);
			}
			com.projetoea.escolasfutebol.classesjava.Jogo[] lJogo1s = equipa.jogo1.toArray();
			for(int i = 0; i < lJogo1s.length; i++) {
				lJogo1s[i].setEquipaFora(null);
			}
			com.projetoea.escolasfutebol.classesjava.Jogo[] lJogo2s = equipa.jogo2.toArray();
			for(int i = 0; i < lJogo2s.length; i++) {
				lJogo2s[i].setVencedor(null);
			}
			com.projetoea.escolasfutebol.classesjava.Partcipantetorneio[] lPartcipantetorneios = equipa.partcipantetorneio.toArray();
			for(int i = 0; i < lPartcipantetorneios.length; i++) {
				lPartcipantetorneios[i].setEquipa(null);
			}
			com.projetoea.escolasfutebol.classesjava.Participantecampeonato[] lParticipantecampeonatos = equipa.participantecampeonato.toArray();
			for(int i = 0; i < lParticipantecampeonatos.length; i++) {
				lParticipantecampeonatos[i].setEquipa(null);
			}
			return delete(equipa);
		}
		catch(Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean deleteAndDissociate(com.projetoea.escolasfutebol.classesjava.Equipa equipa, org.orm.PersistentSession session)throws PersistentException {
		try {
			if (equipa.getCampo() != null) {
				equipa.getCampo().equipa.remove(equipa);
			}
			
			if (equipa.getEscolas() != null) {
				equipa.getEscolas().equipa.remove(equipa);
			}
			
			com.projetoea.escolasfutebol.classesjava.Jogador[] lJogadors = equipa.jogador.toArray();
			for(int i = 0; i < lJogadors.length; i++) {
				lJogadors[i].setEquipa(null);
			}
			com.projetoea.escolasfutebol.classesjava.Jogo[] lJogos = equipa.jogo.toArray();
			for(int i = 0; i < lJogos.length; i++) {
				lJogos[i].setEquipaCasa(null);
			}
			com.projetoea.escolasfutebol.classesjava.Jogo[] lJogo1s = equipa.jogo1.toArray();
			for(int i = 0; i < lJogo1s.length; i++) {
				lJogo1s[i].setEquipaFora(null);
			}
			com.projetoea.escolasfutebol.classesjava.Jogo[] lJogo2s = equipa.jogo2.toArray();
			for(int i = 0; i < lJogo2s.length; i++) {
				lJogo2s[i].setVencedor(null);
			}
			com.projetoea.escolasfutebol.classesjava.Partcipantetorneio[] lPartcipantetorneios = equipa.partcipantetorneio.toArray();
			for(int i = 0; i < lPartcipantetorneios.length; i++) {
				lPartcipantetorneios[i].setEquipa(null);
			}
			com.projetoea.escolasfutebol.classesjava.Participantecampeonato[] lParticipantecampeonatos = equipa.participantecampeonato.toArray();
			for(int i = 0; i < lParticipantecampeonatos.length; i++) {
				lParticipantecampeonatos[i].setEquipa(null);
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
	
	public static boolean refresh(com.projetoea.escolasfutebol.classesjava.Equipa equipa) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession().refresh(equipa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static boolean evict(com.projetoea.escolasfutebol.classesjava.Equipa equipa) throws PersistentException {
		try {
			com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession().evict(equipa);
			return true;
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new PersistentException(e);
		}
	}
	
	public static Equipa loadEquipaByCriteria(EquipaCriteria equipaCriteria) {
		Equipa[] equipas = listEquipaByCriteria(equipaCriteria);
		if(equipas == null || equipas.length == 0) {
			return null;
		}
		return equipas[0];
	}
	
	public static Equipa[] listEquipaByCriteria(EquipaCriteria equipaCriteria) {
		return equipaCriteria.listEquipa();
	}
}
