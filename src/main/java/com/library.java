package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class library {

    Book b;

    @Autowired
    public void setb(Book b1){
        b=b1;
    }

    String lname = " Netaji Abhyasika ";
    String location = "Tasgaon";

    public String getlibinfo(){

        return b.getbookinfo()+ " ans this book available at "+lname + " which is located at "+location;

    }

}
