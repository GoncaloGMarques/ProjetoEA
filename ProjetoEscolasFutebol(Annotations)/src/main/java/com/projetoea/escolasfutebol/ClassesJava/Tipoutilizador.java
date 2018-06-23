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
@Table(name="tipoutilizador")
public class Tipoutilizador implements Serializable {
	public Tipoutilizador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TIPOUTILIZADOR_UTILIZADOR) {
			return ORM_utilizador;
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
	@GeneratedValue(generator="TIPOUTILIZADOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TIPOUTILIZADOR_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@OneToMany(mappedBy="tipoutilizador", targetEntity=Utilizador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_utilizador = new java.util.HashSet();
	
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
	
	private void setORM_Utilizador(java.util.Set value) {
		this.ORM_utilizador = value;
	}
	
	private java.util.Set getORM_Utilizador() {
		return ORM_utilizador;
	}
	
	@Transient	
	public final UtilizadorSetCollection utilizador = new UtilizadorSetCollection(this, _ormAdapter, ORMConstants.KEY_TIPOUTILIZADOR_UTILIZADOR, ORMConstants.KEY_UTILIZADOR_TIPOUTILIZADOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
