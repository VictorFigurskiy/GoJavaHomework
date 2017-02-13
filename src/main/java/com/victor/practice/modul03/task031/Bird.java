package com.victor.practice.modul03.task031;

/**
 * Created by Sonikb on 08.02.2017.
 */
public class Bird {
    public final static String SONG = "I am walking\n" + "I am flying\n" + "I am singing" + "\nI am Bird";
    private String name;

    public Bird() {

    }

    public Bird(String name) {
        this.name = name;
    }

    public void sing() {
        if (name != null) {
            System.out.println("I am " + name);
        }
        System.out.println(SONG);
        System.out.println();
    }
}
