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
@Table(name="partcipantetorneio")
public class Partcipantetorneio implements Serializable {
	public Partcipantetorneio() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_PARTCIPANTETORNEIO_TORNEIO) {
			this.torneio = (com.projetoea.escolasfutebol.classesjava.Torneio) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_PARTCIPANTETORNEIO_EQUIPA) {
			this.equipa = (com.projetoea.escolasfutebol.classesjava.Equipa) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_PARTCIPANTETORNEIO_GRUPO) {
			this.grupo = (com.projetoea.escolasfutebol.classesjava.Grupo) owner;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_PARTCIPANTETORNEIO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_PARTCIPANTETORNEIO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Torneio.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="torneioID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Torneio torneio;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="equipaID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Equipa equipa;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Grupo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="grupoID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Grupo grupo;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setTorneio(com.projetoea.escolasfutebol.classesjava.Torneio value) {
		if (torneio != null) {
			torneio.partcipantetorneio.remove(this);
		}
		if (value != null) {
			value.partcipantetorneio.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Torneio getTorneio() {
		return torneio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Torneio(com.projetoea.escolasfutebol.classesjava.Torneio value) {
		this.torneio = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Torneio getORM_Torneio() {
		return torneio;
	}
	
	public void setEquipa(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		if (equipa != null) {
			equipa.partcipantetorneio.remove(this);
		}
		if (value != null) {
			value.partcipantetorneio.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Equipa getEquipa() {
		return equipa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Equipa(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		this.equipa = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Equipa getORM_Equipa() {
		return equipa;
	}
	
	public void setGrupo(com.projetoea.escolasfutebol.classesjava.Grupo value) {
		if (grupo != null) {
			grupo.partcipantetorneio.remove(this);
		}
		if (value != null) {
			value.partcipantetorneio.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Grupo getGrupo() {
		return grupo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Grupo(com.projetoea.escolasfutebol.classesjava.Grupo value) {
		this.grupo = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Grupo getORM_Grupo() {
		return grupo;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
