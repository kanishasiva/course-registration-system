package com.example.Course.Registration.System.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity //we need orm to connect object and relational(table) so we are using @entity
public class Course {

    @Id
    private int courseid;
    private String coursename;
    private String trainername;
    private int durationinweek;

    public int getCourseid() {
        return courseid;
    }

    public void setCourseid(int courseid) {
        this.courseid = courseid;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getTrainername() {
        return trainername;
    }

    public void setTrainername(String trainername) {
        this.trainername = trainername;
    }

    public int getDurationinweek() {
        return durationinweek;
    }

    public void setDurationinweek(int durationinweek) {
        this.durationinweek = durationinweek;
    }

    public Course() {
    }
}
