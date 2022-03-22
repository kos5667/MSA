package org.riot.api.riot.vo;

public class SummonerVO {
    
    private String name; //이름(소환사 이름)
    private String id; //암호화된 소환사 ID
    private String accountId; //암호화된 계정 ID입니다. 
    private String puuid; //암호화된 PUUID.
    private String profileIconId; //프로필 아이콘 ID
    private String revisionDate; // 개정날짜
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
