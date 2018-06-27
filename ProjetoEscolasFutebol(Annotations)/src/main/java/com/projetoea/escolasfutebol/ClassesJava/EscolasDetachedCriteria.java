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
package com.projetoea.escolasfutebol.ClassesJava;

import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

import java.util.List;

public class EscolasDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final StringExpression nome;
	public final IntegerExpression associacaoId;
	public final AssociationExpression associacao;
	public final IntegerExpression diretorEscolaId;
	public final AssociationExpression diretorEscola;
	public final CollectionExpression equipa;
	
	public EscolasDetachedCriteria() {
		super(com.projetoea.escolasfutebol.ClassesJava.Escolas.class, com.projetoea.escolasfutebol.ClassesJava.EscolasCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		associacaoId = new IntegerExpression("associacao.ID", this.getDetachedCriteria());
		associacao = new AssociationExpression("associacao", this.getDetachedCriteria());
		diretorEscolaId = new IntegerExpression("diretorEscola.ID", this.getDetachedCriteria());
		diretorEscola = new AssociationExpression("diretorEscola", this.getDetachedCriteria());
		equipa = new CollectionExpression("ORM_equipa", this.getDetachedCriteria());
	}
	
	public EscolasDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.projetoea.escolasfutebol.ClassesJava.EscolasCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		nome = new StringExpression("nome", this.getDetachedCriteria());
		associacaoId = new IntegerExpression("associacao.ID", this.getDetachedCriteria());
		associacao = new AssociationExpression("associacao", this.getDetachedCriteria());
		diretorEscolaId = new IntegerExpression("diretorEscola.ID", this.getDetachedCriteria());
		diretorEscola = new AssociationExpression("diretorEscola", this.getDetachedCriteria());
		equipa = new CollectionExpression("ORM_equipa", this.getDetachedCriteria());
	}
	
	public AssociacaoDetachedCriteria createAssociacaoCriteria() {
		return new AssociacaoDetachedCriteria(createCriteria("associacao"));
	}
	
	public UtilizadorDetachedCriteria createDiretorEscolaCriteria() {
		return new UtilizadorDetachedCriteria(createCriteria("diretorEscola"));
	}
	
	public com.projetoea.escolasfutebol.ClassesJava.EquipaDetachedCriteria createEquipaCriteria() {
		return new com.projetoea.escolasfutebol.ClassesJava.EquipaDetachedCriteria(createCriteria("ORM_equipa"));
	}
	
	public Escolas uniqueEscolas(PersistentSession session) {
		return (Escolas) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Escolas[] listEscolas(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Escolas[]) list.toArray(new Escolas[list.size()]);
	}
}

