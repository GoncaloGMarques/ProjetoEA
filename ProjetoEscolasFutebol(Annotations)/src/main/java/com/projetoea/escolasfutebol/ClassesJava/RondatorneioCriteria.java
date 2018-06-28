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

public class RondatorneioCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression data;
	public final IntegerExpression faseId;
	public final AssociationExpression fase;
	public final IntegerExpression torneioId;
	public final AssociationExpression torneio;
	public final CollectionExpression jogo;
	
	public RondatorneioCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		data = new IntegerExpression("data", this);
		faseId = new IntegerExpression("fase.ID", this);
		fase = new AssociationExpression("fase", this);
		torneioId = new IntegerExpression("torneio.ID", this);
		torneio = new AssociationExpression("torneio", this);
		jogo = new CollectionExpression("ORM_jogo", this);
	}
	
	public RondatorneioCriteria(PersistentSession session) {
		this(session.createCriteria(Rondatorneio.class));
	}
	
	public RondatorneioCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public FaseCriteria createFaseCriteria() {
		return new FaseCriteria(createCriteria("fase"));
	}
	
	public TorneioCriteria createTorneioCriteria() {
		return new TorneioCriteria(createCriteria("torneio"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.JogoCriteria createJogoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.JogoCriteria(createCriteria("ORM_jogo"));
	}
	
	public Rondatorneio uniqueRondatorneio() {
		return (Rondatorneio) super.uniqueResult();
	}
	
	public Rondatorneio[] listRondatorneio() {
		java.util.List list = super.list();
		return (Rondatorneio[]) list.toArray(new Rondatorneio[list.size()]);
	}
}

