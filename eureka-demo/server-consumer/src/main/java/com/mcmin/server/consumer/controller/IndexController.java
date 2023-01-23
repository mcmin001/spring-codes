package com.mcmin.server.consumer.controller;

import com.alibaba.fastjson2.JSON;
import com.mcmin.server.common.JSONResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/index")
@Slf4j
public class IndexController {
    private final static String ServerProvider = "http://ServerProvider";
    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping( value = "/test", method = RequestMethod.GET)
    public JSONResult test(){
        List<String> stringList = discoveryClient.getServices();
        return JSONResult.builder().code("200").data(JSON.toJSON(stringList)).build();
    }
}
