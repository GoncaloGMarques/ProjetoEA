package com.projetoea.escolasfutebol.ClassesJava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class ListEscolasFutebolBetterData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Campo...");
		Campo[] campos = CampoDAO.listCampoByQuery(null, null);
		int length = Math.min(campos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(campos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Escolas...");
		Escolas[] escolases = EscolasDAO.listEscolasByQuery(null, null);
		length = Math.min(escolases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(escolases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Equipa...");
		Equipa[] equipas = EquipaDAO.listEquipaByQuery(null, null);
		length = Math.min(equipas.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(equipas[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Jogador...");
		Jogador[] jogadors = JogadorDAO.listJogadorByQuery(null, null);
		length = Math.min(jogadors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(jogadors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Campeonato...");
		Campeonato[] campeonatos = CampeonatoDAO.listCampeonatoByQuery(null, null);
		length = Math.min(campeonatos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(campeonatos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Jogo...");
		Jogo[] jogos = JogoDAO.listJogoByQuery(null, null);
		length = Math.min(jogos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(jogos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Arbitro...");
		Arbitro[] arbitros = ArbitroDAO.listArbitroByQuery(null, null);
		length = Math.min(arbitros.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(arbitros[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tipoeventojogo...");
		Tipoeventojogo[] tipoeventojogos = TipoeventojogoDAO.listTipoeventojogoByQuery(null, null);
		length = Math.min(tipoeventojogos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tipoeventojogos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Utilizador...");
		Utilizador[] utilizadors = UtilizadorDAO.listUtilizadorByQuery(null, null);
		length = Math.min(utilizadors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(utilizadors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Eventojogo...");
		Eventojogo[] eventojogos = EventojogoDAO.listEventojogoByQuery(null, null);
		length = Math.min(eventojogos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eventojogos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Associacao...");
		Associacao[] associacaos = AssociacaoDAO.listAssociacaoByQuery(null, null);
		length = Math.min(associacaos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(associacaos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Torneio...");
		Torneio[] torneios = TorneioDAO.listTorneioByQuery(null, null);
		length = Math.min(torneios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(torneios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Fase...");
		Fase[] fases = FaseDAO.listFaseByQuery(null, null);
		length = Math.min(fases.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(fases[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Rondatorneio...");
		Rondatorneio[] rondatorneios = RondatorneioDAO.listRondatorneioByQuery(null, null);
		length = Math.min(rondatorneios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(rondatorneios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Rondacampeonato...");
		Rondacampeonato[] rondacampeonatos = RondacampeonatoDAO.listRondacampeonatoByQuery(null, null);
		length = Math.min(rondacampeonatos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(rondacampeonatos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Partcipantetorneio...");
		Partcipantetorneio[] partcipantetorneios = PartcipantetorneioDAO.listPartcipantetorneioByQuery(null, null);
		length = Math.min(partcipantetorneios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(partcipantetorneios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Grupo...");
		Grupo[] grupos = GrupoDAO.listGrupoByQuery(null, null);
		length = Math.min(grupos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(grupos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Participantecampeonato...");
		Participantecampeonato[] participantecampeonatos = ParticipantecampeonatoDAO.listParticipantecampeonatoByQuery(null, null);
		length = Math.min(participantecampeonatos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(participantecampeonatos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Tipoutilizador...");
		Tipoutilizador[] tipoutilizadors = TipoutilizadorDAO.listTipoutilizadorByQuery(null, null);
		length = Math.min(tipoutilizadors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tipoutilizadors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public void listByCriteria() throws PersistentException {
		System.out.println("Listing Campo by Criteria...");
		CampoCriteria campoCriteria = new CampoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//campoCriteria.ID.eq();
		campoCriteria.setMaxResults(ROW_COUNT);
		Campo[] campos = campoCriteria.listCampo();
		int length =campos== null ? 0 : Math.min(campos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(campos[i]);
		}
		System.out.println(length + " Campo record(s) retrieved."); 
		
		System.out.println("Listing Escolas by Criteria...");
		EscolasCriteria escolasCriteria = new EscolasCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//escolasCriteria.ID.eq();
		escolasCriteria.setMaxResults(ROW_COUNT);
		Escolas[] escolases = escolasCriteria.listEscolas();
		length =escolases== null ? 0 : Math.min(escolases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(escolases[i]);
		}
		System.out.println(length + " Escolas record(s) retrieved."); 
		
		System.out.println("Listing Equipa by Criteria...");
		EquipaCriteria equipaCriteria = new EquipaCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//equipaCriteria.ID.eq();
		equipaCriteria.setMaxResults(ROW_COUNT);
		Equipa[] equipas = equipaCriteria.listEquipa();
		length =equipas== null ? 0 : Math.min(equipas.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(equipas[i]);
		}
		System.out.println(length + " Equipa record(s) retrieved."); 
		
		System.out.println("Listing Jogador by Criteria...");
		JogadorCriteria jogadorCriteria = new JogadorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//jogadorCriteria.ID.eq();
		jogadorCriteria.setMaxResults(ROW_COUNT);
		Jogador[] jogadors = jogadorCriteria.listJogador();
		length =jogadors== null ? 0 : Math.min(jogadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(jogadors[i]);
		}
		System.out.println(length + " Jogador record(s) retrieved."); 
		
		System.out.println("Listing Campeonato by Criteria...");
		CampeonatoCriteria campeonatoCriteria = new CampeonatoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//campeonatoCriteria.ID.eq();
		campeonatoCriteria.setMaxResults(ROW_COUNT);
		Campeonato[] campeonatos = campeonatoCriteria.listCampeonato();
		length =campeonatos== null ? 0 : Math.min(campeonatos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(campeonatos[i]);
		}
		System.out.println(length + " Campeonato record(s) retrieved."); 
		
		System.out.println("Listing Jogo by Criteria...");
		JogoCriteria jogoCriteria = new JogoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//jogoCriteria.ID.eq();
		jogoCriteria.setMaxResults(ROW_COUNT);
		Jogo[] jogos = jogoCriteria.listJogo();
		length =jogos== null ? 0 : Math.min(jogos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(jogos[i]);
		}
		System.out.println(length + " Jogo record(s) retrieved."); 
		
		System.out.println("Listing Arbitro by Criteria...");
		ArbitroCriteria arbitroCriteria = new ArbitroCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//arbitroCriteria.ID.eq();
		arbitroCriteria.setMaxResults(ROW_COUNT);
		Arbitro[] arbitros = arbitroCriteria.listArbitro();
		length =arbitros== null ? 0 : Math.min(arbitros.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(arbitros[i]);
		}
		System.out.println(length + " Arbitro record(s) retrieved."); 
		
		System.out.println("Listing Tipoeventojogo by Criteria...");
		TipoeventojogoCriteria tipoeventojogoCriteria = new TipoeventojogoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tipoeventojogoCriteria.ID.eq();
		tipoeventojogoCriteria.setMaxResults(ROW_COUNT);
		Tipoeventojogo[] tipoeventojogos = tipoeventojogoCriteria.listTipoeventojogo();
		length =tipoeventojogos== null ? 0 : Math.min(tipoeventojogos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tipoeventojogos[i]);
		}
		System.out.println(length + " Tipoeventojogo record(s) retrieved."); 
		
		System.out.println("Listing Utilizador by Criteria...");
		UtilizadorCriteria utilizadorCriteria = new UtilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//utilizadorCriteria.ID.eq();
		utilizadorCriteria.setMaxResults(ROW_COUNT);
		Utilizador[] utilizadors = utilizadorCriteria.listUtilizador();
		length =utilizadors== null ? 0 : Math.min(utilizadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(utilizadors[i]);
		}
		System.out.println(length + " Utilizador record(s) retrieved."); 
		
		System.out.println("Listing Eventojogo by Criteria...");
		EventojogoCriteria eventojogoCriteria = new EventojogoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//eventojogoCriteria.ID.eq();
		//JogoCriteria eventojogoCriteria_Jogo = eventojogoCriteria.createJogoCriteria();
		//eventojogoCriteria_Jogo.ID.eq();
		//TipoeventojogoCriteria eventojogoCriteria_Tipoeventojogo = eventojogoCriteria.createTipoeventojogoCriteria();
		//eventojogoCriteria_Tipoeventojogo.ID.eq();
		eventojogoCriteria.setMaxResults(ROW_COUNT);
		Eventojogo[] eventojogos = eventojogoCriteria.listEventojogo();
		length =eventojogos== null ? 0 : Math.min(eventojogos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(eventojogos[i]);
		}
		System.out.println(length + " Eventojogo record(s) retrieved."); 
		
		System.out.println("Listing Associacao by Criteria...");
		AssociacaoCriteria associacaoCriteria = new AssociacaoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//associacaoCriteria.ID.eq();
		associacaoCriteria.setMaxResults(ROW_COUNT);
		Associacao[] associacaos = associacaoCriteria.listAssociacao();
		length =associacaos== null ? 0 : Math.min(associacaos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(associacaos[i]);
		}
		System.out.println(length + " Associacao record(s) retrieved."); 
		
		System.out.println("Listing Torneio by Criteria...");
		TorneioCriteria torneioCriteria = new TorneioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//torneioCriteria.ID.eq();
		torneioCriteria.setMaxResults(ROW_COUNT);
		Torneio[] torneios = torneioCriteria.listTorneio();
		length =torneios== null ? 0 : Math.min(torneios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(torneios[i]);
		}
		System.out.println(length + " Torneio record(s) retrieved."); 
		
		System.out.println("Listing Fase by Criteria...");
		FaseCriteria faseCriteria = new FaseCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//faseCriteria.ID.eq();
		faseCriteria.setMaxResults(ROW_COUNT);
		Fase[] fases = faseCriteria.listFase();
		length =fases== null ? 0 : Math.min(fases.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(fases[i]);
		}
		System.out.println(length + " Fase record(s) retrieved."); 
		
		System.out.println("Listing Rondatorneio by Criteria...");
		RondatorneioCriteria rondatorneioCriteria = new RondatorneioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//rondatorneioCriteria.ID.eq();
		rondatorneioCriteria.setMaxResults(ROW_COUNT);
		Rondatorneio[] rondatorneios = rondatorneioCriteria.listRondatorneio();
		length =rondatorneios== null ? 0 : Math.min(rondatorneios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(rondatorneios[i]);
		}
		System.out.println(length + " Rondatorneio record(s) retrieved."); 
		
		System.out.println("Listing Rondacampeonato by Criteria...");
		RondacampeonatoCriteria rondacampeonatoCriteria = new RondacampeonatoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//rondacampeonatoCriteria.ID.eq();
		rondacampeonatoCriteria.setMaxResults(ROW_COUNT);
		Rondacampeonato[] rondacampeonatos = rondacampeonatoCriteria.listRondacampeonato();
		length =rondacampeonatos== null ? 0 : Math.min(rondacampeonatos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(rondacampeonatos[i]);
		}
		System.out.println(length + " Rondacampeonato record(s) retrieved."); 
		
		System.out.println("Listing Partcipantetorneio by Criteria...");
		PartcipantetorneioCriteria partcipantetorneioCriteria = new PartcipantetorneioCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//partcipantetorneioCriteria.ID.eq();
		partcipantetorneioCriteria.setMaxResults(ROW_COUNT);
		Partcipantetorneio[] partcipantetorneios = partcipantetorneioCriteria.listPartcipantetorneio();
		length =partcipantetorneios== null ? 0 : Math.min(partcipantetorneios.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(partcipantetorneios[i]);
		}
		System.out.println(length + " Partcipantetorneio record(s) retrieved."); 
		
		System.out.println("Listing Grupo by Criteria...");
		GrupoCriteria grupoCriteria = new GrupoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//grupoCriteria.ID.eq();
		grupoCriteria.setMaxResults(ROW_COUNT);
		Grupo[] grupos = grupoCriteria.listGrupo();
		length =grupos== null ? 0 : Math.min(grupos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(grupos[i]);
		}
		System.out.println(length + " Grupo record(s) retrieved."); 
		
		System.out.println("Listing Participantecampeonato by Criteria...");
		ParticipantecampeonatoCriteria participantecampeonatoCriteria = new ParticipantecampeonatoCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//participantecampeonatoCriteria.ID.eq();
		participantecampeonatoCriteria.setMaxResults(ROW_COUNT);
		Participantecampeonato[] participantecampeonatos = participantecampeonatoCriteria.listParticipantecampeonato();
		length =participantecampeonatos== null ? 0 : Math.min(participantecampeonatos.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(participantecampeonatos[i]);
		}
		System.out.println(length + " Participantecampeonato record(s) retrieved."); 
		
		System.out.println("Listing Tipoutilizador by Criteria...");
		TipoutilizadorCriteria tipoutilizadorCriteria = new TipoutilizadorCriteria();
		// Please uncomment the follow line and fill in parameter(s) 
		//tipoutilizadorCriteria.ID.eq();
		tipoutilizadorCriteria.setMaxResults(ROW_COUNT);
		Tipoutilizador[] tipoutilizadors = tipoutilizadorCriteria.listTipoutilizador();
		length =tipoutilizadors== null ? 0 : Math.min(tipoutilizadors.length, ROW_COUNT); 
		for (int i = 0; i < length; i++) {
			 System.out.println(tipoutilizadors[i]);
		}
		System.out.println(length + " Tipoutilizador record(s) retrieved."); 
		
	}
	
	public static void main(String[] args) {
		try {
			ListEscolasFutebolBetterData listEscolasFutebolBetterData = new ListEscolasFutebolBetterData();
			try {
				listEscolasFutebolBetterData.listTestData();
				//listEscolasFutebolBetterData.listByCriteria();
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
