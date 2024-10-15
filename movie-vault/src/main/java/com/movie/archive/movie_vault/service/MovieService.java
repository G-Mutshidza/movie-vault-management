package com.movie.archive.movie_vault.service;

import com.movie.archive.movie_vault.model.Movie;
import com.movie.archive.movie_vault.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> searchMovieByName(String name) {
        return movieRepository.findByNameContaining(name);
    }

    public List<Movie> filterByGenre(String genre) {
        return movieRepository.findByGenre(genre);
    }

    public List<Movie> filterByDirector(String director) {
        return movieRepository.findByDirector(director);
    }

    public List<Movie> filterByYear(int year) {
        return movieRepository.findByYear(year);
    }

    public List<Movie> filterByCountry(String country) {
        return movieRepository.findByCountry(country);
    }
}
