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

public class TorneioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression datainicio;
	public final IntegerExpression datafim;
	public final CollectionExpression rondatorneio;
	public final CollectionExpression partcipantetorneio;
	public final CollectionExpression grupo;
	
	public TorneioDetachedCriteria() {
		super(Torneio.class, TorneioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		datainicio = new IntegerExpression("datainicio", this.getDetachedCriteria());
		datafim = new IntegerExpression("datafim", this.getDetachedCriteria());
		rondatorneio = new CollectionExpression("ORM_rondatorneio", this.getDetachedCriteria());
		partcipantetorneio = new CollectionExpression("ORM_partcipantetorneio", this.getDetachedCriteria());
		grupo = new CollectionExpression("ORM_grupo", this.getDetachedCriteria());
	}
	
	public TorneioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TorneioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		datainicio = new IntegerExpression("datainicio", this.getDetachedCriteria());
		datafim = new IntegerExpression("datafim", this.getDetachedCriteria());
		rondatorneio = new CollectionExpression("ORM_rondatorneio", this.getDetachedCriteria());
		partcipantetorneio = new CollectionExpression("ORM_partcipantetorneio", this.getDetachedCriteria());
		grupo = new CollectionExpression("ORM_grupo", this.getDetachedCriteria());
	}
	
	public RondatorneioDetachedCriteria createRondatorneioCriteria() {
		return new RondatorneioDetachedCriteria(createCriteria("ORM_rondatorneio"));
	}
	
	public PartcipantetorneioDetachedCriteria createPartcipantetorneioCriteria() {
		return new PartcipantetorneioDetachedCriteria(createCriteria("ORM_partcipantetorneio"));
	}
	
	public GrupoDetachedCriteria createGrupoCriteria() {
		return new GrupoDetachedCriteria(createCriteria("ORM_grupo"));
	}
	
	public Torneio uniqueTorneio(PersistentSession session) {
		return (Torneio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Torneio[] listTorneio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Torneio[]) list.toArray(new Torneio[list.size()]);
	}
}

