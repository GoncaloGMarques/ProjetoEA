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
@Table(name="Campeonato")
public class Campeonato implements Serializable {
	public Campeonato() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_CAMPEONATO_JOGOS) {
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
	@GeneratedValue(generator="CAMPEONATO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="CAMPEONATO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@OneToOne(optional=false, targetEntity=Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="EquipaID2", referencedColumnName="ID", nullable=false) })	
	private Equipa equipa;
	
	@OneToMany(mappedBy="campeonato", targetEntity=Jogo.class)	
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
	
	public void setEquipa(Equipa value) {
		if (this.equipa != value) {
			Equipa lequipa = this.equipa;
			this.equipa = value;
			if (value != null) {
				equipa.setCampeonato(this);
			}
			if (lequipa != null && lequipa.getCampeonato() == this) {
				lequipa.setCampeonato(null);
			}
		}
	}
	
	public Equipa getEquipa() {
		return equipa;
	}
	
	private void setORM_Jogos(java.util.Set value) {
		this.ORM_jogos = value;
	}
	
	private java.util.Set getORM_Jogos() {
		return ORM_jogos;
	}
	
	@Transient	
	public final JogoSetCollection jogos = new JogoSetCollection(this, _ormAdapter, ORMConstants.KEY_CAMPEONATO_JOGOS, ORMConstants.KEY_JOGO_CAMPEONATO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
