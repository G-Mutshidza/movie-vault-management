package com.movie.archive.movie_vault.repository;

import com.movie.archive.movie_vault.model.Nomination;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NominationRepository extends JpaRepository<Nomination, Long> {
}
