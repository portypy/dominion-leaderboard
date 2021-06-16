package com.dominion.dominion_backend;

import com.dominion.dominion_backend.models.Game;
import com.dominion.dominion_backend.models.Player;
import com.dominion.dominion_backend.models.Season;
import com.dominion.dominion_backend.repositories.GameRepository;
import com.dominion.dominion_backend.repositories.PlayerRepository;
import com.dominion.dominion_backend.repositories.SeasonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DominionBackendApplicationTests {

	@Autowired
	PlayerRepository playerRepository;

	@Autowired
	GameRepository gameRepository;

	@Autowired
	SeasonRepository seasonRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createPlayer(){
		 Player player = new Player("Wielki Shu");
		 playerRepository.save(player);
	}

	@Test
	public void createGame(){
		Season season1 = new Season(1);
		seasonRepository.save(season1);
		Game game1 = new Game(1, season1);
		gameRepository.save(game1);
	}

	@Test
	public void createSeason(){
		Season season1 = new Season(1);
		seasonRepository.save(season1);
	}
}
