package com.victor.practice.modul08.task081;

/**
 * Created by Sonikb on 27.03.2017.
 */
public final class IdGenerator {
    public static int idGenerate(String name, Country country, int expiration) {
        return name.hashCode() + country.ordinal() + expiration;
    }
}