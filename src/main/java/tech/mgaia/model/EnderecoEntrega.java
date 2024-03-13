package tech.mgaia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@Embeddable
public class EnderecoEntrega implements Serializable {

    private static final long serialVersionUID = 1L;

    @Column(nullable = false, length = 150, name = "logradouro")
    private String logradouro;

    @Column(nullable = false, length = 10,  name = "numero")
    private String numero;

    @Column(length = 150, name = "complemento")
    private String complemento;

    @Column(nullable = false, length = 150, name = "cidade")
    private String cidade;

    @Column(nullable = false, length = 2, name = "uf")
    private String uf;

    @Column(nullable = false, length = 9, name = "cep")
    private String cep;

}
