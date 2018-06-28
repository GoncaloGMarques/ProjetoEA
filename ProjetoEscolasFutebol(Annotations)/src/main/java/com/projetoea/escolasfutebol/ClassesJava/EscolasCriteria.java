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

public class EscolasCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final IntegerExpression associacaoId;
	public final AssociationExpression associacao;
	public final IntegerExpression diretorEscolaId;
	public final AssociationExpression diretorEscola;
	public final CollectionExpression equipa;
	
	public EscolasCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		nome = new StringExpression("nome", this);
		associacaoId = new IntegerExpression("associacao.ID", this);
		associacao = new AssociationExpression("associacao", this);
		diretorEscolaId = new IntegerExpression("diretorEscola.ID", this);
		diretorEscola = new AssociationExpression("diretorEscola", this);
		equipa = new CollectionExpression("ORM_equipa", this);
	}
	
	public EscolasCriteria(PersistentSession session) {
		this(session.createCriteria(Escolas.class));
	}
	
	public EscolasCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public AssociacaoCriteria createAssociacaoCriteria() {
		return new AssociacaoCriteria(createCriteria("associacao"));
	}
	
	public UtilizadorCriteria createDiretorEscolaCriteria() {
		return new UtilizadorCriteria(createCriteria("diretorEscola"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.EquipaCriteria createEquipaCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.EquipaCriteria(createCriteria("ORM_equipa"));
	}
	
	public Escolas uniqueEscolas() {
		return (Escolas) super.uniqueResult();
	}
	
	public Escolas[] listEscolas() {
		java.util.List list = super.list();
		return (Escolas[]) list.toArray(new Escolas[list.size()]);
	}
}

