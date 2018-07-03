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

import javax.persistence.*;
import java.io.Serializable;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="eventojogo")
public class Eventojogo implements Serializable {
	public Eventojogo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EVENTOJOGO_JOGO) {
			this.jogo = (com.projetoea.escolasfutebol.classesjava.Jogo) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EVENTOJOGO_TIPOEVENTOJOGO) {
			this.tipoeventojogo = (com.projetoea.escolasfutebol.classesjava.Tipoeventojogo) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EVENTOJOGO_JOGADOR) {
			this.jogador = (com.projetoea.escolasfutebol.classesjava.Jogador) owner;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_EVENTOJOGO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_EVENTOJOGO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Minuto", nullable=false, length=10)	
	private int minuto;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Jogo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="jogoID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Jogo jogo;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Tipoeventojogo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="tipoeventojogoID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Tipoeventojogo tipoeventojogo;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Jogador.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="jogadorID", referencedColumnName="ID") })	
	private com.projetoea.escolasfutebol.classesjava.Jogador jogador;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setMinuto(int value) {
		this.minuto = value;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public void setJogo(com.projetoea.escolasfutebol.classesjava.Jogo value) {
		if (jogo != null) {
			jogo.eventojogo.remove(this);
		}
		if (value != null) {
			value.eventojogo.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Jogo getJogo() {
		return jogo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Jogo(com.projetoea.escolasfutebol.classesjava.Jogo value) {
		this.jogo = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Jogo getORM_Jogo() {
		return jogo;
	}
	
	public void setTipoeventojogo(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo value) {
		if (tipoeventojogo != null) {
			tipoeventojogo.eventojogo.remove(this);
		}
		if (value != null) {
			value.eventojogo.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Tipoeventojogo getTipoeventojogo() {
		return tipoeventojogo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tipoeventojogo(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo value) {
		this.tipoeventojogo = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Tipoeventojogo getORM_Tipoeventojogo() {
		return tipoeventojogo;
	}
	
	public void setJogador(com.projetoea.escolasfutebol.classesjava.Jogador value) {
		if (jogador != null) {
			jogador.eventojogo.remove(this);
		}
		if (value != null) {
			value.eventojogo.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Jogador getJogador() {
		return jogador;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Jogador(com.projetoea.escolasfutebol.classesjava.Jogador value) {
		this.jogador = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Jogador getORM_Jogador() {
		return jogador;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
