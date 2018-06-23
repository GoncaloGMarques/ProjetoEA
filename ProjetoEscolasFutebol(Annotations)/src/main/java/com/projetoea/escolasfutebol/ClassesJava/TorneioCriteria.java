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

public class TorneioCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression datainicio;
	public final IntegerExpression datafim;
	public final CollectionExpression rondatorneio;
	public final CollectionExpression partcipantetorneio;
	public final CollectionExpression grupo;
	
	public TorneioCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		datainicio = new IntegerExpression("datainicio", this);
		datafim = new IntegerExpression("datafim", this);
		rondatorneio = new CollectionExpression("ORM_rondatorneio", this);
		partcipantetorneio = new CollectionExpression("ORM_partcipantetorneio", this);
		grupo = new CollectionExpression("ORM_grupo", this);
	}
	
	public TorneioCriteria(PersistentSession session) {
		this(session.createCriteria(Torneio.class));
	}
	
	public TorneioCriteria() throws PersistentException {
		this(EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public RondatorneioCriteria createRondatorneioCriteria() {
		return new RondatorneioCriteria(createCriteria("ORM_rondatorneio"));
	}
	
	public PartcipantetorneioCriteria createPartcipantetorneioCriteria() {
		return new PartcipantetorneioCriteria(createCriteria("ORM_partcipantetorneio"));
	}
	
	public GrupoCriteria createGrupoCriteria() {
		return new GrupoCriteria(createCriteria("ORM_grupo"));
	}
	
	public Torneio uniqueTorneio() {
		return (Torneio) super.uniqueResult();
	}
	
	public Torneio[] listTorneio() {
		java.util.List list = super.list();
		return (Torneio[]) list.toArray(new Torneio[list.size()]);
	}
}

