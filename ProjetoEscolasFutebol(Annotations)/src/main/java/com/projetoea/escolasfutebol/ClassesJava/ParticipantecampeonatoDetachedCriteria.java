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

public class ParticipantecampeonatoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression campeonatoId;
	public final AssociationExpression campeonato;
	public final IntegerExpression equipaId;
	public final AssociationExpression equipa;
	
	public ParticipantecampeonatoDetachedCriteria() {
		super(Participantecampeonato.class, ParticipantecampeonatoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		campeonatoId = new IntegerExpression("campeonato.ID", this.getDetachedCriteria());
		campeonato = new AssociationExpression("campeonato", this.getDetachedCriteria());
		equipaId = new IntegerExpression("equipa.ID", this.getDetachedCriteria());
		equipa = new AssociationExpression("equipa", this.getDetachedCriteria());
	}
	
	public ParticipantecampeonatoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, ParticipantecampeonatoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		campeonatoId = new IntegerExpression("campeonato.ID", this.getDetachedCriteria());
		campeonato = new AssociationExpression("campeonato", this.getDetachedCriteria());
		equipaId = new IntegerExpression("equipa.ID", this.getDetachedCriteria());
		equipa = new AssociationExpression("equipa", this.getDetachedCriteria());
	}
	
	public CampeonatoDetachedCriteria createCampeonatoCriteria() {
		return new CampeonatoDetachedCriteria(createCriteria("campeonato"));
	}
	
	public EquipaDetachedCriteria createEquipaCriteria() {
		return new EquipaDetachedCriteria(createCriteria("equipa"));
	}
	
	public Participantecampeonato uniqueParticipantecampeonato(PersistentSession session) {
		return (Participantecampeonato) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Participantecampeonato[] listParticipantecampeonato(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Participantecampeonato[]) list.toArray(new Participantecampeonato[list.size()]);
	}
}

