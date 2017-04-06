package com.victor.practice.modul09.task091;

import com.victor.practice.modul04.task042.Currency;
import com.victor.practice.modul07.task071.Order;
import com.victor.practice.modul07.task071.User;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Created by Sonikb on 05.04.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<User> usersList = new ArrayList<>(10);
        List<Order> ordersList = new ArrayList<>(10);

        usersList.add(new User(1, "John", "Wick", "Guam", 15000));
        usersList.add(new User(2, "Victoria", "Sand", "Miami", 16000));
        usersList.add(new User(3, "Maria", "Slow", "Kreston", 9000));
        usersList.add(new User(4, "Gary", "Truman", "New-Jersey", 13000));
        usersList.add(new User(5, "Adam", "Sendler", "Trenton", 46000));
        usersList.add(new User(6, "Ariana", "Grande", "San Francisco", 38000));
        usersList.add(new User(7, "Eric", "Louson", "Charlston", 23000));
        usersList.add(new User(8, "Gary", "Olbrait", "New-York", 14000));
        usersList.add(new User(9, "Carina", "Strock", "Coventry", 19000));
        usersList.add(new User(10, "Victor", "Markov", "Dallas", 65000));

        ordersList.add(new Order(1, 1800, Currency.USD, "Samsung TV", "TV", usersList.get(0)));
        ordersList.add(new Order(2, 900, Currency.USD, "Acer laptop", "Laptops", usersList.get(1)));
        ordersList.add(new Order(3, 400, Currency.USD, "X Box 360", "Consoles", usersList.get(2)));
        ordersList.add(new Order(4, 400, Currency.USD, "X Box 360", "Consoles", usersList.get(2)));
        ordersList.add(new Order(5, 1600, Currency.USD, "Asus laptop", "Laptops", usersList.get(4)));
        ordersList.add(new Order(6, 28000, Currency.UAH, "Apple laptop", "Laptops", usersList.get(5)));
        ordersList.add(new Order(7, 500, Currency.USD, "Samsung Note", "Phones", usersList.get(6)));
        ordersList.add(new Order(8, 13500, Currency.UAH, "PS1", "Consoles", usersList.get(7)));
        ordersList.add(new Order(9, 900, Currency.USD, "Acer laptop", "Laptops", usersList.get(8)));
        ordersList.add(new Order(10, 300, Currency.USD, "Huawey", "Phones", usersList.get(9)));

        sortListByPriceDown(ordersList);
        sortListByPriceUpAndCity(ordersList);
        sortByNameAndShopIDAndCity(ordersList);

        removeDuplicateOrders(ordersList);
        removeElemWithPriceLowerX(ordersList, 1500);
        splitOrdersOn2ListsByCurrency(ordersList);

        splitOnSeparateOrdersListByCity(ordersList);
        findByName(ordersList, "Sendler");
        removeOrdersInUSD(ordersList);

    }

    public static void sortListByPriceDown(List<Order> orderList) {
        System.out.println("\nСортировка за ценой заказа по убыванию:");
        orderList.stream().sorted((o1, o2) -> Integer.compare(o1.getPrice(), o2.getPrice())).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void sortListByPriceUpAndCity(List<Order> orderList) {
        System.out.println("\nСортировка за ценой заказа по возрастанию и за городом пользователя:");
        orderList.stream().sorted((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity())).
                sorted((o1, o2) -> Integer.valueOf(o1.getPrice()).compareTo(o2.getPrice())).collect(Collectors.toCollection(ArrayList<Order>::new)).forEach(System.out::println);
    }

    public static void sortByNameAndShopIDAndCity(List<Order> orderList) {
        System.out.println("\nСортировка за наименованием и идентификатором заказа, и городом пользователя:");
        orderList.stream().sorted((o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity())).
                sorted(Comparator.comparing(order -> order.getShopIdentificator())).
                sorted(Comparator.comparing(Order::getItemName)).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void removeDuplicateOrders(List<Order> ordersList) {
        System.out.println("\nУдаление дублированных данных со списка:");
        ordersList.stream().distinct().collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void removeElemWithPriceLowerX(List<Order> ordersList, Integer x) {
        System.out.println("\nУдаление объектов, где цена меньше " + x + ":");
        ordersList.stream().filter(order -> order.getPrice() > x).collect(Collectors.toList()).forEach(System.out::println);
    }

    public static void splitOrdersOn2ListsByCurrency(List<Order> orderList) {
        System.out.println("\nРазделение списка на 2-а списка:");
        System.out.println("Заказы в долларах:");
        orderList.stream().filter(order -> order.getCurrency().equals(Currency.USD)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("Заказы в гривнах:");
        orderList.stream().filter(order -> order.getCurrency().equals(Currency.UAH)).collect(Collectors.toCollection(ArrayList::new)).forEach(System.out::println);
    }

    public static void splitOnSeparateOrdersListByCity(List<Order> orderList) {
        System.out.println("\nМетод для разделения на отдельные списки по городам:");
        ArrayList<Order> sortedListByCity = orderList.stream().sorted(Comparator.comparing(o -> o.getUser().getCity())).collect(Collectors.toCollection(ArrayList::new));
        
    }

    public static void findByName(List<Order> ordersList, String name) {
        System.out.println("\nПроверяем содержыт ли список фамилию " + name);
        System.out.println(ordersList.stream().anyMatch(order -> order.getUser().getLastName().equals(name)));
        ordersList.stream().filter(order -> order.getUser().getLastName().equals(name)).forEach(System.out::println);
    }

    public static void removeOrdersInUSD(List<Order> orderList) {
        System.out.println("\nУдаление заказов в USD");
        orderList.stream().filter(order -> order.getCurrency() != Currency.USD).collect(Collectors.toList()).forEach(System.out::println);
    }
}
