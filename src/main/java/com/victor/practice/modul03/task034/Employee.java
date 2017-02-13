package com.victor.practice.modul03.task034;

/**
 * Created by Sonikb on 08.02.2017.
 */
public class Employee {
    public static void main(String[] args) {
        User person1 = new User("Kuznecov", 120000, 1, "Google", 20000, "UAH");
        person1.paySalary();
        person1.withdraw(900);
        person1.companyNameLenght();
        person1.monthIncreaser(5);
    }
}
