package com.dominion.dominion_backend.repositories;

import com.dominion.dominion_backend.models.Player;
import com.dominion.dominion_backend.models.Season;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SeasonRepository extends JpaRepository<Season, Long> {

}
