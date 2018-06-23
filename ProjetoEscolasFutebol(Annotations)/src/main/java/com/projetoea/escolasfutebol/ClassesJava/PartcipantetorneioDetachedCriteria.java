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

public class PartcipantetorneioDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression torneioId;
	public final AssociationExpression torneio;
	public final IntegerExpression equipaId;
	public final AssociationExpression equipa;
	public final IntegerExpression grupoId;
	public final AssociationExpression grupo;
	
	public PartcipantetorneioDetachedCriteria() {
		super(Partcipantetorneio.class, PartcipantetorneioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		torneioId = new IntegerExpression("torneio.ID", this.getDetachedCriteria());
		torneio = new AssociationExpression("torneio", this.getDetachedCriteria());
		equipaId = new IntegerExpression("equipa.ID", this.getDetachedCriteria());
		equipa = new AssociationExpression("equipa", this.getDetachedCriteria());
		grupoId = new IntegerExpression("grupo.ID", this.getDetachedCriteria());
		grupo = new AssociationExpression("grupo", this.getDetachedCriteria());
	}
	
	public PartcipantetorneioDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, PartcipantetorneioCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		torneioId = new IntegerExpression("torneio.ID", this.getDetachedCriteria());
		torneio = new AssociationExpression("torneio", this.getDetachedCriteria());
		equipaId = new IntegerExpression("equipa.ID", this.getDetachedCriteria());
		equipa = new AssociationExpression("equipa", this.getDetachedCriteria());
		grupoId = new IntegerExpression("grupo.ID", this.getDetachedCriteria());
		grupo = new AssociationExpression("grupo", this.getDetachedCriteria());
	}
	
	public TorneioDetachedCriteria createTorneioCriteria() {
		return new TorneioDetachedCriteria(createCriteria("torneio"));
	}
	
	public EquipaDetachedCriteria createEquipaCriteria() {
		return new EquipaDetachedCriteria(createCriteria("equipa"));
	}
	
	public GrupoDetachedCriteria createGrupoCriteria() {
		return new GrupoDetachedCriteria(createCriteria("grupo"));
	}
	
	public Partcipantetorneio uniquePartcipantetorneio(PersistentSession session) {
		return (Partcipantetorneio) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Partcipantetorneio[] listPartcipantetorneio(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Partcipantetorneio[]) list.toArray(new Partcipantetorneio[list.size()]);
	}
}

