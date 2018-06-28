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

public class RondacampeonatoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression campeonatoId;
	public final AssociationExpression campeonato;
	public final CollectionExpression jogo;
	
	public RondacampeonatoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		campeonatoId = new IntegerExpression("campeonato.ID", this);
		campeonato = new AssociationExpression("campeonato", this);
		jogo = new CollectionExpression("ORM_jogo", this);
	}
	
	public RondacampeonatoCriteria(PersistentSession session) {
		this(session.createCriteria(Rondacampeonato.class));
	}
	
	public RondacampeonatoCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public CampeonatoCriteria createCampeonatoCriteria() {
		return new CampeonatoCriteria(createCriteria("campeonato"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.JogoCriteria createJogoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.JogoCriteria(createCriteria("ORM_jogo"));
	}
	
	public Rondacampeonato uniqueRondacampeonato() {
		return (Rondacampeonato) super.uniqueResult();
	}
	
	public Rondacampeonato[] listRondacampeonato() {
		java.util.List list = super.list();
		return (Rondacampeonato[]) list.toArray(new Rondacampeonato[list.size()]);
	}
}

