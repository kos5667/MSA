package org.riot.api.common.util;

import java.util.List;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.riot.api.common.exception.ApiException;
import org.springframework.stereotype.Component;

@Component
public class JsonUtil {
    
    /**
     * 
     * @param <T>
     * @param vo
     * @param jsonData
     * @return 
     * @throws Exception
     */
    @SuppressWarnings("unchecked")
    public <T> T JsonToObject(String jsonData, T obj) throws Exception, ApiException {
        if(obj instanceof List) 
            return (T) new ObjectMapper().readValue(jsonData, new TypeReference<List<T>>(){});
        else
            return (T) new ObjectMapper().readValue(jsonData, obj.getClass());
    }
    
}
