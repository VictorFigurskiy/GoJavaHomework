package com.victor.practice.modul07.task071;

import java.util.Comparator;

public class SortedByPriceUpCity implements Comparator<Order> {

    public int compare(Order o1, Order o2) {

        int result = Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice());
        if (result != 0) return result;
        result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
        if (result != 0) return result;
        return result;

    }

}
