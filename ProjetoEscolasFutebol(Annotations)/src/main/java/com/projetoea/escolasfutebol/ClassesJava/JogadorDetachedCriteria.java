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

public class JogadorDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final IntegerExpression idade;
	public final IntegerExpression NCartoesVermelhos;
	public final IntegerExpression NCartoesAmarelos;
	public final IntegerExpression golos;
	public final IntegerExpression equipaId;
	public final AssociationExpression equipa;
	
	public JogadorDetachedCriteria() {
		super(Jogador.class, JogadorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		idade = new IntegerExpression("idade", this.getDetachedCriteria());
		NCartoesVermelhos = new IntegerExpression("NCartoesVermelhos", this.getDetachedCriteria());
		NCartoesAmarelos = new IntegerExpression("NCartoesAmarelos", this.getDetachedCriteria());
		golos = new IntegerExpression("golos", this.getDetachedCriteria());
		equipaId = new IntegerExpression("equipa.ID", this.getDetachedCriteria());
		equipa = new AssociationExpression("equipa", this.getDetachedCriteria());
	}
	
	public JogadorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, JogadorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		idade = new IntegerExpression("idade", this.getDetachedCriteria());
		NCartoesVermelhos = new IntegerExpression("NCartoesVermelhos", this.getDetachedCriteria());
		NCartoesAmarelos = new IntegerExpression("NCartoesAmarelos", this.getDetachedCriteria());
		golos = new IntegerExpression("golos", this.getDetachedCriteria());
		equipaId = new IntegerExpression("equipa.ID", this.getDetachedCriteria());
		equipa = new AssociationExpression("equipa", this.getDetachedCriteria());
	}
	
	public EquipaDetachedCriteria createEquipaCriteria() {
		return new EquipaDetachedCriteria(createCriteria("equipa"));
	}
	
	public Jogador uniqueJogador(PersistentSession session) {
		return (Jogador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Jogador[] listJogador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Jogador[]) list.toArray(new Jogador[list.size()]);
	}
}

