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

public class CampeonatoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final CollectionExpression participantecampeonato;
	public final CollectionExpression rondacampeonato;
	
	public CampeonatoDetachedCriteria() {
		super(Campeonato.class, CampeonatoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		participantecampeonato = new CollectionExpression("ORM_participantecampeonato", this.getDetachedCriteria());
		rondacampeonato = new CollectionExpression("ORM_rondacampeonato", this.getDetachedCriteria());
	}
	
	public CampeonatoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, CampeonatoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		participantecampeonato = new CollectionExpression("ORM_participantecampeonato", this.getDetachedCriteria());
		rondacampeonato = new CollectionExpression("ORM_rondacampeonato", this.getDetachedCriteria());
	}
	
	public ParticipantecampeonatoDetachedCriteria createParticipantecampeonatoCriteria() {
		return new ParticipantecampeonatoDetachedCriteria(createCriteria("ORM_participantecampeonato"));
	}
	
	public RondacampeonatoDetachedCriteria createRondacampeonatoCriteria() {
		return new RondacampeonatoDetachedCriteria(createCriteria("ORM_rondacampeonato"));
	}
	
	public Campeonato uniqueCampeonato(PersistentSession session) {
		return (Campeonato) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Campeonato[] listCampeonato(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Campeonato[]) list.toArray(new Campeonato[list.size()]);
	}
}

