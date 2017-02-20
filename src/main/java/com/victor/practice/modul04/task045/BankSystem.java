package com.victor.practice.modul04.task045;

import com.victor.practice.modul04.task044.User;

/**
 * Created by Sonikb on 15.02.2017.
 */
public interface BankSystem {
    void withdrawOfUser(User user, int amount);

    void fundUser(User user, int amount);

    void transferMoney(User fromUser, User toUser, int amount);

    void paySalary(User user);
}
