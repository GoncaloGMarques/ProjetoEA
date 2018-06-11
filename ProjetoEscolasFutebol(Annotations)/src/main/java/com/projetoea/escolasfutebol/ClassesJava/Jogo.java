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
@Table(name="Jogo")
public class Jogo implements Serializable {
	public Jogo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_JOGO_EVENTOS) {
			return ORM_eventos;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_JOGO_CAMPEONATO) {
			this.campeonato = (Campeonato) owner;
		}
		
		else if (key == ORMConstants.KEY_JOGO_ARBITRO) {
			this.arbitro = (Arbitro) owner;
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
	@GeneratedValue(generator="JOGO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="JOGO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=Arbitro.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="ArbitroID2", referencedColumnName="ID", nullable=false) })	
	private Arbitro arbitro;
	
	@ManyToOne(targetEntity=Campeonato.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="CampeonatoID2", referencedColumnName="ID", nullable=false) })	
	private Campeonato campeonato;
	
	@Column(name="Data", nullable=true, length=255)	
	private String Data;
	
	@Column(name="ResultadoVisitado", nullable=false, length=10)	
	private int ResultadoVisitado;
	
	@Column(name="ResultadoVisitante", nullable=false, length=10)	
	private int ResultadoVisitante;
	
	@Column(name="VencedorID", nullable=false, length=10)	
	private int VencedorID;
	
	@OneToMany(mappedBy="jogo", targetEntity=EventoJogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_eventos = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setData(String value) {
		this.Data = value;
	}
	
	public String getData() {
		return Data;
	}
	
	public void setResultadoVisitado(int value) {
		this.ResultadoVisitado = value;
	}
	
	public int getResultadoVisitado() {
		return ResultadoVisitado;
	}
	
	public void setResultadoVisitante(int value) {
		this.ResultadoVisitante = value;
	}
	
	public int getResultadoVisitante() {
		return ResultadoVisitante;
	}
	
	public void setVencedorID(int value) {
		this.VencedorID = value;
	}
	
	public int getVencedorID() {
		return VencedorID;
	}
	
	public void setCampeonato(Campeonato value) {
		if (campeonato != null) {
			campeonato.jogos.remove(this);
		}
		if (value != null) {
			value.jogos.add(this);
		}
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Campeonato(Campeonato value) {
		this.campeonato = value;
	}
	
	private Campeonato getORM_Campeonato() {
		return campeonato;
	}
	
	public void setArbitro(Arbitro value) {
		if (arbitro != null) {
			arbitro.jogos.remove(this);
		}
		if (value != null) {
			value.jogos.add(this);
		}
	}
	
	public Arbitro getArbitro() {
		return arbitro;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Arbitro(Arbitro value) {
		this.arbitro = value;
	}
	
	private Arbitro getORM_Arbitro() {
		return arbitro;
	}
	
	private void setORM_Eventos(java.util.Set value) {
		this.ORM_eventos = value;
	}
	
	private java.util.Set getORM_Eventos() {
		return ORM_eventos;
	}
	
	@Transient	
	public final EventoJogoSetCollection eventos = new EventoJogoSetCollection(this, _ormAdapter, ORMConstants.KEY_JOGO_EVENTOS, ORMConstants.KEY_EVENTOJOGO_JOGO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
