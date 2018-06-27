package com.projetoea.escolasfutebol.ClassesJava; /**
 * Licensee: Gonçalo Marques(Universidade do Minho)
 * License Type: Academic
 */
import org.orm.PersistentException;
import org.orm.PersistentTransaction;

import java.util.Random;

public class CreateEscolasFutebolBetterData {
    public void createTestData() throws PersistentException {
        PersistentTransaction t = EscolasFutebolBetterPersistentManager.instance().getSession().beginTransaction();
        try {
            //region Inicializacao dos Campos
            Campo campo = CampoDAO.createCampo();
            campo.setNome("Estádio AXA");
            CampoDAO.save(campo);
            //endregion

            //region Inicializacao Tipo de Utilizador
            String[] tipos = new String[]{
                    "DiretorAssociacao",
                    "DiretorEscola",
                    "Arbitro"
            };

            Tipoutilizador tipoutilizadorDiretorAssociacao = TipoutilizadorDAO.createTipoutilizador();
            tipoutilizadorDiretorAssociacao.setNome("DiretorAssociacao");
            TipoutilizadorDAO.save(tipoutilizadorDiretorAssociacao);
            Tipoutilizador tipoutilizadorDiretorEscola = TipoutilizadorDAO.createTipoutilizador();
            tipoutilizadorDiretorEscola.setNome("DiretorEscola");
            TipoutilizadorDAO.save(tipoutilizadorDiretorEscola);
            Tipoutilizador tipoutilizadorArbitro = TipoutilizadorDAO.createTipoutilizador();
            tipoutilizadorArbitro.setNome("Arbitro");
            TipoutilizadorDAO.save(tipoutilizadorArbitro);
            //endregion

            //region Inicializacao Tipo de Eventos
            Tipoeventojogo tipoeventojogoGolo = TipoeventojogoDAO.createTipoeventojogo();
            tipoeventojogoGolo.setNome("Golo");
            TipoeventojogoDAO.save(tipoeventojogoGolo);

            String[] tiposEventos = new String[]{
                    "Amarelo",
                    "Vermelho",
                    "Penalidade",
                    "ForaDeJogo"
            };
            for (Object tipo : tiposEventos) {
                Tipoeventojogo tipoeventojogo = TipoeventojogoDAO.createTipoeventojogo();
                tipoeventojogo.setNome(tipo.toString());
                TipoeventojogoDAO.save(tipoeventojogo);
            }
            //endregion

            Utilizador DiretorAssociacao = UtilizadorDAO.createUtilizador();
            DiretorAssociacao.setNome("DiretorAssociacao");
            DiretorAssociacao.setEmail(StringGenerator());
            DiretorAssociacao.setTipoutilizador(tipoutilizadorDiretorAssociacao);
            DiretorAssociacao.setPassword("pass");
            UtilizadorDAO.save(DiretorAssociacao);

            Associacao associacao = AssociacaoDAO.createAssociacao();
            associacao.setDiretorAssociacao(DiretorAssociacao);
            AssociacaoDAO.save(associacao);

            Utilizador DiretorEscola = UtilizadorDAO.createUtilizador();
            DiretorEscola.setNome("DiretorEscola");
            DiretorEscola.setEmail(StringGenerator());
            DiretorEscola.setTipoutilizador(tipoutilizadorDiretorEscola);
            DiretorEscola.setPassword("pass");
            UtilizadorDAO.save(DiretorEscola);

            Escolas escolas = EscolasDAO.createEscolas();
            escolas.setDiretorEscola(DiretorEscola);
            escolas.setAssociacao(associacao);
            escolas.setNome(StringGenerator());
            EscolasDAO.save(escolas);

            Equipa equipaA = EquipaDAO.createEquipa();
            equipaA.setCampo(campo);
            equipaA.setEscolas(escolas);
            equipaA.setNome("Equipa da Vida");
            EquipaDAO.save(equipaA);

            Equipa equipaB = EquipaDAO.createEquipa();
            equipaB.setCampo(campo);
            equipaB.setEscolas(escolas);
            equipaB.setNome("Equipa da Morte");
            EquipaDAO.save(equipaB);

            Jogador jogador = JogadorDAO.createJogador();
            jogador.setEquipa(equipaA);
            JogadorDAO.save(jogador);

            Campeonato campeonato = CampeonatoDAO.createCampeonato();
            campeonato.setNome("Campeonato NOS");
            CampeonatoDAO.save(campeonato);

            Utilizador Arbitro = UtilizadorDAO.createUtilizador();
            Arbitro.setNome("Arbitro");
            Arbitro.setEmail(StringGenerator());
            Arbitro.setTipoutilizador(tipoutilizadorArbitro);
            Arbitro.setPassword("pass");
            UtilizadorDAO.save(Arbitro);

            Arbitro arbitro = ArbitroDAO.createArbitro();
            arbitro.setUtilizador(Arbitro);
            ArbitroDAO.save(arbitro);

            Jogo jogo = JogoDAO.createJogo();
            jogo.setArbitro(arbitro);
            jogo.setCampo(campo);
            jogo.setEquipaCasa(equipaA);
            jogo.setEquipaFora(equipaB);
            jogo.setVencedor(equipaA);
            JogoDAO.save(jogo);

            Eventojogo eventojogo = EventojogoDAO.createEventojogo();
            eventojogo.setJogo(jogo);
            eventojogo.setTipoeventojogo(tipoeventojogoGolo);
            EventojogoDAO.save(eventojogo);

            Torneio torneio = TorneioDAO.createTorneio();
            TorneioDAO.save(torneio);

            String[] tiposFase = new String[]{
                    "Grupos",
                    "16AvosFinal",
                    "8AvosFinal",
                    "4Final",
                    "MeiaFinal",
                    "Final"
            };
            Fase fase = FaseDAO.createFase();
            fase.setNomefase(0);
            FaseDAO.save(fase);
            int count = 1;
            for (String tipo: tiposFase)
            {
                Fase fase1 = FaseDAO.createFase();
                fase1.setNomefase(count);
                FaseDAO.save(fase1);
                count++;
            }

            Rondatorneio rondatorneio = RondatorneioDAO.createRondatorneio();
            rondatorneio.setFase(fase);
            RondatorneioDAO.save(rondatorneio);

            Rondacampeonato rondacampeonato = RondacampeonatoDAO.createRondacampeonato();
            rondacampeonato.setCampeonato(campeonato);
            RondacampeonatoDAO.save(rondacampeonato);

            Grupo grupo = GrupoDAO.createGrupo();
            grupo.setNome("A");
            grupo.setTorneio(torneio);
            GrupoDAO.save(grupo);

            Partcipantetorneio partcipantetorneio = PartcipantetorneioDAO.createPartcipantetorneio();
            partcipantetorneio.setEquipa(equipaA);
            partcipantetorneio.setGrupo(grupo);
            partcipantetorneio.setTorneio(torneio);
            PartcipantetorneioDAO.save(partcipantetorneio);

            Participantecampeonato participantecampeonato = ParticipantecampeonatoDAO.createParticipantecampeonato();
            participantecampeonato.setCampeonato(campeonato);
            participantecampeonato.setEquipa(equipaA);
            ParticipantecampeonatoDAO.save(participantecampeonato);
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

    public String StringGenerator() {
        int leftLimit = 97; // letter 'a'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();
        StringBuilder buffer = new StringBuilder(targetStringLength);
        for (int i = 0; i < targetStringLength; i++) {
            int randomLimitedInt = leftLimit + (int)
                    (random.nextFloat() * (rightLimit - leftLimit + 1));
            buffer.append((char) randomLimitedInt);
        }
        String generatedString = buffer.toString();

        return generatedString;
    }
}
