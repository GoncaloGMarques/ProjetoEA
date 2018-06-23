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
@Table(name="participantecampeonato")
public class Participantecampeonato implements Serializable {
	public Participantecampeonato() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PARTICIPANTECAMPEONATO_CAMPEONATO) {
			this.campeonato = (Campeonato) owner;
		}
		
		else if (key == ORMConstants.KEY_PARTICIPANTECAMPEONATO_EQUIPA) {
			this.equipa = (Equipa) owner;
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
	@GeneratedValue(generator="PARTICIPANTECAMPEONATO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PARTICIPANTECAMPEONATO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Campeonato.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="campeonatoID", referencedColumnName="ID", nullable=false) })	
	private Campeonato campeonato;
	
	@ManyToOne(targetEntity=Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="equipaID", referencedColumnName="ID", nullable=false) })	
	private Equipa equipa;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setCampeonato(Campeonato value) {
		if (campeonato != null) {
			campeonato.participantecampeonato.remove(this);
		}
		if (value != null) {
			value.participantecampeonato.add(this);
		}
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Campeonato(Campeonato value) {
		this.campeonato = value;
	}
	
	private Campeonato getORM_Campeonato() {
		return campeonato;
	}
	
	public void setEquipa(Equipa value) {
		if (equipa != null) {
			equipa.participantecampeonato.remove(this);
		}
		if (value != null) {
			value.participantecampeonato.add(this);
		}
	}
	
	public Equipa getEquipa() {
		return equipa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Equipa(Equipa value) {
		this.equipa = value;
	}
	
	private Equipa getORM_Equipa() {
		return equipa;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
