package com.projetoea.escolasfutebol.ClassesJava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class CreateEscolasFutebolData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = EscolasFutebolPersistentManager.instance().getSession().beginTransaction();
		try {
			Escolas escolas = EscolasDAO.createEscolas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : equipas
			EscolasDAO.save(escolas);
			Equipa equipa = EquipaDAO.createEquipa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : campeonato, torneios, jogadores, escalao, pontos, campo, escola
			EquipaDAO.save(equipa);
			Jogador jogador = JogadorDAO.createJogador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : Golos, NCartoesAmarelos, NCartoesVermelhos, idade, name, equipa
			JogadorDAO.save(jogador);
			Torneio torneio = TorneioDAO.createTorneio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : equipas
			TorneioDAO.save(torneio);
			Jogo jogo = JogoDAO.createJogo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eventos, VencedorID, ResultadoVisitante, ResultadoVisitado, campeonato, arbitro
			JogoDAO.save(jogo);
			EventoJogo eventoJogo = EventoJogoDAO.createEventoJogo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : minuto, jogo, TipoDeEvento
			EventoJogoDAO.save(eventoJogo);
			Campo campo = CampoDAO.createCampo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : equipas
			CampoDAO.save(campo);
			Campeonato campeonato = CampeonatoDAO.createCampeonato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : jogos, equipa
			CampeonatoDAO.save(campeonato);
			Arbitro arbitro = ArbitroDAO.createArbitro();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : jogos
			ArbitroDAO.save(arbitro);
			TipoEventoJogo tipoEventoJogo = TipoEventoJogoDAO.createTipoEventoJogo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : EventoJogo
			TipoEventoJogoDAO.save(tipoEventoJogo);
			Utilizador utilizador = UtilizadorDAO.createUtilizador();
			// Initialize the properties of the persistent object here
			UtilizadorDAO.save(utilizador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEscolasFutebolData createEscolasFutebolData = new CreateEscolasFutebolData();
			try {
				createEscolasFutebolData.createTestData();
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
