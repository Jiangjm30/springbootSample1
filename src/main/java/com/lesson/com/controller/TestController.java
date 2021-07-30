package com.lesson.com.controller;

import org.springframework.boot.SpringBootConfiguration;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

    @GetMapping("/hello")
    public String test1(){
        return "hello ";
    }
    @PostMapping ("/hello2")
    public String test2(){
        return "helloPost ";
    }
    @DeleteMapping  ("/hello3")
    public String test3(){
        return "helloDelete ";
    }
    @GetMapping("/param/{abc}/{decf}")
    public String test4(@PathVariable String abc,@PathVariable String decf){
        return "hello " + abc + " : " + decf;
    }
    @GetMapping("/param/{userId}/{passwd}")
    public String test5(@PathVariable("userid") String abc,@PathVariable("passwd") String decf){
        return "hello " + abc + " : " + decf;
    }
    @GetMapping("/param/{userId}/{passwd}")
    public String test6(@PathVariable("userid") String abc,@PathVariable("decf") String passwd){
        return "hello " + abc + " : " + passwd;
    }
}
