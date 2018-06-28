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

public class FaseCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression nomefase;
	public final CollectionExpression rondatorneio;
	
	public FaseCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nomefase = new IntegerExpression("nomefase", this);
		rondatorneio = new CollectionExpression("ORM_rondatorneio", this);
	}
	
	public FaseCriteria(PersistentSession session) {
		this(session.createCriteria(Fase.class));
	}
	
	public FaseCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public com.projetoea.escolasfutebol.classesjava.RondatorneioCriteria createRondatorneioCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.RondatorneioCriteria(createCriteria("ORM_rondatorneio"));
	}
	
	public Fase uniqueFase() {
		return (Fase) super.uniqueResult();
	}
	
	public Fase[] listFase() {
		java.util.List list = super.list();
		return (Fase[]) list.toArray(new Fase[list.size()]);
	}
}

