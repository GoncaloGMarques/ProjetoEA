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

public class EquipaCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression escalao;
	public final StringExpression nome;
	public final IntegerExpression campoId;
	public final AssociationExpression campo;
	public final IntegerExpression escolasId;
	public final AssociationExpression escolas;
	public final CollectionExpression jogador;
	public final CollectionExpression jogo;
	public final CollectionExpression jogo1;
	public final CollectionExpression jogo2;
	public final CollectionExpression partcipantetorneio;
	public final CollectionExpression participantecampeonato;
	
	public EquipaCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		escalao = new IntegerExpression("escalao", this);
		nome = new StringExpression("nome", this);
		campoId = new IntegerExpression("campo.ID", this);
		campo = new AssociationExpression("campo", this);
		escolasId = new IntegerExpression("escolas.ID", this);
		escolas = new AssociationExpression("escolas", this);
		jogador = new CollectionExpression("ORM_jogador", this);
		jogo = new CollectionExpression("ORM_jogo", this);
		jogo1 = new CollectionExpression("ORM_jogo1", this);
		jogo2 = new CollectionExpression("ORM_jogo2", this);
		partcipantetorneio = new CollectionExpression("ORM_partcipantetorneio", this);
		participantecampeonato = new CollectionExpression("ORM_participantecampeonato", this);
	}
	
	public EquipaCriteria(PersistentSession session) {
		this(session.createCriteria(Equipa.class));
	}
	
	public EquipaCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public CampoCriteria createCampoCriteria() {
		return new CampoCriteria(createCriteria("campo"));
	}
	
	public EscolasCriteria createEscolasCriteria() {
		return new EscolasCriteria(createCriteria("escolas"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.JogadorCriteria createJogadorCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.JogadorCriteria(createCriteria("ORM_jogador"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.JogoCriteria createJogoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.JogoCriteria(createCriteria("ORM_jogo"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.JogoCriteria createJogo1Criteria() {
		return new com.projetoea.escolasfutebol.classesjava.JogoCriteria(createCriteria("ORM_jogo1"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.JogoCriteria createJogo2Criteria() {
		return new com.projetoea.escolasfutebol.classesjava.JogoCriteria(createCriteria("ORM_jogo2"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.PartcipantetorneioCriteria createPartcipantetorneioCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.PartcipantetorneioCriteria(createCriteria("ORM_partcipantetorneio"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.ParticipantecampeonatoCriteria createParticipantecampeonatoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.ParticipantecampeonatoCriteria(createCriteria("ORM_participantecampeonato"));
	}
	
	public Equipa uniqueEquipa() {
		return (Equipa) super.uniqueResult();
	}
	
	public Equipa[] listEquipa() {
		java.util.List list = super.list();
		return (Equipa[]) list.toArray(new Equipa[list.size()]);
	}
}

