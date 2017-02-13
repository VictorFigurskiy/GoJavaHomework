package com.victor.practice.modul03.task034;

/**
 * Created by Sonikb on 08.02.2017.
 */
public class User {
    final static double COMMISION1 = 1.05;
    final static double COMMISION2 = 1.1;
    private String name;
    private double balance;
    private int monthsOfEmployment;
    private String companyName;
    private int salary;
    private String currency;

    public User(String name, double balance, int monthsOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthsOfEmployment = monthsOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    void paySalary() {
        balance += salary;
        System.out.println("Остаток на счету с учетом зарплаты: " + balance);
    }

    void withdraw(double summ) {
        if (summ >= 1000 && summ < balance) {
            balance -= (summ * COMMISION2);
            System.out.println("Вы сняли сумму " + summ + " +10% комиссии банка. Остаток на счете: " + balance);
        }
        if (summ < 1000 && summ < balance) {
            balance -= (summ * COMMISION1);
            System.out.println("Вы сняли сумму " + summ + " +5% комиссии банка. Остаток на счете: " + balance);
        } else System.out.println("Сумма снятия превышает сумму баланса!");
    }

    void companyNameLenght() {
        System.out.println("Длинна имени компании " + companyName.length());
    }

    void monthIncreaser(int addMonth) {
        monthsOfEmployment += addMonth;
        System.out.println("Количество месяцев " + addMonth);
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
