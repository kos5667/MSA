package org.riot.api.riot.service;

import org.riot.api.riot.vo.SummonerVO;

public interface RiotService {
 
    public SummonerVO callSummonerByName(SummonerVO vo) throws Exception;
}
