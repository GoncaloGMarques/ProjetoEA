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
@Table(name="jogador")
public class Jogador implements Serializable {
	public Jogador() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGADOR_EVENTOJOGO) {
			return ORM_eventojogo;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGADOR_EQUIPA) {
			this.equipa = (com.projetoea.escolasfutebol.classesjava.Equipa) owner;
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
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_JOGADOR_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_JOGADOR_ID_GENERATOR", strategy="native")	
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
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Equipa.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="equipaID", referencedColumnName="ID") })	
	private com.projetoea.escolasfutebol.classesjava.Equipa equipa;
	
	@OneToMany(mappedBy="jogador", targetEntity=com.projetoea.escolasfutebol.classesjava.Eventojogo.class)	
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
	
	public void setEquipa(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		if (equipa != null) {
			equipa.jogador.remove(this);
		}
		if (value != null) {
			value.jogador.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Equipa getEquipa() {
		return equipa;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Equipa(com.projetoea.escolasfutebol.classesjava.Equipa value) {
		this.equipa = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Equipa getORM_Equipa() {
		return equipa;
	}
	
	private void setORM_Eventojogo(java.util.Set value) {
		this.ORM_eventojogo = value;
	}
	
	private java.util.Set getORM_Eventojogo() {
		return ORM_eventojogo;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.EventojogoSetCollection eventojogo = new com.projetoea.escolasfutebol.classesjava.EventojogoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGADOR_EVENTOJOGO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EVENTOJOGO_JOGADOR, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
