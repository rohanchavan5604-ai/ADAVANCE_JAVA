package com.controller;

import com.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnginCarController {

    @Autowired
    Car c;

    @GetMapping("/getcarinfo")
    public String getcarinfo()
    {
        return c.driving();
    }
}