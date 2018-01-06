package com.movie.finder.repository;

import com.movie.finder.model.Movie;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SqlRepository implements MoviesRepository {
    @Override
    public List<Movie> getMoviesInTheatres() {
        return null;
    }
}
