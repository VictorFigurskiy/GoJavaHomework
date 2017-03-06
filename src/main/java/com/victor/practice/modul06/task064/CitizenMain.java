package com.victor.practice.modul06.task064;

/**
 * Created by Sonikb on 06.03.2017.
 */
public class CitizenMain {
    public static void main(String[] args) {
        Citizen[] citizensArray = {CitizenFactory.getChinese(),CitizenFactory.getEnglishMan(),CitizenFactory.getItalian(),CitizenFactory.getRussian()};

        for (int i = 0; i < citizensArray.length; i++) {
            citizensArray[i].sayHello();
        }
    }
}
