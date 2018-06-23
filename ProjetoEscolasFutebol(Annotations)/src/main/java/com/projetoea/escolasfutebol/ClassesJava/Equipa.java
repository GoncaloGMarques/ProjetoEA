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
@Table(name="equipa")
public class Equipa implements Serializable {
	public Equipa() {
	}
	
	private java.util.Set this_getSet (int key) {
		if (key == ORMConstants.KEY_EQUIPA_JOGADOR) {
			return ORM_jogador;
		}
		else if (key == ORMConstants.KEY_EQUIPA_JOGO) {
			return ORM_jogo;
		}
		else if (key == ORMConstants.KEY_EQUIPA_JOGO1) {
			return ORM_jogo1;
		}
		else if (key == ORMConstants.KEY_EQUIPA_JOGO2) {
			return ORM_jogo2;
		}
		else if (key == ORMConstants.KEY_EQUIPA_PARTCIPANTETORNEIO) {
			return ORM_partcipantetorneio;
		}
		else if (key == ORMConstants.KEY_EQUIPA_PARTICIPANTECAMPEONATO) {
			return ORM_participantecampeonato;
		}
		
		return null;
	}
	
	private void this_setOwner(Object owner, int key) {
		if (key == ORMConstants.KEY_EQUIPA_CAMPO) {
			this.campo = (Campo) owner;
		}
		
		else if (key == ORMConstants.KEY_EQUIPA_ESCOLAS) {
			this.escolas = (Escolas) owner;
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
	@GeneratedValue(generator="EQUIPA_ID_GENERATOR")	
	@org.hibernate.annotations.GenericGenerator(name="EQUIPA_ID_GENERATOR", strategy="native")	
	private int ID;
	
	@Column(name="Escalao", nullable=true, length=11)	
	private Integer escalao;
	
	@Column(name="Nome", nullable=true, length=255)	
	private String nome;
	
	@ManyToOne(targetEntity=Campo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="campoID", referencedColumnName="ID", nullable=false) })	
	private Campo campo;
	
	@ManyToOne(targetEntity=Escolas.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="escolasID", referencedColumnName="ID", nullable=false) })	
	private Escolas escolas;
	
	@OneToMany(mappedBy="equipa", targetEntity=Jogador.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogador = new java.util.HashSet();
	
	@OneToMany(mappedBy="equipaCasa", targetEntity=Jogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogo = new java.util.HashSet();
	
	@OneToMany(mappedBy="equipaFora", targetEntity=Jogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogo1 = new java.util.HashSet();
	
	@OneToMany(mappedBy="vencedor", targetEntity=Jogo.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_jogo2 = new java.util.HashSet();
	
	@OneToMany(mappedBy="equipa", targetEntity=Partcipantetorneio.class)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.SAVE_UPDATE, org.hibernate.annotations.CascadeType.LOCK})	
	@org.hibernate.annotations.LazyCollection(org.hibernate.annotations.LazyCollectionOption.TRUE)	
	private java.util.Set ORM_partcipantetorneio = new java.util.HashSet();
	
	@OneToMany(mappedBy="equipa", targetEntity=Participantecampeonato.class)	
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
	
	public void setCampo(Campo value) {
		if (campo != null) {
			campo.equipa.remove(this);
		}
		if (value != null) {
			value.equipa.add(this);
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
	
	public void setEscolas(Escolas value) {
		if (escolas != null) {
			escolas.equipa.remove(this);
		}
		if (value != null) {
			value.equipa.add(this);
		}
	}
	
	public Escolas getEscolas() {
		return escolas;
	}
	
	/**
	 * This method is for internal use only.
	 */
	public void setORM_Escolas(Escolas value) {
		this.escolas = value;
	}
	
	private Escolas getORM_Escolas() {
		return escolas;
	}
	
	private void setORM_Jogador(java.util.Set value) {
		this.ORM_jogador = value;
	}
	
	private java.util.Set getORM_Jogador() {
		return ORM_jogador;
	}
	
	@Transient	
	public final JogadorSetCollection jogador = new JogadorSetCollection(this, _ormAdapter, ORMConstants.KEY_EQUIPA_JOGADOR, ORMConstants.KEY_JOGADOR_EQUIPA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Jogo(java.util.Set value) {
		this.ORM_jogo = value;
	}
	
	private java.util.Set getORM_Jogo() {
		return ORM_jogo;
	}
	
	@Transient	
	public final JogoSetCollection jogo = new JogoSetCollection(this, _ormAdapter, ORMConstants.KEY_EQUIPA_JOGO, ORMConstants.KEY_JOGO_EQUIPACASA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Jogo1(java.util.Set value) {
		this.ORM_jogo1 = value;
	}
	
	private java.util.Set getORM_Jogo1() {
		return ORM_jogo1;
	}
	
	@Transient	
	public final JogoSetCollection jogo1 = new JogoSetCollection(this, _ormAdapter, ORMConstants.KEY_EQUIPA_JOGO1, ORMConstants.KEY_JOGO_EQUIPAFORA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Jogo2(java.util.Set value) {
		this.ORM_jogo2 = value;
	}
	
	private java.util.Set getORM_Jogo2() {
		return ORM_jogo2;
	}
	
	@Transient	
	public final JogoSetCollection jogo2 = new JogoSetCollection(this, _ormAdapter, ORMConstants.KEY_EQUIPA_JOGO2, ORMConstants.KEY_JOGO_VENCEDOR, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Partcipantetorneio(java.util.Set value) {
		this.ORM_partcipantetorneio = value;
	}
	
	private java.util.Set getORM_Partcipantetorneio() {
		return ORM_partcipantetorneio;
	}
	
	@Transient	
	public final PartcipantetorneioSetCollection partcipantetorneio = new PartcipantetorneioSetCollection(this, _ormAdapter, ORMConstants.KEY_EQUIPA_PARTCIPANTETORNEIO, ORMConstants.KEY_PARTCIPANTETORNEIO_EQUIPA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	private void setORM_Participantecampeonato(java.util.Set value) {
		this.ORM_participantecampeonato = value;
	}
	
	private java.util.Set getORM_Participantecampeonato() {
		return ORM_participantecampeonato;
	}
	
	@Transient	
	public final ParticipantecampeonatoSetCollection participantecampeonato = new ParticipantecampeonatoSetCollection(this, _ormAdapter, ORMConstants.KEY_EQUIPA_PARTICIPANTECAMPEONATO, ORMConstants.KEY_PARTICIPANTECAMPEONATO_EQUIPA, ORMConstants.KEY_MUL_ONE_TO_MANY);
	
	public String toString() {
		return String.valueOf(getID());
	}
	
}
