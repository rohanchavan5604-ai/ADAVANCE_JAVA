package com;

import org.springframework.stereotype.Component;

@Component
public class Product {

    String productName = "Laptop";
    double price = 42000;

    public String getProductDetails()
    {
        return "Product name is " + productName + " and price is " + price;
    }
}