package com.victor.practice.modul02.task024;

/**
 * Created by Sonikb on 31.01.2017.
 */
public class FundAccount {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        String ownerName1 = "Oww";
        double fund1 = 100.0;

        FundAccount oww = new FundAccount();
        oww.Replenishment(balances, ownerNames, ownerName1, fund1);
    }

    public void Replenishment(int[] balance, String[] names, String ownerName, double fund) {
        for (int i = 0; i < names.length; i++) {
            if (ownerName == names[i]) {
                System.out.println(names[i] + "  " + (balance[i] + fund));
            }
        }
    }
}
