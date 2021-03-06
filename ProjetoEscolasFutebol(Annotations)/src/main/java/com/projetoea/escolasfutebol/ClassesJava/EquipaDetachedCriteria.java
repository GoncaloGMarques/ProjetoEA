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

public class EquipaDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public EquipaDetachedCriteria() {
		super(Equipa.class, EquipaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		escalao = new IntegerExpression("escalao", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		campoId = new IntegerExpression("campo.ID", this.getDetachedCriteria());
		campo = new AssociationExpression("campo", this.getDetachedCriteria());
		escolasId = new IntegerExpression("escolas.ID", this.getDetachedCriteria());
		escolas = new AssociationExpression("escolas", this.getDetachedCriteria());
		jogador = new CollectionExpression("ORM_jogador", this.getDetachedCriteria());
		jogo = new CollectionExpression("ORM_jogo", this.getDetachedCriteria());
		jogo1 = new CollectionExpression("ORM_jogo1", this.getDetachedCriteria());
		jogo2 = new CollectionExpression("ORM_jogo2", this.getDetachedCriteria());
		partcipantetorneio = new CollectionExpression("ORM_partcipantetorneio", this.getDetachedCriteria());
		participantecampeonato = new CollectionExpression("ORM_participantecampeonato", this.getDetachedCriteria());
	}
	
	public EquipaDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, EquipaCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		escalao = new IntegerExpression("escalao", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		campoId = new IntegerExpression("campo.ID", this.getDetachedCriteria());
		campo = new AssociationExpression("campo", this.getDetachedCriteria());
		escolasId = new IntegerExpression("escolas.ID", this.getDetachedCriteria());
		escolas = new AssociationExpression("escolas", this.getDetachedCriteria());
		jogador = new CollectionExpression("ORM_jogador", this.getDetachedCriteria());
		jogo = new CollectionExpression("ORM_jogo", this.getDetachedCriteria());
		jogo1 = new CollectionExpression("ORM_jogo1", this.getDetachedCriteria());
		jogo2 = new CollectionExpression("ORM_jogo2", this.getDetachedCriteria());
		partcipantetorneio = new CollectionExpression("ORM_partcipantetorneio", this.getDetachedCriteria());
		participantecampeonato = new CollectionExpression("ORM_participantecampeonato", this.getDetachedCriteria());
	}
	
	public CampoDetachedCriteria createCampoCriteria() {
		return new CampoDetachedCriteria(createCriteria("campo"));
	}
	
	public EscolasDetachedCriteria createEscolasCriteria() {
		return new EscolasDetachedCriteria(createCriteria("escolas"));
	}
	
	public JogadorDetachedCriteria createJogadorCriteria() {
		return new JogadorDetachedCriteria(createCriteria("ORM_jogador"));
	}
	
	public JogoDetachedCriteria createJogoCriteria() {
		return new JogoDetachedCriteria(createCriteria("ORM_jogo"));
	}
	
	public JogoDetachedCriteria createJogo1Criteria() {
		return new JogoDetachedCriteria(createCriteria("ORM_jogo1"));
	}
	
	public JogoDetachedCriteria createJogo2Criteria() {
		return new JogoDetachedCriteria(createCriteria("ORM_jogo2"));
	}
	
	public PartcipantetorneioDetachedCriteria createPartcipantetorneioCriteria() {
		return new PartcipantetorneioDetachedCriteria(createCriteria("ORM_partcipantetorneio"));
	}
	
	public ParticipantecampeonatoDetachedCriteria createParticipantecampeonatoCriteria() {
		return new ParticipantecampeonatoDetachedCriteria(createCriteria("ORM_participantecampeonato"));
	}
	
	public Equipa uniqueEquipa(PersistentSession session) {
		return (Equipa) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Equipa[] listEquipa(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Equipa[]) list.toArray(new Equipa[list.size()]);
	}
}

