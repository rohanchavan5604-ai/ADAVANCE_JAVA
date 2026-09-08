package com.controller;

import com.Shop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShopController {

    @Autowired
    Shop s;

    @GetMapping("/getshopinfo")
    public String get()
    {
        return s.openShop();
    }
}