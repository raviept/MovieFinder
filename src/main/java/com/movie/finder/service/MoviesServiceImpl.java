package com.movie.finder.service;

import com.movie.finder.model.Movie;
import com.movie.finder.repository.MoviesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MoviesServiceImpl implements MoviesService {
    private final MoviesRepository moviesRepository;

    public MoviesServiceImpl(MoviesRepository moviesRepository) {
        this.moviesRepository = moviesRepository;
    }

    @Override
    public List<Movie> getMoviesInTheatres() {
        return moviesRepository.getMoviesInTheatres();
    }
}
