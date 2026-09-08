package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    Engin e;

    public String driving()
    {
        return e.start() + " I am driving my car";
    }
}