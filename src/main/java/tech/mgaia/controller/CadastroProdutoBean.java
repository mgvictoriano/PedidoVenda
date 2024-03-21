package tech.mgaia.controller;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Inject;
import jakarta.inject.Named;
import jakarta.persistence.EntityManager;
import tech.mgaia.model.Categoria;
import tech.mgaia.model.Produto;
import tech.mgaia.repository.CategoriaRepository;

import java.io.Serial;
import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.List;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

    private Categoria categoriaPai;
    @Serial
    private static final long serialVersionUID = 1L;
    private Produto produto;
    @Inject
    private CategoriaRepository categoria;
    private List<Categoria> categoriasRaizes;


    public CadastroProdutoBean() {
        produto = new Produto();
    }

    public void inicializar() {
        categoriasRaizes = categoria.buscarCategoriasRaizes();
    }

    public void salvar() {
        System.out.println("Categoria pai selecionada:" + categoriaPai.getDescricao());
    }

    public Produto getProduto() {
        return produto;
    }

}
