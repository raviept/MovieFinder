package com.movie.finder.repository;

import com.movie.finder.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface MoviesRepository {
    List<Movie> getMoviesInTheatres();
}
