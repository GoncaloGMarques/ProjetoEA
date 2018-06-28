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

public class ArbitroCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression utilizadorId;
	public final AssociationExpression utilizador;
	public final CollectionExpression jogo;
	
	public ArbitroCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		utilizadorId = new IntegerExpression("utilizador.ID", this);
		utilizador = new AssociationExpression("utilizador", this);
		jogo = new CollectionExpression("ORM_jogo", this);
	}
	
	public ArbitroCriteria(PersistentSession session) {
		this(session.createCriteria(Arbitro.class));
	}
	
	public ArbitroCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public UtilizadorCriteria createUtilizadorCriteria() {
		return new UtilizadorCriteria(createCriteria("utilizador"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.JogoCriteria createJogoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.JogoCriteria(createCriteria("ORM_jogo"));
	}
	
	public Arbitro uniqueArbitro() {
		return (Arbitro) super.uniqueResult();
	}
	
	public Arbitro[] listArbitro() {
		java.util.List list = super.list();
		return (Arbitro[]) list.toArray(new Arbitro[list.size()]);
	}
}

