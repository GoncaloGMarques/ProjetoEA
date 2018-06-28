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
@Table(name="torneio")
public class Torneio implements Serializable {
	public Torneio() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_TORNEIO_RONDATORNEIO) {
			return ORM_rondatorneio;
		}
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_TORNEIO_PARTCIPANTETORNEIO) {
			return ORM_partcipantetorneio;
		}
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_TORNEIO_GRUPO) {
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_TORNEIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_TORNEIO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="datainicio", nullable=true)	
	private java.sql.Timestamp datainicio;
	
	@Column(name="datafim", nullable=true)	
	private java.sql.Timestamp datafim;
	
	@Column(name="nome", nullable=true, length=255)	
	private String nome;
	
	@OneToMany(mappedBy="torneio", targetEntity=com.projetoea.escolasfutebol.classesjava.Rondatorneio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_rondatorneio = new java.util.HashSet();
	
	@OneToMany(mappedBy="torneio", targetEntity=com.projetoea.escolasfutebol.classesjava.Partcipantetorneio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_partcipantetorneio = new java.util.HashSet();
	
	@OneToMany(mappedBy="torneio", targetEntity=com.projetoea.escolasfutebol.classesjava.Grupo.class)	
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
	public final com.projetoea.escolasfutebol.classesjava.RondatorneioSetCollection rondatorneio = new com.projetoea.escolasfutebol.classesjava.RondatorneioSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_TORNEIO_RONDATORNEIO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_RONDATORNEIO_TORNEIO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Partcipantetorneio(java.util.Set value) {
		this.ORM_partcipantetorneio = value;
	}
	
	private java.util.Set getORM_Partcipantetorneio() {
		return ORM_partcipantetorneio;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.PartcipantetorneioSetCollection partcipantetorneio = new com.projetoea.escolasfutebol.classesjava.PartcipantetorneioSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_TORNEIO_PARTCIPANTETORNEIO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_PARTCIPANTETORNEIO_TORNEIO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Grupo(java.util.Set value) {
		this.ORM_grupo = value;
	}
	
	private java.util.Set getORM_Grupo() {
		return ORM_grupo;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.GrupoSetCollection grupo = new com.projetoea.escolasfutebol.classesjava.GrupoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_TORNEIO_GRUPO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_GRUPO_TORNEIO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
