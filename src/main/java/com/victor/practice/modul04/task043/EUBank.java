package com.victor.practice.modul04.task043;


import com.victor.practice.modul04.task041.Bank;
import com.victor.practice.modul04.task042.Currency;

import static com.victor.practice.modul04.task042.Currency.EUR;
import static com.victor.practice.modul04.task042.Currency.USD;

/**
 * Created by Sonikb on 15.02.2017.
 */
public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limits = 0;
        switch (getCurrency()) {
            case USD:
                System.out.println("Лимит снятия банка = 2000 " + getCurrency());
                limits = 2000;
                break;

            case EUR:
                System.out.println("Лимит снятия банка = 2200 " + getCurrency());
                limits = 2200;
                break;
        }
        return limits;
    }

    @Override
    public int getLimitOfFunding() {
        int limits = 0;
        switch (getCurrency()) {
            case USD:
                System.out.println("Лимит зачисления = 10000 " + getCurrency());
                limits = 10000;
                break;

            case EUR:
                System.out.println("Лимит зачисления = 20000 " + getCurrency());
                limits = 20000;
                break;
        }
        return limits;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate = 1;
        switch (getCurrency()) {
            case USD:
                monthlyRate = 0;
                break;
            case EUR:
                monthlyRate = 1;
                break;
        }
        return monthlyRate;
    }

    @Override
    public int getCommission(int summ) {
        int commision = 1;
        if (summ <= 1000 && getCurrency().equals(USD)) {
            commision = 5;
        } else if (summ > 1000 && getCurrency().equals(USD)) {
            commision = 7;
        }
        if (summ <= 1000 && getCurrency().equals(EUR)) {
            commision = 2;
        } else if (summ > 1000 && getCurrency().equals(EUR)) {
            commision = 4;
        }
        return commision;
    }
}
