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

public class ArbitroDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression utilizadorId;
	public final AssociationExpression utilizador;
	public final CollectionExpression jogo;
	
	public ArbitroDetachedCriteria() {
		super(Arbitro.class, ArbitroCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		utilizadorId = new IntegerExpression("utilizador.ID", this.getDetachedCriteria());
		utilizador = new AssociationExpression("utilizador", this.getDetachedCriteria());
		jogo = new CollectionExpression("ORM_jogo", this.getDetachedCriteria());
	}
	
	public ArbitroDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ArbitroCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		utilizadorId = new IntegerExpression("utilizador.ID", this.getDetachedCriteria());
		utilizador = new AssociationExpression("utilizador", this.getDetachedCriteria());
		jogo = new CollectionExpression("ORM_jogo", this.getDetachedCriteria());
	}
	
	public UtilizadorDetachedCriteria createUtilizadorCriteria() {
		return new UtilizadorDetachedCriteria(createCriteria("utilizador"));
	}
	
	public JogoDetachedCriteria createJogoCriteria() {
		return new JogoDetachedCriteria(createCriteria("ORM_jogo"));
	}
	
	public Arbitro uniqueArbitro(PersistentSession session) {
		return (Arbitro) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Arbitro[] listArbitro(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Arbitro[]) list.toArray(new Arbitro[list.size()]);
	}
}

