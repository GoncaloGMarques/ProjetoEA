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
@Table(name="rondatorneio")
public class Rondatorneio implements Serializable {
	public Rondatorneio() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_RONDATORNEIO_JOGO) {
			return ORM_jogo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_RONDATORNEIO_FASE) {
			this.fase = (com.projetoea.escolasfutebol.classesjava.Fase) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_RONDATORNEIO_TORNEIO) {
			this.torneio = (com.projetoea.escolasfutebol.classesjava.Torneio) owner;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_RONDATORNEIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_RONDATORNEIO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="data", nullable=true, length=10)	
	private Integer data;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Fase.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="faseID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Fase fase;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Torneio.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="torneioID", referencedColumnName="ID") })	
	private com.projetoea.escolasfutebol.classesjava.Torneio torneio;
	
	@OneToMany(mappedBy="rondatorneio", targetEntity=com.projetoea.escolasfutebol.classesjava.Jogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogo = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setData(int value) {
		setData(new Integer(value));
	}
	
	public void setData(Integer value) {
		this.data = value;
	}
	
	public Integer getData() {
		return data;
	}
	
	public void setFase(com.projetoea.escolasfutebol.classesjava.Fase value) {
		if (fase != null) {
			fase.rondatorneio.remove(this);
		}
		if (value != null) {
			value.rondatorneio.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Fase getFase() {
		return fase;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Fase(com.projetoea.escolasfutebol.classesjava.Fase value) {
		this.fase = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Fase getORM_Fase() {
		return fase;
	}
	
	public void setTorneio(com.projetoea.escolasfutebol.classesjava.Torneio value) {
		if (torneio != null) {
			torneio.rondatorneio.remove(this);
		}
		if (value != null) {
			value.rondatorneio.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Torneio getTorneio() {
		return torneio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Torneio(com.projetoea.escolasfutebol.classesjava.Torneio value) {
		this.torneio = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Torneio getORM_Torneio() {
		return torneio;
	}
	
	private void setORM_Jogo(java.util.Set value) {
		this.ORM_jogo = value;
	}
	
	private java.util.Set getORM_Jogo() {
		return ORM_jogo;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.JogoSetCollection jogo = new com.projetoea.escolasfutebol.classesjava.JogoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_RONDATORNEIO_JOGO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_RONDATORNEIO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
