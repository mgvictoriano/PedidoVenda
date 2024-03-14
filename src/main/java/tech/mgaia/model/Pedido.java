package tech.mgaia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "pedido")
public class Pedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @NotNull
    @Temporal(TemporalType.TIMESTAMP)
    @Column(nullable = false, length = 30, name = "data_criacao")
    private Date dataCriacao;

    @Temporal(TemporalType.DATE)
    @Column(nullable = false, length = 10, name = "data_entrega")
    private Date dataEntrega;

    @Column(columnDefinition = "text")
    private String observacao;

    @Column(nullable = false, precision = 10, scale = 2, name = "valor_total")
    private BigDecimal valorTotal;

    @Column(nullable = false, precision = 10, scale = 2, name = "valor_desconto")
    private BigDecimal valorDesconto;

    @Column(name = "valor_frete", nullable = false, precision = 10, scale = 2)
    private BigDecimal valorFrete;

    @Column(nullable = false, length = 30, name = "status")
    @Enumerated(EnumType.STRING)
    private StatusPedido status;

    @NotNull
    @Column(nullable = false, length = 30, name = "forma_pagamento")
    private FormaPagamento formaPagamento;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "vendedor_id", nullable = false, foreignKey = @ForeignKey(name = "fk_pedido_vendedor"))
    private Usuario vendedor;

    @NotNull
    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false, foreignKey = @ForeignKey(name = "fk_pedido_cliente"))
    private Cliente cliente;

    @Embedded
    private EnderecoEntrega enderecoEntrega;

    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true, fetch = FetchType.LAZY)
    private List<ItemPedido> itens = new ArrayList<>();
}
