package com.dominion.dominion_backend.controllers;

import com.dominion.dominion_backend.models.Player;
import com.dominion.dominion_backend.repositories.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PlayerController {
    @Autowired
    PlayerRepository playerRepository;

    @GetMapping(value = "/players")
    public List<Player> getAllPlayers() {
        return playerRepository.findAll();
    }
}
