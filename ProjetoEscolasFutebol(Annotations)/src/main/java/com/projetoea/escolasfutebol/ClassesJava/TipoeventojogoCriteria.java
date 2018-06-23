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
import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TipoeventojogoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final CollectionExpression eventojogo;
	
	public TipoeventojogoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		eventojogo = new CollectionExpression("ORM_eventojogo", this);
	}
	
	public TipoeventojogoCriteria(PersistentSession session) {
		this(session.createCriteria(Tipoeventojogo.class));
	}
	
	public TipoeventojogoCriteria() throws PersistentException {
		this(EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public EventojogoCriteria createEventojogoCriteria() {
		return new EventojogoCriteria(createCriteria("ORM_eventojogo"));
	}
	
	public Tipoeventojogo uniqueTipoeventojogo() {
		return (Tipoeventojogo) super.uniqueResult();
	}
	
	public Tipoeventojogo[] listTipoeventojogo() {
		java.util.List list = super.list();
		return (Tipoeventojogo[]) list.toArray(new Tipoeventojogo[list.size()]);
	}
}

