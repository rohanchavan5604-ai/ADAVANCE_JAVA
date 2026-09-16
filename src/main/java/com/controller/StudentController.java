package com.controller;

import com.entity.student;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    // task: accept student record (object) from user
    // and add it in list
    List<student> students = new ArrayList<>();


    // Add single student
    @PostMapping("/addstudent")
    public String addstudent(@RequestBody student s) {

        // student s { rollno=1, name="parag", course="java", marks=80.90 }

        students.add(s);

        return "student record added successfully";
    }


    // Get all student records
    @GetMapping("/getstudent")
    public List<student> getstudent() {

        return students;
    }


    // Method to accept list from user
    // and add it in original list
    @PostMapping("/addstudlist")
    public String addstudentlist(@RequestBody List<student> studlist) {

        students.addAll(studlist);

        return "Student updated";
    }


    // Patch @PatchMapping
    @PatchMapping("/updatestudent")
    public String updatestudent(@RequestParam int rollno,
                                @RequestBody student newstud) {

        // no arg -- newstud name null course null marks 0.0

        // setter method
        // name marks course


        // Step 1: Create empty object of Student
        student existingstudent = new student();

        // rollno 0 name null course null marks 0.0


        // Step 2: find matching record for given rollno
        for (student s : students) {

            if (s.getRollno() == rollno) {

                existingstudent = s;
            }
        }


        // Step 3: check matching record found for rollno or not
        if (existingstudent.getRollno() == 0) {

            return "No matching record found for given rollno";
        }


        //step 4: check newstud contains at least one variable to update data
        if (newstud.getName() == null
                && newstud.getCourse() == null
                && newstud.getMarks() == 0.0) {
            //newstudent ---> name course marks
            return "No new data provided for updation";
        }

        // newstudent --> name course marks


        // Step 5: update only provided variables

        if (newstud.getName() != null) {

            existingstudent.setName(newstud.getName());
        }


        if (newstud.getCourse() != null) {

            existingstudent.setCourse(newstud.getCourse());
        }


        if (newstud.getMarks() != 0.0) {

            existingstudent.setMarks(newstud.getMarks());
        }


        return "Student record updated successfully";

    }
        //using put update student record
        @PutMapping("/studentput")
        public String studentput(@RequestParam int rollno,
        @RequestBody student newstud) {
            //step 1:create empty object of student
            student existingstudent = new student();

            //step:find matching record for rollno
            for (student s : students) {
                if (s.getRollno() == rollno) {
                    existingstudent = s;
                }
            }

            //step 3:check existingstudent is matching record for given rollno
            if (existingstudent.getRollno() == 0) {
                return "No matching record found for given rollno";
            }

            //step 4:check newstud contains all variables
            if (newstud.getName() == null
                    || newstud.getCourse() == null
                    || newstud.getMarks() == 0.0) {
                return "Need to provide entire object";
            }

            //step 5:
            existingstudent.setName(newstud.getName());
            existingstudent.setCourse(newstud.getCourse());
            existingstudent.setMarks(newstud.getMarks());

            // step 6:
            return "Student record update successfully";
        }

}