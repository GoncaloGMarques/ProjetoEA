package com.projetoea.escolasfutebol.ClassesJava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class CreateEscolasFutebolBetterData {
	public void createTestData() throws PersistentException {
		PersistentTransaction t = EscolasFutebolBetterPersistentManager.instance().getSession().beginTransaction();
		try {
			Campo campo = CampoDAO.createCampo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : jogo, equipa
			CampoDAO.save(campo);
			Escolas escolas = EscolasDAO.createEscolas();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : equipa, diretorEscola, associacao, diretoescolaID
			EscolasDAO.save(escolas);
			Equipa equipa = EquipaDAO.createEquipa();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : participantecampeonato, partcipantetorneio, jogo2, jogo1, jogo, jogador, escolas, campo
			EquipaDAO.save(equipa);
			Jogador jogador = JogadorDAO.createJogador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : equipa
			JogadorDAO.save(jogador);
			Campeonato campeonato = CampeonatoDAO.createCampeonato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : rondacampeonato, participantecampeonato
			CampeonatoDAO.save(campeonato);
			Jogo jogo = JogoDAO.createJogo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eventojogo, campo, vencedor, equipaFora, equipaCasa, arbitro
			JogoDAO.save(jogo);
			Arbitro arbitro = ArbitroDAO.createArbitro();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : jogo, utilizador
			ArbitroDAO.save(arbitro);
			Tipoeventojogo tipoeventojogo = TipoeventojogoDAO.createTipoeventojogo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : eventojogo
			TipoeventojogoDAO.save(tipoeventojogo);
			Utilizador utilizador = UtilizadorDAO.createUtilizador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : associacao, escolas, arbitro, tipoutilizador
			UtilizadorDAO.save(utilizador);
			Eventojogo eventojogo = EventojogoDAO.createEventojogo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : minuto
			EventojogoDAO.save(eventojogo);
			Associacao associacao = AssociacaoDAO.createAssociacao();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : escolas, diretorAssociacao
			AssociacaoDAO.save(associacao);
			Torneio torneio = TorneioDAO.createTorneio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : grupo, partcipantetorneio
			TorneioDAO.save(torneio);
			Fase fase = FaseDAO.createFase();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : rondatorneio
			FaseDAO.save(fase);
			Rondatorneio rondatorneio = RondatorneioDAO.createRondatorneio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : fase
			RondatorneioDAO.save(rondatorneio);
			Rondacampeonato rondacampeonato = RondacampeonatoDAO.createRondacampeonato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : campeonato
			RondacampeonatoDAO.save(rondacampeonato);
			Partcipantetorneio partcipantetorneio = PartcipantetorneioDAO.createPartcipantetorneio();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : grupo, equipa, torneio
			PartcipantetorneioDAO.save(partcipantetorneio);
			Grupo grupo = GrupoDAO.createGrupo();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : partcipantetorneio, torneio
			GrupoDAO.save(grupo);
			Participantecampeonato participantecampeonato = ParticipantecampeonatoDAO.createParticipantecampeonato();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : equipa, campeonato
			ParticipantecampeonatoDAO.save(participantecampeonato);
			Tipoutilizador tipoutilizador = TipoutilizadorDAO.createTipoutilizador();
			// TODO Initialize the properties of the persistent object here, the following properties must be initialized before saving : utilizador
			TipoutilizadorDAO.save(tipoutilizador);
			t.commit();
		}
		catch (Exception e) {
			t.rollback();
		}
		
	}
	
	public static void main(String[] args) {
		try {
			CreateEscolasFutebolBetterData createEscolasFutebolBetterData = new CreateEscolasFutebolBetterData();
			try {
				createEscolasFutebolBetterData.createTestData();
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
