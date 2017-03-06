package com.victor.practice.modul06.task066;

import com.victor.practice.modul06.task064.User;
import com.victor.practice.modul06.task065.UserUtils;

/**
 * Created by Sonikb on 05.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        User[] users = {new User(1, "John", "Snouden", 4000, 58000),
                new User(2, "Li", "Cooper", 3000, 25000),
                new User(3, "Cristoffer", "Sundens", 5000, 15000),
                new User(4, "John", "Cooper", 3000, 1000),
                new User(5, null, null, 0, 0),
                new User(6, "Airton", "Senna", 20000, 150000),
                new User(7, "John", "Cooper", 3000, 1000),
                new User(8, "Gary", "Truman", 6000, 12200),
                new User(9, null, null, 0, 0),
                new User(10, "John", "Cooper", 3000, 1000)};

        for (User user : UserUtils.uniqueUsers(users)) {
            System.out.println(user);
        }

        for (User user : UserUtils.usersWithContitionalBalance(users, 1000)) {
            System.out.println(user);
        }

        for (User user : UserUtils.paySalaryToUsers(users)) {
            System.out.println(user);
        }

        for (long l : UserUtils.getUsersId(users)) {
            System.out.print(l + " ");
        }
        System.out.println("");

        for (User user : UserUtils.deleteEmptyUsers(users)) {
            System.out.println(user);
        }
    }
}
