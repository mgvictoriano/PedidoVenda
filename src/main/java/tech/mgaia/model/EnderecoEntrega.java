package tech.mgaia.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Embeddable
public class EnderecoEntrega implements Serializable {

    private static final long serialVersionUID = 1L;

    @NotBlank
    @Size(max = 150)
    @Column(nullable = false, length = 150, name = "logradouro")
    private String logradouro;

    @NotBlank
    @Size(max = 6)
    @Column(nullable = false, length = 10,  name = "numero")
    private String numero;

    @Size(max = 150)
    @Column(length = 150, name = "complemento")
    private String complemento;

    @NotBlank
    @Size(max = 150)
    @Column(nullable = false, length = 150, name = "cidade")
    private String cidade;

    @NotBlank
    @Size(max = 2)
    @Column(nullable = false, length = 2, name = "uf")
    private String uf;

    @NotBlank
    @Size(max = 9)
    @Column(nullable = false, length = 9, name = "cep")
    private String cep;

}
