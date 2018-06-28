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

public class TipoutilizadorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final CollectionExpression utilizador;
	
	public TipoutilizadorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		utilizador = new CollectionExpression("ORM_utilizador", this);
	}
	
	public TipoutilizadorCriteria(PersistentSession session) {
		this(session.createCriteria(Tipoutilizador.class));
	}
	
	public TipoutilizadorCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public com.projetoea.escolasfutebol.classesjava.UtilizadorCriteria createUtilizadorCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.UtilizadorCriteria(createCriteria("ORM_utilizador"));
	}
	
	public Tipoutilizador uniqueTipoutilizador() {
		return (Tipoutilizador) super.uniqueResult();
	}
	
	public Tipoutilizador[] listTipoutilizador() {
		java.util.List list = super.list();
		return (Tipoutilizador[]) list.toArray(new Tipoutilizador[list.size()]);
	}
}

