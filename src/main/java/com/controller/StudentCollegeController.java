package com.controller;

import com.College;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentCollegeController {

    //field injection
    @Autowired
    College c;

    @GetMapping("/getcollegeinfo")
    public String get()
    {
        return c.getcollegeinfo();
    }
}