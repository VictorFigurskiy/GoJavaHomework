package com.victor.practice.modul04.task043;

import com.victor.practice.modul04.task041.Bank;
import com.victor.practice.modul04.task042.Currency;

/**
 * Created by Sonikb on 15.02.2017.
 */
public class USBank extends Bank {
    public final static int ONEPERSENT = 1;
    public final static int TWOPERSENT = 2;
    public final static int FIVEPERSENT = 5;
    public final static int SIXPERSENT = 6;
    public final static int SEVENPERSENT = 7;
    public final static int EIGHTPERSENT = 8;

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

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

    public int getLimitOfFunding() {
        int limits = 0;
        switch (getCurrency()) {
            case USD:
                System.out.println("Без лимитов на зачисление в " + getCurrency());
                limits = Integer.MAX_VALUE;
                break;

            case EUR:
                System.out.println("Лимит зачисления = 10000 " + getCurrency());
                limits = 10000;
                break;
        }
        return limits;
    }

    public int getMonthlyRate() {
        int monthlyRate = 1;
        switch (getCurrency()) {
            case USD:
                monthlyRate = ONEPERSENT;
                break;
            case EUR:
                monthlyRate = TWOPERSENT;
                break;
        }
        return monthlyRate;
    }

    public int getCommission(int summ) {
        int commision = 1;
        switch (getCurrency()) {
            case USD:
                if (summ <= 1000) {
                    commision = FIVEPERSENT;
                } else if (summ > 1000) {
                    commision = SEVENPERSENT;
                }
                break;
            case EUR:
                if (summ <= 1000) {
                    commision = SIXPERSENT;
                } else if (summ > 1000) {
                    commision = EIGHTPERSENT;
                }
                break;
        }
        return commision;
    }
}
