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

public class RondatorneioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression data;
	public final IntegerExpression faseId;
	public final AssociationExpression fase;
	public final IntegerExpression torneioId;
	public final AssociationExpression torneio;
	public final CollectionExpression jogo;
	
	public RondatorneioDetachedCriteria() {
		super(com.projetoea.escolasfutebol.classesjava.Rondatorneio.class, com.projetoea.escolasfutebol.classesjava.RondatorneioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		data = new IntegerExpression("data", this.getDetachedCriteria());
		faseId = new IntegerExpression("fase.ID", this.getDetachedCriteria());
		fase = new AssociationExpression("fase", this.getDetachedCriteria());
		torneioId = new IntegerExpression("torneio.ID", this.getDetachedCriteria());
		torneio = new AssociationExpression("torneio", this.getDetachedCriteria());
		jogo = new CollectionExpression("ORM_jogo", this.getDetachedCriteria());
	}
	
	public RondatorneioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.projetoea.escolasfutebol.classesjava.RondatorneioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		data = new IntegerExpression("data", this.getDetachedCriteria());
		faseId = new IntegerExpression("fase.ID", this.getDetachedCriteria());
		fase = new AssociationExpression("fase", this.getDetachedCriteria());
		torneioId = new IntegerExpression("torneio.ID", this.getDetachedCriteria());
		torneio = new AssociationExpression("torneio", this.getDetachedCriteria());
		jogo = new CollectionExpression("ORM_jogo", this.getDetachedCriteria());
	}
	
	public FaseDetachedCriteria createFaseCriteria() {
		return new FaseDetachedCriteria(createCriteria("fase"));
	}
	
	public TorneioDetachedCriteria createTorneioCriteria() {
		return new TorneioDetachedCriteria(createCriteria("torneio"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.JogoDetachedCriteria createJogoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.JogoDetachedCriteria(createCriteria("ORM_jogo"));
	}
	
	public Rondatorneio uniqueRondatorneio(PersistentSession session) {
		return (Rondatorneio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Rondatorneio[] listRondatorneio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Rondatorneio[]) list.toArray(new Rondatorneio[list.size()]);
	}
}

