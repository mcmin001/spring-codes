package com.mcmin.server.consumer.service.impl;

import com.mcmin.server.common.JSONResult;
import com.mcmin.server.consumer.service.TimeRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Slf4j
@Service("timeRequestService")
public class TimeRequestServiceImpl implements TimeRequestService {

    private String serverUrl = "http://timeserver/server";
    private static final String queryCurrentTime = "/time/current";

    private RestTemplate restTemplate;

    @Autowired
    public TimeRequestServiceImpl(RestTemplate restTemplate){
        this.restTemplate = restTemplate;
    }

    @Override
    public String queryTime() {
        String url = serverUrl + queryCurrentTime;
        try{
            ResponseEntity<JSONResult> result = restTemplate.getForEntity(url, JSONResult.class);
            if(null != result && null != result.getBody() && JSONResult.SUCCESS_CODE.equalsIgnoreCase(result.getBody().getCode())){
                return (String) result.getBody().getData();
            }
        }catch (Exception e){
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
