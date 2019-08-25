package com.owen.configclient.controller;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Slf4j
public class TestController {

    @Value("${from}")
    private String from;

    @Autowired
    private Environment env ;

    @RequestMapping("/from")
    public String from(){
        log.info("from = ------------> " + env.getProperty("from","undefined"));
        return this.from;
//        return  env.getProperty("from","undefined");
    }
}
