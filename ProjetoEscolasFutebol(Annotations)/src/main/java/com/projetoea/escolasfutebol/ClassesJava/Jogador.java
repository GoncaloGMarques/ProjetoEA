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
@Table(name="Jogador")
public class Jogador implements Serializable {
	public Jogador() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_JOGADOR_EQUIPA) {
			this.equipa = (Equipa) owner;
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
	@GeneratedValue(generator="JOGADOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="JOGADOR_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="EquipaID2", referencedColumnName="ID", nullable=false) })	
	private Equipa equipa;
	
	@Column(name="Name", nullable=false, length=10)	
	private int name;
	
	@Column(name="Idade", nullable=false, length=10)	
	private int idade;
	
	@Column(name="NCartoesVermelhos", nullable=false, length=10)	
	private int NCartoesVermelhos;
	
	@Column(name="NCartoesAmarelos", nullable=false, length=10)	
	private int NCartoesAmarelos;
	
	@Column(name="Golos", nullable=false, length=10)	
	private int Golos;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(int value) {
		this.name = value;
	}
	
	public int getName() {
		return name;
	}
	
	public void setIdade(int value) {
		this.idade = value;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setNCartoesVermelhos(int value) {
		this.NCartoesVermelhos = value;
	}
	
	public int getNCartoesVermelhos() {
		return NCartoesVermelhos;
	}
	
	public void setNCartoesAmarelos(int value) {
		this.NCartoesAmarelos = value;
	}
	
	public int getNCartoesAmarelos() {
		return NCartoesAmarelos;
	}
	
	public void setGolos(int value) {
		this.Golos = value;
	}
	
	public int getGolos() {
		return Golos;
	}
	
	public void setEquipa(Equipa value) {
		if (equipa != null) {
			equipa.jogadores.remove(this);
		}
		if (value != null) {
			value.jogadores.add(this);
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
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
