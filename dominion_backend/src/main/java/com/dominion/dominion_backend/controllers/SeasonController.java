package com.dominion.dominion_backend.controllers;

import com.dominion.dominion_backend.models.Season;
import com.dominion.dominion_backend.repositories.SeasonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SeasonController {
    @Autowired
    SeasonRepository seasonRepository;

    @GetMapping(value = "/seasons")
    public List<Season> getAllSeasons() {
        return seasonRepository.findAll();
    }
}
