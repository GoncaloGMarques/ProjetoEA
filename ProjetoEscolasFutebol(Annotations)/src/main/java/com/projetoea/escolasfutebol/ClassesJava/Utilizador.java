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
@Table(name="utilizador")
public class Utilizador implements Serializable {
	public Utilizador() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_UTILIZADOR_TIPOUTILIZADOR) {
			this.tipoutilizador = (Tipoutilizador) owner;
		}
		
		else if (key == ORMConstants.KEY_UTILIZADOR_ARBITRO) {
			this.arbitro = (Arbitro) owner;
		}
		
		else if (key == ORMConstants.KEY_UTILIZADOR_ESCOLAS) {
			this.escolas = (Escolas) owner;
		}
		
		else if (key == ORMConstants.KEY_UTILIZADOR_ASSOCIACAO) {
			this.associacao = (Associacao) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="UTILIZADOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="UTILIZADOR_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@ManyToOne(targetEntity=Tipoutilizador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="tipoutilizadorID", referencedColumnName="ID", nullable=false) })	
	private Tipoutilizador tipoutilizador;
	
	@OneToOne(mappedBy="utilizador", targetEntity=Arbitro.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private Arbitro arbitro;
	
	@OneToOne(mappedBy="diretorEscola", targetEntity=Escolas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private Escolas escolas;
	
	@OneToOne(mappedBy="diretorAssociacao", targetEntity=Associacao.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private Associacao associacao;
	
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
	
	public void setEmail(String value) {
		this.email = value;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setPassword(String value) {
		this.password = value;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setTipoutilizador(Tipoutilizador value) {
		if (tipoutilizador != null) {
			tipoutilizador.utilizador.remove(this);
		}
		if (value != null) {
			value.utilizador.add(this);
		}
	}
	
	public Tipoutilizador getTipoutilizador() {
		return tipoutilizador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tipoutilizador(Tipoutilizador value) {
		this.tipoutilizador = value;
	}
	
	private Tipoutilizador getORM_Tipoutilizador() {
		return tipoutilizador;
	}
	
	public void setArbitro(Arbitro value) {
		if (this.arbitro != value) {
			Arbitro larbitro = this.arbitro;
			this.arbitro = value;
			if (value != null) {
				arbitro.setUtilizador(this);
			}
			if (larbitro != null && larbitro.getUtilizador() == this) {
				larbitro.setUtilizador(null);
			}
		}
	}
	
	public Arbitro getArbitro() {
		return arbitro;
	}
	
	public void setEscolas(Escolas value) {
		if (this.escolas != value) {
			Escolas lescolas = this.escolas;
			this.escolas = value;
			if (value != null) {
				escolas.setDiretorEscola(this);
			}
			if (lescolas != null && lescolas.getDiretorEscola() == this) {
				lescolas.setDiretorEscola(null);
			}
		}
	}
	
	public Escolas getEscolas() {
		return escolas;
	}
	
	public void setAssociacao(Associacao value) {
		if (this.associacao != value) {
			Associacao lassociacao = this.associacao;
			this.associacao = value;
			if (value != null) {
				associacao.setDiretorAssociacao(this);
			}
			if (lassociacao != null && lassociacao.getDiretorAssociacao() == this) {
				lassociacao.setDiretorAssociacao(null);
			}
		}
	}
	
	public Associacao getAssociacao() {
		return associacao;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
