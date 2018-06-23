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

public class AssociacaoDetachedCriteria extends AbstractORMDetachedCriteria {
	public final IntegerExpression ID;
	public final IntegerExpression diretorAssociacaoId;
	public final AssociationExpression diretorAssociacao;
	public final CollectionExpression escolas;
	
	public AssociacaoDetachedCriteria() {
		super(Associacao.class, AssociacaoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		diretorAssociacaoId = new IntegerExpression("diretorAssociacao.ID", this.getDetachedCriteria());
		diretorAssociacao = new AssociationExpression("diretorAssociacao", this.getDetachedCriteria());
		escolas = new CollectionExpression("ORM_escolas", this.getDetachedCriteria());
	}
	
	public AssociacaoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, AssociacaoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		diretorAssociacaoId = new IntegerExpression("diretorAssociacao.ID", this.getDetachedCriteria());
		diretorAssociacao = new AssociationExpression("diretorAssociacao", this.getDetachedCriteria());
		escolas = new CollectionExpression("ORM_escolas", this.getDetachedCriteria());
	}
	
	public UtilizadorDetachedCriteria createDiretorAssociacaoCriteria() {
		return new UtilizadorDetachedCriteria(createCriteria("diretorAssociacao"));
	}
	
	public EscolasDetachedCriteria createEscolasCriteria() {
		return new EscolasDetachedCriteria(createCriteria("ORM_escolas"));
	}
	
	public Associacao uniqueAssociacao(PersistentSession session) {
		return (Associacao) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Associacao[] listAssociacao(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Associacao[]) list.toArray(new Associacao[list.size()]);
	}
}

