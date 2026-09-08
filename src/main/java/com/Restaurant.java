package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

    String restaurantName = "Rangda Bet";
    String location = "Savlaj";

    //field injection
    @Autowired
    Chef c;

    public String serveFood()
    {
        return c.cookFood() + " restaurant name is " + restaurantName + " which is at " + location;
    }
}