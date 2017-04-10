package com.victor.practice.modul10.task105;

/**
 * Created by Sonikb on 10.04.2017.
 */
public class TroubleClass {

    public void x() throws MyTestExceptionPack {
        if (true) {
            throw new TestException1();
        }
        if (true) {
            throw new TestException2();
        }
        if (true){
            throw new TestException3();
        }
    }

    public static void main(String[] args) throws MyTestExceptionPack {
        TroubleClass test = new TroubleClass();
        try {
            test.x();
        }catch (MyTestExceptionPack m){
            System.err.println(m.fillInStackTrace());
        }
    }
}
