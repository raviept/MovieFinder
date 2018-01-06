package com.movie.finder.repository;

import com.movie.finder.entity.Movie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MoviesRepositoryImpl implements MoviesRepository {
    private final JPAMoviesRepository jpaRepository;

    @Autowired
    public MoviesRepositoryImpl(JPAMoviesRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public List<Movie> getMoviesInTheatres() {
        List<Movie> movies = new ArrayList<>();
        jpaRepository.findAll().forEach(movie -> movies.add(movie));
        return movies;
    }
}
