package com.victor.practice.modul07.task073;

import com.victor.practice.modul04.task042.Currency;
import com.victor.practice.modul07.task071.Order;
import com.victor.practice.modul07.task071.SortedByPriceUpCity;
import com.victor.practice.modul07.task071.User;

import java.util.*;

/**
 * Created by Sonikb on 14.03.2017.
 */
public class Main2 {
    public static void main(String[] args) {

        User user1 = (new User(1, "John", "Wick", "New-York", 15000));
        User user2 = (new User(2, "Victoria", "Sand", "Miami", 16000));
        User user3 = (new User(3, "Maria", "Slow", "Kreston", 9000));
        User user4 = (new User(4, "Gary", "Truman", "New-Jersey", 13000));
        User user5 = (new User(5, "Adam", "Sendler", "Trenton", 46000));
        User user6 = (new User(6, "Ariana", "Grande", "San Francisco", 38000));
        User user7 = (new User(7, "Eric", "Petrov", "Charlston", 23000));
        User user8 = (new User(8, "Gary", "Olbrait", "Guam", 14000));
        User user9 = (new User(9, "Carina", "Petrov", "Coventry", 19000));
        User user10 = (new User(10, "Victor", "Markov", "Dallas", 65000));

        TreeSet<Order> ordersSet = new TreeSet<Order>(new SortedByPriceUpCity());
        ordersSet.add(new Order(1, 1800, Currency.USD, "Samsung TV", "TV", user1));
        ordersSet.add(new Order(2, 900, Currency.USD, "Iphone 7", "Phones", user2));
        ordersSet.add(new Order(3, 400, Currency.USD, "X Box 360", "Consoles", user3));
        ordersSet.add(new Order(3, 400, Currency.USD, "X Box 360", "Consoles", user4));
        ordersSet.add(new Order(5, 7600, Currency.UAH, "Asus laptop", "Laptops", user5));
        ordersSet.add(new Order(6, 2500, Currency.USD, "Apple laptop", "Laptops", user6));
        ordersSet.add(new Order(7, 500, Currency.USD, "Samsung Note", "Phones", user7));
        ordersSet.add(new Order(8, 15000, Currency.UAH, "PS1", "Consoles", user8));
        ordersSet.add(new Order(9, 900, Currency.USD, "Acer laptop", "Laptops", user9));
        ordersSet.add(new Order(10, 800, Currency.USD, "Huawey", "Phones", user10));

        findByName(ordersSet, "Petrov");
        findOrderWithHighestPrice(ordersSet);
        remuveOrdersWithUSD(ordersSet);
    }

    public static void findByName(TreeSet<Order> ordersSet, String name) {
        System.out.println("\nПроверяем содержыт ли объкт фамилию " + name);
        for (Order order : ordersSet) {
            if (order.getUser().getLastName().equals(name)) {
                System.out.println(order);
            }
        }
    }

    public static void findOrderWithHighestPrice(TreeSet<Order> orderTreeSet) {
        TreeSet<Order> orderSet = new TreeSet<Order>(new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                return Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice());
            }
        });
        orderSet.addAll(orderTreeSet);
        System.out.println("\nЗаказ с наибольшей ценой заказа:");
        System.out.println(orderSet.last());
    }

    public static void remuveOrdersWithUSD(TreeSet<Order> orderTreeSet) {
        Iterator<Order> iterator = orderTreeSet.iterator();
        while (iterator.hasNext()) {
            Order order = iterator.next();
            if (order.getCurrency().equals(Currency.USD)) {
                iterator.remove();
            }
        }
        System.out.println("\nВывод заказоа в грн.");
        for (Order order : orderTreeSet) {
            System.out.println(order);
        }
    }
}
