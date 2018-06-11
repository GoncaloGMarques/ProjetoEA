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
@Table(name="Equipa")
public class Equipa implements Serializable {
	public Equipa() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EQUIPA_JOGADORES) {
			return ORM_jogadores;
		}
		else if (key == ORMConstants.KEY_EQUIPA_TORNEIOS) {
			return ORM_torneios;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EQUIPA_CAMPO) {
			this.campo = (Campo) owner;
		}
		
		else if (key == ORMConstants.KEY_EQUIPA_ESCOLA) {
			this.escola = (Escolas) owner;
		}
		
		else if (key == ORMConstants.KEY_EQUIPA_CAMPEONATO) {
			this.campeonato = (Campeonato) owner;
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
	@GeneratedValue(generator="EQUIPA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EQUIPA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Escolas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="EscolasID2", referencedColumnName="ID", nullable=false) })	
	private Escolas escola;
	
	@ManyToOne(targetEntity=Campo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="CampoID2", referencedColumnName="ID", nullable=false) })	
	private Campo campo;
	
	@Column(name="Name", nullable=true, length=255)	
	private String name;
	
	@Column(name="Pontos", nullable=false, length=10)	
	private int pontos;
	
	@Column(name="Escalao", nullable=false, length=10)	
	private int escalao;
	
	@OneToMany(mappedBy="equipa", targetEntity=Jogador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogadores = new java.util.HashSet();
	
	@ManyToMany(mappedBy="ORM_equipas", targetEntity=Torneio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_torneios = new java.util.HashSet();
	
	@OneToOne(mappedBy="equipa", targetEntity=Campeonato.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	private Campeonato campeonato;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setName(String value) {
		this.name = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setPontos(int value) {
		this.pontos = value;
	}
	
	public int getPontos() {
		return pontos;
	}
	
	public void setEscalao(int value) {
		this.escalao = value;
	}
	
	public int getEscalao() {
		return escalao;
	}
	
	public void setCampo(Campo value) {
		if (campo != null) {
			campo.equipas.remove(this);
		}
		if (value != null) {
			value.equipas.add(this);
		}
	}
	
	public Campo getCampo() {
		return campo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Campo(Campo value) {
		this.campo = value;
	}
	
	private Campo getORM_Campo() {
		return campo;
	}
	
	public void setEscola(Escolas value) {
		if (escola != null) {
			escola.equipas.remove(this);
		}
		if (value != null) {
			value.equipas.add(this);
		}
	}
	
	public Escolas getEscola() {
		return escola;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Escola(Escolas value) {
		this.escola = value;
	}
	
	private Escolas getORM_Escola() {
		return escola;
	}
	
	private void setORM_Jogadores(java.util.Set value) {
		this.ORM_jogadores = value;
	}
	
	private java.util.Set getORM_Jogadores() {
		return ORM_jogadores;
	}
	
	@Transient	
	public final JogadorSetCollection jogadores = new JogadorSetCollection(this, _ormAdapter, ORMConstants.KEY_EQUIPA_JOGADORES, ORMConstants.KEY_JOGADOR_EQUIPA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Torneios(java.util.Set value) {
		this.ORM_torneios = value;
	}
	
	private java.util.Set getORM_Torneios() {
		return ORM_torneios;
	}
	
	@Transient	
	public final TorneioSetCollection torneios = new TorneioSetCollection(this, _ormAdapter, ORMConstants.KEY_EQUIPA_TORNEIOS, ORMConstants.KEY_TORNEIO_EQUIPAS, ORMConstants.KEY_MUL_MANY_TO_MANY);
	
	public void setCampeonato(Campeonato value) {
		if (this.campeonato != value) {
			Campeonato lcampeonato = this.campeonato;
			this.campeonato = value;
			if (value != null) {
				campeonato.setEquipa(this);
			}
			if (lcampeonato != null && lcampeonato.getEquipa() == this) {
				lcampeonato.setEquipa(null);
			}
		}
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
