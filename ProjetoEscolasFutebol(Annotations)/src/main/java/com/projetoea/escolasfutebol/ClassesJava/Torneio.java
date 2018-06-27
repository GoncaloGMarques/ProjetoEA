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
import javax.persistence.*;
import java.io.Serializable;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="torneio")
public class Torneio implements Serializable {
	public Torneio() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TORNEIO_RONDATORNEIO) {
			return ORM_rondatorneio;
		}
		else if (key == ORMConstants.KEY_TORNEIO_PARTCIPANTETORNEIO) {
			return ORM_partcipantetorneio;
		}
		else if (key == ORMConstants.KEY_TORNEIO_GRUPO) {
			return ORM_grupo;
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
	@GeneratedValue(generator="TORNEIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TORNEIO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="datainicio", nullable=true)	
	private java.sql.Timestamp datainicio;
	
	@Column(name="datafim", nullable=true)	
	private java.sql.Timestamp datafim;
	
	@Column(name="nome", nullable=true, length=255)	
	private String nome;
	
	@OneToMany(mappedBy="torneio", targetEntity=Rondatorneio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_rondatorneio = new java.util.HashSet();
	
	@OneToMany(mappedBy="torneio", targetEntity=Partcipantetorneio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_partcipantetorneio = new java.util.HashSet();
	
	@OneToMany(mappedBy="torneio", targetEntity=Grupo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_grupo = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setDatainicio(java.sql.Timestamp value) {
		this.datainicio = value;
	}
	
	public java.sql.Timestamp getDatainicio() {
		return datainicio;
	}
	
	public void setDatafim(java.sql.Timestamp value) {
		this.datafim = value;
	}
	
	public java.sql.Timestamp getDatafim() {
		return datafim;
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	private void setORM_Rondatorneio(java.util.Set value) {
		this.ORM_rondatorneio = value;
	}
	
	private java.util.Set getORM_Rondatorneio() {
		return ORM_rondatorneio;
	}
	
	@Transient	
	public final RondatorneioSetCollection rondatorneio = new RondatorneioSetCollection(this, _ormAdapter, ORMConstants.KEY_TORNEIO_RONDATORNEIO, ORMConstants.KEY_RONDATORNEIO_TORNEIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Partcipantetorneio(java.util.Set value) {
		this.ORM_partcipantetorneio = value;
	}
	
	private java.util.Set getORM_Partcipantetorneio() {
		return ORM_partcipantetorneio;
	}
	
	@Transient	
	public final PartcipantetorneioSetCollection partcipantetorneio = new PartcipantetorneioSetCollection(this, _ormAdapter, ORMConstants.KEY_TORNEIO_PARTCIPANTETORNEIO, ORMConstants.KEY_PARTCIPANTETORNEIO_TORNEIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Grupo(java.util.Set value) {
		this.ORM_grupo = value;
	}
	
	private java.util.Set getORM_Grupo() {
		return ORM_grupo;
	}
	
	@Transient	
	public final GrupoSetCollection grupo = new GrupoSetCollection(this, _ormAdapter, ORMConstants.KEY_TORNEIO_GRUPO, ORMConstants.KEY_GRUPO_TORNEIO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
