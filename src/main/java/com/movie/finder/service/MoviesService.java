package com.movie.finder.service;

import com.movie.finder.entity.Movie;

import java.util.List;

public interface MoviesService {
    List<Movie> getMoviesInTheatres();
}
