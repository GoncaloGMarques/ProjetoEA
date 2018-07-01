package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.DiretorAssociacaoBean;
import com.projetoea.escolasfutebol.Notifications;
import com.projetoea.escolasfutebol.classesjava.Escolas;
import com.projetoea.escolasfutebol.classesjava.TipoutilizadorDAO;
import com.projetoea.escolasfutebol.classesjava.Utilizador;
import com.vaadin.data.*;
import com.vaadin.data.validator.EmailValidator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.server.UserError;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import static com.projetoea.escolasfutebol.EscolasfutebolApplication.applicationBeansContext;
import static com.vaadin.ui.Grid.SelectionMode.SINGLE;


@SpringView
public class GerirEscolasView extends Composite implements View, HasValue.ValueChangeListener<Escolas> {

    private DiretorAssociacaoBean diretorAssociacaoBean = applicationBeansContext.getBean("DiretorAssociacaoBean",
            DiretorAssociacaoBean.class);

    private Escolas currentlyEditing;
    private boolean removedSelected = false;

    private List<Escolas> escolas;
    private Grid<Escolas> gridEscolas;

    private Button create;
    private Button remove;
    private Label createError;

    private Binder<Utilizador> criarEscolaBinder;

    private Window createWindow(){

        criarEscolaBinder = new Binder<>();

        Window window = new Window("Criar Escola");
        window.setWidth(500.0f, Unit.PIXELS);
        window.center();
        window.setModal(true);

        VerticalLayout content = new VerticalLayout();

        content.setMargin(true);

        Label diretorHeader = new Label("Diretor");
        diretorHeader.setIcon(VaadinIcons.USER);
        diretorHeader.setStyleName("v-header-label");

        TextField nomeDiretor = new TextField("Nome Diretor");
        nomeDiretor.setComponentError(new UserError("Nome deve ter pelo menos 6 letras"));

        TextField emailDiretor = new TextField("Email");
        PasswordField passwordFieldDiretor = new PasswordField("Palavra-Pass");
        PasswordField passwordCheckFieldDiretor = new PasswordField("Confirmar Palavra-Pass");

        Label escolaHeader = new Label("Escola");
        escolaHeader.setIcon(VaadinIcons.ACADEMY_CAP);
        escolaHeader.setStyleName("v-header-label");
        TextField nomeEscolaField = new TextField("Nome Escola");
        Button finishCreate = new Button("Criar Escola");

        criarEscolaBinder.setBean(new Utilizador());

        criarEscolaBinder.forField(nomeDiretor)
                .asRequired("Nome nao pode estar em branco")
                .bind(Utilizador::getNome, Utilizador::setNome);

        criarEscolaBinder.forField(emailDiretor)
                .asRequired("Email tem de ser preenchido")
                .withValidator(new EmailValidator("O email nao e valido."))
                .bind(Utilizador::getEmail, Utilizador::setEmail);

        criarEscolaBinder.forField(passwordFieldDiretor)
                .asRequired("Palavra-Pass tem de ser preenchida")
                .withValidator(new StringLengthValidator("A palavra pass tem de ter pelo menos 4 letras",
                        4, null))
                .bind(Utilizador::getPassword, Utilizador::setPassword);

        criarEscolaBinder.forField(passwordCheckFieldDiretor)
                .asRequired("Tem de confirmar a Palavra-Pass")
                .bind(Utilizador::getPassword, (user, password) -> {});

        criarEscolaBinder.withValidator(Validator.from(user -> {
            if(passwordCheckFieldDiretor.getValue().isEmpty() || passwordCheckFieldDiretor.getValue().isEmpty())
                return true;
            else return Objects.equals(passwordCheckFieldDiretor.getValue(), passwordCheckFieldDiretor.getValue());
        }, "As Palavra-Pass devem ser iguais"));

        createError = new Label(null);
        createError.setStyleName("v-error-label");
        finishCreate.addClickListener(event -> {
            try {
                Utilizador binderBean = criarEscolaBinder.getBean();
                binderBean.setTipoutilizador(TipoutilizadorDAO.loadTipoutilizadorByQuery("ID = 2", null));
                Utilizador utilizador = diretorAssociacaoBean.createUtilizador(binderBean.getNome(),
                        binderBean.getEmail(), binderBean.getPassword(), binderBean.getTipoutilizador().getID());
                diretorAssociacaoBean.criarEscola(nomeEscolaField.getValue(), 1, utilizador);
                Notifications.showSuccessNotification("Escola criada com sucesso");
            } catch (PersistentException e) {
                window.close();
                Notifications.showErrorNotification("Erro a criar escola! Tente de novo");
                getUI().getPage().reload();
                e.printStackTrace();
                return;
            }
            //Do i really need to close the window?
            window.close();
            getUI().getPage().reload();
        });
        finishCreate.setEnabled(false);
        criarEscolaBinder.addStatusChangeListener(event -> finishCreate.setEnabled(criarEscolaBinder.isValid()));

        content.addComponent(diretorHeader);
        content.addComponent(nomeDiretor);
        content.addComponent(emailDiretor);
        content.addComponent(passwordFieldDiretor);
        content.addComponent(passwordCheckFieldDiretor);

        content.addComponent(escolaHeader);
        content.addComponent(nomeEscolaField);
        content.addComponent(finishCreate);
        window.setContent(content);
        return window;
    }

