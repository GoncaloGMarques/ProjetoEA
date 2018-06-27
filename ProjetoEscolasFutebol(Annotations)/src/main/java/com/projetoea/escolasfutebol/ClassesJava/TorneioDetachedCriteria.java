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

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

import java.util.List;

public class TorneioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression datainicio;
	public final TimestampExpression datafim;
	public final StringExpression nome;
	public final CollectionExpression rondatorneio;
	public final CollectionExpression partcipantetorneio;
	public final CollectionExpression grupo;
	
	public TorneioDetachedCriteria() {
		super(Torneio.class, TorneioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		datainicio = new TimestampExpression("datainicio", this.getDetachedCriteria());
		datafim = new TimestampExpression("datafim", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		rondatorneio = new CollectionExpression("ORM_rondatorneio", this.getDetachedCriteria());
		partcipantetorneio = new CollectionExpression("ORM_partcipantetorneio", this.getDetachedCriteria());
		grupo = new CollectionExpression("ORM_grupo", this.getDetachedCriteria());
	}
	
	public TorneioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, TorneioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		datainicio = new TimestampExpression("datainicio", this.getDetachedCriteria());
		datafim = new TimestampExpression("datafim", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
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

