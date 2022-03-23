package org.riot.api.riot.vo;

public class ChampionMasteryVO {

    private String championPointsUntilNextLevel;
    private String chestGranted;
    private String championId;
    private String lastPlayTime;
    private String championLevel;
    private String summonerId;
    private String championPoints;
    private String championPointsSinceLastLevel;
    private String tokensEarned;

    public String getChampionPointsUntilNextLevel() {
        return this.championPointsUntilNextLevel;
    }

    public void setChampionPointsUntilNextLevel(String championPointsUntilNextLevel) {
        this.championPointsUntilNextLevel = championPointsUntilNextLevel;
    }

    public String getChestGranted() {
        return this.chestGranted;
    }

    public void setChestGranted(String chestGranted) {
        this.chestGranted = chestGranted;
    }

    public String getChampionId() {
        return this.championId;
    }

    public void setChampionId(String championId) {
        this.championId = championId;
    }

    public String getLastPlayTime() {
        return this.lastPlayTime;
    }

    public void setLastPlayTime(String lastPlayTime) {
        this.lastPlayTime = lastPlayTime;
    }

    public String getChampionLevel() {
        return this.championLevel;
    }

    public void setChampionLevel(String championLevel) {
        this.championLevel = championLevel;
    }

    public String getSummonerId() {
        return this.summonerId;
    }

    public void setSummonerId(String summonerId) {
        this.summonerId = summonerId;
    }

    public String getChampionPoints() {
        return this.championPoints;
    }

    public void setChampionPoints(String championPoints) {
        this.championPoints = championPoints;
    }

    public String getChampionPointsSinceLastLevel() {
        return this.championPointsSinceLastLevel;
    }

    public void setChampionPointsSinceLastLevel(String championPointsSinceLastLevel) {
        this.championPointsSinceLastLevel = championPointsSinceLastLevel;
    }

    public String getTokensEarned() {
        return this.tokensEarned;
    }

    public void setTokensEarned(String tokensEarned) {
        this.tokensEarned = tokensEarned;
    }
}
