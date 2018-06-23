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

public class UtilizadorDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public UtilizadorDetachedCriteria() {
		super(Utilizador.class, UtilizadorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		tipoutilizadorId = new IntegerExpression("tipoutilizador.ID", this.getDetachedCriteria());
		tipoutilizador = new AssociationExpression("tipoutilizador", this.getDetachedCriteria());
		arbitroId = new IntegerExpression("arbitro.ID", this.getDetachedCriteria());
		arbitro = new AssociationExpression("arbitro", this.getDetachedCriteria());
		escolasId = new IntegerExpression("escolas.ID", this.getDetachedCriteria());
		escolas = new AssociationExpression("escolas", this.getDetachedCriteria());
		associacaoId = new IntegerExpression("associacao.ID", this.getDetachedCriteria());
		associacao = new AssociationExpression("associacao", this.getDetachedCriteria());
	}
	
	public UtilizadorDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, UtilizadorCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		email = new StringExpression("email", this.getDetachedCriteria());
		password = new StringExpression("password", this.getDetachedCriteria());
		tipoutilizadorId = new IntegerExpression("tipoutilizador.ID", this.getDetachedCriteria());
		tipoutilizador = new AssociationExpression("tipoutilizador", this.getDetachedCriteria());
		arbitroId = new IntegerExpression("arbitro.ID", this.getDetachedCriteria());
		arbitro = new AssociationExpression("arbitro", this.getDetachedCriteria());
		escolasId = new IntegerExpression("escolas.ID", this.getDetachedCriteria());
		escolas = new AssociationExpression("escolas", this.getDetachedCriteria());
		associacaoId = new IntegerExpression("associacao.ID", this.getDetachedCriteria());
		associacao = new AssociationExpression("associacao", this.getDetachedCriteria());
	}
	
	public TipoutilizadorDetachedCriteria createTipoutilizadorCriteria() {
		return new TipoutilizadorDetachedCriteria(createCriteria("tipoutilizador"));
	}
	
	public ArbitroDetachedCriteria createArbitroCriteria() {
		return new ArbitroDetachedCriteria(createCriteria("arbitro"));
	}
	
	public EscolasDetachedCriteria createEscolasCriteria() {
		return new EscolasDetachedCriteria(createCriteria("escolas"));
	}
	
	public AssociacaoDetachedCriteria createAssociacaoCriteria() {
		return new AssociacaoDetachedCriteria(createCriteria("associacao"));
	}
	
	public Utilizador uniqueUtilizador(PersistentSession session) {
		return (Utilizador) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Utilizador[] listUtilizador(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Utilizador[]) list.toArray(new Utilizador[list.size()]);
	}
}

