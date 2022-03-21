package org.api.riot.controller;

import javax.annotation.Resource;

import org.api.common.util.CodeType;
import org.api.common.vo.ResponseModel;
import org.api.riot.service.RiotService;
import org.api.riot.vo.RiotVO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
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
    
    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Resource
    private RiotService riotService;

    @GetMapping(value = "/riot/callRiot", produces = {MediaType.APPLICATION_JSON_VALUE})
    public Object callRiot(RiotVO vo) throws Exception {
        ResponseModel<RiotVO> responseModel = new ResponseModel<>();
        responseModel.setResult(riotService.callRiot(vo));
		responseModel.setCode(CodeType.SUCCESS.code);
		responseModel.setMessage(CodeType.SUCCESS.message);
        return responseModel;
    }

}
