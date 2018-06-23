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

public class CampoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final CollectionExpression equipa;
	public final CollectionExpression jogo;
	
	public CampoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		equipa = new CollectionExpression("ORM_equipa", this);
		jogo = new CollectionExpression("ORM_jogo", this);
	}
	
	public CampoCriteria(PersistentSession session) {
		this(session.createCriteria(Campo.class));
	}
	
	public CampoCriteria() throws PersistentException {
		this(EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public EquipaCriteria createEquipaCriteria() {
		return new EquipaCriteria(createCriteria("ORM_equipa"));
	}
	
	public JogoCriteria createJogoCriteria() {
		return new JogoCriteria(createCriteria("ORM_jogo"));
	}
	
	public Campo uniqueCampo() {
		return (Campo) super.uniqueResult();
	}
	
	public Campo[] listCampo() {
		java.util.List list = super.list();
		return (Campo[]) list.toArray(new Campo[list.size()]);
	}
}

