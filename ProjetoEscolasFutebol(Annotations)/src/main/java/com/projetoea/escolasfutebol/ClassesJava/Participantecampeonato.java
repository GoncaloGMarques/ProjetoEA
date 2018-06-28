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
@Table(name="participantecampeonato")
public class Participantecampeonato implements Serializable {
	public Participantecampeonato() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_PARTICIPANTECAMPEONATO_CAMPEONATO) {
			this.campeonato = (com.projetoea.escolasfutebol.classesjava.Campeonato) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_PARTICIPANTECAMPEONATO_EQUIPA) {
			this.equipa = (com.projetoea.escolasfutebol.classesjava.Equipa) owner;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_PARTICIPANTECAMPEONATO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_PARTICIPANTECAMPEONATO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Campeonato.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="campeonatoID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Campeonato campeonato;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="equipaID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Equipa equipa;
	
	@Column(name="pontos", nullable=false, length=10)	
	private int pontos = 0;
	
	@Column(name="golosmarcados", nullable=false, length=10)	
	private int golosmarcados = 0;
	
	@Column(name="golossofridos", nullable=false, length=10)	
	private int golossofridos = 0;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setPontos(int value) {
		this.pontos = value;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void setGolosmarcados(int value) {
		this.golosmarcados = value;
	}
	
	public int getGolosmarcados() {
		return golosmarcados;
	}
	
	public void setGolossofridos(int value) {
		this.golossofridos = value;
	}
	
	public int getGolossofridos() {
		return golossofridos;
	}
	
	public void setCampeonato(com.projetoea.escolasfutebol.classesjava.Campeonato value) {
		if (campeonato != null) {
			campeonato.participantecampeonato.remove(this);
		}
		if (value != null) {
			value.participantecampeonato.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Campeonato getCampeonato() {
		return campeonato;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Campeonato(com.projetoea.escolasfutebol.classesjava.Campeonato value) {
		this.campeonato = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Campeonato getORM_Campeonato() {
		return campeonato;
	}
	
	public void setEquipa(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		if (equipa != null) {
			equipa.participantecampeonato.remove(this);
		}
		if (value != null) {
			value.participantecampeonato.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Equipa getEquipa() {
		return equipa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Equipa(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		this.equipa = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Equipa getORM_Equipa() {
		return equipa;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
