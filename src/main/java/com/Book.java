package com;

import org.springframework.stereotype.Component;

@Component
public class Book {

    String title = "Java";
    String author = "James Gosling";

    public String getbookinfo(){

        return "Book name is "+ title + " which is written by "+ author;

    }

}
