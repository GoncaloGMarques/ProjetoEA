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

import java.util.List;
import org.hibernate.criterion.DetachedCriteria;
import org.orm.PersistentSession;
import org.orm.criteria.*;

public class JogoDetachedCriteria extends AbstractORMDetachedCriteria {
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
	
	public JogoDetachedCriteria() {
		super(com.projetoea.escolasfutebol.classesjava.Jogo.class, com.projetoea.escolasfutebol.classesjava.JogoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		data = new TimestampExpression("data", this.getDetachedCriteria());
		arbitroId = new IntegerExpression("arbitro.ID", this.getDetachedCriteria());
		arbitro = new AssociationExpression("arbitro", this.getDetachedCriteria());
		equipaCasaId = new IntegerExpression("equipaCasa.ID", this.getDetachedCriteria());
		equipaCasa = new AssociationExpression("equipaCasa", this.getDetachedCriteria());
		equipaForaId = new IntegerExpression("equipaFora.ID", this.getDetachedCriteria());
		equipaFora = new AssociationExpression("equipaFora", this.getDetachedCriteria());
		vencedorId = new IntegerExpression("vencedor.ID", this.getDetachedCriteria());
		vencedor = new AssociationExpression("vencedor", this.getDetachedCriteria());
		golosEquipaCasa = new IntegerExpression("golosEquipaCasa", this.getDetachedCriteria());
		golosEquipaFora = new IntegerExpression("golosEquipaFora", this.getDetachedCriteria());
		rondatorneioId = new IntegerExpression("rondatorneio.ID", this.getDetachedCriteria());
		rondatorneio = new AssociationExpression("rondatorneio", this.getDetachedCriteria());
		campoId = new IntegerExpression("campo.ID", this.getDetachedCriteria());
		campo = new AssociationExpression("campo", this.getDetachedCriteria());
		rondacampeonatoId = new IntegerExpression("rondacampeonato.ID", this.getDetachedCriteria());
		rondacampeonato = new AssociationExpression("rondacampeonato", this.getDetachedCriteria());
		eventojogo = new CollectionExpression("ORM_eventojogo", this.getDetachedCriteria());
	}
	
	public JogoDetachedCriteria(DetachedCriteria aDetachedCriteria) {
		super(aDetachedCriteria, com.projetoea.escolasfutebol.classesjava.JogoCriteria.class);
		ID = new IntegerExpression("ID", this.getDetachedCriteria());
		data = new TimestampExpression("data", this.getDetachedCriteria());
		arbitroId = new IntegerExpression("arbitro.ID", this.getDetachedCriteria());
		arbitro = new AssociationExpression("arbitro", this.getDetachedCriteria());
		equipaCasaId = new IntegerExpression("equipaCasa.ID", this.getDetachedCriteria());
		equipaCasa = new AssociationExpression("equipaCasa", this.getDetachedCriteria());
		equipaForaId = new IntegerExpression("equipaFora.ID", this.getDetachedCriteria());
		equipaFora = new AssociationExpression("equipaFora", this.getDetachedCriteria());
		vencedorId = new IntegerExpression("vencedor.ID", this.getDetachedCriteria());
		vencedor = new AssociationExpression("vencedor", this.getDetachedCriteria());
		golosEquipaCasa = new IntegerExpression("golosEquipaCasa", this.getDetachedCriteria());
		golosEquipaFora = new IntegerExpression("golosEquipaFora", this.getDetachedCriteria());
		rondatorneioId = new IntegerExpression("rondatorneio.ID", this.getDetachedCriteria());
		rondatorneio = new AssociationExpression("rondatorneio", this.getDetachedCriteria());
		campoId = new IntegerExpression("campo.ID", this.getDetachedCriteria());
		campo = new AssociationExpression("campo", this.getDetachedCriteria());
		rondacampeonatoId = new IntegerExpression("rondacampeonato.ID", this.getDetachedCriteria());
		rondacampeonato = new AssociationExpression("rondacampeonato", this.getDetachedCriteria());
		eventojogo = new CollectionExpression("ORM_eventojogo", this.getDetachedCriteria());
	}
	
	public ArbitroDetachedCriteria createArbitroCriteria() {
		return new ArbitroDetachedCriteria(createCriteria("arbitro"));
	}
	
	public EquipaDetachedCriteria createEquipaCasaCriteria() {
		return new EquipaDetachedCriteria(createCriteria("equipaCasa"));
	}
	
	public EquipaDetachedCriteria createEquipaForaCriteria() {
		return new EquipaDetachedCriteria(createCriteria("equipaFora"));
	}
	
	public EquipaDetachedCriteria createVencedorCriteria() {
		return new EquipaDetachedCriteria(createCriteria("vencedor"));
	}
	
	public RondatorneioDetachedCriteria createRondatorneioCriteria() {
		return new RondatorneioDetachedCriteria(createCriteria("rondatorneio"));
	}
	
	public CampoDetachedCriteria createCampoCriteria() {
		return new CampoDetachedCriteria(createCriteria("campo"));
	}
	
	public RondacampeonatoDetachedCriteria createRondacampeonatoCriteria() {
		return new RondacampeonatoDetachedCriteria(createCriteria("rondacampeonato"));
	}
	
	public com.projetoea.escolasfutebol.classesjava.EventojogoDetachedCriteria createEventojogoCriteria() {
		return new com.projetoea.escolasfutebol.classesjava.EventojogoDetachedCriteria(createCriteria("ORM_eventojogo"));
	}
	
	public Jogo uniqueJogo(PersistentSession session) {
		return (Jogo) super.createExecutableCriteria(session).uniqueResult();
	}
	
	public Jogo[] listJogo(PersistentSession session) {
		List list = super.createExecutableCriteria(session).list();
		return (Jogo[]) list.toArray(new Jogo[list.size()]);
	}
}

