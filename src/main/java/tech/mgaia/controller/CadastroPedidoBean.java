package tech.mgaia.controller;

import jakarta.faces.view.ViewScoped;
import jakarta.inject.Named;
import jdk.jfr.Name;
import tech.mgaia.model.Pedido;

import java.io.Serializable;
import java.util.List;

@Named
@ViewScoped
public class CadastroPedidoBean implements Serializable {

    private static final long serialVersionUID = 1L;
    private Pedido pedido;
    private List<Integer> itens;

    public void salvar() {
    }
    public List<Integer> getItens() {
        return itens;
    }
    public Pedido getPedido() {
        return pedido;
    }


}
