package com.victor.practice.modul03.task034;

/**
 * Created by Sonikb on 08.02.2017.
 */
public class User {
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;
    final static double COMMISION1 = 1.05;
    final static double COMMISION2 = 1.1;

    public User(String name, int balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary() {
        balance += salary;
    }

    void withdraw(int summ) {
        double tmp = -1;
        if (summ >= 1000) {
            tmp = balance - (summ * COMMISION1);
        }
        if (summ < 1000) {
            tmp = balance - (summ * COMMISION2);
        }
        if (tmp < 0) {
            System.out.println("Сумма снятия превышает сумму баланса!");
            balance = tmp;
        } else  balance = tmp;
    }

    void show() {
        String text = "Имя пользователя " + name + "\n";
        text += "Компания " + companyName + '\n';
        text += "Зарплата: " + salary + " " + currency + '\n';
        text += "Остаток счета: " + balance + " " + currency + '\n';
        text += "Месяцев отработал: " + monthsOfEmployment;
        System.out.println(text);
    }

    int companyNameLenght() {
        return companyName.length();
    }

    void monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
