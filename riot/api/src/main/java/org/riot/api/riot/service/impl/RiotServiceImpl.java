package org.riot.api.riot.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.riot.api.common.exception.ApiException;
import org.riot.api.common.util.HttpUtil;
import org.riot.api.common.util.JsonUtil;
import org.riot.api.riot.service.RiotService;
import org.riot.api.riot.vo.ChampionMasteryVO;
import org.riot.api.riot.vo.ChampionRotationsVO;
import org.riot.api.riot.vo.ChampionVO;
import org.riot.api.riot.vo.RiotRequestVO;
import org.riot.api.riot.vo.SummonerVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("riotService")
public class RiotServiceImpl implements RiotService {

    @Autowired
    private JsonUtil jsonUtil;

    @Autowired
    private HttpUtil httpUtil;

    @Value("${riot.dev.key}")
    private String riotDevKey;

    @Override
    public SummonerVO getSummonerByName(RiotRequestVO vo) throws ApiException {
        try {
            String url = new StringBuilder().append("https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/")
                                            .append(vo.getName())
                                            .append("?api_key=")
                                            .append(riotDevKey)
                                            .toString();
            String body = httpUtil.getRequest(url);
            return jsonUtil.JsonToObject(body, new SummonerVO());
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }

    @Override
    public List<ChampionMasteryVO> getChampionMasteryBySummoner(RiotRequestVO vo) throws Exception, ApiException {
        try {
            String url = new StringBuilder().append("https://kr.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/")
                                            .append(vo.getEncryptedSummonerId())
                                            .append("?api_key=")
                                            .append(riotDevKey)
                                            .toString();
            String body = httpUtil.getRequest(url);
            return jsonUtil.JsonToObject(body, new ArrayList<ChampionMasteryVO>());
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }
    
    @Override
    public ChampionMasteryVO getChampionMasteryByChampion(RiotRequestVO vo) throws ApiException, Exception {
        try {
            String url = new StringBuilder().append("https://kr.api.riotgames.com/lol/champion-mastery/v4/champion-masteries/by-summoner/")
                                            .append(vo.getEncryptedSummonerId())
                                            .append("/by-champion/")
                                            .append(vo.getChampionId())
                                            .append("?api_key=")
                                            .append(riotDevKey)
                                            .toString();
            String body = httpUtil.getRequest(url);
            return jsonUtil.JsonToObject(body, new ChampionMasteryVO());
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }

    @Override
    public int getChampionMasteryScore(RiotRequestVO vo) throws ApiException, Exception {
        try {
            String url = new StringBuilder().append("https://kr.api.riotgames.com/lol/champion-mastery/v4/scores/by-summoner/")
                                            .append(vo.getEncryptedSummonerId())
                                            .append("?api_key=")
                                            .append(riotDevKey)
                                            .toString();
            String body = httpUtil.getRequest(url);
            return Integer.parseInt(body);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }
    
    @Override
    public Map<String,Object> getChampionList(RiotRequestVO vo) throws ApiException, Exception {
        Map<String,Object> map = new HashMap<String, Object>();
        try {
            String url = "https://ddragon.leagueoflegends.com/cdn/12.5.1/data/ko_KR/champion.json";
            String body = httpUtil.getRequest(url);
            // body.replaceAll(" ", "\\");
            // System.out.println(body);
            map.put("data", body);
            return map;
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }

    @Override
    public ChampionRotationsVO getChampionRotations(RiotRequestVO vo) throws ApiException, Exception {
        try {
            String url = new StringBuilder().append("https://kr.api.riotgames.com/lol/platform/v3/champion-rotations")
                                            .append("?api_key=")
                                            .append(riotDevKey)
                                            .toString();
            String body = httpUtil.getRequest(url);
            return jsonUtil.JsonToObject(body, new ChampionRotationsVO());
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }
}