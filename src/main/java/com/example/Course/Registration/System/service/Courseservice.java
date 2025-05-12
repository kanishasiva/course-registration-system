package com.example.Course.Registration.System.service;

import com.example.Course.Registration.System.model.Course;
import com.example.Course.Registration.System.model.Courseregistry;
import com.example.Course.Registration.System.repository.Courseregistryrepo;
import com.example.Course.Registration.System.repository.Courserepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Courseservice {

    @Autowired
    Courserepo cr;

    @Autowired
    Courseregistryrepo crr;

    public List<Course> availablecourse() {
        return cr.findAll();
    }

    public List<Courseregistry> enrolledstudent() {
        return crr.findAll();
    }

    public void courseregister(String name, String emailid, String coursename) {
        Courseregistry courseregistry = new Courseregistry(name,emailid,coursename);
         crr.save(courseregistry);
    }
}
