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
@Table(name="escolas")
public class Escolas implements Serializable {
	public Escolas() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ESCOLAS_EQUIPA) {
			return ORM_equipa;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_ESCOLAS_ASSOCIACAO) {
			this.associacao = (Associacao) owner;
		}
		
		else if (key == ORMConstants.KEY_ESCOLAS_DIRETORESCOLA) {
			this.diretorEscola = (Utilizador) owner;
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
	@GeneratedValue(generator="ESCOLAS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ESCOLAS_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="diretoescolaID", nullable=false, length=10)	
	private int diretoescolaID;
	
	@ManyToOne(targetEntity=Associacao.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="associacaoID", referencedColumnName="ID", nullable=false) })	
	private Associacao associacao;
	
	@OneToOne(optional=false, targetEntity=Utilizador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="diretorEscolaID", referencedColumnName="ID", nullable=false) })	
	private Utilizador diretorEscola;
	
	@OneToMany(mappedBy="escolas", targetEntity=Equipa.class)	
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
	
	public void setDiretoescolaID(int value) {
		this.diretoescolaID = value;
	}
	
	public int getDiretoescolaID() {
		return diretoescolaID;
	}
	
	public void setAssociacao(Associacao value) {
		if (associacao != null) {
			associacao.escolas.remove(this);
		}
		if (value != null) {
			value.escolas.add(this);
		}
	}
	
	public Associacao getAssociacao() {
		return associacao;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Associacao(Associacao value) {
		this.associacao = value;
	}
	
	private Associacao getORM_Associacao() {
		return associacao;
	}
	
	public void setDiretorEscola(Utilizador value) {
		if (this.diretorEscola != value) {
			Utilizador ldiretorEscola = this.diretorEscola;
			this.diretorEscola = value;
			if (value != null) {
				diretorEscola.setEscolas(this);
			}
			if (ldiretorEscola != null && ldiretorEscola.getEscolas() == this) {
				ldiretorEscola.setEscolas(null);
			}
		}
	}
	
	public Utilizador getDiretorEscola() {
		return diretorEscola;
	}
	
	private void setORM_Equipa(java.util.Set value) {
		this.ORM_equipa = value;
	}
	
	private java.util.Set getORM_Equipa() {
		return ORM_equipa;
	}
	
	@Transient	
	public final EquipaSetCollection equipa = new EquipaSetCollection(this, _ormAdapter, ORMConstants.KEY_ESCOLAS_EQUIPA, ORMConstants.KEY_EQUIPA_ESCOLAS, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
