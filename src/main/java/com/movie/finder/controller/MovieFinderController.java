package com.movie.finder.controller;

import com.movie.finder.entity.Movie;
import com.movie.finder.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MovieFinderController {
	private final MoviesService moviesService;

	@Autowired
	public MovieFinderController(MoviesService moviesService) {
		this.moviesService = moviesService;
	}

	@RequestMapping("/")
	public String home() {
		return "Movie Finder!";
	}

	@RequestMapping("/movies/in/theatres/")
    public List<Movie> getMoviesInTheatres() {
		return moviesService.getMoviesInTheatres();
    }
}
