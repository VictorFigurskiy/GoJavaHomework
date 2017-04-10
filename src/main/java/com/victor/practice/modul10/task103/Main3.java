package com.victor.practice.modul10.task103;

/**
 * Created by Sonikb on 10.04.2017.
 */
public class Main3 {
    public static void main(String[] args) throws NullPointerException {
        Integer testNull = null;

        try {
            System.out.println(someCalculation(testNull));
            System.out.println("do something else");
        } catch (NullPointerException n) {
            System.err.println("Catch NullPointerException");
        }
    }

    public static Integer someCalculation(Integer x) {
        return x * x;
    }
}
