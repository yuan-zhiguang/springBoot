package com.yzg.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class TestController {

    @RequestMapping(value = "/world", method = RequestMethod.GET)
    public String helloWorld(){
        return "Hello World !";
    }
}