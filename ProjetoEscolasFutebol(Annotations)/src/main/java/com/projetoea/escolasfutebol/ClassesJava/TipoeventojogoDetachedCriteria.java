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
import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class TipoeventojogoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final CollectionExpression eventojogo;
	
	public TipoeventojogoDetachedCriteria() {
		super(Tipoeventojogo.class, TipoeventojogoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		eventojogo = new CollectionExpression("ORM_eventojogo", this.getDetachedCriteria());
	}
	
	public TipoeventojogoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TipoeventojogoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		eventojogo = new CollectionExpression("ORM_eventojogo", this.getDetachedCriteria());
	}
	
	public EventojogoDetachedCriteria createEventojogoCriteria() {
		return new EventojogoDetachedCriteria(createCriteria("ORM_eventojogo"));
	}
	
	public Tipoeventojogo uniqueTipoeventojogo(PersistentSession session) {
		return (Tipoeventojogo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tipoeventojogo[] listTipoeventojogo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tipoeventojogo[]) list.toArray(new Tipoeventojogo[list.size()]);
	}
}

