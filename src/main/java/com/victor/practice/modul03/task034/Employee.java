package com.victor.practice.modul03.task034;

/**
 * Created by Sonikb on 08.02.2017.
 */
public class Employee {
    public static void main(String[] args) {
        User person1 = new User("SHEVA", 10000, 5, "Google!!!", 20000, "UAH");
        person1.show();
        System.out.println("\n+++++++++++++++++++++++\n");

        person1.paySalary();
        person1.show();
        System.out.println("\n+_+_+_+_+_+_+_+_+_+_+_+_+_+\n");

        person1.withdraw(50000);
        person1.companyNameLenght();
        person1.show();
    }
}
