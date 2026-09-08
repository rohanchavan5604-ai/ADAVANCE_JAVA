package com;

import org.springframework.stereotype.Component;

@Component
public class Chef {

    String chefName = "Pranay";
    String specialDish = "Chicken Biryani";

    public String cookFood()
    {
        return "Chef name is " + chefName + " and special dish is " + specialDish;
    }
}