package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.DiretorEscolaBean;
import com.projetoea.escolasfutebol.EscolasfutebolApplication;
import com.projetoea.escolasfutebol.classesjava.*;
import com.vaadin.data.Binder;
import com.vaadin.data.converter.StringToIntegerConverter;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.Page;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import java.util.ArrayList;
import java.util.Arrays;

import static com.projetoea.escolasfutebol.EscolasfutebolApplication.applicationBeansContext;

public class GerirJogadoresView extends Composite implements View {
    DiretorEscolaBean diretorEscolaBean = applicationBeansContext.getBean("DiretorEscolaBean",
            DiretorEscolaBean.class);

    ComboBox<Equipa> equipaComboBox = new ComboBox<>();
    ArrayList<Equipa> equipasDB;
    VerticalLayout vt;

    Binder<Jogador> criarJogadorBinder;

    public GerirJogadoresView() {
        vt = new VerticalLayout();
        Label NomeDaPaginaLabel = new Label("Adicionar Jogador");
        vt.addComponent(NomeDaPaginaLabel);

        HorizontalLayout linhaNomeJogador = new HorizontalLayout();
        vt.addComponent(linhaNomeJogador);
        Label nomeJogadorLabel = new Label("Nome do Jogador");
        linhaNomeJogador.addComponent(nomeJogadorLabel);
        TextField nomeJogadorTextField = new TextField();
        nomeJogadorTextField.setPlaceholder("Nome");
        linhaNomeJogador.addComponent(nomeJogadorTextField);

        HorizontalLayout linhaIdadeJogador = new HorizontalLayout();
        vt.addComponent(linhaIdadeJogador);
        Label idadeJogadorLabel = new Label("Idade do Jogador");
        linhaIdadeJogador.addComponent(idadeJogadorLabel);
        TextField idadeJogadorTextField = new TextField();
        idadeJogadorTextField.setPlaceholder("0");
        linhaIdadeJogador.addComponent(idadeJogadorTextField);

        Button adicionarJogadorButton = new Button("Adicionar Jogador");
        criarJogadorBinder = new Binder<>();
        criarJogadorBinder.setBean(new Jogador());

        criarJogadorBinder.forField(nomeJogadorTextField).asRequired("O nome não pode estar em branco").bind(Jogador::getNome, Jogador::setNome);

        criarJogadorBinder.forField(idadeJogadorTextField).asRequired("O nome não pode estar em branco").withNullRepresentation( "" )
                .withConverter(new StringToIntegerConverter( Integer.valueOf( 0 ), "Só podem ser introduzidos numeros" ))
                .bind(Jogador::getIdade, Jogador::setIdade);

        adicionarJogadorButton.addClickListener(clickEvent -> {
            Jogador binderBean = criarJogadorBinder.getBean();
            try {
                Utilizador user = getSession().getAttribute(Utilizador.class);
                diretorEscolaBean.createPlayer(binderBean.getNome(), binderBean.getIdade(), equipaComboBox.getValue(),user.getEscolas());
                Page.getCurrent().reload();
            } catch (PersistentException e) {
                e.printStackTrace();
            }
        });

        adicionarJogadorButton.setEnabled(false);

        criarJogadorBinder.addStatusChangeListener(statusChangeEvent -> adicionarJogadorButton.setEnabled(criarJogadorBinder.isValid()));
        vt.addComponent(equipaComboBox);
        vt.addComponent(adicionarJogadorButton);

        setCompositionRoot(vt);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        DiretorEscolaBean diretorEscolaBean = EscolasfutebolApplication.applicationBeansContext.getBean("DiretorEscolaBean", DiretorEscolaBean.class);
        try {
            Utilizador user = getSession().getAttribute(Utilizador.class);
            equipasDB = new ArrayList<>(Arrays.asList(diretorEscolaBean.getEquipasDeEscola(EscolasDAO.getEscolasByORMID(UtilizadorDAO.loadUtilizadorByORMID(user.getORMID()).getEscolas().getORMID()).getORMID())));
            equipaComboBox.setItems(equipasDB);
            equipaComboBox.setItemCaptionGenerator(Equipa::getNome);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
    }
}

