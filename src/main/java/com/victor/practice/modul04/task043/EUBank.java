package com.victor.practice.modul04.task043;


import com.victor.practice.modul04.task041.Bank;
import com.victor.practice.modul04.task042.Currency;

import static com.victor.practice.modul04.task042.Currency.EUR;
import static com.victor.practice.modul04.task042.Currency.USD;

/**
 * Created by Sonikb on 15.02.2017.
 */
public class EUBank extends Bank {
    public final static int ONEPERSENT = 1;
    public final static int TWOPERSENT = 2;
    public final static int FOURPERSENT = 4;
    public final static int FIVEPERSENT = 5;
    public final static int SEVENPERSENT = 7;


    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

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

    public int getMonthlyRate() {
        int monthlyRate = 1;
        switch (getCurrency()) {
            case USD:
                monthlyRate = 0;
                break;
            case EUR:
                monthlyRate = ONEPERSENT;
                break;
        }
        return monthlyRate;
    }

    public int getCommission(int summ) {
        int commision = 1;
        if (summ <= 1000 && getCurrency().equals(USD)) {
            commision = FIVEPERSENT;
        } else if (summ > 1000 && getCurrency().equals(USD)) {
            commision = SEVENPERSENT;
        }
        if (summ <= 1000 && getCurrency().equals(EUR)) {
            commision = TWOPERSENT;
        } else if (summ > 1000 && getCurrency().equals(EUR)) {
            commision = FOURPERSENT;
        }
        return commision;
    }
}
