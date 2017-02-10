package com.victor.practice.modul03.task031;

/**
 * Created by Sonikb on 08.02.2017.
 */
public class Bird {
    final static String SONG = "I am walking\n" + "I am flying\n" + "I am singing" + "\nI am Bird";
    private String name;

    public Bird() {

    }

    public Bird(String name) {
        this.name = name;
        System.out.println(name);
    }

    void sing() {
        System.out.println(SONG);
    }
}
