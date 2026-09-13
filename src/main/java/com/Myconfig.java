package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Myconfig {

    @Bean
    public MyService createobject(){

        MyService serv = new MyService();

        System.out.println("This is configuration class method...");
        return serv;

    }

}
