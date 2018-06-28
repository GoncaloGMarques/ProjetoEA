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
@Table(name="tipoeventojogo")
public class Tipoeventojogo implements Serializable {
	public Tipoeventojogo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_TIPOEVENTOJOGO_EVENTOJOGO) {
			return ORM_eventojogo;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_TIPOEVENTOJOGO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_TIPOEVENTOJOGO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@OneToMany(mappedBy="tipoeventojogo", targetEntity=com.projetoea.escolasfutebol.classesjava.Eventojogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_eventojogo = new java.util.HashSet();
	
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
	
	private void setORM_Eventojogo(java.util.Set value) {
		this.ORM_eventojogo = value;
	}
	
	private java.util.Set getORM_Eventojogo() {
		return ORM_eventojogo;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.EventojogoSetCollection eventojogo = new com.projetoea.escolasfutebol.classesjava.EventojogoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_TIPOEVENTOJOGO_EVENTOJOGO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EVENTOJOGO_TIPOEVENTOJOGO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
