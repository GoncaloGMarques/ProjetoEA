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
@Table(name="eventojogo")
@IdClass(EventojogoPK.class)
class Eventojogo implements Serializable {
	public Eventojogo() {
	}
	
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof Eventojogo))
			return false;
		Eventojogo eventojogo = (Eventojogo)aObj;
		if (getID() != eventojogo.getID())
			return false;
		if (getJogo() == null) {
			if (eventojogo.getJogo() != null)
				return false;
		}
		else if (!getJogo().equals(eventojogo.getJogo()))
			return false;
		if (getTipoeventojogo() == null) {
			if (eventojogo.getTipoeventojogo() != null)
				return false;
		}
		else if (!getTipoeventojogo().equals(eventojogo.getTipoeventojogo()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getID();
		if (getJogo() != null) {
			hashcode = hashcode + (int) getJogo().getORMID();
		}
		if (getTipoeventojogo() != null) {
			hashcode = hashcode + (int) getTipoeventojogo().getORMID();
		}
		return hashcode;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVENTOJOGO_JOGO) {
			this.jogo = (Jogo) owner;
		}
		
		else if (key == ORMConstants.KEY_EVENTOJOGO_TIPOEVENTOJOGO) {
			this.tipoeventojogo = (Tipoeventojogo) owner;
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
	@GeneratedValue(generator="EVENTOJOGO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENTOJOGO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Minuto", nullable=false, length=10)	
	private int minuto;
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=Jogo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="jogoID", referencedColumnName="ID", nullable=false) })	
	private Jogo jogo;
	
	@Column(name="jogoID", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="EVENTOJOGO_JOGOID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENTOJOGO_JOGOID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="jogo"))	
	private int jogoId;
	
	private void setJogoId(int value) {
		this.jogoId = value;
	}
	
	public int getJogoId() {
		return jogoId;
	}
	
	@PrimaryKeyJoinColumn	
	@ManyToOne(targetEntity=Tipoeventojogo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="tipoeventojogoID", referencedColumnName="ID", nullable=false) })	
	private Tipoeventojogo tipoeventojogo;
	
	@Column(name="tipoeventojogoID", nullable=false, insertable=false, updatable=false)	
	@Id	
	@GeneratedValue(generator="EVENTOJOGO_TIPOEVENTOJOGOID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENTOJOGO_TIPOEVENTOJOGOID_GENERATOR", strategy="foreign", parameters=@org.hibernate.annotations.Parameter(name="property", value="tipoeventojogo"))	
	private int tipoeventojogoId;
	
	private void setTipoeventojogoId(int value) {
		this.tipoeventojogoId = value;
	}
	
	public int getTipoeventojogoId() {
		return tipoeventojogoId;
	}
	
	public void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setMinuto(int value) {
		this.minuto = value;
	}
	
	public int getMinuto() {
		return minuto;
	}
	
	public void setJogo(Jogo value) {
		if (jogo != null) {
			jogo.eventojogo.remove(this);
		}
		if (value != null) {
			value.eventojogo.add(this);
		}
	}
	
	public Jogo getJogo() {
		return jogo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Jogo(Jogo value) {
		this.jogo = value;
	}
	
	private Jogo getORM_Jogo() {
		return jogo;
	}
	
	public void setTipoeventojogo(Tipoeventojogo value) {
		if (tipoeventojogo != null) {
			tipoeventojogo.eventojogo.remove(this);
		}
		if (value != null) {
			value.eventojogo.add(this);
		}
	}
	
	public Tipoeventojogo getTipoeventojogo() {
		return tipoeventojogo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Tipoeventojogo(Tipoeventojogo value) {
		this.tipoeventojogo = value;
	}
	
	private Tipoeventojogo getORM_Tipoeventojogo() {
		return tipoeventojogo;
	}
	
	public String toString() {
		return String.valueOf(getID() + " " + ((getJogo() == null) ? "" : String.valueOf(getJogo().getORMID())) + " " + ((getTipoeventojogo() == null) ? "" : String.valueOf(getTipoeventojogo().getORMID())));
	}
	
}
