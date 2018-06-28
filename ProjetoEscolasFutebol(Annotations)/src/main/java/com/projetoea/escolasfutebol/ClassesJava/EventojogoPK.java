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
@Embeddable
public class EventojogoPK implements Serializable {
	public boolean equals(Object aObj) {
		if (aObj == this)
			return true;
		if (!(aObj instanceof EventojogoPK))
			return false;
		EventojogoPK eventojogopk = (EventojogoPK)aObj;
		if (getID() != eventojogopk.getID())
			return false;
		if (getJogo() == null) {
			if (eventojogopk.getJogo() != null)
				return false;
		}
		else if (!getJogo().equals(eventojogopk.getJogo()))
			return false;
		if (getTipoeventojogo() == null) {
			if (eventojogopk.getTipoeventojogo() != null)
				return false;
		}
		else if (!getTipoeventojogo().equals(eventojogopk.getTipoeventojogo()))
			return false;
		return true;
	}
	
	public int hashCode() {
		int hashcode = 0;
		hashcode = hashcode + (int) getID();
		if (getJogo() != null) {
			hashcode = hashcode + (int) getJogo().getORMID();
		}
		if (getTipoeventojogo() != null) {
			hashcode = hashcode + (int) getTipoeventojogo().getORMID();
		}
		return hashcode;
	}
	
	@Column(name="ID", nullable=false, length=10)	
	private int ID;
	
	public void setID(int value)  {
		this.ID =  value;
	}
	
	public int getID()  {
		return this.ID;
	}
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Jogo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="jogoID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Jogo jogo;
	
	public void setJogo(com.projetoea.escolasfutebol.classesjava.Jogo value)  {
		this.jogo =  value;
	}
	
	public com.projetoea.escolasfutebol.classesjava.Jogo getJogo()  {
		return this.jogo;
	}
	
	@ManyToOne(targetEntity=com.projetoea.escolasfutebol.classesjava.Tipoeventojogo.class, fetch=FetchType.LAZY)	
	@org.hibernate.annotations.Cascade({org.hibernate.annotations.CascadeType.LOCK})	
	@JoinColumns({ @JoinColumn(name="tipoeventojogoID", referencedColumnName="ID", nullable=false) })	
	private com.projetoea.escolasfutebol.classesjava.Tipoeventojogo tipoeventojogo;
	
	public void setTipoeventojogo(com.projetoea.escolasfutebol.classesjava.Tipoeventojogo value)  {
		this.tipoeventojogo =  value;
	}
	
	public com.projetoea.escolasfutebol.classesjava.Tipoeventojogo getTipoeventojogo()  {
		return this.tipoeventojogo;
	}
	
}
