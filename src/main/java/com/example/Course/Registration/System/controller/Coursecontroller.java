package com.example.Course.Registration.System.controller;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.Courseregistry;
import com.example.Course.Registration.System.service.Courseservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:5500")
public class Coursecontroller {

    @Autowired
    Courseservice cs;

    @GetMapping("/courses")
    public List<Course> availablecourse(){
        return cs.availablecourse();
    }

    @GetMapping("/courses/enrolled")
    public List<Courseregistry> enrolledstudent(){
        return cs.enrolledstudent();
    }

    @PostMapping("/courses/register")
    public String courseregister(@RequestParam("name") String name,
                                 @RequestParam("emailid") String emailid,
                                 @RequestParam("coursename") String coursename){
        cs.courseregister(name,emailid,coursename);
        return "Congratulation "+name+" ..! Enrollment successfull for the "+coursename+" course..!";

    }
}
