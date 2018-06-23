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

public class GrupoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final IntegerExpression torneioId;
	public final AssociationExpression torneio;
	public final CollectionExpression partcipantetorneio;
	
	public GrupoDetachedCriteria() {
		super(Grupo.class, GrupoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		torneioId = new IntegerExpression("torneio.ID", this.getDetachedCriteria());
		torneio = new AssociationExpression("torneio", this.getDetachedCriteria());
		partcipantetorneio = new CollectionExpression("ORM_partcipantetorneio", this.getDetachedCriteria());
	}
	
	public GrupoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, GrupoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		torneioId = new IntegerExpression("torneio.ID", this.getDetachedCriteria());
		torneio = new AssociationExpression("torneio", this.getDetachedCriteria());
		partcipantetorneio = new CollectionExpression("ORM_partcipantetorneio", this.getDetachedCriteria());
	}
	
	public TorneioDetachedCriteria createTorneioCriteria() {
		return new TorneioDetachedCriteria(createCriteria("torneio"));
	}
	
	public PartcipantetorneioDetachedCriteria createPartcipantetorneioCriteria() {
		return new PartcipantetorneioDetachedCriteria(createCriteria("ORM_partcipantetorneio"));
	}
	
	public Grupo uniqueGrupo(PersistentSession session) {
		return (Grupo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Grupo[] listGrupo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Grupo[]) list.toArray(new Grupo[list.size()]);
	}
}

