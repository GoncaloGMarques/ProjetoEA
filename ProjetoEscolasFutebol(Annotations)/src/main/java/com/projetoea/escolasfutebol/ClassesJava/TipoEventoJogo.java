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
@Table(name="TipoEventoJogo")
public class TipoEventoJogo implements Serializable {
	public TipoEventoJogo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_TIPOEVENTOJOGO_EVENTOJOGO) {
			return ORM_eventoJogo;
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
	@GeneratedValue(generator="TIPOEVENTOJOGO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="TIPOEVENTOJOGO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String Nome;
	
	@OneToMany(mappedBy="TipoDeEvento", targetEntity=EventoJogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_eventoJogo = new java.util.HashSet();
	
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
		this.Nome = value;
	}
	
	public String getNome() {
		return Nome;
	}
	
	private void setORM_EventoJogo(java.util.Set value) {
		this.ORM_eventoJogo = value;
	}
	
	private java.util.Set getORM_EventoJogo() {
		return ORM_eventoJogo;
	}
	
	@Transient	
	public final EventoJogoSetCollection eventoJogo = new EventoJogoSetCollection(this, _ormAdapter, ORMConstants.KEY_TIPOEVENTOJOGO_EVENTOJOGO, ORMConstants.KEY_EVENTOJOGO_TIPODEEVENTO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
