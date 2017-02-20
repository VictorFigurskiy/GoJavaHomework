package com.victor.practice.modul04.task046;

import com.victor.practice.modul04.task042.Currency;
import com.victor.practice.modul04.task043.ChinaBank;
import com.victor.practice.modul04.task043.EUBank;
import com.victor.practice.modul04.task043.USBank;
import com.victor.practice.modul04.task044.User;
import com.victor.practice.modul04.task045.BankSystemimpl;

/**
 * Created by Sonikb on 15.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        BankSystemimpl payPal = new BankSystemimpl();

        USBank bankOfAmerica = new USBank(456465460654L, "USA", Currency.USD, 5, 5000, 546465L, 40000000000L);
        EUBank europaCentrale = new EUBank(20312657489L, "France", Currency.EUR, 2, 4500, 216548L, 25005650006L);
        ChinaBank guangzhouCapital = new ChinaBank(795324679863L, "China", Currency.USD, 4, 1000, 354684L, 35000000000L);

        User jonnyWalker = new User(46540106146L, "Jonny Walker", 150660.65, 5, "Ciklum", 5000, bankOfAmerica);
        User petyaPupkin = new User(4065640685L, "Petya Pupkin", 10000, 2, "Roga&Kopyta", 5000, bankOfAmerica);

        payPal.withdrawOfUser(jonnyWalker, 1000);
        payPal.fundUser(jonnyWalker, 10000);
        payPal.transferMoney(jonnyWalker, petyaPupkin, 5000);
        System.out.println(petyaPupkin.getBalance());
        payPal.paySalary(jonnyWalker);
        payPal.paySalary(petyaPupkin);
        payPal.fundUser(petyaPupkin, 8000);
        payPal.withdrawOfUser(petyaPupkin, 1500);
        System.out.println(jonnyWalker);
        System.out.println(petyaPupkin);

        System.out.println("===========================================");

        User alkapone = new User(5442187956L, "Al Kapone", 450000, 6, "Mafia", 6000, europaCentrale);
        User huandeRamos = new User(95461435445L, "Хуанде Рамос", 320000, 1, "Sevilia", 5000, europaCentrale);

        payPal.withdrawOfUser(alkapone, 20000);
        payPal.fundUser(alkapone, 15000);
        payPal.transferMoney(alkapone, huandeRamos, 12000);
        payPal.paySalary(alkapone);
        System.out.println(alkapone);
        payPal.withdrawOfUser(huandeRamos, 2000);
        payPal.paySalary(huandeRamos);
        payPal.fundUser(huandeRamos, 1000);
        payPal.transferMoney(huandeRamos, alkapone, 2000);
        System.out.println(huandeRamos);

        System.out.println("===========================================");

        User sunCiHun = new User(78094564605L, "Сун Цю Хун", 8000, 11, "Apple", 1000, guangzhouCapital);
        User sumikoTan = new User(87065448460L, "Cумико Тан", 6000, 3, "Omron", 1200, guangzhouCapital);

        payPal.paySalary(sunCiHun);
        payPal.fundUser(sunCiHun, 1500);
        payPal.transferMoney(sunCiHun, petyaPupkin, 20000);
        payPal.withdrawOfUser(sunCiHun, 500);
        System.out.println(sunCiHun);
        payPal.withdrawOfUser(sumikoTan, 100);
        payPal.transferMoney(sumikoTan, sunCiHun, 1000);
        payPal.paySalary(sumikoTan);
        payPal.fundUser(sumikoTan, 10000);
        System.out.println(sumikoTan);
    }
}
