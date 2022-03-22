package org.riot.api.common.util;

import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.stereotype.Component;

@Component
public class JsonUtil {
    
    @SuppressWarnings("unchecked")
    public <T>T JsonToObject(T vo, String jsonData) throws Exception {
        return (T) new ObjectMapper().readValue(jsonData, vo.getClass());
    }
    
}
