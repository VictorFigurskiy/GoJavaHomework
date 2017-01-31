package com.victor.practice.modul02.task023;

/**
 * Created by Sonikb on 30.01.2017.
 */
public class WithdrawalAccount {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName1 = "Ann";
        double withdrawal1 = 100;

        WithdrawalAccount ann = new WithdrawalAccount();
        ann.withdraw(balances, ownerNames, ownerName1, withdrawal1);

        String ownerName2 = "Oww";
        double withdrawal2 = 490;

        WithdrawalAccount oww = new WithdrawalAccount();
        oww.withdraw(balances, ownerNames, ownerName2, withdrawal2);
    }

    public void withdraw(int[] balance, String[] names, String ownerName, double withdrowal) {
        double commision = 1.05;
        double result;
        for (int i = 0; i < names.length; i++) {
            if (ownerName == names[i]) {
                result = balance[i] - (withdrowal * commision);
                if (result < 0) {
                    System.out.println(names[i] + "  NO");
                    result = balance[i];
                } else System.out.println(names[i] + "  " + withdrowal + "  " + result);
            }
        }
    }
}