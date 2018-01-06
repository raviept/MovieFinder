package com.movie.finder.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MovieFinderController {

	@RequestMapping("/")
	public String home() {
		return "Movie Finder!";
	}
}
