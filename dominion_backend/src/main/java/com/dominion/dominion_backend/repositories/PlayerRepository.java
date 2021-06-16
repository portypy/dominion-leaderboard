package com.dominion.dominion_backend.repositories;

import com.dominion.dominion_backend.models.Player;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {
//    List<Player> findPlayersBySeasonNumber(int seasonNumber);
}
