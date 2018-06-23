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
import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="associacao")
public class Associacao implements Serializable {
	public Associacao() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ASSOCIACAO_ESCOLAS) {
			return ORM_escolas;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="ASSOCIACAO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ASSOCIACAO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(optional=false, targetEntity=Utilizador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="diretorAssociacaoID", referencedColumnName="ID", nullable=false) })	
	private Utilizador diretorAssociacao;
	
	@OneToMany(mappedBy="associacao", targetEntity=Escolas.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_escolas = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDiretorAssociacao(Utilizador value) {
		if (this.diretorAssociacao != value) {
			Utilizador ldiretorAssociacao = this.diretorAssociacao;
			this.diretorAssociacao = value;
			if (value != null) {
				diretorAssociacao.setAssociacao(this);
			}
			if (ldiretorAssociacao != null && ldiretorAssociacao.getAssociacao() == this) {
				ldiretorAssociacao.setAssociacao(null);
			}
		}
	}
	
	public Utilizador getDiretorAssociacao() {
		return diretorAssociacao;
	}
	
	private void setORM_Escolas(java.util.Set value) {
		this.ORM_escolas = value;
	}
	
	private java.util.Set getORM_Escolas() {
		return ORM_escolas;
	}
	
	@Transient	
	public final EscolasSetCollection escolas = new EscolasSetCollection(this, _ormAdapter, ORMConstants.KEY_ASSOCIACAO_ESCOLAS, ORMConstants.KEY_ESCOLAS_ASSOCIACAO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
