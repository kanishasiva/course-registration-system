package com.example.Course.Registration.System.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Courseregistry {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;  // no need to provide value
    private String name;
    private String emailid;
    private String coursename;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public Courseregistry(String name, String emailid, String coursename) {
        this.name = name;
        this.emailid = emailid;
        this.coursename = coursename;
    }

    public Courseregistry() {
    }
}
