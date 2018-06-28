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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class PartcipantetorneioCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression torneioId;
	public final AssociationExpression torneio;
	public final IntegerExpression equipaId;
	public final AssociationExpression equipa;
	public final IntegerExpression grupoId;
	public final AssociationExpression grupo;
	
	public PartcipantetorneioCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		torneioId = new IntegerExpression("torneio.ID", this);
		torneio = new AssociationExpression("torneio", this);
		equipaId = new IntegerExpression("equipa.ID", this);
		equipa = new AssociationExpression("equipa", this);
		grupoId = new IntegerExpression("grupo.ID", this);
		grupo = new AssociationExpression("grupo", this);
	}
	
	public PartcipantetorneioCriteria(PersistentSession session) {
		this(session.createCriteria(Partcipantetorneio.class));
	}
	
	public PartcipantetorneioCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public TorneioCriteria createTorneioCriteria() {
		return new TorneioCriteria(createCriteria("torneio"));
	}
	
	public EquipaCriteria createEquipaCriteria() {
		return new EquipaCriteria(createCriteria("equipa"));
	}
	
	public GrupoCriteria createGrupoCriteria() {
		return new GrupoCriteria(createCriteria("grupo"));
	}
	
	public Partcipantetorneio uniquePartcipantetorneio() {
		return (Partcipantetorneio) super.uniqueResult();
	}
	
	public Partcipantetorneio[] listPartcipantetorneio() {
		java.util.List list = super.list();
		return (Partcipantetorneio[]) list.toArray(new Partcipantetorneio[list.size()]);
	}
}

