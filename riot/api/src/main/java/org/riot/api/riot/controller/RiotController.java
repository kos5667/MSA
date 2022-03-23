package org.riot.api.riot.controller;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.riot.api.common.exception.ApiException;
import org.riot.api.common.util.CodeType;
import org.riot.api.common.vo.ResponseModel;
import org.riot.api.riot.service.RiotService;
import org.riot.api.riot.vo.ChampionMasteryVO;
import org.riot.api.riot.vo.ChampionRotationsVO;
import org.riot.api.riot.vo.RiotRequestVO;
import org.riot.api.riot.vo.SummonerVO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.annotations.ApiIgnore;

@Api(value = "RiotController", description = "Riot 데이터 조회", tags = {"Riot", "데이터", "계정"})
@ApiResponses({ 
	@ApiResponse(code = 200, message = "요청 성공"), 
	@ApiResponse(code = 400, message = "잘못된 요청 구문"),
	@ApiResponse(code = 500, message = "서버 에러"), 
	@ApiResponse(code = 502, message = "서버로부터 잘못된 응답 수신") 
	})
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
    @ApiOperation(value = "소환사 조회", notes = "소환사 정보를 제공합니다.", response = SummonerVO.class)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name", value = "이름", defaultValue = "hide on bush", dataType = "string", paramType = "query", required = true)
    })
    @GetMapping(value = "/riot/summoner/by-name", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object getSummonerByName(@ApiIgnore RiotRequestVO vo) throws ApiException, Exception {
        ResponseModel<SummonerVO> responseModel = new ResponseModel<>();
        responseModel.setResult(riotService.getSummonerByName(vo));
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
    @ApiOperation(value = "챔피언 숙련도 조회 - 소환사", notes = "소환사의 챔피언들의 숙련도를 제공합니다.", response = ChampionMasteryVO.class)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "encryptedSummonerId", value = "암호화 소환사 ID", dataType = "string", paramType = "query", required = true)
    })
    @GetMapping(value = "/riot/champion-mastery/by-summoner", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object getChampionMasteryBySummoner(@ApiIgnore RiotRequestVO vo) throws ApiException, Exception {
        ResponseModel<List<ChampionMasteryVO>> responseModel = new ResponseModel<>();
        responseModel.setResult(riotService.getChampionMasteryBySummoner(vo));
		responseModel.setCode(CodeType.SUCCESS.code);
		responseModel.setMessage(CodeType.SUCCESS.message);
        return responseModel;
    }

    /**
     * CHAMPION-MASTERY-V4 By Champion
     * @param vo
     * @return
     * @throws Exception
     */
    @ApiOperation(value = "챔피언 숙련도 조회 - 챔피언", notes = "특정 챔피언의 숙련도를 제공합니다.", response = ChampionMasteryVO.class)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "encryptedSummonerId", value = "암호화 소환사 ID", dataType = "string", paramType = "query", required = true),
        @ApiImplicitParam(name = "championId", value = "챔피언 ID", defaultValue = "52", dataType = "string", paramType = "query", required = true)
    })
    @GetMapping(value = "/riot/champion-mastery/by-champion", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object getChampionMasteryByChampion(@ApiIgnore RiotRequestVO vo) throws ApiException, Exception {
        ResponseModel<ChampionMasteryVO> responseModel = new ResponseModel<>();
        responseModel.setResult(riotService.getChampionMasteryByChampion(vo));
		responseModel.setCode(CodeType.SUCCESS.code);
		responseModel.setMessage(CodeType.SUCCESS.message);
        return responseModel;
    }

    /**
     * 
     * @param vo
     * @return
     * @throws ApiException
     * @throws Exception
     */
    @ApiOperation(value = "챔피언 숙련도 조회 - 레벨", notes = "소환사의 챔피언 숙련도 레벨을 제공합니다.", response = Integer.class)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "encryptedSummonerId", value = "암호화 소환사 ID", dataType = "string", paramType = "query", required = true),
    })
    @GetMapping(value = "/riot/champion-mastery/scores", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object getChampionMasteryScore(@ApiIgnore RiotRequestVO vo) throws ApiException, Exception {
        ResponseModel<Integer> responseModel = new ResponseModel<>();
        responseModel.setResult(riotService.getChampionMasteryScore(vo));
		responseModel.setCode(CodeType.SUCCESS.code);
		responseModel.setMessage(CodeType.SUCCESS.message);
        return responseModel;
    }

    /**
     * 
     * @param vo
     * @return
     * @throws ApiException
     * @throws Exception
     */
    @ApiOperation(value = "챔피언 목록 조회", notes = "챔피언 목록을 제공합니다.", response = Map.class)
    @GetMapping(value = "/riot/champion/list", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object getChampionList(@ApiIgnore RiotRequestVO vo) throws ApiException, Exception {
        ResponseModel<Map<String,Object>> responseModel = new ResponseModel<>();
        responseModel.setResult(riotService.getChampionList(vo));
		responseModel.setCode(CodeType.SUCCESS.code);
		responseModel.setMessage(CodeType.SUCCESS.message);
        return responseModel;
    }

    /**
     * 
     * @param vo
     * @return
     * @throws ApiException
     * @throws Exception
     */
    @ApiOperation(value = "로테이션 챔피언 조회", notes = "로테이션 챔피언 목록을 제공합니다.", response = ChampionRotationsVO.class)
    @GetMapping(value = "/riot/champion-rotationsReturns", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object getChampionRotations(@ApiIgnore RiotRequestVO vo) throws ApiException, Exception {
        ResponseModel<ChampionRotationsVO> responseModel = new ResponseModel<>();
        responseModel.setResult(riotService.getChampionRotations(vo));
		responseModel.setCode(CodeType.SUCCESS.code);
		responseModel.setMessage(CodeType.SUCCESS.message);
        return responseModel;
    }

}
