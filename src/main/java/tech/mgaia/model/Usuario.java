package tech.mgaia.model;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "usuario")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, name = "nome", length = 50)
    private String nome;

    @Column(nullable = false, length = 100,  name = "email", unique = true, updatable = false, insertable = false)
    private String email;

    @Column(nullable = false, length = 100, name = "senha")
    private String senha;

}
