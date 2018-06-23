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
@Table(name="partcipantetorneio")
public class Partcipantetorneio implements Serializable {
	public Partcipantetorneio() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_PARTCIPANTETORNEIO_TORNEIO) {
			this.torneio = (Torneio) owner;
		}
		
		else if (key == ORMConstants.KEY_PARTCIPANTETORNEIO_EQUIPA) {
			this.equipa = (Equipa) owner;
		}
		
		else if (key == ORMConstants.KEY_PARTCIPANTETORNEIO_GRUPO) {
			this.grupo = (Grupo) owner;
		}
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public void setOwner(Object owner, int key) {
			this_setOwner(owner, key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=10)	
	@Id	
	@GeneratedValue(generator="PARTCIPANTETORNEIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="PARTCIPANTETORNEIO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Torneio.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="torneioID", referencedColumnName="ID", nullable=false) })	
	private Torneio torneio;
	
	@ManyToOne(targetEntity=Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="equipaID", referencedColumnName="ID", nullable=false) })	
	private Equipa equipa;
	
	@ManyToOne(targetEntity=Grupo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="grupoID", referencedColumnName="ID", nullable=false) })	
	private Grupo grupo;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTorneio(Torneio value) {
		if (torneio != null) {
			torneio.partcipantetorneio.remove(this);
		}
		if (value != null) {
			value.partcipantetorneio.add(this);
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
	
	public void setEquipa(Equipa value) {
		if (equipa != null) {
			equipa.partcipantetorneio.remove(this);
		}
		if (value != null) {
			value.partcipantetorneio.add(this);
		}
	}
	
	public Equipa getEquipa() {
		return equipa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Equipa(Equipa value) {
		this.equipa = value;
	}
	
	private Equipa getORM_Equipa() {
		return equipa;
	}
	
	public void setGrupo(Grupo value) {
		if (grupo != null) {
			grupo.partcipantetorneio.remove(this);
		}
		if (value != null) {
			value.partcipantetorneio.add(this);
		}
	}
	
	public Grupo getGrupo() {
		return grupo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Grupo(Grupo value) {
		this.grupo = value;
	}
	
	private Grupo getORM_Grupo() {
		return grupo;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
