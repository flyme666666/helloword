package com.example.demo.controller;

import com.example.demo.dto.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Slf4j
@Controller
public class testController {
    @RequestMapping("/")
    @ResponseBody
    private String test(){
        return "起始页";
    }

    @GetMapping("/get")
    @ResponseBody
    private String get(@RequestParam String key){
        log.info("GET请求入参 [{}]" , key);
        return "GET请求";
    }

    @PostMapping("/post")
    @ResponseBody
    private String post(@RequestBody User user){
        log.info("姓名 : {} 年龄 : {}" , user.getName() , user.getAge());
        return "POST请求";
    }

}
