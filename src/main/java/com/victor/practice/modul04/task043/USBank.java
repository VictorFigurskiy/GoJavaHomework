package com.victor.practice.modul04.task043;

import com.victor.practice.modul04.task041.Bank;
import com.victor.practice.modul04.task042.Currency;

/**
 * Created by Sonikb on 15.02.2017.
 */
public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limits = 0;
        switch (getCurrency()) {
            case USD:
                System.out.println("Лимит снятия банка = 1000 " + getCurrency());
                limits = 1000;
                break;

            case EUR:
                System.out.println("Лимит снятия банка = 1200 " + getCurrency());
                limits = 1200;
                break;
        }
        return limits;
    }

    @Override
    public int getLimitOfFunding() {
        int limits = 0;
        switch (getCurrency()) {
            case USD:
                System.out.println("Без лимитов на зачисление в " + getCurrency());
                limits = 2147483647;
                break;

            case EUR:
                System.out.println("Лимит зачисления = 10000 " + getCurrency());
                limits = 10000;
                break;
        }
        return limits;
    }

    @Override
    public int getMonthlyRate() {
        int monthlyRate = 1;
        switch (getCurrency()) {
            case USD:
                monthlyRate = 1;
                break;
            case EUR:
                monthlyRate = 2;
                break;
        }
        return monthlyRate;
    }

    @Override
    public int getCommission(int summ) {
        int commision = 1;
        switch (getCurrency()) {
            case USD:
                if (summ <= 1000) {
                    commision = 5;
                } else if (summ > 1000) {
                    commision = 7;
                }
                break;
            case EUR:
                if (summ <= 1000) {
                    commision = 6;
                } else if (summ > 1000) {
                    commision = 8;
                }
                break;
        }
        return commision;
    }
}
