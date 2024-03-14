package tech.mgaia.controller;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import tech.mgaia.model.Produto;

import java.io.Serializable;

@Named
@ViewScoped
public class CadastroProdutoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Produto produto;

    public void salvar() {
    }

    public Produto getProduto() {
        return produto;
    }

}
