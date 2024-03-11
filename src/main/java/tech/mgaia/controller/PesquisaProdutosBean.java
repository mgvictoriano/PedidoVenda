package tech.mgaia.controller;

import jakarta.annotation.ManagedBean;
import jakarta.enterprise.context.RequestScoped;

import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class PesquisaProdutosBean {

    private List<Integer> produtosFiltrados;
    private PesquisaProdutosBean() {
        produtosFiltrados = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            produtosFiltrados.add(i);
        }
    }

    public List<Integer> getProdutosFiltrados() {
        return produtosFiltrados;
    }


}
