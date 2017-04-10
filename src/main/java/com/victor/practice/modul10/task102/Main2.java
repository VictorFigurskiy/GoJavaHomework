package com.victor.practice.modul10.task102;

/**
 * Created by Sonikb on 10.04.2017.
 */
public class Main2 {
    public static void main(String[] args) throws MyOwnException {
        try {
            System.err.println("doing something...");
            throw new MyOwnException("Something is broken");
        }catch (MyOwnException m){
            System.err.println(m.getMessage());
        }catch (Exception e){
            System.err.println("Maybe we are here?");
        }finally {
            System.err.println("always done this section");
        }
    }
}
