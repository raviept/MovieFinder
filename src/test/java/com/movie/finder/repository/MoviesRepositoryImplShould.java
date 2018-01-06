package com.movie.finder.repository;

import com.movie.finder.entity.Movie;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class MoviesRepositoryImplShould {
    @Test
    public void listMoviesInTheatres() {
        List<Movie> stubbedMovies = new ArrayList<>();
        stubbedMovies.add(new Movie("Das boot"));
        JPAMoviesRepository jpaMoviesRepository = mock(JPAMoviesRepository.class);
        when(jpaMoviesRepository.findAll()).thenReturn(stubbedMovies);
        MoviesRepositoryImpl moviesRepository = new MoviesRepositoryImpl(jpaMoviesRepository);

        List<Movie> movies = moviesRepository.getMoviesInTheatres();

        assertEquals(stubbedMovies, movies);
    }
}
