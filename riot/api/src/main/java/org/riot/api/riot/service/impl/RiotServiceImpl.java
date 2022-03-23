package org.riot.api.riot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.riot.api.common.exception.ApiException;
import org.riot.api.common.util.HttpUtil;
import org.riot.api.common.util.JsonUtil;
import org.riot.api.riot.service.RiotService;
import org.riot.api.riot.vo.ChampionMasteryVO;
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
    public SummonerVO callSummonerByName(RiotRequestVO vo) throws ApiException {
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
    public List<ChampionMasteryVO> callChampionMasteryBySummoner(RiotRequestVO vo) throws Exception, ApiException {
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
}