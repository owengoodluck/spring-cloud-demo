package com.owen.eurekaclient.controller;

import com.netflix.appinfo.InstanceInfo;
import com.netflix.discovery.DiscoveryClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@Slf4j
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        log.info("Service invoked -------------");
        return "Hello Spring Boot . From Eureka "+ new Date() ;

    }
}
