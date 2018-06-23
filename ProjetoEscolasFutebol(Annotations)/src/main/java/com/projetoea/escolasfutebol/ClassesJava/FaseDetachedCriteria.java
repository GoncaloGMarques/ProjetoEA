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

public class FaseDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression nomefase;
	public final CollectionExpression rondatorneio;
	
	public FaseDetachedCriteria() {
		super(Fase.class, FaseCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nomefase = new IntegerExpression("nomefase", this.getDetachedCriteria());
		rondatorneio = new CollectionExpression("ORM_rondatorneio", this.getDetachedCriteria());
	}
	
	public FaseDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, FaseCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nomefase = new IntegerExpression("nomefase", this.getDetachedCriteria());
		rondatorneio = new CollectionExpression("ORM_rondatorneio", this.getDetachedCriteria());
	}
	
	public RondatorneioDetachedCriteria createRondatorneioCriteria() {
		return new RondatorneioDetachedCriteria(createCriteria("ORM_rondatorneio"));
	}
	
	public Fase uniqueFase(PersistentSession session) {
		return (Fase) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Fase[] listFase(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Fase[]) list.toArray(new Fase[list.size()]);
	}
}

