package com;

import org.springframework.stereotype.Component;

@Component
public class Doctor {

    String name = "Dr.Prathamesh";
    String type = "Surgon";

    public String getdoctinfo(){
        return " Name of doctor is "+name + " and type is "+type;
    }

}
