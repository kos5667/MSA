package org.riot.api.riot.vo;

public class RiotRequestVO {
    
    private String name; //이름
    private String encryptedSummonerId; // 암호화 계정 ID

    
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
