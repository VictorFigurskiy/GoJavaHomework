package com.victor.practice.modul03.task033;

import java.util.Date;

/**
 * Created by Sonikb on 08.02.2017.
 */
public class Solution {
    public static void main(String[] args) {

        Course javaCore = new Course(new Date(), "Java Core");
        Course javaEE = new Course(new Date(1486867791851L), "Java EE");
        Course goStart = new Course("Go Start", 16, "Aleksander Jeckovich");
        Course goQA = new Course("GoQA", 42, "Nikolay Vishnevskiy");
        Course html = new Course("HTML", 68, "Fedor Bolshoy");

        Student student1 = new Student("Gerodot", "Borov", 001);
        Student student2 = new Student("Shevchenko", new Course[]{javaCore, javaEE, goStart, goQA, html});

        CollegeStudent student3 = new CollegeStudent("Gregoriy", "Skovoroda", 001);
        CollegeStudent student4 = new CollegeStudent("Shakira", new Course[]{javaCore, javaEE});
        CollegeStudent student5 = new CollegeStudent("Bursa", 180, 0564054031160153L);

        SpecialStudent student6 = new SpecialStudent("Vasya", "Kulibin", 002);
        SpecialStudent student7 = new SpecialStudent("Harvard", new Course[]{html, goStart});
        SpecialStudent student8 = new SpecialStudent(16541651065160165L);
    }
}
