package com.controller;

import com.library;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {

    library l;

    @Autowired
    public void setl(library l1){

        l=l1;

    }

    @GetMapping("/getlibinfo")
    public String get(){
        return l.getlibinfo();
    }

}
