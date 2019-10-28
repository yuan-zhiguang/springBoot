package com.yzg.demo.controller;

import com.yzg.demo.domain.User;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/hello")
public class TestController {

    @RequestMapping(value = "/world", method = RequestMethod.POST)
    public Map helloWorld(@RequestBody User user){
        int age = user.getAge();
        String name =  user.getName();
        Map map = new HashMap(2);
        map.put("name", name);
        map.put("age", age);
        return map;
    }
	
	@PostMapping("/world2")
    public Map helloWorld2(@RequestBody Map<String, Object> map){
        String world = (String) map.get("key");
        Map resultMap = new HashMap(1);
        resultMap.put("key", world);
        return resultMap;
    }
	
}
