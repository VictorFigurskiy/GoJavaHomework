package com.victor.practice.modul10.task104;

import com.victor.practice.modul10.task102.MyOwnException;

/**
 * Created by Sonikb on 10.04.2017.
 */
public class ExceptionInMethodsTest {

    public void f() throws MyOwnException {
        try {
            g();
        }catch (MyOwnException m){
            throw new MyOwnException("Broken here again");
        }
    }

    public void g() throws MyOwnException {
        throw new MyOwnException("Broken here");
    }
}
