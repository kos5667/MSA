package org.riot.api.riot.vo;

public class RiotRequestVO {
    
    private String name; //이름
    private String encryptedSummonerId; // 암호화 계정 ID
    private String championId; // 챔피언

    public String getChampionId() {
        return this.championId;
    }
    public void setChampionId(String championId) {
        this.championId = championId;
    }
    public String getEncryptedSummonerId() {
        return this.encryptedSummonerId;
    }
    public void setEncryptedSummonerId(String encryptedSummonerId) {
        this.encryptedSummonerId = encryptedSummonerId;
    }
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
