package com.sn.provide.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/helloNacos")
    public String helloNacos(){
        System.out.println("他来了，他来了");
        return "你好，nacos！";
    }

}
