package com.victor.practice.modul06.task064;

/**
 * Created by Sonikb on 06.03.2017.
 */
public class CitizenFactory {
    private static class EnglishMan implements Citizen {
        public void sayHello() {
            System.out.println("Hello");
        }
    }

    private static class Chinese implements Citizen {
        public void sayHello() {
            System.out.println("你好");
        }
    }

    private static class Russian implements Citizen {
        public void sayHello() {
            System.out.println("Привет");
        }
    }

    private static class Italian implements Citizen {
        public void sayHello() {
            System.out.println("Ciao");
        }
    }

    public static Citizen getEnglishMan(){
        return new EnglishMan();
    }

    public static Citizen getChinese(){
        return new Chinese();
    }

    public static Citizen getRussian(){
        return new Russian();
    }

    public static Citizen getItalian(){
        return new Italian();
    }
}
