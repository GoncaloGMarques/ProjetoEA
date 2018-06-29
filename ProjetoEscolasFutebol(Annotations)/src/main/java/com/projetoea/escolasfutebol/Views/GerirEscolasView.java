package com.projetoea.escolasfutebol.Views;

import com.projetoea.escolasfutebol.Beans.DiretorAssociacaoBean;
import com.projetoea.escolasfutebol.classesjava.Escolas;
import com.projetoea.escolasfutebol.classesjava.Utilizador;
import com.vaadin.data.HasValue;
import com.vaadin.data.ValueProvider;
import com.vaadin.icons.VaadinIcons;
import com.vaadin.navigator.View;
import com.vaadin.navigator.ViewChangeListener;
import com.vaadin.spring.annotation.SpringView;
import com.vaadin.ui.*;
import org.orm.PersistentException;

import java.util.ArrayList;
import java.util.List;

import static com.projetoea.escolasfutebol.EscolasfutebolApplication.applicationBeansContext;
import static com.vaadin.ui.Grid.SelectionMode.SINGLE;


@SpringView
public class GerirEscolasView extends Composite implements View, HasValue.ValueChangeListener<Escolas> {

    DiretorAssociacaoBean diretorAssociacaoBean = applicationBeansContext.getBean("DiretorAssociacaoBean",
            DiretorAssociacaoBean.class);

    private Escolas currentlyEditing;
    private boolean removedSelected = false;

    private List<Escolas> escolas;
    private Grid<Escolas> gridEscolas;

    private Button create;
    private Button remove;


    private Window createWindow(){
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
        TextField emailDiretor = new TextField("Email");
        PasswordField passwordFieldDiretor = new PasswordField("Password");

        Label escolaHeader = new Label("Diretor");
        escolaHeader.setIcon(VaadinIcons.ACADEMY_CAP);
        escolaHeader.setStyleName("v-header-label");
        TextField nomeEscolaField = new TextField("Nome Escola");
        Button finishCreate = new Button("Criar Escola", event -> {
            try {
                Utilizador utilizador = diretorAssociacaoBean.createUtilizador(nomeDiretor.getValue(),
                        emailDiretor.getValue(), passwordFieldDiretor.getValue(), 2);
                diretorAssociacaoBean.criarEscola(nomeEscolaField.getValue(), 1, utilizador);
            } catch (PersistentException e) {
                e.printStackTrace();
            }
            //Do i really need to close the window?
            window.close();
            getUI().getPage().reload();
        });

        content.addComponent(diretorHeader);
        content.addComponent(nomeDiretor);
        content.addComponent(emailDiretor);
        content.addComponent(passwordFieldDiretor);

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

    private void createGrid(Grid grid){
        grid.addColumn((ValueProvider) o -> ((Escolas)o).getNome()).setCaption("Nome");
        grid.addColumn((ValueProvider) o -> ((Escolas)o).getDiretorEscola().getNome()).setCaption("Diretor");
    }

    @Override
    public void valueChange(HasValue.ValueChangeEvent<Escolas> event) {
        currentlyEditing = event.getValue();
        remove.setEnabled(event.getValue() != null);
    }
}
