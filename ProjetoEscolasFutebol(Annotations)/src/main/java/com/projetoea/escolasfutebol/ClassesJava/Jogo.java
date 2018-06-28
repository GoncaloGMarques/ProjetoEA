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

import javax.persistence.*;
import java.io.Serializable;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="jogo")
public class Jogo implements Serializable {
	public Jogo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_EVENTOJOGO) {
			return ORM_eventojogo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_ARBITRO) {
			this.arbitro = (com.projetoea.escolasfutebol.classesjava.Arbitro) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_EQUIPACASA) {
			this.equipaCasa = (com.projetoea.escolasfutebol.classesjava.Equipa) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_EQUIPAFORA) {
			this.equipaFora = (com.projetoea.escolasfutebol.classesjava.Equipa) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_VENCEDOR) {
			this.vencedor = (com.projetoea.escolasfutebol.classesjava.Equipa) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_RONDATORNEIO) {
			this.rondatorneio = (com.projetoea.escolasfutebol.classesjava.Rondatorneio) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_CAMPO) {
			this.campo = (com.projetoea.escolasfutebol.classesjava.Campo) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_RONDACAMPEONATO) {
			this.rondacampeonato = (com.projetoea.escolasfutebol.classesjava.Rondacampeonato) owner;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_JOGO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_JOGO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Data", nullable=true)	
	private java.sql.Timestamp data;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Arbitro.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="arbitroID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Arbitro arbitro;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="equipaCasaID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Equipa equipaCasa;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="equipaForaID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Equipa equipaFora;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="vencedorID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Equipa vencedor;
	
	@Column(name="golosEquipaCasa", nullable=true, length=10)	
	private Integer golosEquipaCasa;
	
	@Column(name="golosEquipaFora", nullable=true, length=10)	
	private Integer golosEquipaFora;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Rondatorneio.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="rondatorneioID", referencedColumnName="ID") })	
	private com.projetoea.escolasfutebol.classesjava.Rondatorneio rondatorneio;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Campo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="campoID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Campo campo;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Rondacampeonato.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="rondacampeonatoID", referencedColumnName="ID") })	
	private com.projetoea.escolasfutebol.classesjava.Rondacampeonato rondacampeonato;
	
	@OneToMany(mappedBy="jogo", targetEntity=com.projetoea.escolasfutebol.classesjava.Eventojogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_eventojogo = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setData(java.sql.Timestamp value) {
		this.data = value;
	}
	
	public java.sql.Timestamp getData() {
		return data;
	}
	
	public void setGolosEquipaCasa(int value) {
		setGolosEquipaCasa(new Integer(value));
	}
	
	public void setGolosEquipaCasa(Integer value) {
		this.golosEquipaCasa = value;
	}
	
	public Integer getGolosEquipaCasa() {
		return golosEquipaCasa;
	}
	
	public void setGolosEquipaFora(int value) {
		setGolosEquipaFora(new Integer(value));
	}
	
	public void setGolosEquipaFora(Integer value) {
		this.golosEquipaFora = value;
	}
	
	public Integer getGolosEquipaFora() {
		return golosEquipaFora;
	}
	
	public void setArbitro(com.projetoea.escolasfutebol.classesjava.Arbitro value) {
		if (arbitro != null) {
			arbitro.jogo.remove(this);
		}
		if (value != null) {
			value.jogo.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Arbitro getArbitro() {
		return arbitro;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Arbitro(com.projetoea.escolasfutebol.classesjava.Arbitro value) {
		this.arbitro = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Arbitro getORM_Arbitro() {
		return arbitro;
	}
	
	public void setEquipaCasa(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		if (equipaCasa != null) {
			equipaCasa.jogo.remove(this);
		}
		if (value != null) {
			value.jogo.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Equipa getEquipaCasa() {
		return equipaCasa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EquipaCasa(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		this.equipaCasa = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Equipa getORM_EquipaCasa() {
		return equipaCasa;
	}
	
	public void setEquipaFora(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		if (equipaFora != null) {
			equipaFora.jogo1.remove(this);
		}
		if (value != null) {
			value.jogo1.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Equipa getEquipaFora() {
		return equipaFora;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EquipaFora(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		this.equipaFora = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Equipa getORM_EquipaFora() {
		return equipaFora;
	}
	
	public void setVencedor(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		if (vencedor != null) {
			vencedor.jogo2.remove(this);
		}
		if (value != null) {
			value.jogo2.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Equipa getVencedor() {
		return vencedor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Vencedor(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		this.vencedor = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Equipa getORM_Vencedor() {
		return vencedor;
	}
	
	public void setRondatorneio(com.projetoea.escolasfutebol.classesjava.Rondatorneio value) {
		if (rondatorneio != null) {
			rondatorneio.jogo.remove(this);
		}
		if (value != null) {
			value.jogo.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Rondatorneio getRondatorneio() {
		return rondatorneio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Rondatorneio(com.projetoea.escolasfutebol.classesjava.Rondatorneio value) {
		this.rondatorneio = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Rondatorneio getORM_Rondatorneio() {
		return rondatorneio;
	}
	
	public void setCampo(com.projetoea.escolasfutebol.classesjava.Campo value) {
		if (campo != null) {
			campo.jogo.remove(this);
		}
		if (value != null) {
			value.jogo.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Campo getCampo() {
		return campo;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Campo(com.projetoea.escolasfutebol.classesjava.Campo value) {
		this.campo = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Campo getORM_Campo() {
		return campo;
	}
	
	public void setRondacampeonato(com.projetoea.escolasfutebol.classesjava.Rondacampeonato value) {
		if (rondacampeonato != null) {
			rondacampeonato.jogo.remove(this);
		}
		if (value != null) {
			value.jogo.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Rondacampeonato getRondacampeonato() {
		return rondacampeonato;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Rondacampeonato(com.projetoea.escolasfutebol.classesjava.Rondacampeonato value) {
		this.rondacampeonato = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Rondacampeonato getORM_Rondacampeonato() {
		return rondacampeonato;
	}
	
	private void setORM_Eventojogo(java.util.Set value) {
		this.ORM_eventojogo = value;
	}
	
	private java.util.Set getORM_Eventojogo() {
		return ORM_eventojogo;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.EventojogoSetCollection eventojogo = new com.projetoea.escolasfutebol.classesjava.EventojogoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_EVENTOJOGO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EVENTOJOGO_JOGO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
