package tech.mgaia.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import tech.mgaia.validation.SKU;

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

    @NotNull(message = "é obrigatório")
    @Min(0) @Max(value = 9999,  message = "deve ser entre 0 e 9999")
    @Column(nullable = false, length = 100, name = "quantidade_estoque")
    private Integer quantidadeEstoque;

    @NotBlank
    @SKU
    @Column(nullable = false, length = 100, name = "sku")
    private String sku;

    @NotNull(message = "é obrigatório")
    @Column(name = "valor_unitario", nullable = false)
    private BigDecimal valorUnitario;

    @NotNull
    @ManyToOne(optional = false)
    @JoinColumn(name = "categoria_id", nullable = false)
    private Categoria categoria;

}
