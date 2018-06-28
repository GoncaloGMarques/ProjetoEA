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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class CampeonatoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final CollectionExpression participantecampeonato;
	public final CollectionExpression rondacampeonato;
	
	public CampeonatoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		participantecampeonato = new CollectionExpression("ORM_participantecampeonato", this);
		rondacampeonato = new CollectionExpression("ORM_rondacampeonato", this);
	}
	
	public CampeonatoCriteria(PersistentSession session) {
		this(session.createCriteria(Campeonato.class));
	}
	
	public CampeonatoCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public com.projetoea.escolasfutebol.classesjava.ParticipantecampeonatoCriteria createParticipantecampeonatoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.ParticipantecampeonatoCriteria(createCriteria("ORM_participantecampeonato"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.RondacampeonatoCriteria createRondacampeonatoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.RondacampeonatoCriteria(createCriteria("ORM_rondacampeonato"));
	}
	
	public Campeonato uniqueCampeonato() {
		return (Campeonato) super.uniqueResult();
	}
	
	public Campeonato[] listCampeonato() {
		java.util.List list = super.list();
		return (Campeonato[]) list.toArray(new Campeonato[list.size()]);
	}
}

