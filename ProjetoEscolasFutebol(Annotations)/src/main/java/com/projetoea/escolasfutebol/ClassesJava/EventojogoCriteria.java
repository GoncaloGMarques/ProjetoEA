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

public class EventojogoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression minuto;
	public final IntegerExpression jogoId;
	public final AssociationExpression jogo;
	public final IntegerExpression tipoeventojogoId;
	public final AssociationExpression tipoeventojogo;
	
	public EventojogoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		minuto = new IntegerExpression("minuto", this);
		jogoId = new IntegerExpression("ORM_Jogo.ID", this);
		jogo = new AssociationExpression("ORM_Jogo", this);
		tipoeventojogoId = new IntegerExpression("ORM_Tipoeventojogo.ID", this);
		tipoeventojogo = new AssociationExpression("ORM_Tipoeventojogo", this);
	}
	
	public EventojogoCriteria(PersistentSession session) {
		this(session.createCriteria(Eventojogo.class));
	}
	
	public EventojogoCriteria() throws PersistentException {
		this(EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public JogoCriteria createJogoCriteria() {
		return new JogoCriteria(createCriteria("ORM_Jogo"));
	}
	
	public TipoeventojogoCriteria createTipoeventojogoCriteria() {
		return new TipoeventojogoCriteria(createCriteria("ORM_Tipoeventojogo"));
	}
	
	public Eventojogo uniqueEventojogo() {
		return (Eventojogo) super.uniqueResult();
	}
	
	public Eventojogo[] listEventojogo() {
		java.util.List list = super.list();
		return (Eventojogo[]) list.toArray(new Eventojogo[list.size()]);
	}
}

