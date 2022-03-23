package org.riot.api.riot.vo;

import java.util.List;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "로테이션 챔피언 - 응답객체")
public class ChampionRotationsVO {
    
    @ApiModelProperty(value = "로테이션 챔피언 ID", position = 1)
    private List<Integer> freeChampionIds;
    @ApiModelProperty(value = "신규 유저 무료 챔피언", position = 2)
    private List<Integer> freeChampionIdsForNewPlayers;
    @ApiModelProperty(value = "신규 유저 무료 사용가능 MAX 레벨", position = 3)
    private int maxNewPlayerLevel;

    public int getMaxNewPlayerLevel() {
        return this.maxNewPlayerLevel;
    }

    public void setMaxNewPlayerLevel(int maxNewPlayerLevel) {
        this.maxNewPlayerLevel = maxNewPlayerLevel;
    }

    public List<Integer> getFreeChampionIdsForNewPlayers() {
        return this.freeChampionIdsForNewPlayers;
    }

    public void setFreeChampionIdsForNewPlayers(List<Integer> freeChampionIdsForNewPlayers) {
        this.freeChampionIdsForNewPlayers = freeChampionIdsForNewPlayers;
    }

    public List<Integer> getFreeChampionIds() {
        return this.freeChampionIds;
    }

    public void setFreeChampionIds(List<Integer> freeChampionIds) {
        this.freeChampionIds = freeChampionIds;
    }

}
