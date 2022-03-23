package org.riot.api.riot.controller;

import java.util.List;

import javax.annotation.Resource;

import org.riot.api.common.util.CodeType;
import org.riot.api.common.vo.ResponseModel;
import org.riot.api.riot.service.RiotService;
import org.riot.api.riot.vo.ChampionMasteryVO;
import org.riot.api.riot.vo.RiotRequestVO;
import org.riot.api.riot.vo.SummonerVO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RiotController {
    
    @Resource
    private RiotService riotService;

    /**
     * ACCOUNT-V1
     * @param SummonerVO
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/riot/summoner/by-name", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object callSummonerByName(RiotRequestVO vo) throws Exception {
        ResponseModel<SummonerVO> responseModel = new ResponseModel<>();
        responseModel.setResult(riotService.callSummonerByName(vo));
		responseModel.setCode(CodeType.SUCCESS.code);
		responseModel.setMessage(CodeType.SUCCESS.message);
        return responseModel;
    }

    /**
     * CHAMPION-MASTERY-V4 By Summoner
     * @param vo
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/riot/champion-mastery/by-summoner", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object callChampionMasteryBySummoner(RiotRequestVO vo) throws Exception {
        ResponseModel<List<ChampionMasteryVO>> responseModel = new ResponseModel<>();
        responseModel.setResult(riotService.callChampionMasteryBySummoner(vo));
		responseModel.setCode(CodeType.SUCCESS.code);
		responseModel.setMessage(CodeType.SUCCESS.message);
        return riotService;
    }

    /**
     * CHAMPION-MASTERY-V4 By Champion
     * @param vo
     * @return
     * @throws Exception
     */
    @GetMapping(value = "/riot/champion-mastery/by-champion", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object callChampionMasteryByChampion(RiotRequestVO vo) throws Exception {
        return riotService;
    }

    @GetMapping(value = "/riot/champion-mastery/scores", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object callChampionMasteryScore(RiotRequestVO vo) throws Exception {
        return riotService;
    }

}
