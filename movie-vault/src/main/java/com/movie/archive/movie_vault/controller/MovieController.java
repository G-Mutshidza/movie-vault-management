package com.movie.archive.movie_vault.controller;

import com.movie.archive.movie_vault.model.Movie;
import com.movie.archive.movie_vault.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping("/search")
    public ResponseEntity<List<Movie>> searchMovies(@RequestParam String name) {
        List<Movie> movies = movieService.searchMovieByName(name);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/filter/genre")
    public ResponseEntity<List<Movie>> filterByGenre(@RequestParam String genre) {
        List<Movie> movies = movieService.filterByGenre(genre);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/filter/director")
    public ResponseEntity<List<Movie>> filterByDirector(@RequestParam String director) {
        List<Movie> movies = movieService.filterByDirector(director);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/filter/year")
    public ResponseEntity<List<Movie>> filterByYear(@RequestParam int year) {
        List<Movie> movies = movieService.filterByYear(year);
        return ResponseEntity.ok(movies);
    }

    @GetMapping("/filter/country")
    public ResponseEntity<List<Movie>> filterByCountry(@RequestParam String country) {
        List<Movie> movies = movieService.filterByCountry(country);
        return ResponseEntity.ok(movies);
    }
}
