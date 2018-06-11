package com.projetoea.escolasfutebol.ClassesJava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class DeleteEscolasFutebolData {
	public void deleteTestData() throws PersistentException {
		PersistentTransaction t = EscolasFutebolPersistentManager.instance().getSession().beginTransaction();
		try {
			Escolas escolas = EscolasDAO.loadEscolasByQuery(null, null);
			// Delete the persistent object
			EscolasDAO.delete(escolas);
			Equipa equipa = EquipaDAO.loadEquipaByQuery(null, null);
			// Delete the persistent object
			EquipaDAO.delete(equipa);
			Jogador jogador = JogadorDAO.loadJogadorByQuery(null, null);
			// Delete the persistent object
			JogadorDAO.delete(jogador);
			Torneio torneio = TorneioDAO.loadTorneioByQuery(null, null);
			// Delete the persistent object
			TorneioDAO.delete(torneio);
			Jogo jogo = JogoDAO.loadJogoByQuery(null, null);
			// Delete the persistent object
			JogoDAO.delete(jogo);
			EventoJogo eventoJogo = EventoJogoDAO.loadEventoJogoByQuery(null, null);
			// Delete the persistent object
			EventoJogoDAO.delete(eventoJogo);
			Campo campo = CampoDAO.loadCampoByQuery(null, null);
			// Delete the persistent object
			CampoDAO.delete(campo);
			Campeonato campeonato = CampeonatoDAO.loadCampeonatoByQuery(null, null);
			// Delete the persistent object
			CampeonatoDAO.delete(campeonato);
			Arbitro arbitro = ArbitroDAO.loadArbitroByQuery(null, null);
			// Delete the persistent object
			ArbitroDAO.delete(arbitro);
			TipoEventoJogo tipoEventoJogo = TipoEventoJogoDAO.loadTipoEventoJogoByQuery(null, null);
			// Delete the persistent object
			TipoEventoJogoDAO.delete(tipoEventoJogo);
			Utilizador utilizador = UtilizadorDAO.loadUtilizadorByQuery(null, null);
			// Delete the persistent object
			UtilizadorDAO.delete(utilizador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			DeleteEscolasFutebolData deleteEscolasFutebolData = new DeleteEscolasFutebolData();
			try {
				deleteEscolasFutebolData.deleteTestData();
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
