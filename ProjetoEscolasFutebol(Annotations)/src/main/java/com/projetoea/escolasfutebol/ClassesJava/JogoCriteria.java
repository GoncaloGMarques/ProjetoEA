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

import org.hibernate.Criteria;
import org.orm.PersistentException;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class JogoCriteria extends AbstractORMCriteria {
	public final IntegerExpression ID;
	public final TimestampExpression data;
	public final IntegerExpression arbitroId;
	public final AssociationExpression arbitro;
	public final IntegerExpression equipaCasaId;
	public final AssociationExpression equipaCasa;
	public final IntegerExpression equipaForaId;
	public final AssociationExpression equipaFora;
	public final IntegerExpression vencedorId;
	public final AssociationExpression vencedor;
	public final IntegerExpression golosEquipaCasa;
	public final IntegerExpression golosEquipaFora;
	public final IntegerExpression rondatorneioId;
	public final AssociationExpression rondatorneio;
	public final IntegerExpression campoId;
	public final AssociationExpression campo;
	public final IntegerExpression rondacampeonatoId;
	public final AssociationExpression rondacampeonato;
	public final CollectionExpression eventojogo;
	
	public JogoCriteria(Criteria criteria) {
		super(criteria);
		ID = new IntegerExpression("ID", this);
		data = new TimestampExpression("data", this);
		arbitroId = new IntegerExpression("arbitro.ID", this);
		arbitro = new AssociationExpression("arbitro", this);
		equipaCasaId = new IntegerExpression("equipaCasa.ID", this);
		equipaCasa = new AssociationExpression("equipaCasa", this);
		equipaForaId = new IntegerExpression("equipaFora.ID", this);
		equipaFora = new AssociationExpression("equipaFora", this);
		vencedorId = new IntegerExpression("vencedor.ID", this);
		vencedor = new AssociationExpression("vencedor", this);
		golosEquipaCasa = new IntegerExpression("golosEquipaCasa", this);
		golosEquipaFora = new IntegerExpression("golosEquipaFora", this);
		rondatorneioId = new IntegerExpression("rondatorneio.ID", this);
		rondatorneio = new AssociationExpression("rondatorneio", this);
		campoId = new IntegerExpression("campo.ID", this);
		campo = new AssociationExpression("campo", this);
		rondacampeonatoId = new IntegerExpression("rondacampeonato.ID", this);
		rondacampeonato = new AssociationExpression("rondacampeonato", this);
		eventojogo = new CollectionExpression("ORM_eventojogo", this);
	}
	
	public JogoCriteria(PersistentSession session) {
		this(session.createCriteria(Jogo.class));
	}
	
	public JogoCriteria() throws PersistentException {
		this(com.projetoea.escolasfutebol.classesjava.EscolasFutebolBetterPersistentManager.instance().getSession());
	}
	
	public ArbitroCriteria createArbitroCriteria() {
		return new ArbitroCriteria(createCriteria("arbitro"));
	}
	
	public EquipaCriteria createEquipaCasaCriteria() {
		return new EquipaCriteria(createCriteria("equipaCasa"));
	}
	
	public EquipaCriteria createEquipaForaCriteria() {
		return new EquipaCriteria(createCriteria("equipaFora"));
	}
	
	public EquipaCriteria createVencedorCriteria() {
		return new EquipaCriteria(createCriteria("vencedor"));
	}
	
	public RondatorneioCriteria createRondatorneioCriteria() {
		return new RondatorneioCriteria(createCriteria("rondatorneio"));
	}
	
	public CampoCriteria createCampoCriteria() {
		return new CampoCriteria(createCriteria("campo"));
	}
	
	public RondacampeonatoCriteria createRondacampeonatoCriteria() {
		return new RondacampeonatoCriteria(createCriteria("rondacampeonato"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.EventojogoCriteria createEventojogoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.EventojogoCriteria(createCriteria("ORM_eventojogo"));
	}
	
	public Jogo uniqueJogo() {
		return (Jogo) super.uniqueResult();
	}
	
	public Jogo[] listJogo() {
		java.util.List list = super.list();
		return (Jogo[]) list.toArray(new Jogo[list.size()]);
	}
}

