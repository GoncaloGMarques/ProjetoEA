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
@Table(name="rondacampeonato")
public class Rondacampeonato implements Serializable {
	public Rondacampeonato() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_RONDACAMPEONATO_JOGO) {
			return ORM_jogo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_RONDACAMPEONATO_CAMPEONATO) {
			this.campeonato = (com.projetoea.escolasfutebol.classesjava.Campeonato) owner;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_RONDACAMPEONATO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_RONDACAMPEONATO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Campeonato.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="campeonatoID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Campeonato campeonato;
	
	@OneToMany(mappedBy="rondacampeonato", targetEntity=com.projetoea.escolasfutebol.classesjava.Jogo.class)	
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
	
	public void setCampeonato(com.projetoea.escolasfutebol.classesjava.Campeonato value) {
		if (campeonato != null) {
			campeonato.rondacampeonato.remove(this);
		}
		if (value != null) {
			value.rondacampeonato.add(this);
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
	
	private void setORM_Jogo(java.util.Set value) {
		this.ORM_jogo = value;
	}
	
	private java.util.Set getORM_Jogo() {
		return ORM_jogo;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.JogoSetCollection jogo = new com.projetoea.escolasfutebol.classesjava.JogoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_RONDACAMPEONATO_JOGO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_RONDACAMPEONATO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
