package com.example.assignmentproject;

public class Course{
    public void displayCourse(){
        System.out.println("Studying: Object-Oriented Programming");
    }
}

class Student {
    private final Course course;

    public Student(Course course) {
        this.course = course;
    }


    public void startLearning() {
        course.displayCourse();
        System.out.println("Student has started learning.");
    }
}