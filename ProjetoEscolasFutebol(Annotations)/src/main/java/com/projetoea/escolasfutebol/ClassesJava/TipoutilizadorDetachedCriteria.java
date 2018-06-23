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

public class TipoutilizadorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final CollectionExpression utilizador;
	
	public TipoutilizadorDetachedCriteria() {
		super(Tipoutilizador.class, TipoutilizadorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		utilizador = new CollectionExpression("ORM_utilizador", this.getDetachedCriteria());
	}
	
	public TipoutilizadorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TipoutilizadorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		utilizador = new CollectionExpression("ORM_utilizador", this.getDetachedCriteria());
	}
	
	public UtilizadorDetachedCriteria createUtilizadorCriteria() {
		return new UtilizadorDetachedCriteria(createCriteria("ORM_utilizador"));
	}
	
	public Tipoutilizador uniqueTipoutilizador(PersistentSession session) {
		return (Tipoutilizador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Tipoutilizador[] listTipoutilizador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Tipoutilizador[]) list.toArray(new Tipoutilizador[list.size()]);
	}
}

