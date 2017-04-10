package com.victor.practice.modul10.task102;

/**
 * Created by Sonikb on 10.04.2017.
 */
public class MyOwnException extends Exception {
    private String message;

    public MyOwnException(String message) {
        this.message = message;
    }

    public String getMessage(){
        return this.message;
    }
}
