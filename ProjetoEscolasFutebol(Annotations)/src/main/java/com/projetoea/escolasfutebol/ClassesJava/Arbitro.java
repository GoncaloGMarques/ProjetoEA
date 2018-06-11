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
@Table(name="Arbitro")
public class Arbitro implements Serializable {
	public Arbitro() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_ARBITRO_JOGOS) {
			return ORM_jogos;
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
	@GeneratedValue(generator="ARBITRO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="ARBITRO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToMany(mappedBy="arbitro", targetEntity=Jogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogos = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	private void setORM_Jogos(java.util.Set value) {
		this.ORM_jogos = value;
	}
	
	private java.util.Set getORM_Jogos() {
		return ORM_jogos;
	}
	
	@Transient	
	public final JogoSetCollection jogos = new JogoSetCollection(this, _ormAdapter, ORMConstants.KEY_ARBITRO_JOGOS, ORMConstants.KEY_JOGO_ARBITRO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
