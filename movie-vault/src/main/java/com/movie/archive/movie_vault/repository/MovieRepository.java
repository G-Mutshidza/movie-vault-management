package com.movie.archive.movie_vault.repository;

import com.movie.archive.movie_vault.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    List<Movie> findByNameContaining(String name);
    List<Movie> findByGenre(String genre);
    List<Movie> findByDirector(String director);
    List<Movie> findByYear(int year);
    List<Movie> findByCountry(String country);
}
