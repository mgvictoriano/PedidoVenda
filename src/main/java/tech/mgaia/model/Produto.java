package tech.mgaia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100, name = "nome_produto")
    private String nome;

    @Column(nullable = false, length = 100, name = "quantidade_estoque")
    private Integer quantidadeEstoque;

    @Column(nullable = false, length = 100, name = "sku")
    private String sku;

    @Column(name = "valor_unitario", nullable = false)
    private BigDecimal valorUnitario;

    @Column(name = "categoria_id", nullable = false)
    private Long categoriaId;

}
