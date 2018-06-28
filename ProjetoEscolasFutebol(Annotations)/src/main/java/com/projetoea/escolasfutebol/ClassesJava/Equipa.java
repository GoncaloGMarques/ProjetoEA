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
@Table(name="equipa")
public class Equipa implements Serializable {
	public Equipa() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_JOGADOR) {
			return ORM_jogador;
		}
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_JOGO) {
			return ORM_jogo;
		}
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_JOGO1) {
			return ORM_jogo1;
		}
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_JOGO2) {
			return ORM_jogo2;
		}
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_PARTCIPANTETORNEIO) {
			return ORM_partcipantetorneio;
		}
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_PARTICIPANTECAMPEONATO) {
			return ORM_participantecampeonato;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_CAMPO) {
			this.campo = (com.projetoea.escolasfutebol.classesjava.Campo) owner;
		}
		
		else if (key == com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_ESCOLAS) {
			this.escolas = (com.projetoea.escolasfutebol.classesjava.Escolas) owner;
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
	
	@Column(name="ID", nullable=false, length=11)	
	@Id	
	@GeneratedValue(generator="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_EQUIPA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="COM_PROJETOEA_ESCOLASFUTEBOL_CLASSESJAVA_EQUIPA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Escalao", nullable=true, length=11)	
	private Integer escalao;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Campo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="campoID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Campo campo;
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Escolas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="escolasID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Escolas escolas;
	
	@OneToMany(mappedBy="equipa", targetEntity=com.projetoea.escolasfutebol.classesjava.Jogador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogador = new java.util.HashSet();
	
	@OneToMany(mappedBy="equipaCasa", targetEntity=com.projetoea.escolasfutebol.classesjava.Jogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogo = new java.util.HashSet();
	
	@OneToMany(mappedBy="equipaFora", targetEntity=com.projetoea.escolasfutebol.classesjava.Jogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogo1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="vencedor", targetEntity=com.projetoea.escolasfutebol.classesjava.Jogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogo2 = new java.util.HashSet();
	
	@OneToMany(mappedBy="equipa", targetEntity=com.projetoea.escolasfutebol.classesjava.Partcipantetorneio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_partcipantetorneio = new java.util.HashSet();
	
	@OneToMany(mappedBy="equipa", targetEntity=com.projetoea.escolasfutebol.classesjava.Participantecampeonato.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_participantecampeonato = new java.util.HashSet();
	
	private void setID(int value) {
		this.ID = value;
	}
	
	public int getID() {
		return ID;
	}
	
	public int getORMID() {
		return getID();
	}
	
	public void setEscalao(int value) {
		setEscalao(new Integer(value));
	}
	
	public void setEscalao(Integer value) {
		this.escalao = value;
	}
	
	public Integer getEscalao() {
		return escalao;
	}
	
	public void setNome(String value) {
		this.nome = value;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setCampo(com.projetoea.escolasfutebol.classesjava.Campo value) {
		if (campo != null) {
			campo.equipa.remove(this);
		}
		if (value != null) {
			value.equipa.add(this);
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
	
	public void setEscolas(com.projetoea.escolasfutebol.classesjava.Escolas value) {
		if (escolas != null) {
			escolas.equipa.remove(this);
		}
		if (value != null) {
			value.equipa.add(this);
		}
	}
	
	public com.projetoea.escolasfutebol.classesjava.Escolas getEscolas() {
		return escolas;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Escolas(com.projetoea.escolasfutebol.classesjava.Escolas value) {
		this.escolas = value;
	}
	
	private com.projetoea.escolasfutebol.classesjava.Escolas getORM_Escolas() {
		return escolas;
	}
	
	private void setORM_Jogador(java.util.Set value) {
		this.ORM_jogador = value;
	}
	
	private java.util.Set getORM_Jogador() {
		return ORM_jogador;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.JogadorSetCollection jogador = new com.projetoea.escolasfutebol.classesjava.JogadorSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_JOGADOR, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGADOR_EQUIPA, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Jogo(java.util.Set value) {
		this.ORM_jogo = value;
	}
	
	private java.util.Set getORM_Jogo() {
		return ORM_jogo;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.JogoSetCollection jogo = new com.projetoea.escolasfutebol.classesjava.JogoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_JOGO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_EQUIPACASA, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Jogo1(java.util.Set value) {
		this.ORM_jogo1 = value;
	}
	
	private java.util.Set getORM_Jogo1() {
		return ORM_jogo1;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.JogoSetCollection jogo1 = new com.projetoea.escolasfutebol.classesjava.JogoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_JOGO1, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_EQUIPAFORA, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Jogo2(java.util.Set value) {
		this.ORM_jogo2 = value;
	}
	
	private java.util.Set getORM_Jogo2() {
		return ORM_jogo2;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.JogoSetCollection jogo2 = new com.projetoea.escolasfutebol.classesjava.JogoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_JOGO2, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_JOGO_VENCEDOR, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Partcipantetorneio(java.util.Set value) {
		this.ORM_partcipantetorneio = value;
	}
	
	private java.util.Set getORM_Partcipantetorneio() {
		return ORM_partcipantetorneio;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.PartcipantetorneioSetCollection partcipantetorneio = new com.projetoea.escolasfutebol.classesjava.PartcipantetorneioSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_PARTCIPANTETORNEIO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_PARTCIPANTETORNEIO_EQUIPA, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Participantecampeonato(java.util.Set value) {
		this.ORM_participantecampeonato = value;
	}
	
	private java.util.Set getORM_Participantecampeonato() {
		return ORM_participantecampeonato;
	}
	
	@Transient	
	public final com.projetoea.escolasfutebol.classesjava.ParticipantecampeonatoSetCollection participantecampeonato = new com.projetoea.escolasfutebol.classesjava.ParticipantecampeonatoSetCollection(this, _ormAdapter, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_EQUIPA_PARTICIPANTECAMPEONATO, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_PARTICIPANTECAMPEONATO_EQUIPA, com.projetoea.escolasfutebol.classesjava.ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
