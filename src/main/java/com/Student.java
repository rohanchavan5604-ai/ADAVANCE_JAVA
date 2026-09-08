package com;

import org.springframework.stereotype.Component;

@Component
public class Student {

    String name = "Rohan";
    String course = "Java Full Stack";

    public String getstudinfo()
    {
        return "Name of student is " + name + " course is " + course;
    }
}