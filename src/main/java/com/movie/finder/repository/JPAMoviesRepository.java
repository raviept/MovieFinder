package com.movie.finder.repository;

import com.movie.finder.entity.Movie;
import org.springframework.data.repository.CrudRepository;

public interface JPAMoviesRepository extends CrudRepository<Movie, Long> {
}
