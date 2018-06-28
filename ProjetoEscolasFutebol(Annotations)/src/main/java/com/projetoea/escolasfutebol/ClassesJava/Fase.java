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
@Table(name="fase")
public class Fase implements Serializable {
	public Fase() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_FASE_RONDATORNEIO) {
			return ORM_rondatorneio;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_FASE_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_FASE_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="nomefase", nullable=true, length=10)	
	private Integer nomefase;
	
	@OneToMany(mappedBy="fase", targetEntity=com.projetoea.escolasfutebol.classesjava.Rondatorneio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_rondatorneio = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setNomefase(int value) {
		setNomefase(new Integer(value));
	}
	
	public void setNomefase(Integer value) {
		this.nomefase = value;
	}
	
	public Integer getNomefase() {
		return nomefase;
	}
	
	private void setORM_Rondatorneio(java.util.Set value) {
		this.ORM_rondatorneio = value;
	}
	
	private java.util.Set getORM_Rondatorneio() {
		return ORM_rondatorneio;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.RondatorneioSetCollection rondatorneio = new com.projetoea.escolasfutebol.classesjava.RondatorneioSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_FASE_RONDATORNEIO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_RONDATORNEIO_FASE, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
