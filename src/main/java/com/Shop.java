package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Shop {

    String shopName = "sachin Electronics";
    String location = "Tasgaon";

    //field injection
    @Autowired
    Product p;

    public String openShop()
    {
        return p.getProductDetails() + " shop name is " + shopName + " which is at " + location;
    }
}