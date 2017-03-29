package com.victor.practice.modul08.task085;

import com.victor.practice.modul08.task081.Country;
import com.victor.practice.modul08.task082.Food;
import com.victor.practice.modul08.task084.ManageSystem;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * Created by Sonikb on 28.03.2017.
 */
public class Main {
    public static void main(String[] args) {
        Food apple = new Food("Apple", Country.UKRAINE, 60);
        Food apple1 = new Food("Apple", Country.UKRAINE, 60);
        Food banana = new Food("Banana", Country.BRAZIL, 30);
        Food tea = new Food("Tea", Country.CHINA, 100);
        Food corn = new Food("Corn", Country.USA, 60);
        Food coffee = new Food("Coffee", Country.GONDURAS, 90);
        Food cherry = new Food("Cherry", Country.UKRAINE, 120);

        ManageSystem manageSystem = new ManageSystem();

        manageSystem.save(apple, 10);
        manageSystem.save(banana, 30);
        manageSystem.save(tea, 300);
        manageSystem.save(corn, 40);
        manageSystem.save(coffee, 420);

        System.out.println("Цена яблок " + manageSystem.getPrice(apple));

        System.out.println(manageSystem.save(apple1));
        System.out.println("Цена яблок " + manageSystem.getPrice(apple1));

        manageSystem.save(cherry);
        System.out.println("Цена черешни " + manageSystem.getPrice(cherry));

        Set products = manageSystem.getProducts();
        System.out.println("Вывод на экран всех продуктов:");
        for (Object product : products) {
            System.out.println(product);
        }

        List<Double> prices = manageSystem.getPrices();
        System.out.println("Вывод на экран всех цен по продуктам:");
        for (Double price : prices) {
            System.out.println(price);
        }

        System.out.println("Выводим продукты по ID");
        System.out.println(manageSystem.get(1));
        System.out.println(manageSystem.get(coffee.getId()));
        System.out.println(manageSystem.get(corn.getId()));

        System.out.println("Удаляем продукты по ID");
        manageSystem.deleteById(banana.getId());

        System.out.println("Удаляем продукты по объекту:");
        manageSystem.delete(corn);

        System.out.println("Еще раз выводим список продуктов, после удаления:");
        Set products1 = manageSystem.getProducts();
        for (Object o : products1) {
            System.out.println(o);
        }

        //additional tasks
        manageSystem.printProductsSortedByName();

        manageSystem.printProductsSortedByPrice();
    }
}
