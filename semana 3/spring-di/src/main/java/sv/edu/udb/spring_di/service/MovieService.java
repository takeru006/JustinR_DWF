package sv.edu.udb.spring_di.service;

import sv.edu.udb.spring_di.repository.domain.Movie;
public interface MovieService {
    Movie findMovieById(final Long id);
}