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

public class GrupoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final IntegerExpression torneioId;
	public final AssociationExpression torneio;
	public final CollectionExpression partcipantetorneio;
	
	public GrupoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		torneioId = new IntegerExpression("torneio.ID", this);
		torneio = new AssociationExpression("torneio", this);
		partcipantetorneio = new CollectionExpression("ORM_partcipantetorneio", this);
	}
	
	public GrupoCriteria(PersistentSession session) {
		this(session.createCriteria(Grupo.class));
	}
	
	public GrupoCriteria() throws PersistentException {
		this(EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public TorneioCriteria createTorneioCriteria() {
		return new TorneioCriteria(createCriteria("torneio"));
	}
	
	public PartcipantetorneioCriteria createPartcipantetorneioCriteria() {
		return new PartcipantetorneioCriteria(createCriteria("ORM_partcipantetorneio"));
	}
	
	public Grupo uniqueGrupo() {
		return (Grupo) super.uniqueResult();
	}
	
	public Grupo[] listGrupo() {
		java.util.List list = super.list();
		return (Grupo[]) list.toArray(new Grupo[list.size()]);
	}
}

