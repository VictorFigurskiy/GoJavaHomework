package com.victor.practice.modul03.task032;

/**
 * Created by Sonikb on 08.02.2017.
 */
public class ArithmeticOperations {
    public static void main(String[] args) {
        Integer a = 25;
        Integer b = 40;
        Adder obj1 = new Adder();
        System.out.println("Результат суммы метода add = " + obj1.add(a, b));
        System.out.println("Результат сравнения a>=b = " + obj1.check(a, b));
    }
}
