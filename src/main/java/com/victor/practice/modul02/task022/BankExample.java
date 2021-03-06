package com.victor.practice.modul02.task022;

/**
 * Created by Sonikb on 30.01.2017.
 */
public class BankExample {
    static final double COMMISION = 1.05;

    public static void main(String[] args) {

        double balance1 = 100;
        double withdrawal1 = 10;

        BankExample client1 = new BankExample();
        client1.withdraw(balance1, withdrawal1);

        double balance2 = 100;
        double withdrawal2 = 99;

        BankExample client2 = new BankExample();
        client2.withdraw(balance2, withdrawal2);
    }

    public void withdraw(double balance, double withdraw) {
        double result, amountOfCommission;
        amountOfCommission = (withdraw * COMMISION) - withdraw;
        result = balance - (withdraw * COMMISION);
        if (result < 0) {
            System.out.println("NO");
            result = balance;
        } else System.out.println("OK " + amountOfCommission + " " + result);

    }
}
