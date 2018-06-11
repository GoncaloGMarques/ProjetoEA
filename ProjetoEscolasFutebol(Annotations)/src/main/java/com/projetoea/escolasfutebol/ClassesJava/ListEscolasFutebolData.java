package com.projetoea.escolasfutebol.ClassesJava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.*;
public class ListEscolasFutebolData {
	private static final int ROW_COUNT = 100;
	
	public void listTestData() throws PersistentException {
		System.out.println("Listing Escolas...");
		Escolas[] escolases = EscolasDAO.listEscolasByQuery(null, null);
		int length = Math.min(escolases.length, ROW_COUNT);
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
		
		System.out.println("Listing Torneio...");
		Torneio[] torneios = TorneioDAO.listTorneioByQuery(null, null);
		length = Math.min(torneios.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(torneios[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Jogo...");
		Jogo[] jogos = JogoDAO.listJogoByQuery(null, null);
		length = Math.min(jogos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(jogos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing EventoJogo...");
		EventoJogo[] eventoJogos = EventoJogoDAO.listEventoJogoByQuery(null, null);
		length = Math.min(eventoJogos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(eventoJogos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Campo...");
		Campo[] campos = CampoDAO.listCampoByQuery(null, null);
		length = Math.min(campos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(campos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Campeonato...");
		Campeonato[] campeonatos = CampeonatoDAO.listCampeonatoByQuery(null, null);
		length = Math.min(campeonatos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(campeonatos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Arbitro...");
		Arbitro[] arbitros = ArbitroDAO.listArbitroByQuery(null, null);
		length = Math.min(arbitros.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(arbitros[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing TipoEventoJogo...");
		TipoEventoJogo[] tipoEventoJogos = TipoEventoJogoDAO.listTipoEventoJogoByQuery(null, null);
		length = Math.min(tipoEventoJogos.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(tipoEventoJogos[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
		System.out.println("Listing Utilizador...");
		Utilizador[] utilizadors = UtilizadorDAO.listUtilizadorByQuery(null, null);
		length = Math.min(utilizadors.length, ROW_COUNT);
		for (int i = 0; i < length; i++) {
			System.out.println(utilizadors[i]);
		}
		System.out.println(length + " record(s) retrieved.");
		
	}
	
	public static void main(String[] args) {
		try {
			ListEscolasFutebolData listEscolasFutebolData = new ListEscolasFutebolData();
			try {
				listEscolasFutebolData.listTestData();
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
