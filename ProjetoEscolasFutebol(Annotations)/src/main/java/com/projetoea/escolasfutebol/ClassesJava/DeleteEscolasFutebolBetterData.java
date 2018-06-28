package com.projetoea.escolasfutebol.classesjava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class DeleteEscolasFutebolBetterData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = EscolasFutebolBetterPersistentManager.instance().getSession().beginTransaction();
		try {
			Campo campo = CampoDAO.loadCampoByQuery(null, null);
			// Delete the persistent object
			CampoDAO.delete(campo);
			Escolas escolas = EscolasDAO.loadEscolasByQuery(null, null);
			// Delete the persistent object
			EscolasDAO.delete(escolas);
			Equipa equipa = EquipaDAO.loadEquipaByQuery(null, null);
			// Delete the persistent object
			EquipaDAO.delete(equipa);
			Jogador jogador = JogadorDAO.loadJogadorByQuery(null, null);
			// Delete the persistent object
			JogadorDAO.delete(jogador);
			Campeonato campeonato = CampeonatoDAO.loadCampeonatoByQuery(null, null);
			// Delete the persistent object
			CampeonatoDAO.delete(campeonato);
			Jogo jogo = JogoDAO.loadJogoByQuery(null, null);
			// Delete the persistent object
			JogoDAO.delete(jogo);
			Arbitro arbitro = ArbitroDAO.loadArbitroByQuery(null, null);
			// Delete the persistent object
			ArbitroDAO.delete(arbitro);
			Tipoeventojogo tipoeventojogo = TipoeventojogoDAO.loadTipoeventojogoByQuery(null, null);
			// Delete the persistent object
			TipoeventojogoDAO.delete(tipoeventojogo);
			Utilizador utilizador = UtilizadorDAO.loadUtilizadorByQuery(null, null);
			// Delete the persistent object
			UtilizadorDAO.delete(utilizador);
			Eventojogo eventojogo = EventojogoDAO.loadEventojogoByQuery(null, null);
			// Delete the persistent object
			EventojogoDAO.delete(eventojogo);
			Associacao associacao = AssociacaoDAO.loadAssociacaoByQuery(null, null);
			// Delete the persistent object
			AssociacaoDAO.delete(associacao);
			Torneio torneio = TorneioDAO.loadTorneioByQuery(null, null);
			// Delete the persistent object
			TorneioDAO.delete(torneio);
			Fase fase = FaseDAO.loadFaseByQuery(null, null);
			// Delete the persistent object
			FaseDAO.delete(fase);
			Rondatorneio rondatorneio = RondatorneioDAO.loadRondatorneioByQuery(null, null);
			// Delete the persistent object
			RondatorneioDAO.delete(rondatorneio);
			Rondacampeonato rondacampeonato = RondacampeonatoDAO.loadRondacampeonatoByQuery(null, null);
			// Delete the persistent object
			RondacampeonatoDAO.delete(rondacampeonato);
			Partcipantetorneio partcipantetorneio = PartcipantetorneioDAO.loadPartcipantetorneioByQuery(null, null);
			// Delete the persistent object
			PartcipantetorneioDAO.delete(partcipantetorneio);
			Grupo grupo = GrupoDAO.loadGrupoByQuery(null, null);
			// Delete the persistent object
			GrupoDAO.delete(grupo);
			Participantecampeonato participantecampeonato = ParticipantecampeonatoDAO.loadParticipantecampeonatoByQuery(null, null);
			// Delete the persistent object
			ParticipantecampeonatoDAO.delete(participantecampeonato);
			Tipoutilizador tipoutilizador = TipoutilizadorDAO.loadTipoutilizadorByQuery(null, null);
			// Delete the persistent object
			TipoutilizadorDAO.delete(tipoutilizador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEscolasFutebolBetterData deleteEscolasFutebolBetterData = new DeleteEscolasFutebolBetterData();
			try {
				deleteEscolasFutebolBetterData.deleteTestData();
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
