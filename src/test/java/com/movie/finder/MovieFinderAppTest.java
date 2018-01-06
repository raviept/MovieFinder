package com.movie.finder;

import com.movie.finder.controller.MovieFinderController;
import com.movie.finder.model.Movie;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author XVI01
 *
 * This class performs system tests to the MovieFinder app.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MovieFinderAppTest {
	@Autowired
	private MovieFinderController controller;

	@Test
	public void testgetMoviesInDisplay() {
		List<Movie> movies = controller.getMoviesInTheatres();

		Assert.assertNotNull(movies);
	}
}
