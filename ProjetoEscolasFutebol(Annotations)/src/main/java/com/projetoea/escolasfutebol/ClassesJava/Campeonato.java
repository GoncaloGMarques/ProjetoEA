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
@Table(name="campeonato")
public class Campeonato implements Serializable {
	public Campeonato() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_CAMPEONATO_PARTICIPANTECAMPEONATO) {
			return ORM_participantecampeonato;
		}
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_CAMPEONATO_RONDACAMPEONATO) {
			return ORM_rondacampeonato;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_CAMPEONATO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_CAMPEONATO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@OneToMany(mappedBy="campeonato", targetEntity=com.projetoea.escolasfutebol.classesjava.Participantecampeonato.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_participantecampeonato = new java.util.HashSet();
	
	@OneToMany(mappedBy="campeonato", targetEntity=com.projetoea.escolasfutebol.classesjava.Rondacampeonato.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_rondacampeonato = new java.util.HashSet();
	
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
	
	private void setORM_Participantecampeonato(java.util.Set value) {
		this.ORM_participantecampeonato = value;
	}
	
	private java.util.Set getORM_Participantecampeonato() {
		return ORM_participantecampeonato;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.ParticipantecampeonatoSetCollection participantecampeonato = new com.projetoea.escolasfutebol.classesjava.ParticipantecampeonatoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_CAMPEONATO_PARTICIPANTECAMPEONATO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_PARTICIPANTECAMPEONATO_CAMPEONATO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Rondacampeonato(java.util.Set value) {
		this.ORM_rondacampeonato = value;
	}
	
	private java.util.Set getORM_Rondacampeonato() {
		return ORM_rondacampeonato;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.RondacampeonatoSetCollection rondacampeonato = new com.projetoea.escolasfutebol.classesjava.RondacampeonatoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_CAMPEONATO_RONDACAMPEONATO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_RONDACAMPEONATO_CAMPEONATO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
