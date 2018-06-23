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

public class CampoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final CollectionExpression equipa;
	public final CollectionExpression jogo;
	
	public CampoDetachedCriteria() {
		super(Campo.class, CampoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		equipa = new CollectionExpression("ORM_equipa", this.getDetachedCriteria());
		jogo = new CollectionExpression("ORM_jogo", this.getDetachedCriteria());
	}
	
	public CampoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CampoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		equipa = new CollectionExpression("ORM_equipa", this.getDetachedCriteria());
		jogo = new CollectionExpression("ORM_jogo", this.getDetachedCriteria());
	}
	
	public EquipaDetachedCriteria createEquipaCriteria() {
		return new EquipaDetachedCriteria(createCriteria("ORM_equipa"));
	}
	
	public JogoDetachedCriteria createJogoCriteria() {
		return new JogoDetachedCriteria(createCriteria("ORM_jogo"));
	}
	
	public Campo uniqueCampo(PersistentSession session) {
		return (Campo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Campo[] listCampo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Campo[]) list.toArray(new Campo[list.size()]);
	}
}

