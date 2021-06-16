package com.dominion.dominion_backend.controllers;

import com.dominion.dominion_backend.models.Game;
import com.dominion.dominion_backend.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GameController {
    @Autowired
    GameRepository gameRepository;

    @GetMapping(value = "/games")
    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }
}
