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
@Table(name="jogador")
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
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@Column(name="Idade", nullable=true, length=10)	
	private Integer idade;
	
	@Column(name="NCartoesVermelhos", nullable=true, length=10)	
	private Integer NCartoesVermelhos;
	
	@Column(name="NCartoesAmarelos", nullable=true, length=10)	
	private Integer NCartoesAmarelos;
	
	@Column(name="Golos", nullable=true, length=10)	
	private Integer golos;
	
	@ManyToOne(targetEntity=Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="equipaID", referencedColumnName="ID", nullable=false) })	
	private Equipa equipa;
	
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
	
	public void setIdade(int value) {
		setIdade(new Integer(value));
	}
	
	public void setIdade(Integer value) {
		this.idade = value;
	}
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setNCartoesVermelhos(int value) {
		setNCartoesVermelhos(new Integer(value));
	}
	
	public void setNCartoesVermelhos(Integer value) {
		this.NCartoesVermelhos = value;
	}
	
	public Integer getNCartoesVermelhos() {
		return NCartoesVermelhos;
	}
	
	public void setNCartoesAmarelos(int value) {
		setNCartoesAmarelos(new Integer(value));
	}
	
	public void setNCartoesAmarelos(Integer value) {
		this.NCartoesAmarelos = value;
	}
	
	public Integer getNCartoesAmarelos() {
		return NCartoesAmarelos;
	}
	
	public void setGolos(int value) {
		setGolos(new Integer(value));
	}
	
	public void setGolos(Integer value) {
		this.golos = value;
	}
	
	public Integer getGolos() {
		return golos;
	}
	
	public void setEquipa(Equipa value) {
		if (equipa != null) {
			equipa.jogador.remove(this);
		}
		if (value != null) {
			value.jogador.add(this);
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
