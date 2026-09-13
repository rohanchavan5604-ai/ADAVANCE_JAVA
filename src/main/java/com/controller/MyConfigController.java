package com.controller;

import com.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyConfigController {

    @Autowired
    MyService s;

    @GetMapping("/getservice")
    public String get(){
        return s.service();
    }

}
