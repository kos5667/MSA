package org.riot.api.riot.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "챔피언 숙련도 - 응답객체")
public class ChampionMasteryVO {

    @ApiModelProperty(value = "챔피언 ID", position = 1)
    private String championId;
    @ApiModelProperty(value = "챔피언 레벨", position = 2)
    private String championLevel;
    @ApiModelProperty(value = "챔피언 숙련도", position = 3)
    private String championPoints;
    @ApiModelProperty(value = "상자 획득 여부", position = 4)
    private String chestGranted;
    @ApiModelProperty(value = "마지막 플레이 시간", position = 5)
    private String lastPlayTime;
    @ApiModelProperty(value = "소환사 ID", position = 6)
    private String summonerId;
    @ApiModelProperty(value = "현재 레벨에서 획득한 경험치", position = 7)
    private String championPointsSinceLastLevel;
    @ApiModelProperty(value = "다음 레벨까지 필요한 경험치", position = 8)
    private String championPointsUntilNextLevel;
    @ApiModelProperty(value = "토큰 수", position = 9)
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
