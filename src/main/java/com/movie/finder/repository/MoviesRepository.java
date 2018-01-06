package com.movie.finder.repository;

import com.movie.finder.entity.Movie;

import java.util.List;

public interface MoviesRepository {
    List<Movie> getMoviesInTheatres();
}
