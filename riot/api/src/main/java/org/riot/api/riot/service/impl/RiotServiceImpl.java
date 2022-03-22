package org.riot.api.riot.service.impl;

import org.riot.api.common.exception.ApiException;
import org.riot.api.common.util.HttpUtil;
import org.riot.api.common.util.JsonUtil;
import org.riot.api.riot.service.RiotService;
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
    public SummonerVO callSummonerByName(SummonerVO vo) throws ApiException {
        try {
            String url = "https://kr.api.riotgames.com/lol/summoner/v4/summoners/by-name/"+vo.getName()+"?api_key=" + riotDevKey;
            String body = httpUtil.getRequest(url);
            return jsonUtil.JsonToObject(vo, body);
        } catch (Exception e) {
            e.printStackTrace();
            throw new ApiException(e.getMessage());
        }
    }
}