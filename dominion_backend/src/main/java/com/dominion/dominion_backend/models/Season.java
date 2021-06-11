package com.dominion.dominion_backend.models;

import java.util.ArrayList;
import java.util.List;

public class Season {
    private Long id;
    private int seasonNumber;
    private List<Game> games;
    private List<Player> players;

    public Season(int seasonNumber) {
        this.seasonNumber = seasonNumber;
        this.games = new ArrayList<Game>();
        this.players = new ArrayList<Player>();
    }

    public Season() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getSeasonNumber() {
        return seasonNumber;
    }

    public void setSeasonNumber(int seasonNumber) {
        this.seasonNumber = seasonNumber;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }
}
