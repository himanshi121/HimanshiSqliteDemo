package com.example.himanshisqlitedemo.model;

public class Course {
    int id;
    String title;
    int duration;
    float fee;

    public Course() {
    }

    public Course( String title, int duration, float fee) {
        this.title = title;
        this.duration = duration;
        this.fee = fee;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public float getFee() {
        return fee;
    }

    public void setFee(float fee) {
        this.fee = fee;
    }
}
