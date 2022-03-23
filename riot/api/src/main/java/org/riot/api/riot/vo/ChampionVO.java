package org.riot.api.riot.vo;

import java.util.List;

import io.swagger.annotations.ApiModel;

@ApiModel(value = "챔피언 정보 - 응답객체")
public class ChampionVO {
    
    private String championNm;
    private String version;
    private String id;
    private String key;
    private String name;
    private String title;
    private String blurb;
    private ChampionInfoVO championInfo;
    private ChampionImageVO championImage;
    private List<String> tags;
    private String partype;
    private ChampionStatsVO championStats;

    public String getChampionNm() {
        return this.championNm;
    }

    public void setChampionNm(String championNm) {
        this.championNm = championNm;
    }

    public String getVersion() {
        return this.version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBlurb() {
        return this.blurb;
    }

    public void setBlurb(String blurb) {
        this.blurb = blurb;
    }

    public ChampionInfoVO getChampionInfo() {
        return this.championInfo;
    }

    public void setChampionInfo(ChampionInfoVO championInfo) {
        this.championInfo = championInfo;
    }

    public ChampionImageVO getChampionImage() {
        return this.championImage;
    }

    public void setChampionImage(ChampionImageVO championImage) {
        this.championImage = championImage;
    }

    public List<String> getTags() {
        return this.tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getPartype() {
        return this.partype;
    }

    public void setPartype(String partype) {
        this.partype = partype;
    }

    public ChampionStatsVO getChampionStats() {
        return this.championStats;
    }

    public void setChampionStats(ChampionStatsVO championStats) {
        this.championStats = championStats;
    }
}
