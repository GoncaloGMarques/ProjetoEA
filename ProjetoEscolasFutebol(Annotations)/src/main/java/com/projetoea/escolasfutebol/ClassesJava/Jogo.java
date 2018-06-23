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
@Table(name="jogo")
public class Jogo implements Serializable {
	public Jogo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_JOGO_EVENTOJOGO) {
			return ORM_eventojogo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_JOGO_ARBITRO) {
			this.arbitro = (Arbitro) owner;
		}
		
		else if (key == ORMConstants.KEY_JOGO_EQUIPACASA) {
			this.equipaCasa = (Equipa) owner;
		}
		
		else if (key == ORMConstants.KEY_JOGO_EQUIPAFORA) {
			this.equipaFora = (Equipa) owner;
		}
		
		else if (key == ORMConstants.KEY_JOGO_VENCEDOR) {
			this.vencedor = (Equipa) owner;
		}
		
		else if (key == ORMConstants.KEY_JOGO_RONDATORNEIO) {
			this.rondatorneio = (Rondatorneio) owner;
		}
		
		else if (key == ORMConstants.KEY_JOGO_CAMPO) {
			this.campo = (Campo) owner;
		}
		
		else if (key == ORMConstants.KEY_JOGO_RONDACAMPEONATO) {
			this.rondacampeonato = (Rondacampeonato) owner;
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
	
	@Column(name="Data", nullable=true)	
	private java.sql.Timestamp data;
	
	@ManyToOne(targetEntity=Arbitro.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="arbitroID", referencedColumnName="ID", nullable=false) })	
	private Arbitro arbitro;
	
	@ManyToOne(targetEntity=Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="equipaCasaID", referencedColumnName="ID", nullable=false) })	
	private Equipa equipaCasa;
	
	@ManyToOne(targetEntity=Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="equipaForaID", referencedColumnName="ID", nullable=false) })	
	private Equipa equipaFora;
	
	@ManyToOne(targetEntity=Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="vencedorID", referencedColumnName="ID", nullable=false) })	
	private Equipa vencedor;
	
	@Column(name="golosEquipaCasa", nullable=true, length=10)	
	private Integer golosEquipaCasa;
	
	@Column(name="golosEquipaFora", nullable=true, length=10)	
	private Integer golosEquipaFora;
	
	@ManyToOne(targetEntity=Rondatorneio.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="rondatorneioID", referencedColumnName="ID") })	
	private Rondatorneio rondatorneio;
	
	@ManyToOne(targetEntity=Campo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="campoID", referencedColumnName="ID", nullable=false) })	
	private Campo campo;
	
	@ManyToOne(targetEntity=Rondacampeonato.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="rondacampeonatoID", referencedColumnName="ID") })	
	private Rondacampeonato rondacampeonato;
	
	@OneToMany(mappedBy="jogo", targetEntity=Eventojogo.class)	
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
	
	public void setArbitro(Arbitro value) {
		if (arbitro != null) {
			arbitro.jogo.remove(this);
		}
		if (value != null) {
			value.jogo.add(this);
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
	
	public void setEquipaCasa(Equipa value) {
		if (equipaCasa != null) {
			equipaCasa.jogo.remove(this);
		}
		if (value != null) {
			value.jogo.add(this);
		}
	}
	
	public Equipa getEquipaCasa() {
		return equipaCasa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EquipaCasa(Equipa value) {
		this.equipaCasa = value;
	}
	
	private Equipa getORM_EquipaCasa() {
		return equipaCasa;
	}
	
	public void setEquipaFora(Equipa value) {
		if (equipaFora != null) {
			equipaFora.jogo1.remove(this);
		}
		if (value != null) {
			value.jogo1.add(this);
		}
	}
	
	public Equipa getEquipaFora() {
		return equipaFora;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_EquipaFora(Equipa value) {
		this.equipaFora = value;
	}
	
	private Equipa getORM_EquipaFora() {
		return equipaFora;
	}
	
	public void setVencedor(Equipa value) {
		if (vencedor != null) {
			vencedor.jogo2.remove(this);
		}
		if (value != null) {
			value.jogo2.add(this);
		}
	}
	
	public Equipa getVencedor() {
		return vencedor;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Vencedor(Equipa value) {
		this.vencedor = value;
	}
	
	private Equipa getORM_Vencedor() {
		return vencedor;
	}
	
	public void setRondatorneio(Rondatorneio value) {
		if (rondatorneio != null) {
			rondatorneio.jogo.remove(this);
		}
		if (value != null) {
			value.jogo.add(this);
		}
	}
	
	public Rondatorneio getRondatorneio() {
		return rondatorneio;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Rondatorneio(Rondatorneio value) {
		this.rondatorneio = value;
	}
	
	private Rondatorneio getORM_Rondatorneio() {
		return rondatorneio;
	}
	
	public void setCampo(Campo value) {
		if (campo != null) {
			campo.jogo.remove(this);
		}
		if (value != null) {
			value.jogo.add(this);
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
	
	public void setRondacampeonato(Rondacampeonato value) {
		if (rondacampeonato != null) {
			rondacampeonato.jogo.remove(this);
		}
		if (value != null) {
			value.jogo.add(this);
		}
	}
	
	public Rondacampeonato getRondacampeonato() {
		return rondacampeonato;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Rondacampeonato(Rondacampeonato value) {
		this.rondacampeonato = value;
	}
	
	private Rondacampeonato getORM_Rondacampeonato() {
		return rondacampeonato;
	}
	
	private void setORM_Eventojogo(java.util.Set value) {
		this.ORM_eventojogo = value;
	}
	
	private java.util.Set getORM_Eventojogo() {
		return ORM_eventojogo;
	}
	
	@Transient	
	public final EventojogoSetCollection eventojogo = new EventojogoSetCollection(this, _ormAdapter, ORMConstants.KEY_JOGO_EVENTOJOGO, ORMConstants.KEY_EVENTOJOGO_JOGO, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
