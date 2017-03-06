package com.victor.practice.modul06.task065;

import com.victor.practice.modul06.task064.User;

import java.util.Arrays;

/**
 * Created by Sonikb on 05.03.2017.
 */
public class UserUtils {
    public static User[] uniqueUsers(User[] users) {
        User[] uniqueArray = new User[0];
        User[] clonedArray = users.clone();
        for (int i = 0; i < users.length; i++) {
            for (int j = users.length - 1; j >= 0; j--) {
                if (i == j) break;
                if (users[i].equals(users[j])) {
                    clonedArray[j] = null;
                }
            }
        }
        for (int i = 0; i < clonedArray.length; i++) {
            if (clonedArray[i] != null) {
                uniqueArray = addElementToArray(uniqueArray, clonedArray[i]);
            }
        }
        System.out.println("Уникальные пользователи");
        return uniqueArray;
    }

    public static User[] usersWithContitionalBalance(User[] users, int balance) {
        User[] equalBalanceArray = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i].getBalance() == balance) {
                equalBalanceArray = addElementToArray(equalBalanceArray, users[i]);
            }
        }
        System.out.println("Пользователи с одинаковым балансом");
        return equalBalanceArray;
    }

    public static final User[] paySalaryToUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            users[i].setBalance(users[i].getBalance() + users[i].getSalary());
        }
        System.out.println("Выплата зарплаты всем сотрудникам");
        return users;
    }

    public static final long[] getUsersId(User[] users) {
        long[] usersID = new long[users.length];

        for (int i = 0; i < users.length; i++) {
            usersID[i] = users[i].getId();
        }
        System.out.println("ID всех пользователей");
        return usersID;
    }

    public static User[] deleteEmptyUsers(User[] users) {
        User[] notNullUsers = new User[0];
        for (int i = 0; i < users.length; i++) {
            if (users[i].getFirstName() != null && users[i].getLastName() != null) {
                notNullUsers = addElementToArray(notNullUsers, users[i]);
            }
        }
        System.out.println("Удаление всех не заполненых пользователей");
        return notNullUsers;
    }

    public static User[] addElementToArray(User[] array, User newArrayElement) {
        User[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = newArrayElement;
        return newArray;
    }
}
