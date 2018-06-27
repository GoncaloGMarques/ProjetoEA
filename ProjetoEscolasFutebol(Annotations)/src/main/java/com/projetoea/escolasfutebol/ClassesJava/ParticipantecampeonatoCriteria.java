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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class ParticipantecampeonatoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression campeonatoId;
	public final AssociationExpression campeonato;
	public final IntegerExpression equipaId;
	public final AssociationExpression equipa;
	public final IntegerExpression pontos;
	public final IntegerExpression golosmarcados;
	public final IntegerExpression golossofridos;
	
	public ParticipantecampeonatoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		campeonatoId = new IntegerExpression("campeonato.ID", this);
		campeonato = new AssociationExpression("campeonato", this);
		equipaId = new IntegerExpression("equipa.ID", this);
		equipa = new AssociationExpression("equipa", this);
		pontos = new IntegerExpression("pontos", this);
		golosmarcados = new IntegerExpression("golosmarcados", this);
		golossofridos = new IntegerExpression("golossofridos", this);
	}
	
	public ParticipantecampeonatoCriteria(PersistentSession session) {
		this(session.createCriteria(Participantecampeonato.class));
	}
	
	public ParticipantecampeonatoCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.ClassesJava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public CampeonatoCriteria createCampeonatoCriteria() {
		return new CampeonatoCriteria(createCriteria("campeonato"));
	}
	
	public EquipaCriteria createEquipaCriteria() {
		return new EquipaCriteria(createCriteria("equipa"));
	}
	
	public Participantecampeonato uniqueParticipantecampeonato() {
		return (Participantecampeonato) super.uniqueResult();
	}
	
	public Participantecampeonato[] listParticipantecampeonato() {
		java.util.List list = super.list();
		return (Participantecampeonato[]) list.toArray(new Participantecampeonato[list.size()]);
	}
}

