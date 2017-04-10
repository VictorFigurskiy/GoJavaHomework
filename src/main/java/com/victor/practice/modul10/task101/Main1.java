package com.victor.practice.modul10.task101;

/**
 * Created by Sonikb on 10.04.2017.
 */
public class Main1 {
    public static void main(String[] args) throws Exception{
        try {
            throw new ReflectiveOperationException();
        }catch (Exception e){
            System.err.println("Printed in Exception catch");
        }finally {
            System.err.println("Printed in finally");
        }
        System.err.println("Program still able to work");
    }
}
