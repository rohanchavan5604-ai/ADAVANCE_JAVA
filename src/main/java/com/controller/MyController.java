package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
    //Request URL: /hello
    @GetMapping("/hello")
    public String greet(){
        return "Good Afternoon..!";
    }

    @GetMapping("/MyPersonalInfo")
    public String show(){
        return "My name is Rohan. " +
                "my course is Java Fullstack Developer, " +
                "My hobbies is watching Movies..!";
    }

    @GetMapping("/addition")
    public String add( ){
        int a = 10;
        int b = 20;
        return "Addition is: "+(a+b);
    }


//    1] Write function with perform subtraction of two numbers

    @GetMapping("/subtraction")
    public String sub(){
        int a =10;
        int b = 5;
        return "subtraction is: "+(a-b);
    }

//    2] write function with return result division of two numbers

    @GetMapping("/division")
    public String div(){
        int a = 15;
        int b = 3;
        return "Division of "+a+"/ "+b+" is: "+(a/b);
    }

//    3] Write function with return result multiplication of two numbers

    @GetMapping("/multiplication")
    public String mul(){
        int a = 10;
        int b = 5;
        return "Multiplication of "+a+ " * "+b+" is: "+(a*b);
    }

//    4] Write function which return square of given number

    @GetMapping("/square")
    public String sqrt(){
        int num = 5;
        return "Square of "+num+" is: "+(num*num);
    }

//    Method to find cube of given number

    @GetMapping("/cube")
    public String cubeofnum(){
        int num = 5;

        return "cube is "+(num * num * num);
    }

    @GetMapping("/getstudinfo/{name}/{course}/{marks}")
    public String getstudinfo(@PathVariable("name") String nm,
                              @PathVariable("course") String c,
                              @PathVariable("marks") float m){
        return "name of the student is "+nm+" and course is "+c +" and marks is "+ m;
    }

    @GetMapping("/areaofcircle/{r}")
    public String areaofcircle(@PathVariable float r){
        return "The area of circle is "+(3.14*r*r);
    }

    @GetMapping("/areaofsquare/{s}")
    public String areaofsquare(@PathVariable double s)
    {
        return "Area of square is "+(s*s);
    }

    @GetMapping("/addofthree/{a}/{b}/{c}")
    public String addofthree(@PathVariable int a,
                             @PathVariable int b,
                             @PathVariable int c){

        return "Addition of three Numbers is "+(a+b+c);

    }

    @GetMapping("/evenodd/{a}")
    public String evenodd(@PathVariable int a){

        if(a%2==0)
        {
            return "Given no "+a+ " is even";
        }else{
            return "Given no "+a+" is odd";
        }
    }

//    accept two numbers from user and find max of them

    @GetMapping("/maxoftwo/{a}/{b}")
    public String maxoftwo(@PathVariable int a,
                           @PathVariable int b){

        if(a>b){
            return a+" is Greater then "+b;
        }
        else{
            return b+" is Greater then "+a;
        }
    }


    // 1) Write a function which accept two numbers from User and return result  of addition

    @GetMapping("/AddC/{a}/{b}")
    public String AddC(@PathVariable int a,
                      @PathVariable int b)
    {
        return "two numbers addition is "+(a+b);
    }

//2) Write a function which accept two no and return result of subtraction

    @GetMapping("/SubC/{a}/{b}")
    public String SubC(@PathVariable int a,
                      @PathVariable int b)
    {
        return "two numbers substraction is "+(a-b);
    }

//3) Write a function which accept two no and return result of division

    @GetMapping("/DivC/{a}/{b}")
    public String DivC(@PathVariable int a,
                      @PathVariable int b)
    {
        return "two numbers division is "+(a/b);
    }

//4) Write a function which accept two no and return result of multiplication

    @GetMapping("/MulC/{a}/{b}")
    public String MulC(@PathVariable int a,
                      @PathVariable int b)
    {
        return "two numbers multiplication is "+(a*b);
    }

//5) Write a function which accept no from user and calculate square

    @GetMapping("/SquC/{a}")
    public String SquC(@PathVariable int a)
    {
        return "two numbers square is "+(a*a);
    }

//6) Write a function which accept no from user and calculate cube

    @GetMapping("/CubC/{a}")
    public String CubC(@PathVariable int a)
    {
        return "two numbers square is "+(a*a*a);
    }


    @GetMapping("/getdeveloperinfo")
    public String getdeveloperinfo(@RequestParam  String name,
                                   @RequestParam int exp,
                                   @RequestParam String tech)
    {
        return "Name of Developer is "+name+"\nAnd Experience of "+exp+" years "+"\nAnd technology is "+tech;
    }

//    simple interest

    @GetMapping("/simpleinterest")
    public String simpleinterest(@RequestParam float p,
                                 @RequestParam float r,
                                 @RequestParam float t)
    {
        float si = (p * r * t) / 100;
        return "Simple Interest is : "+ si;
    }

//write a function which accept age from user and check user is eligible for vote or not

    @GetMapping("/vote")
    public String vote(@RequestParam int age){

        if(age>=18){
            return "Eligible for vote";
        }else{
            return "Not eligible for vote";
        }
    }


    //write function which accept five subject marks and calculate total marks obtain

    @GetMapping("/totalmarks")
    public String totalmarks(@RequestParam int s1,
                             @RequestParam int s2,
                             @RequestParam int s3,
                             @RequestParam int s4,
                             @RequestParam int s5){

        int total = s1 + s2 + s3 + s4 + s5;

        return "Out of 500 you obtained "+total+ " Marks..!";
    }

//accept bookid title price and author

    @GetMapping("/bookinfo")
    public String bookinfo(@RequestParam int bookid,
                           @RequestParam String title,
                           @RequestParam float price,
                           @RequestParam String author){

        return "Book ID: "+bookid+ "\nTitle of book : "+title+ "\nPrice of book : "+price+ "\nAuthor is : "+author;
    }

//    HomeWork:-

//    1) write function which accept no from user and check it is positive or not

    @GetMapping("/isPositive")
    public String isPositive(@RequestParam int num){

        if(num > 0 ){
            return "Number is Positive";
        }else if(num<0){
            return "Number is Negative";
        }else{
            return "Number is Zero";
        }

    }

//    2) write function which accept total marks from user and check if marks >=40 then student is pass otherwise fail

    @GetMapping("/result")
    public String result(@RequestParam int marks){

        if(marks>=40){
            return "Pass";
        }else{
            return "Fail";
        }
    }

//    3) write function which accept radius and calculate area of circle

    @GetMapping("/AreaOfCic")
    public String AreaOfCir(@RequestParam float r){

        return "Area of circle: "+ (3.14 * r * r);

    }

//    4) write function which accept side and calculate area of square

    @GetMapping("/AreaOfSqu")
    public String AreaOfSqu(@RequestParam double side){

        return "Area of Square is "+(side * side);

    }


}