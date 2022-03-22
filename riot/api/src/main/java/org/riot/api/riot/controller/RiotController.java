package org.riot.api.riot.controller;

import javax.annotation.Resource;

import org.riot.api.common.util.CodeType;
import org.riot.api.common.vo.ResponseModel;
import org.riot.api.riot.service.RiotService;
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

@Api(value = "RiotController", description = "", tags = "")
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

    @ApiOperation(value = "이름 검색", notes = "TEST API 호출", response = SummonerVO.class)
    @ApiImplicitParams({
        @ApiImplicitParam(name = "name", value = "이름", defaultValue = "hide on bush", dataType = "string", paramType = "query", required = true)
    })
    @GetMapping(value = "/riot/summoner/by-name", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object callSummonerByName(SummonerVO vo) throws Exception {
        ResponseModel<SummonerVO> responseModel = new ResponseModel<>();
        responseModel.setResult(riotService.callSummonerByName(vo));
		responseModel.setCode(CodeType.SUCCESS.code);
		responseModel.setMessage(CodeType.SUCCESS.message);
        return responseModel;
    }

}
