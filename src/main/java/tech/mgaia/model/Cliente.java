package tech.mgaia.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@Entity
@Table(name = "cliente")
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(name = "nome_cliente", nullable = false)
    private String nome;

    @Column(unique = true, nullable = false, length = 30, name = "email")
    private String email;

    @Column(nullable = false, length = 14, name = "cpf_cnpj")
    private String documentoReceitaFederal;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false, length = 10, name = "tipo_pessoa") // Física ou Jurídica.
    private TipoPessoa tipoPessoa;

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Endereco> enderecos = new ArrayList<>();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return id.equals(cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
