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

public class EventojogoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression minuto;
	public final IntegerExpression jogoId;
	public final AssociationExpression jogo;
	public final IntegerExpression tipoeventojogoId;
	public final AssociationExpression tipoeventojogo;
	
	public EventojogoDetachedCriteria() {
		super(Eventojogo.class, EventojogoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		minuto = new IntegerExpression("minuto", this.getDetachedCriteria());
		jogoId = new IntegerExpression("ORM_Jogo.ID", this.getDetachedCriteria());
		jogo = new AssociationExpression("ORM_Jogo", this.getDetachedCriteria());
		tipoeventojogoId = new IntegerExpression("ORM_Tipoeventojogo.ID", this.getDetachedCriteria());
		tipoeventojogo = new AssociationExpression("ORM_Tipoeventojogo", this.getDetachedCriteria());
	}
	
	public EventojogoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, EventojogoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		minuto = new IntegerExpression("minuto", this.getDetachedCriteria());
		jogoId = new IntegerExpression("ORM_Jogo.ID", this.getDetachedCriteria());
		jogo = new AssociationExpression("ORM_Jogo", this.getDetachedCriteria());
		tipoeventojogoId = new IntegerExpression("ORM_Tipoeventojogo.ID", this.getDetachedCriteria());
		tipoeventojogo = new AssociationExpression("ORM_Tipoeventojogo", this.getDetachedCriteria());
	}
	
	public JogoDetachedCriteria createJogoCriteria() {
		return new JogoDetachedCriteria(createCriteria("ORM_Jogo"));
	}
	
	public TipoeventojogoDetachedCriteria createTipoeventojogoCriteria() {
		return new TipoeventojogoDetachedCriteria(createCriteria("ORM_Tipoeventojogo"));
	}
	
	public Eventojogo uniqueEventojogo(PersistentSession session) {
		return (Eventojogo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Eventojogo[] listEventojogo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Eventojogo[]) list.toArray(new Eventojogo[list.size()]);
	}
}

