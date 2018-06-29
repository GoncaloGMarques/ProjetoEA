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

public class JogadorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final IntegerExpression idade;
	public final IntegerExpression NCartoesVermelhos;
	public final IntegerExpression NCartoesAmarelos;
	public final IntegerExpression golos;
	public final IntegerExpression equipaId;
	public final AssociationExpression equipa;
	public final IntegerExpression escolasId;
	public final AssociationExpression escolas;
	public final CollectionExpression eventojogo;
	
	public JogadorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		idade = new IntegerExpression("idade", this);
		NCartoesVermelhos = new IntegerExpression("NCartoesVermelhos", this);
		NCartoesAmarelos = new IntegerExpression("NCartoesAmarelos", this);
		golos = new IntegerExpression("golos", this);
		equipaId = new IntegerExpression("equipa.ID", this);
		equipa = new AssociationExpression("equipa", this);
		escolasId = new IntegerExpression("escolas.ID", this);
		escolas = new AssociationExpression("escolas", this);
		eventojogo = new CollectionExpression("ORM_eventojogo", this);
	}
	
	public JogadorCriteria(PersistentSession session) {
		this(session.createCriteria(Jogador.class));
	}
	
	public JogadorCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public EquipaCriteria createEquipaCriteria() {
		return new EquipaCriteria(createCriteria("equipa"));
	}
	
	public EscolasCriteria createEscolasCriteria() {
		return new EscolasCriteria(createCriteria("escolas"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.EventojogoCriteria createEventojogoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.EventojogoCriteria(createCriteria("ORM_eventojogo"));
	}
	
	public Jogador uniqueJogador() {
		return (Jogador) super.uniqueResult();
	}
	
	public Jogador[] listJogador() {
		java.util.List list = super.list();
		return (Jogador[]) list.toArray(new Jogador[list.size()]);
	}
}

