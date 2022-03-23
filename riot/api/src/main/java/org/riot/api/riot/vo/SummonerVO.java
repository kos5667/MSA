package org.riot.api.riot.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel(value = "소환사 정보 - 응답객체")
public class SummonerVO {
    
    @ApiModelProperty(value = "이름", position = 1)
    private String name; //이름(소환사 이름)
    @ApiModelProperty(value = "ID", position = 2)
    private String id; //암호화된 소환사 ID
    @ApiModelProperty(value = "계정 ID", position = 3)
    private String accountId; //암호화된 계정 ID입니다. 
    @ApiModelProperty(value = "PUUID", position = 4)
    private String puuid; //암호화된 PUUID.
    @ApiModelProperty(value = "프로필 아이콘 ID", position = 5)
    private String profileIconId; //프로필 아이콘 ID
    @ApiModelProperty(value = "개정일자", position = 6)
    private String revisionDate; // 개정날짜
    @ApiModelProperty(value = "소환사 레벨", position = 7)
    private String summonerLevel; //소환사 레벨

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getAccountId() {
        return this.accountId;
    }
    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }
    public String getPuuid() {
        return this.puuid;
    }
    public void setPuuid(String puuid) {
        this.puuid = puuid;
    }
    public String getProfileIconId() {
        return this.profileIconId;
    }
    public void setProfileIconId(String profileIconId) {
        this.profileIconId = profileIconId;
    }
    public String getRevisionDate() {
        return this.revisionDate;
    }
    public void setRevisionDate(String revisionDate) {
        this.revisionDate = revisionDate;
    }
    public String getSummonerLevel() {
        return this.summonerLevel;
    }
    public void setSummonerLevel(String summonerLevel) {
        this.summonerLevel = summonerLevel;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
