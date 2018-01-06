package com.movie.finder.controller;

import com.movie.finder.service.MoviesService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.Mockito.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieFinderControllerTest {
	private MovieFinderController controller;
	private MoviesService moviesService;

	@Before
	public void createMovieFinderController() {
		moviesService = mock(MoviesService.class);
		controller = new MovieFinderController(moviesService);
	}

	@Test
	public void testGetMoviesInTheatres() {
		controller.getMoviesInTheatres();

		verify(moviesService, times(1)).getMoviesInTheatres();
	}
}
