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

public class AssociacaoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression diretorAssociacaoId;
	public final AssociationExpression diretorAssociacao;
	public final CollectionExpression escolas;
	
	public AssociacaoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		diretorAssociacaoId = new IntegerExpression("diretorAssociacao.ID", this);
		diretorAssociacao = new AssociationExpression("diretorAssociacao", this);
		escolas = new CollectionExpression("ORM_escolas", this);
	}
	
	public AssociacaoCriteria(PersistentSession session) {
		this(session.createCriteria(Associacao.class));
	}
	
	public AssociacaoCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public UtilizadorCriteria createDiretorAssociacaoCriteria() {
		return new UtilizadorCriteria(createCriteria("diretorAssociacao"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.EscolasCriteria createEscolasCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.EscolasCriteria(createCriteria("ORM_escolas"));
	}
	
	public Associacao uniqueAssociacao() {
		return (Associacao) super.uniqueResult();
	}
	
	public Associacao[] listAssociacao() {
		java.util.List list = super.list();
		return (Associacao[]) list.toArray(new Associacao[list.size()]);
	}
}

