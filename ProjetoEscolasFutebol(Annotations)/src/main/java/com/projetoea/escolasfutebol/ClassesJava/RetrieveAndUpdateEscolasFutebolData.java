package com.projetoea.escolasfutebol.ClassesJava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class RetrieveAndUpdateEscolasFutebolData {
	public void retrieveAndUpdateTestData() throws PersistentException {
		PersistentTransaction t = EscolasFutebolPersistentManager.instance().getSession().beginTransaction();
		try {
			Escolas escolas = EscolasDAO.loadEscolasByQuery(null, null);
			// Update the properties of the persistent object
			EscolasDAO.save(escolas);
			Equipa equipa = EquipaDAO.loadEquipaByQuery(null, null);
			// Update the properties of the persistent object
			EquipaDAO.save(equipa);
			Jogador jogador = JogadorDAO.loadJogadorByQuery(null, null);
			// Update the properties of the persistent object
			JogadorDAO.save(jogador);
			Torneio torneio = TorneioDAO.loadTorneioByQuery(null, null);
			// Update the properties of the persistent object
			TorneioDAO.save(torneio);
			Jogo jogo = JogoDAO.loadJogoByQuery(null, null);
			// Update the properties of the persistent object
			JogoDAO.save(jogo);
			EventoJogo eventoJogo = EventoJogoDAO.loadEventoJogoByQuery(null, null);
			// Update the properties of the persistent object
			EventoJogoDAO.save(eventoJogo);
			Campo campo = CampoDAO.loadCampoByQuery(null, null);
			// Update the properties of the persistent object
			CampoDAO.save(campo);
			Campeonato campeonato = CampeonatoDAO.loadCampeonatoByQuery(null, null);
			// Update the properties of the persistent object
			CampeonatoDAO.save(campeonato);
			Arbitro arbitro = ArbitroDAO.loadArbitroByQuery(null, null);
			// Update the properties of the persistent object
			ArbitroDAO.save(arbitro);
			TipoEventoJogo tipoEventoJogo = TipoEventoJogoDAO.loadTipoEventoJogoByQuery(null, null);
			// Update the properties of the persistent object
			TipoEventoJogoDAO.save(tipoEventoJogo);
			Utilizador utilizador = UtilizadorDAO.loadUtilizadorByQuery(null, null);
			// Update the properties of the persistent object
			UtilizadorDAO.save(utilizador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			RetrieveAndUpdateEscolasFutebolData retrieveAndUpdateEscolasFutebolData = new RetrieveAndUpdateEscolasFutebolData();
			try {
				retrieveAndUpdateEscolasFutebolData.retrieveAndUpdateTestData();
			}
			finally {
				EscolasFutebolPersistentManager.instance().disposePersistentManager();
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
