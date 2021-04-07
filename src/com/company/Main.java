package com.company;

public class Main {

    public static void main(String[] args) {

        /*Student students = new Student("James", 1234, "IT");*/
        Student students = new Student();

        students.setStudName("James");
        students.setStudId(987);
        students.setStudCurr("Computer Studies");
        System.out.println(students.getStudName() +" " +students.getStudId() + " " +students.getStudCurr());
    }
}
