package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/second")
public class SecondController {

    @GetMapping("/hello")
    public String show(){
        return "This is ambigious mapping problem";
    }

    @GetMapping("calPow")
    public String power(@RequestParam int num,
                        @RequestParam int pow){
         return "power of given number is " + Math.pow(num, pow);
    }



}
