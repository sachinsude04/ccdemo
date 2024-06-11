package com.stacksimplify.ccdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String sayHello(){

        return "Hi From ccdemo - v1";
    }
}
