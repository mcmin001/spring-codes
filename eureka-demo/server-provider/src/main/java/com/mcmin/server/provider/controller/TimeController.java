package com.mcmin.server.provider.controller;

import com.alibaba.fastjson2.util.DateUtils;
import com.mcmin.server.common.JSONResult;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@RequestMapping("/time")
@Slf4j
public class TimeController {

    @RequestMapping( value = "/current", method = RequestMethod.GET)
    public JSONResult test(){
        return JSONResult.builder().code("200").data("hello, now time is " + DateUtils.toString(new Date())).build();
    }
}
