package tech.mgaia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Setter
@Getter
@Entity
@Table(name = "item_pedido", schema = "public")
public class ItemPedido implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 3)
    private Integer quantidade;

    @Column(nullable = false, precision = 10, scale = 2, name = "valor_unitario")
    private BigDecimal valorUnitario;

    @Column(precision = 10, scale = 2, name = "valor_desconto")
    private BigDecimal desconto;

    @ManyToOne
    @JoinColumn(name = "produto_id",  nullable = false, foreignKey = @ForeignKey(name = "fk_item_produto"))
    private Produto produto;

    @ManyToOne
    @JoinColumn(name = "pedido_id",  nullable = false, foreignKey = @ForeignKey(name = "fk_item_pedido"))
    private Pedido pedido;

}
