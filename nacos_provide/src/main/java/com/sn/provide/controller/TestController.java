package com.sn.provide.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    private static final Logger logger = LoggerFactory.getLogger(TestController.class);

    @GetMapping("/helloNacos")
    public String helloNacos(){
        return "你好，nacos！";
    }

}
