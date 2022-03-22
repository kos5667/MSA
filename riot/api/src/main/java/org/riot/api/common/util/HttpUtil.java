package org.riot.api.common.util;

import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.HttpClientBuilder;
import org.riot.api.common.exception.ApiException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class HttpUtil {
 
    private Logger log = LoggerFactory.getLogger(this.getClass());

    /**
     * HttpClient Request GET
     * @param url
     * @return
     * @throws Exception
     */
    public String getRequest(String url) throws Exception {
        log.info("HttpClient GET Call URL : "+url);
        HttpClient client = HttpClientBuilder.create().build();
        HttpGet request = new HttpGet(url);
        HttpResponse response = client.execute(request);
        
        if(response.getStatusLine().getStatusCode() == 200) {
            ResponseHandler<String> handler = new BasicResponseHandler();
            String body = handler.handleResponse(response);
            log.info("Response Result : "+body);
            return body;
        } else {
            throw new ApiException(CodeType.FAIL, "Response Code : "+ response.getStatusLine().getStatusCode());
        }
    }

    /**
     * HttpClient Request POST
     * @param url
     * @return
     * @throws Exception
     */
    public String postRequest(String url) throws Exception {
        log.info("HttpClient POST Call URL : "+url);
        HttpClient client = HttpClientBuilder.create().build();
        HttpPost request = new HttpPost(url);
        request.setHeader("Accept", "application/json");
        request.setHeader("Connection", "keep-alive");
        request.setHeader("Content-Type", "application/json");

        HttpResponse response = client.execute(request);
        if(response.getStatusLine().getStatusCode() == 200) {
            ResponseHandler<String> handler = new BasicResponseHandler();
            String body = handler.handleResponse(response);
            log.info("Response Result : "+body);
            return body;
        } else {
            throw new ApiException(CodeType.FAIL, "Response Code : "+ response.getStatusLine().getStatusCode());
        }
    }
    
    public String getRequestOk() throws Exception {
        return null;
    }

    public String postRequestOk() throws Exception {
        return null;
    }
}
