package org.riot.api.riot.service;

import java.util.List;
import java.util.Map;

import org.riot.api.common.exception.ApiException;
import org.riot.api.riot.vo.ChampionMasteryVO;
import org.riot.api.riot.vo.ChampionRotationsVO;
import org.riot.api.riot.vo.RiotRequestVO;
import org.riot.api.riot.vo.SummonerVO;

public interface RiotService {
 
    SummonerVO getSummonerByName(RiotRequestVO vo) throws ApiException, Exception ;
    
    List<ChampionMasteryVO> getChampionMasteryBySummoner(RiotRequestVO vo) throws ApiException, Exception;

    ChampionMasteryVO getChampionMasteryByChampion(RiotRequestVO vo) throws ApiException, Exception;

    int getChampionMasteryScore(RiotRequestVO vo) throws ApiException, Exception;

    Map<String,Object> getChampionList(RiotRequestVO vo) throws ApiException, Exception;

    ChampionRotationsVO getChampionRotations(RiotRequestVO vo) throws ApiException, Exception;
}
