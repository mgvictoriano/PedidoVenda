package tech.mgaia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "produto")
public class Produto implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @NotBlank
    @Size(max = 80)
    @Column(nullable = false, length = 100, name = "nome_produto")
    private String nome;

    @NotNull
    @Min(0) @Max(9999)
    @Column(nullable = false, length = 100, name = "quantidade_estoque")
    private Integer quantidadeEstoque;

    @NotBlank
    @Column(nullable = false, length = 100, name = "sku")
    private String sku;

    @NotNull
    @Column(name = "valor_unitario", nullable = false)
    private BigDecimal valorUnitario;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

}
