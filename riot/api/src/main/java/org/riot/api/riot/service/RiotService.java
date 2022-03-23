package org.riot.api.riot.service;

import java.util.List;

import org.riot.api.common.exception.ApiException;
import org.riot.api.riot.vo.ChampionMasteryVO;
import org.riot.api.riot.vo.RiotRequestVO;
import org.riot.api.riot.vo.SummonerVO;

public interface RiotService {
 
    SummonerVO callSummonerByName(RiotRequestVO vo) throws Exception, ApiException;
    
    List<ChampionMasteryVO> callChampionMasteryBySummoner(RiotRequestVO vo) throws Exception, ApiException;
}
