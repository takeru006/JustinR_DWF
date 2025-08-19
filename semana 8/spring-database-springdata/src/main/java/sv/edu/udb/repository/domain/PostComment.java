package sv.edu.udb.repository.domain;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PostComment {
    @Id
    private Long id;
    @Column(nullable = false)
    private String review;
    @Column(nullable = false)
    private LocalDate commentDate;
    @ManyToOne(fetch = FetchType.LAZY) //Relacion de Muchos a uno
    @JoinColumn(name = "post_id") //Definimos el nombre de la llave foranea
    private Post post;
}
