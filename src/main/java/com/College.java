package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class College {

    String cname = "PDVP Collage";
    String location = "Tasgaon";

    //field injection
    @Autowired
    Student s;

    public String getcollegeinfo()
    {
        return s.getstudinfo() + " name of college is " + cname + " which is at " + location;
    }
}