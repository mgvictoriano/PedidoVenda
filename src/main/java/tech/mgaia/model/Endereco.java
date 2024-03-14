package tech.mgaia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "endereco")
public class Endereco implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 150, name = "logradouro")
    private String logradouro;

    @Column(nullable = false, length = 10, name = "numero")
    private String numero;

    @Column(length = 150, name = "complemento")
    private String complemento;

    @Column(nullable = false, length = 150, name = "bairro")
    private String cidade;

    @Column(nullable = false, length = 2, name = "uf")
    private String uf;

    @Column(nullable = false, length = 9, name = "cep")
    private String cep;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false, foreignKey = @ForeignKey(name = "fk_endereco_cliente"))
    private Cliente cliente;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Endereco endereco = (Endereco) o;
        return id.equals(endereco.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
