package sv.edu.udb.spring_di.repository.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Movie {
    private Long id;
    private String name;
    private String type;
    private Integer releaseYear;
}