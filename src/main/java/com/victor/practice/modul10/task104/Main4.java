package com.victor.practice.modul10.task104;

import com.victor.practice.modul10.task102.MyOwnException;

/**
 * Created by Sonikb on 10.04.2017.
 */
public class Main4 {
    public static void main(String[] args) throws MyOwnException {
        try {
            new ExceptionInMethodsTest().f();
        }catch (MyOwnException m){
            System.out.println(m.getMessage());
        }

    }
}
