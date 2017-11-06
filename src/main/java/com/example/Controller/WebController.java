package com.example.Controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class WebController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
    @RequestMapping("/huangyu")
    public String huangyu(){
        int i=1/0;
        return "huangyu";
    }
}
