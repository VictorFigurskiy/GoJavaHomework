package com.victor.practice.modul04.task043;

import com.victor.practice.modul04.task041.Bank;
import com.victor.practice.modul04.task042.Currency;

/**
 * Created by Sonikb on 15.02.2017.
 */
public class ChinaBank extends Bank {

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    @Override
    public int getLimitOfWithdrawal() {
        int limits = 0;
        switch (getCurrency()) {
            case USD:
                System.out.println("Лимит снятия банка = 100 " + getCurrency());
                limits = 100;
                break;

            case EUR:
                System.out.println("Лимит снятия банка = 150 " + getCurrency());
                limits = 150;
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
                limits = 10000;
                break;

            case EUR:
                System.out.println("Лимит зачисления = 10000 " + getCurrency());
                limits = 5000;
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
                monthlyRate = 0;
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
                    commision = 3;
                } else if (summ > 1000) {
                    commision = 5;
                }
                break;
            case EUR:
                if (summ <= 1000) {
                    commision = 10;
                } else if (summ > 1000) {
                    commision = 11;
                }
                break;
        }
        return commision;
    }
}
