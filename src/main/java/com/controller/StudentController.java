package com.controller;

import com.entity.student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {
    // task:accept student record (objct) from user
    //and add it in list
    List<student> students = new ArrayList<>();
    @PostMapping("/addstudent")
    public String addstudent(@RequestBody student s){
        //student s{ rollno=1 name="parag" course="java" marks=80.90y:

        students.add(s);
        return "student record added successfully";
    }
    @GetMapping("getstudent")
    public List<student> getstudent(){

        return students;
    }
    //method to aceept  list from user and add it in orignal llist
    @PostMapping("/addstudlist")
    public String addstudentlist(@RequestBody List<student>studlist){
        students.addAll(studlist);
        return "Student updated";

    }

}
