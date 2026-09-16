package com.controller;

import com.entity.Course;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class CourseController {

    List<Course> courses = new ArrayList<>();


    // 1) Method to add single course record
    @PostMapping("/addcourse")
    public String addCourse(@RequestBody Course c) {

        courses.add(c);

        return "Course record added successfully";
    }


    // 2) Method to find all course records
    @GetMapping("/getcourses")
    public List<Course> getCourses() {

        return courses;
    }


    // 3) Method to add list of courses in original list
    @PostMapping("/addcourselist")
    public String addCourseList(@RequestBody List<Course> courseList) {

        courses.addAll(courseList);

        return "Course list added successfully";
    }


    // 4) Delete course by id
    @DeleteMapping("/deletecourse/{id}")
    public String deleteCourse(@PathVariable int id) {

        for (Course c : courses) {

            if (c.getId() == id) {
                courses.remove(c);
                return "Course deleted successfully";
            }
        }

        return "Course not found";
    }


    // 5) Find course by id
    @GetMapping("/getcourse/{id}")
    public Course getCourseById(@PathVariable int id) {

        for (Course c : courses) {

            if (c.getId() == id) {
                return c;
            }
        }

        return null;
    }
}