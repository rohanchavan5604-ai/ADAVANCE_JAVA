package com;

import org.springframework.stereotype.Component;

@Component
public class Laptop {

    Battery b;
    Keyboard k;
    Mouse m;


    public Laptop(Battery b, Keyboard k, Mouse m) {
        this.b = b;
        this.k = k;
        this.m = m;
    }

    public String getlaptopinfo(){
        return b.getbatteryinfo()+" "+ k.getkeyboardinfo()+" "+m.getmouseinfo()+" "+ "This is my Laptop";
    }

}
