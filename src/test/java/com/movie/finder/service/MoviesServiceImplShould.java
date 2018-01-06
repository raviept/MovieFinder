package com.movie.finder.service;

import com.movie.finder.entity.Movie;
import com.movie.finder.repository.MoviesRepository;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MoviesServiceImplShould {
    private static List<Movie> stubMovies;

    private MoviesService moviesService;

    /*
     * Tests
     */

    @Test
    public void listMoviesInTheatres() {
        List<Movie> movies = moviesService.getMoviesInTheatres();

        assertEquals(stubMovies, movies);
    }

        /*
     * Setup section
     */

    @BeforeClass
    public static void setStubMovies() {
        stubMovies = new ArrayList<Movie>();
        stubMovies.add(new Movie("Das boot"));
    }


    @Before
    public void createMoviesService() {
        MoviesRepository moviesRepository = createMockedRepository();

        moviesService = new MoviesServiceImpl(moviesRepository);
    }

    private MoviesRepository createMockedRepository() {
        List<Movie> stubMoviesCopy = cloneStubMovies();
        MoviesRepository moviesRepository = mock(MoviesRepository.class);

        when(moviesRepository.getMoviesInTheatres()).thenReturn(stubMoviesCopy);

        return moviesRepository;
    }

    private List<Movie> cloneStubMovies() {
        return stubMovies
                .stream()
                .map(movie -> new Movie(movie.getTitle()))
                .collect(Collectors.<Movie>toList());
    }
}
