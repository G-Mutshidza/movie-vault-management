package com.movie.archive.movie_vault.repository;

import com.movie.archive.movie_vault.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import com.movie.archive.movie_vault.model.Director;
import org.springframework.stereotype.Repository;

@Repository
public interface DirectorRepository extends JpaRepository<Director ,Long> {
    Actor findDirectorByName(String director);
}
