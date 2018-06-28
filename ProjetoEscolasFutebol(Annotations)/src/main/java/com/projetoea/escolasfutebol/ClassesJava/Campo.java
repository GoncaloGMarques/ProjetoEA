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

import java.io.Serializable;
import javax.persistence.*;
@Entity
@org.hibernate.annotations.Proxy(lazy=false)
@Table(name="campo")
public class Campo implements Serializable {
	public Campo() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_CAMPO_EQUIPA) {
			return ORM_equipa;
		}
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_CAMPO_JOGO) {
			return ORM_jogo;
		}
		
		return null;
	}
	
	@Transient	
	org.orm.util.ORMAdapter _ormAdapter = new org.orm.util.AbstractORMAdapter() {
		public java.util.Set getSet(int key) {
			return this_getSet(key);
		}
		
	};
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_CAMPO_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_CAMPO_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@OneToMany(mappedBy="campo", targetEntity=com.projetoea.escolasfutebol.classesjava.Equipa.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_equipa = new java.util.HashSet();
	
	@OneToMany(mappedBy="campo", targetEntity=com.projetoea.escolasfutebol.classesjava.Jogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogo = new java.util.HashSet();
	
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
	
	private void setORM_Equipa(java.util.Set value) {
		this.ORM_equipa = value;
	}
	
	private java.util.Set getORM_Equipa() {
		return ORM_equipa;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.EquipaSetCollection equipa = new com.projetoea.escolasfutebol.classesjava.EquipaSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_CAMPO_EQUIPA, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_CAMPO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Jogo(java.util.Set value) {
		this.ORM_jogo = value;
	}
	
	private java.util.Set getORM_Jogo() {
		return ORM_jogo;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.JogoSetCollection jogo = new com.projetoea.escolasfutebol.classesjava.JogoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_CAMPO_JOGO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_CAMPO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
