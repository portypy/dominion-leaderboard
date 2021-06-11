package com.dominion.dominion_backend.models;


import java.util.ArrayList;
import java.util.List;

public class Player {

    private Long id;
    private String name;
    private int seasonPoints;
    private int seasonGames;
    private double seasonAvPosition;
    private int totalPoints;
    private int totalGames;
    private double totalAvPosition;
    private List<Season> seasons;


    public Player(String name){
        this.name = name;
        this.seasonPoints = 0;
        this.seasonGames = 0;
        this.seasonAvPosition = 0;
        this.totalPoints = 0;
        this.totalGames = 0;
        this.totalAvPosition = 0;
        this.seasons = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeasonPoints() {
        return seasonPoints;
    }

    public void setSeasonPoints(int seasonPoints) {
        this.seasonPoints = seasonPoints;
    }

    public int getSeasonGames() {
        return seasonGames;
    }

    public void setSeasonGames(int seasonGames) {
        this.seasonGames = seasonGames;
    }

    public double getSeasonAvPosition() {
        return seasonAvPosition;
    }

    public void setSeasonAvPosition(double seasonAvPosition) {
        this.seasonAvPosition = seasonAvPosition;
    }

    public int getTotalPoints() {
        return totalPoints;
    }

    public void setTotalPoints(int totalPoints) {
        this.totalPoints = totalPoints;
    }

    public int getTotalGames() {
        return totalGames;
    }

    public void setTotalGames(int totalGames) {
        this.totalGames = totalGames;
    }

    public double getTotalAvPosition() {
        return totalAvPosition;
    }

    public void setTotalAvPosition(double totalAvPosition) {
        this.totalAvPosition = totalAvPosition;
    }

    public List<Season> getSeasons() {
        return seasons;
    }

    public void setSeasons(List<Season> seasons) {
        this.seasons = seasons;
    }
}
