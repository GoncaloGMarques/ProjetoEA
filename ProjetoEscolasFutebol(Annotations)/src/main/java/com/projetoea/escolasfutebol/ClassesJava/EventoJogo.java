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
@Table(name="EventoJogo")
public class EventoJogo implements Serializable {
	public EventoJogo() {
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EVENTOJOGO_JOGO) {
			this.jogo = (Jogo) owner;
		}
		
		else if (key == ORMConstants.KEY_EVENTOJOGO_TIPODEEVENTO) {
			this.TipoDeEvento = (TipoEventoJogo) owner;
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
	@GeneratedValue(generator="EVENTOJOGO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EVENTOJOGO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@ManyToOne(targetEntity=TipoEventoJogo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="TipoEventoJogoID2", referencedColumnName="ID", nullable=false) })	
	private TipoEventoJogo TipoDeEvento;
	
	@ManyToOne(targetEntity=Jogo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="JogoID2", referencedColumnName="ID", nullable=false) })	
	private Jogo jogo;
	
	@Column(name="Minuto", nullable=false, length=10)	
	private double minuto;
	
	@Column(name="TipoDeEventoId", nullable=true, length=10)	
	private int tipoDeEventoId;
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setMinuto(double value) {
		this.minuto = value;
	}
	
	public double getMinuto() {
		return minuto;
	}
	
	public void setTipoDeEventoId(int value) {
		this.tipoDeEventoId = value;
	}
	
	public int getTipoDeEventoId() {
		return tipoDeEventoId;
	}
	
	public void setJogo(Jogo value) {
		if (jogo != null) {
			jogo.eventos.remove(this);
		}
		if (value != null) {
			value.eventos.add(this);
		}
	}
	
	public Jogo getJogo() {
		return jogo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Jogo(Jogo value) {
		this.jogo = value;
	}
	
	private Jogo getORM_Jogo() {
		return jogo;
	}
	
	public void setTipoDeEvento(TipoEventoJogo value) {
		if (TipoDeEvento != null) {
			TipoDeEvento.eventoJogo.remove(this);
		}
		if (value != null) {
			value.eventoJogo.add(this);
		}
	}
	
	public TipoEventoJogo getTipoDeEvento() {
		return TipoDeEvento;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_TipoDeEvento(TipoEventoJogo value) {
		this.TipoDeEvento = value;
	}
	
	private TipoEventoJogo getORM_TipoDeEvento() {
		return TipoDeEvento;
	}
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
