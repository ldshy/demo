package com.example.Controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GloabelException {
//    @ExceptionHandler(RuntimeException.class)
//    @ResponseBody
//    public Map<String ,Object> exceptionHandler(){
//        Map<String,Object> map = new HashMap<String ,Object>();
//        map.put("ccode","500");
//        map.put("msg","系统错误。。。。。。。。。");
//        return map;
//    }
}
