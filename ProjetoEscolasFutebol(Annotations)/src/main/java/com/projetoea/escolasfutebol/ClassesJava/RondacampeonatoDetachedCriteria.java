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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class RondacampeonatoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression campeonatoId;
	public final AssociationExpression campeonato;
	public final CollectionExpression jogo;
	
	public RondacampeonatoDetachedCriteria() {
		super(com.projetoea.escolasfutebol.classesjava.Rondacampeonato.class, com.projetoea.escolasfutebol.classesjava.RondacampeonatoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		campeonatoId = new IntegerExpression("campeonato.ID", this.getDetachedCriteria());
		campeonato = new AssociationExpression("campeonato", this.getDetachedCriteria());
		jogo = new CollectionExpression("ORM_jogo", this.getDetachedCriteria());
	}
	
	public RondacampeonatoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.projetoea.escolasfutebol.classesjava.RondacampeonatoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		campeonatoId = new IntegerExpression("campeonato.ID", this.getDetachedCriteria());
		campeonato = new AssociationExpression("campeonato", this.getDetachedCriteria());
		jogo = new CollectionExpression("ORM_jogo", this.getDetachedCriteria());
	}
	
	public CampeonatoDetachedCriteria createCampeonatoCriteria() {
		return new CampeonatoDetachedCriteria(createCriteria("campeonato"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.JogoDetachedCriteria createJogoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.JogoDetachedCriteria(createCriteria("ORM_jogo"));
	}
	
	public Rondacampeonato uniqueRondacampeonato(PersistentSession session) {
		return (Rondacampeonato) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Rondacampeonato[] listRondacampeonato(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Rondacampeonato[]) list.toArray(new Rondacampeonato[list.size()]);
	}
}

