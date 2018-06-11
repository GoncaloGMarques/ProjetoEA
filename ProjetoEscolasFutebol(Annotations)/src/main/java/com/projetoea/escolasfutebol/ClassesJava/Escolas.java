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
@Table(name="Escolas")
public class Escolas implements Serializable {
	public Escolas() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ESCOLAS_EQUIPAS) {
			return ORM_equipas;
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
	@GeneratedValue(generator="ESCOLAS_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ESCOLAS_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String Nome;
	
	@OneToMany(mappedBy="escola", targetEntity=Equipa.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_equipas = new java.util.HashSet();
	
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
		this.Nome = value;
	}
	
	public String getNome() {
		return Nome;
	}
	
	private void setORM_Equipas(java.util.Set value) {
		this.ORM_equipas = value;
	}
	
	private java.util.Set getORM_Equipas() {
		return ORM_equipas;
	}
	
	@Transient	
	public final EquipaSetCollection equipas = new EquipaSetCollection(this, _ormAdapter, ORMConstants.KEY_ESCOLAS_EQUIPAS, ORMConstants.KEY_EQUIPA_ESCOLA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
