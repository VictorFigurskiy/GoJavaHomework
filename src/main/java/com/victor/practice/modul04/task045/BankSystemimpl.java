package com.victor.practice.modul04.task045;

import com.victor.practice.modul04.task044.User;

/**
 * Created by Sonikb on 15.02.2017.
 */
public class BankSystemimpl implements BankSystem {

    public void withdrawOfUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfWithdrawal()) {
            double result = user.getBalance() - amount;
            user.setBalance(result);
            System.out.println("Cумма снятия: " + amount + " " + user.getBank().getCurrency() + "\nОстаток на счету пользователя: " + user.getBalance() + " " + user.getBank().getCurrency());
        } else System.out.println("Превышены лимиты снятия банка!");
    }

    public void fundUser(User user, int amount) {
        if (amount <= user.getBank().getLimitOfFunding()) {
            double result = user.getBalance() + amount;
            user.setBalance(result);
            System.out.println("Сумма зачисления: " + amount + " " + user.getBank().getCurrency() + "\nОстаток на счету пользователя: " + user.getBalance() + " " + user.getBank().getCurrency());
        } else System.out.println("Сумма зачисления превышает лимиты банка!");

    }

    public void transferMoney(User fromUser, User toUser, int amount) {
        if (amount <= fromUser.getBalance()) {
            fromUser.setBalance(fromUser.getBalance() - amount - (amount / 100 * fromUser.getBank().getCommission(amount)));
            toUser.setBalance(toUser.getBalance() + amount);
            System.out.println("Пользователь " + fromUser.getName() + " перевел сууму: " + amount + " " + fromUser.getBank().getCurrency() + ". С учетом коммисии за данный перевод " + fromUser.getBank().getCommission(amount) + "%." + "\nОстаток на счете " + fromUser.getBalance() + " " + fromUser.getBank().getCurrency());
        } else System.out.println("Операция невозможна!!! Сумма перевода превышает остаток на счету!");
    }

    public void paySalary(User user) {
        if (user.getMonthsOfEmployment() > 1) {
            user.setBalance(user.getBalance() + user.getBank().getAvrSalaryOfEmployee() + user.getBank().moneyPaidMonthlyForSalary());
            System.out.println("Зачисление зарплаты: " + user.getBank().getAvrSalaryOfEmployee() + " " + user.getBank().getCurrency() + ". C учетом месячной ставки: " + user.getBank().moneyPaidMonthlyForSalary() + " " + user.getBank().getCurrency() + ". Остаток на счете: " + user.getBalance() + " " + user.getBank().getCurrency());
        } else
            System.out.println("Зачисление зарплаты: " + user.getBank().getAvrSalaryOfEmployee() + " " + user.getBank().getCurrency() + "Остаток на счете: " + user.getBalance() + " " + user.getBank().getCurrency());
    }
}
