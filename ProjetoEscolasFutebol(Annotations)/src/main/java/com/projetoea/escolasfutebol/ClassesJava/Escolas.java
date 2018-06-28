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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="escolas")
public class Escolas implements Serializable {
	public Escolas() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_ESCOLAS_EQUIPA) {
			return ORM_equipa;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_ESCOLAS_ASSOCIACAO) {
			this.associacao = (com.projetoea.escolasfutebol.classesjava.Associacao) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_ESCOLAS_DIRETORESCOLA) {
			this.diretorEscola = (com.projetoea.escolasfutebol.classesjava.Utilizador) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_ESCOLAS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_ESCOLAS_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Associacao.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="associacaoID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Associacao associacao;
	
	@OneToOne(optional=false, targetEntity=com.projetoea.escolasfutebol.classesjava.Utilizador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="diretorEscolaID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Utilizador diretorEscola;
	
	@OneToMany(mappedBy="escolas", targetEntity=com.projetoea.escolasfutebol.classesjava.Equipa.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_equipa = new java.util.HashSet();

	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setAssociacao(com.projetoea.escolasfutebol.classesjava.Associacao value) {
		if (associacao != null) {
			associacao.escolas.remove(this);
		}
		if (value != null) {
			value.escolas.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Associacao getAssociacao() {
		return associacao;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Associacao(com.projetoea.escolasfutebol.classesjava.Associacao value) {
		this.associacao = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Associacao getORM_Associacao() {
		return associacao;
	}
	
	public void setDiretorEscola(com.projetoea.escolasfutebol.classesjava.Utilizador value) {
		if (this.diretorEscola != value) {
			com.projetoea.escolasfutebol.classesjava.Utilizador ldiretorEscola = this.diretorEscola;
			this.diretorEscola = value;
			if (value != null) {
				diretorEscola.setEscolas(this);
			}
			if (ldiretorEscola != null && ldiretorEscola.getEscolas() == this) {
				ldiretorEscola.setEscolas(null);
			}
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Utilizador getDiretorEscola() {
		return diretorEscola;
	}
	
	private void setORM_Equipa(java.util.Set value) {
		this.ORM_equipa = value;
	}
	
	private java.util.Set getORM_Equipa() {
		return ORM_equipa;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.EquipaSetCollection equipa = new com.projetoea.escolasfutebol.classesjava.EquipaSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_ESCOLAS_EQUIPA, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_ESCOLAS, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
