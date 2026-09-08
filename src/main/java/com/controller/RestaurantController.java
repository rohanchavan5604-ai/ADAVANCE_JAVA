package com.controller;

import com.Restaurant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestaurantController {

    @Autowired
    Restaurant r;

    @GetMapping("/getrestaurantinfo")
    public String get()
    {
        return r.serveFood();
    }
}