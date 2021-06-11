package com.dominion.dominion_backend.models;

import java.util.ArrayList;
import java.util.List;

public class Game {
    private Long id;
    private int gameNumber;
    private List<Player> players;
    private Season season;

    public Game(int gameNumber, Season season) {
        this.gameNumber = gameNumber;
        this.season = season;
        this.players = new ArrayList<>();
    }

    public Game() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getGameNumber() {
        return gameNumber;
    }

    public void setGameNumber(int gameNumber) {
        this.gameNumber = gameNumber;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }
}
