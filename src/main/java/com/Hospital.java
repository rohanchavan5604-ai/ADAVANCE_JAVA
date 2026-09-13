package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Hospital {

    Doctor d;


    Hospital(Doctor d1){
        d = d1;
        System.out.println("This is Hospital constuctor");
    }

    String name = "Bharati Hospital";
    String location =  "Dhanakawadi Pune";

    public String gethospinfo(){

        return d.getdoctinfo() + " who works at "+ name + " Which is located at "+location;

    }
}
