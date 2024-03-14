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
@Table(name = "categoria")
public class Categoria implements Serializable {

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false, length = 100, name = "descricao")
    private String descricao;

    @Column(nullable = false, name = "categoria_pai_id")
    private Long categoria_pai_id;

}
