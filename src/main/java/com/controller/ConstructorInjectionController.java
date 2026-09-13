package com.controller;

import com.Laptop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConstructorInjectionController {

    Laptop l;

    ConstructorInjectionController(Laptop l1){
        l= l1;
    }

    @GetMapping("/getlaptopinfo")
    public String get(){
        return l.getlaptopinfo()+" Controller class";
    }

}
