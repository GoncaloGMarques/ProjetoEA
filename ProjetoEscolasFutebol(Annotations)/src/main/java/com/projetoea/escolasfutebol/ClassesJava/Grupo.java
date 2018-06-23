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
@Table(name="grupo")
public class Grupo implements Serializable {
	public Grupo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_GRUPO_PARTCIPANTETORNEIO) {
			return ORM_partcipantetorneio;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_GRUPO_TORNEIO) {
			this.torneio = (Torneio) owner;
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
	@GeneratedValue(generator="GRUPO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="GRUPO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="nome", nullable=true, length=255)	
	private String nome;
	
	@ManyToOne(targetEntity=Torneio.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="torneioID", referencedColumnName="ID", nullable=false) })	
	private Torneio torneio;
	
	@OneToMany(mappedBy="grupo", targetEntity=Partcipantetorneio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_partcipantetorneio = new java.util.HashSet();
	
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
	
	public void setTorneio(Torneio value) {
		if (torneio != null) {
			torneio.grupo.remove(this);
		}
		if (value != null) {
			value.grupo.add(this);
		}
	}
	
	public Torneio getTorneio() {
		return torneio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Torneio(Torneio value) {
		this.torneio = value;
	}
	
	private Torneio getORM_Torneio() {
		return torneio;
	}
	
	private void setORM_Partcipantetorneio(java.util.Set value) {
		this.ORM_partcipantetorneio = value;
	}
	
	private java.util.Set getORM_Partcipantetorneio() {
		return ORM_partcipantetorneio;
	}
	
	@Transient	
	public final PartcipantetorneioSetCollection partcipantetorneio = new PartcipantetorneioSetCollection(this, _ormAdapter, ORMConstants.KEY_GRUPO_PARTCIPANTETORNEIO, ORMConstants.KEY_PARTCIPANTETORNEIO_GRUPO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
