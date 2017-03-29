package com.victor.practice.modul08.task082;

import com.victor.practice.modul08.task081.Country;
import com.victor.practice.modul08.task081.IdGenerator;

/**
 * Created by Sonikb on 27.03.2017.
 */
public class Food {
    private int id;
    private String name;
    private Country country;
    private int expiration;

    public Food(String name, Country country, int expiration) {
        id = IdGenerator.idGenerate(name, country, expiration);
        this.name = name;
        this.country = country;
        this.expiration = expiration;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Country getCountry() {
        return country;
    }

    public int getExpiration() {
        return expiration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        return getId() == food.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "Food{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country=" + country +
                ", expiration=" + expiration +
                '}';
    }
}
