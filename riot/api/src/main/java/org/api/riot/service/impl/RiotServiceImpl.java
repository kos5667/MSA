package org.api.riot.service.impl;

import org.api.riot.service.RiotService;
import org.api.riot.vo.RiotVO;
import org.springframework.stereotype.Service;

@Service("riotService")
public class RiotServiceImpl implements RiotService {

    @Override
    public RiotVO callRiot(RiotVO vo) throws Exception {
        vo.setName("Riot Test");
        return vo;
    }
}
