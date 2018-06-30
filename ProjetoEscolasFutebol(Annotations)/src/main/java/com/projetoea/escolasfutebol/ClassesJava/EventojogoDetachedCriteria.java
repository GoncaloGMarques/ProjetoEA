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

public class EventojogoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression minuto;
	public final IntegerExpression jogoId;
	public final AssociationExpression jogo;
	public final IntegerExpression tipoeventojogoId;
	public final AssociationExpression tipoeventojogo;
	public final IntegerExpression jogadorId;
	public final AssociationExpression jogador;
	
	public EventojogoDetachedCriteria() {
		super(com.projetoea.escolasfutebol.classesjava.Eventojogo.class, com.projetoea.escolasfutebol.classesjava.EventojogoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		minuto = new IntegerExpression("minuto", this.getDetachedCriteria());
		jogoId = new IntegerExpression("jogo.ID", this.getDetachedCriteria());
		jogo = new AssociationExpression("jogo", this.getDetachedCriteria());
		tipoeventojogoId = new IntegerExpression("tipoeventojogo.ID", this.getDetachedCriteria());
		tipoeventojogo = new AssociationExpression("tipoeventojogo", this.getDetachedCriteria());
		jogadorId = new IntegerExpression("jogador.ID", this.getDetachedCriteria());
		jogador = new AssociationExpression("jogador", this.getDetachedCriteria());
	}
	
	public EventojogoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.projetoea.escolasfutebol.classesjava.EventojogoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		minuto = new IntegerExpression("minuto", this.getDetachedCriteria());
		jogoId = new IntegerExpression("jogo.ID", this.getDetachedCriteria());
		jogo = new AssociationExpression("jogo", this.getDetachedCriteria());
		tipoeventojogoId = new IntegerExpression("tipoeventojogo.ID", this.getDetachedCriteria());
		tipoeventojogo = new AssociationExpression("tipoeventojogo", this.getDetachedCriteria());
		jogadorId = new IntegerExpression("jogador.ID", this.getDetachedCriteria());
		jogador = new AssociationExpression("jogador", this.getDetachedCriteria());
	}
	
	public JogoDetachedCriteria createJogoCriteria() {
		return new JogoDetachedCriteria(createCriteria("jogo"));
	}
	
	public TipoeventojogoDetachedCriteria createTipoeventojogoCriteria() {
		return new TipoeventojogoDetachedCriteria(createCriteria("tipoeventojogo"));
	}
	
	public JogadorDetachedCriteria createJogadorCriteria() {
		return new JogadorDetachedCriteria(createCriteria("jogador"));
	}
	
	public Eventojogo uniqueEventojogo(PersistentSession session) {
		return (Eventojogo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Eventojogo[] listEventojogo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Eventojogo[]) list.toArray(new Eventojogo[list.size()]);
	}
}

