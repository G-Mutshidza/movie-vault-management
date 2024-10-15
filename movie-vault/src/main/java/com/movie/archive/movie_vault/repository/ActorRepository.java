package com.movie.archive.movie_vault.repository;

import com.movie.archive.movie_vault.model.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ActorRepository extends JpaRepository<Actor, Long> {
    Actor findActorByName(String name);

}