    private Button.ClickListener criarEscolaOnClick = (Button.ClickListener) event -> {
        Window createEscolaWindow = createWindow();
        getUI().getUI().addWindow(createEscolaWindow);
    };

    private Button.ClickListener removeEscolaOnClick = (Button.ClickListener) event -> {
        try {
            diretorAssociacaoBean.removerEscola(currentlyEditing);
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        remove.setEnabled(false);
        currentlyEditing = null;
    };

    private StyleGenerator<Escolas> gridStyleGenerator = new StyleGenerator<Escolas>() {
        @Override
        public String apply(Escolas item) {
            if(removedSelected && item.getID() == currentlyEditing.getID()){
                return "v-grid-item-removed";
            }
            return null;
        }
    };

    public GerirEscolasView() {
        escolas = new ArrayList<>();

        gridEscolas = new Grid<>();
        gridEscolas.setSizeFull();
        gridEscolas.setSelectionMode(SINGLE);
        gridEscolas.setStyleGenerator(gridStyleGenerator);
        gridEscolas.asSingleSelect().addValueChangeListener(this);

        create = new Button("Adicionar Escola", VaadinIcons.ADD_DOCK);
        create.addClickListener(criarEscolaOnClick);
        create.addStyleName("v-button");

        remove = new Button("Remover Escola", VaadinIcons.ERASER);
        remove.addClickListener(removeEscolaOnClick);
        remove.addStyleName("v-button");
        remove.setEnabled(false);

        HorizontalLayout horizontalLayout = new HorizontalLayout();
        horizontalLayout.addComponent(create);
        horizontalLayout.addComponent(remove);

        VerticalLayout verticalLayout = new VerticalLayout();
        verticalLayout.addComponent(horizontalLayout);
        verticalLayout.addComponent(gridEscolas);
        setCompositionRoot(verticalLayout);
    }

    @Override
    public void enter(ViewChangeListener.ViewChangeEvent event) {
        List<Escolas> escolas = loadEscolas();
        gridEscolas.setItems(escolas);
        createGrid(gridEscolas);
    }

    private List<Escolas> loadEscolas(){
        List<Escolas> escolas = null;
        try {
            escolas = diretorAssociacaoBean.getEscolas();
        } catch (PersistentException e) {
            e.printStackTrace();
        }
        return escolas;
    }

    private void createGrid(Grid<Escolas> grid){
        grid.addColumn(Escolas::getNome).setCaption("Nome");
        grid.addColumn(o -> o.getDiretorEscola().getNome()).setCaption("Diretor");
    }

    @Override
    public void valueChange(HasValue.ValueChangeEvent<Escolas> event) {
        currentlyEditing = event.getValue();
        remove.setEnabled(event.getValue() != null);
    }
}
