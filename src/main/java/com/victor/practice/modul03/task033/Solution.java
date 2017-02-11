package com.victor.practice.modul03.task033;

import java.util.Date;

/**
 * Created by Sonikb on 08.02.2017.
 */
public class Solution {
    public static void main(String[] args) {
        Date date1 = new Date();
        Date date2 = new Date(1486867791851L);

        Course javaCore = new Course(date1, "Java Core");
        Course javaEE = new Course(date2, "Java EE");
        Course goStart = new Course("Go Start", 16, "Aleksander Jeckovich");
        Course goQA = new Course("GoQA", 42, "Nikolay Vishnevskiy");
        Course html = new Course("HTML", 68, "Fedor Bolshoy");

        Course[] arrayCourse1 = new Course[]{javaCore, javaEE, goStart, goQA, html};
        Course[] arrayCourse2 = {javaCore, javaEE};

        Student student1 = new Student("Gerodot", "Borov", 001);
        Student student2 = new Student("Shevchenko", arrayCourse1);

        CollegeStudent student3 = new CollegeStudent("Gregoriy", "Skovoroda", 001);
        CollegeStudent student4 = new CollegeStudent("Shakira", arrayCourse2);
        CollegeStudent student5 = new CollegeStudent("Anton", "Chubarov", 002, "Bursa", 180, 0564054031160153L, new Course[]{javaCore, javaEE, goStart, goQA}, 24);

        SpecialStudent student6 = new SpecialStudent("Vasya", "Kulibin", 002);
        SpecialStudent student7 = new SpecialStudent("Harvard", new Course[]{html, goStart});
        SpecialStudent student8 = new SpecialStudent("Georgiy", "Chubarov", 002, "Bursa", 175, 0564054031160153L, new Course[]{javaCore, javaEE, goStart, goQA}, 22, 16541651065160165L);
    }
}
