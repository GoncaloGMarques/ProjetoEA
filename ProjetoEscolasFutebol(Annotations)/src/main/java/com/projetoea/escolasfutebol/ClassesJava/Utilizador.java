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
@Table(name="utilizador")
public class Utilizador implements Serializable {
	public Utilizador() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_UTILIZADOR_TIPOUTILIZADOR) {
			this.tipoutilizador = (com.projetoea.escolasfutebol.classesjava.Tipoutilizador) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_UTILIZADOR_ARBITRO) {
			this.arbitro = (com.projetoea.escolasfutebol.classesjava.Arbitro) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_UTILIZADOR_ESCOLAS) {
			this.escolas = (com.projetoea.escolasfutebol.classesjava.Escolas) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_UTILIZADOR_ASSOCIACAO) {
			this.associacao = (com.projetoea.escolasfutebol.classesjava.Associacao) owner;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_UTILIZADOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_UTILIZADOR_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="Email", nullable=true, length=255)	
	private String email;
	
	@Column(name="Password", nullable=true, length=255)	
	private String password;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Tipoutilizador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="tipoutilizadorID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Tipoutilizador tipoutilizador;
	
	@OneToOne(mappedBy="utilizador", targetEntity=com.projetoea.escolasfutebol.classesjava.Arbitro.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private com.projetoea.escolasfutebol.classesjava.Arbitro arbitro;
	
	@OneToOne(mappedBy="diretorEscola", targetEntity=com.projetoea.escolasfutebol.classesjava.Escolas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private com.projetoea.escolasfutebol.classesjava.Escolas escolas;
	
	@OneToOne(mappedBy="diretorAssociacao", targetEntity=com.projetoea.escolasfutebol.classesjava.Associacao.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private com.projetoea.escolasfutebol.classesjava.Associacao associacao;
	
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
	
	public void setTipoutilizador(com.projetoea.escolasfutebol.classesjava.Tipoutilizador value) {
		if (tipoutilizador != null) {
			tipoutilizador.utilizador.remove(this);
		}
		if (value != null) {
			value.utilizador.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Tipoutilizador getTipoutilizador() {
		return tipoutilizador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tipoutilizador(com.projetoea.escolasfutebol.classesjava.Tipoutilizador value) {
		this.tipoutilizador = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Tipoutilizador getORM_Tipoutilizador() {
		return tipoutilizador;
	}
	
	public void setArbitro(com.projetoea.escolasfutebol.classesjava.Arbitro value) {
		if (this.arbitro != value) {
			com.projetoea.escolasfutebol.classesjava.Arbitro larbitro = this.arbitro;
			this.arbitro = value;
			if (value != null) {
				arbitro.setUtilizador(this);
			}
			if (larbitro != null && larbitro.getUtilizador() == this) {
				larbitro.setUtilizador(null);
			}
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Arbitro getArbitro() {
		return arbitro;
	}
	
	public void setEscolas(com.projetoea.escolasfutebol.classesjava.Escolas value) {
		if (this.escolas != value) {
			com.projetoea.escolasfutebol.classesjava.Escolas lescolas = this.escolas;
			this.escolas = value;
			if (value != null) {
				escolas.setDiretorEscola(this);
			}
			if (lescolas != null && lescolas.getDiretorEscola() == this) {
				lescolas.setDiretorEscola(null);
			}
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Escolas getEscolas() {
		return escolas;
	}
	
	public void setAssociacao(com.projetoea.escolasfutebol.classesjava.Associacao value) {
		if (this.associacao != value) {
			com.projetoea.escolasfutebol.classesjava.Associacao lassociacao = this.associacao;
			this.associacao = value;
			if (value != null) {
				associacao.setDiretorAssociacao(this);
			}
			if (lassociacao != null && lassociacao.getDiretorAssociacao() == this) {
				lassociacao.setDiretorAssociacao(null);
			}
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Associacao getAssociacao() {
		return associacao;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
