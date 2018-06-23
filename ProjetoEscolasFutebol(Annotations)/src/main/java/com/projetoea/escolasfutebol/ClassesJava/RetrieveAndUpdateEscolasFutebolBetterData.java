package com.projetoea.escolasfutebol.ClassesJava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class RetrieveAndUpdateEscolasFutebolBetterData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = EscolasFutebolBetterPersistentManager.instance().getSession().beginTransaction();
		try {
			Campo campo = CampoDAO.loadCampoByQuery(null, null);
			// Update the properties of the persistent object
			CampoDAO.save(campo);
			Escolas escolas = EscolasDAO.loadEscolasByQuery(null, null);
			// Update the properties of the persistent object
			EscolasDAO.save(escolas);
			Equipa equipa = EquipaDAO.loadEquipaByQuery(null, null);
			// Update the properties of the persistent object
			EquipaDAO.save(equipa);
			Jogador jogador = JogadorDAO.loadJogadorByQuery(null, null);
			// Update the properties of the persistent object
			JogadorDAO.save(jogador);
			Campeonato campeonato = CampeonatoDAO.loadCampeonatoByQuery(null, null);
			// Update the properties of the persistent object
			CampeonatoDAO.save(campeonato);
			Jogo jogo = JogoDAO.loadJogoByQuery(null, null);
			// Update the properties of the persistent object
			JogoDAO.save(jogo);
			Arbitro arbitro = ArbitroDAO.loadArbitroByQuery(null, null);
			// Update the properties of the persistent object
			ArbitroDAO.save(arbitro);
			Tipoeventojogo tipoeventojogo = TipoeventojogoDAO.loadTipoeventojogoByQuery(null, null);
			// Update the properties of the persistent object
			TipoeventojogoDAO.save(tipoeventojogo);
			Utilizador utilizador = UtilizadorDAO.loadUtilizadorByQuery(null, null);
			// Update the properties of the persistent object
			UtilizadorDAO.save(utilizador);
			Eventojogo eventojogo = EventojogoDAO.loadEventojogoByQuery(null, null);
			// Update the properties of the persistent object
			EventojogoDAO.save(eventojogo);
			Associacao associacao = AssociacaoDAO.loadAssociacaoByQuery(null, null);
			// Update the properties of the persistent object
			AssociacaoDAO.save(associacao);
			Torneio torneio = TorneioDAO.loadTorneioByQuery(null, null);
			// Update the properties of the persistent object
			TorneioDAO.save(torneio);
			Fase fase = FaseDAO.loadFaseByQuery(null, null);
			// Update the properties of the persistent object
			FaseDAO.save(fase);
			Rondatorneio rondatorneio = RondatorneioDAO.loadRondatorneioByQuery(null, null);
			// Update the properties of the persistent object
			RondatorneioDAO.save(rondatorneio);
			Rondacampeonato rondacampeonato = RondacampeonatoDAO.loadRondacampeonatoByQuery(null, null);
			// Update the properties of the persistent object
			RondacampeonatoDAO.save(rondacampeonato);
			Partcipantetorneio partcipantetorneio = PartcipantetorneioDAO.loadPartcipantetorneioByQuery(null, null);
			// Update the properties of the persistent object
			PartcipantetorneioDAO.save(partcipantetorneio);
			Grupo grupo = GrupoDAO.loadGrupoByQuery(null, null);
			// Update the properties of the persistent object
			GrupoDAO.save(grupo);
			Participantecampeonato participantecampeonato = ParticipantecampeonatoDAO.loadParticipantecampeonatoByQuery(null, null);
			// Update the properties of the persistent object
			ParticipantecampeonatoDAO.save(participantecampeonato);
			Tipoutilizador tipoutilizador = TipoutilizadorDAO.loadTipoutilizadorByQuery(null, null);
			// Update the properties of the persistent object
			TipoutilizadorDAO.save(tipoutilizador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public void retrieveByCriteria() throws PersistentException {
		System.out.println("Retrieving Campo by CampoCriteria");
		CampoCriteria campoCriteria = new CampoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//campoCriteria.ID.eq();
		System.out.println(campoCriteria.uniqueCampo());
		
		System.out.println("Retrieving Escolas by EscolasCriteria");
		EscolasCriteria escolasCriteria = new EscolasCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//escolasCriteria.ID.eq();
		System.out.println(escolasCriteria.uniqueEscolas());
		
		System.out.println("Retrieving Equipa by EquipaCriteria");
		EquipaCriteria equipaCriteria = new EquipaCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//equipaCriteria.ID.eq();
		System.out.println(equipaCriteria.uniqueEquipa());
		
		System.out.println("Retrieving Jogador by JogadorCriteria");
		JogadorCriteria jogadorCriteria = new JogadorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//jogadorCriteria.ID.eq();
		System.out.println(jogadorCriteria.uniqueJogador());
		
		System.out.println("Retrieving Campeonato by CampeonatoCriteria");
		CampeonatoCriteria campeonatoCriteria = new CampeonatoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//campeonatoCriteria.ID.eq();
		System.out.println(campeonatoCriteria.uniqueCampeonato());
		
		System.out.println("Retrieving Jogo by JogoCriteria");
		JogoCriteria jogoCriteria = new JogoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//jogoCriteria.ID.eq();
		System.out.println(jogoCriteria.uniqueJogo());
		
		System.out.println("Retrieving Arbitro by ArbitroCriteria");
		ArbitroCriteria arbitroCriteria = new ArbitroCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//arbitroCriteria.ID.eq();
		System.out.println(arbitroCriteria.uniqueArbitro());
		
		System.out.println("Retrieving Tipoeventojogo by TipoeventojogoCriteria");
		TipoeventojogoCriteria tipoeventojogoCriteria = new TipoeventojogoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tipoeventojogoCriteria.ID.eq();
		System.out.println(tipoeventojogoCriteria.uniqueTipoeventojogo());
		
		System.out.println("Retrieving Utilizador by UtilizadorCriteria");
		UtilizadorCriteria utilizadorCriteria = new UtilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//utilizadorCriteria.ID.eq();
		System.out.println(utilizadorCriteria.uniqueUtilizador());
		
		System.out.println("Retrieving Eventojogo by EventojogoCriteria");
		EventojogoCriteria eventojogoCriteria = new EventojogoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//eventojogoCriteria.ID.eq();
		//eventojogoCriteria.jogo.eq();
		//eventojogoCriteria.tipoeventojogo.eq();
		System.out.println(eventojogoCriteria.uniqueEventojogo());
		
		System.out.println("Retrieving Associacao by AssociacaoCriteria");
		AssociacaoCriteria associacaoCriteria = new AssociacaoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//associacaoCriteria.ID.eq();
		System.out.println(associacaoCriteria.uniqueAssociacao());
		
		System.out.println("Retrieving Torneio by TorneioCriteria");
		TorneioCriteria torneioCriteria = new TorneioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//torneioCriteria.ID.eq();
		System.out.println(torneioCriteria.uniqueTorneio());
		
		System.out.println("Retrieving Fase by FaseCriteria");
		FaseCriteria faseCriteria = new FaseCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//faseCriteria.ID.eq();
		System.out.println(faseCriteria.uniqueFase());
		
		System.out.println("Retrieving Rondatorneio by RondatorneioCriteria");
		RondatorneioCriteria rondatorneioCriteria = new RondatorneioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//rondatorneioCriteria.ID.eq();
		System.out.println(rondatorneioCriteria.uniqueRondatorneio());
		
		System.out.println("Retrieving Rondacampeonato by RondacampeonatoCriteria");
		RondacampeonatoCriteria rondacampeonatoCriteria = new RondacampeonatoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//rondacampeonatoCriteria.ID.eq();
		System.out.println(rondacampeonatoCriteria.uniqueRondacampeonato());
		
		System.out.println("Retrieving Partcipantetorneio by PartcipantetorneioCriteria");
		PartcipantetorneioCriteria partcipantetorneioCriteria = new PartcipantetorneioCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//partcipantetorneioCriteria.ID.eq();
		System.out.println(partcipantetorneioCriteria.uniquePartcipantetorneio());
		
		System.out.println("Retrieving Grupo by GrupoCriteria");
		GrupoCriteria grupoCriteria = new GrupoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//grupoCriteria.ID.eq();
		System.out.println(grupoCriteria.uniqueGrupo());
		
		System.out.println("Retrieving Participantecampeonato by ParticipantecampeonatoCriteria");
		ParticipantecampeonatoCriteria participantecampeonatoCriteria = new ParticipantecampeonatoCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//participantecampeonatoCriteria.ID.eq();
		System.out.println(participantecampeonatoCriteria.uniqueParticipantecampeonato());
		
		System.out.println("Retrieving Tipoutilizador by TipoutilizadorCriteria");
		TipoutilizadorCriteria tipoutilizadorCriteria = new TipoutilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s)
		//tipoutilizadorCriteria.ID.eq();
		System.out.println(tipoutilizadorCriteria.uniqueTipoutilizador());
		
	}
	
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateEscolasFutebolBetterData retrieveAndUpdateEscolasFutebolBetterData = new RetrieveAndUpdateEscolasFutebolBetterData();
			try {
				retrieveAndUpdateEscolasFutebolBetterData.retrieveAndUpdateTestData();
				//retrieveAndUpdateEscolasFutebolBetterData.retrieveByCriteria();
			}
			finally {
				EscolasFutebolBetterPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
