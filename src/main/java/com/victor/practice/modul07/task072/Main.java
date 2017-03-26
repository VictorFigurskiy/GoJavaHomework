package com.victor.practice.modul07.task072;

import com.victor.practice.modul04.task042.Currency;
import com.victor.practice.modul07.task071.Order;
import com.victor.practice.modul07.task071.SortedByPriceUpCity;
import com.victor.practice.modul07.task071.User;

import java.util.*;

/**
 * Created by Sonikb on 13.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        List<User> usersList = new ArrayList<User>(10);
        List<Order> ordersList = new ArrayList<Order>(10);

        usersList.add(new User(1, "John", "Wick", "New-York", 15000));
        usersList.add(new User(2, "Victoria", "Sand", "Miami", 16000));
        usersList.add(new User(3, "Maria", "Slow", "Kreston", 9000));
        usersList.add(new User(4, "Gary", "Truman", "New-Jersey", 13000));
        usersList.add(new User(5, "Adam", "Sendler", "Trenton", 46000));
        usersList.add(new User(6, "Ariana", "Grande", "San Francisco", 38000));
        usersList.add(new User(7, "Eric", "Louson", "Charlston", 23000));
        usersList.add(new User(8, "Gary", "Olbrait", "Guam", 14000));
        usersList.add(new User(9, "Carina", "Strock", "Coventry", 19000));
        usersList.add(new User(10, "Victor", "Markov", "Dallas", 65000));

        ordersList.add(new Order(1, 1800, Currency.USD, "Samsung TV", "TV", usersList.get(0)));
        ordersList.add(new Order(2, 900, Currency.USD, "Iphone 7", "Phones", usersList.get(1)));
        ordersList.add(new Order(3, 400, Currency.USD, "X Box 360", "Consoles", usersList.get(2)));
        ordersList.add(new Order(4, 400, Currency.USD, "X Box 360", "Consoles", usersList.get(2)));
        ordersList.add(new Order(5, 1600, Currency.USD, "Asus laptop", "Laptops", usersList.get(4)));
        ordersList.add(new Order(6, 28000, Currency.UAH, "Apple laptop", "Laptops", usersList.get(5)));
        ordersList.add(new Order(7, 500, Currency.USD, "Samsung Note", "Phones", usersList.get(6)));
        ordersList.add(new Order(8, 13500, Currency.UAH, "PS1", "Consoles", usersList.get(7)));
        ordersList.add(new Order(9, 900, Currency.USD, "Acer laptop", "Laptops", usersList.get(8)));
        ordersList.add(new Order(10, 300, Currency.USD, "Huawey", "Phones", usersList.get(9)));


        sortByPriceDown(ordersList);
        sortByPriceUpAndCity(ordersList);
        sortByNameAndShopIDAndCity(ordersList);

        //Additional assignment
        removeDuplicateOrdersByAnyField(ordersList);
        removeElemWithPriceLowerX(ordersList, 1500);
        splitOrdersOn2ListsByCurrency(ordersList);
        splitOnOrdersListByCity(ordersList);
    }

    public static void sortByPriceDown(List<Order> ordersList) {
        Collections.sort(ordersList);
        System.out.println("\nСортировка за ценой заказа по убыванию:");
        for (Order order : ordersList) {
            System.out.println(order);
        }
    }

    public static void sortByPriceUpAndCity(List<Order> ordersList) {
        Collections.sort(ordersList, new SortedByPriceUpCity());
        System.out.println("\nСортировка за ценой заказа по возрастанию и за городом пользователя:");
        for (Order order : ordersList) {
            System.out.println(order);
        }
    }

    public static void sortByNameAndShopIDAndCity(List<Order> ordersList) {
        Collections.sort(ordersList, new SortByNameAndShopIDAndCity());
        System.out.println("\nСортировка за наименованием и идентификатором заказа, и городом пользователя:");
        for (Order order : ordersList) {
            System.out.println(order);
        }
    }

    public static void removeDuplicateOrdersByAnyField(List<Order> ordersList) {
        HashSet<Order> ordersSet = new HashSet<Order>();
        ordersSet.addAll(ordersList);
        System.out.println("\nУдаление дублированных данных со списка:");
        for (Order order : ordersSet) {
            System.out.println(order);
        }
    }

    public static void removeElemWithPriceLowerX(List<Order> ordersList, Integer x) {
        Iterator<Order> iter = ordersList.iterator();
        while (iter.hasNext()) {
            Order order = iter.next();
            if (order.getPrice() < x) {
                iter.remove();
            }
        }
        System.out.println("\nУдаление объектов, где цена меньше " + x + ":");
        for (Order order : ordersList) {
            System.out.println(order);
        }
    }

    public static void splitOrdersOn2ListsByCurrency(List<Order> list) {
        ArrayList<Order> orderListUSD = new ArrayList<Order>();
        ArrayList<Order> orderListUAH = new ArrayList<Order>();
        Iterator<Order> iter = list.iterator();
        while (iter.hasNext()) {
            Order order = iter.next();
            if (order.getCurrency().equals(Currency.USD)) {
                orderListUSD.add(order);
            } else if (order.getCurrency().equals(Currency.UAH)) {
                orderListUAH.add(order);
            }
        }
        System.out.println("\nРазделение списка на 2-а списка:");
        System.out.println("Заказы в долларах:");
        for (Order order : orderListUSD) {
            System.out.println(order);
        }
        System.out.println("Заказы в гривнах:");
        for (Order order : orderListUAH) {
            System.out.println(order);
        }
    }

    public static void splitOnOrdersListByCity(List<Order> list) {
        Set<Order> newOrderSet = new TreeSet<Order>(new Comparator<Order>() {
            public int compare(Order o1, Order o2) {
                return Integer.valueOf(o1.getUser().getCity().compareTo(o2.getUser().getCity()));
            }
        });
        newOrderSet.addAll(list);
        Iterator<Order> iterator = newOrderSet.iterator();
        System.out.println("\nМетод для разделения на отдельные списки:");
        while (iterator.hasNext()) {
            Order order = iterator.next();
            for (Order order1 : createNewAListOrders(order)) {
                System.out.println(order1);
            }
        }
    }

    public static List<Order> createNewAListOrders(Order order) {
        List<Order> resultArList = new ArrayList<Order>();
        resultArList.add(order);
        return resultArList;
    }

    private static class SortByNameAndShopIDAndCity implements Comparator<Order> {
        public int compare(Order o1, Order o2) {
            int result = o1.getItemName().compareTo(o2.getItemName());
            if (result != 0) return result;
            result = o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
            if (result != 0) return result;
            result = o1.getUser().getCity().compareTo(o2.getUser().getCity());
            return result;
        }
    }
}
