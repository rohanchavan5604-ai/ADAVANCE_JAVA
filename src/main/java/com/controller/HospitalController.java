package com.controller;

import com.Hospital;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HospitalController {

    Hospital h;


    HospitalController(Hospital h1){
        h= h1;
        System.out.println("This is Controller constuctor");
    }

    @GetMapping("/gethospinfo")
    public String getinfo(){
        return h.gethospinfo();
    }

}
