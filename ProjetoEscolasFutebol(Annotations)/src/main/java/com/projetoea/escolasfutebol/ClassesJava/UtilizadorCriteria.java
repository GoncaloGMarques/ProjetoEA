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

public class UtilizadorCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final StringExpression email;
	public final StringExpression password;
	public final IntegerExpression tipoutilizadorId;
	public final AssociationExpression tipoutilizador;
	public final IntegerExpression arbitroId;
	public final AssociationExpression arbitro;
	public final IntegerExpression escolasId;
	public final AssociationExpression escolas;
	public final IntegerExpression associacaoId;
	public final AssociationExpression associacao;
	
	public UtilizadorCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		email = new StringExpression("email", this);
		password = new StringExpression("password", this);
		tipoutilizadorId = new IntegerExpression("tipoutilizador.ID", this);
		tipoutilizador = new AssociationExpression("tipoutilizador", this);
		arbitroId = new IntegerExpression("arbitro.ID", this);
		arbitro = new AssociationExpression("arbitro", this);
		escolasId = new IntegerExpression("escolas.ID", this);
		escolas = new AssociationExpression("escolas", this);
		associacaoId = new IntegerExpression("associacao.ID", this);
		associacao = new AssociationExpression("associacao", this);
	}
	
	public UtilizadorCriteria(PersistentSession session) {
		this(session.createCriteria(Utilizador.class));
	}
	
	public UtilizadorCriteria() throws PersistentException {
		this(EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public TipoutilizadorCriteria createTipoutilizadorCriteria() {
		return new TipoutilizadorCriteria(createCriteria("tipoutilizador"));
	}
	
	public ArbitroCriteria createArbitroCriteria() {
		return new ArbitroCriteria(createCriteria("arbitro"));
	}
	
	public EscolasCriteria createEscolasCriteria() {
		return new EscolasCriteria(createCriteria("escolas"));
	}
	
	public AssociacaoCriteria createAssociacaoCriteria() {
		return new AssociacaoCriteria(createCriteria("associacao"));
	}
	
	public Utilizador uniqueUtilizador() {
		return (Utilizador) super.uniqueResult();
	}
	
	public Utilizador[] listUtilizador() {
		java.util.List list = super.list();
		return (Utilizador[]) list.toArray(new Utilizador[list.size()]);
	}
}

