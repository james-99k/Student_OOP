package com.company;

public class Main {

    public static void main(String[] args) {

        Student students = new Student("James", 1234, "IT");
        System.out.println(students.getStudName() +" " +students.getStudId() + " " +students.getStudCurr());
    }
}
