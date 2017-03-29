package com.victor.practice.modul08.task084;

import com.victor.practice.modul08.task082.Food;
import com.victor.practice.modul08.task083.IManageSystem;

import java.util.*;

/**
 * Created by Sonikb on 28.03.2017.
 */
public class ManageSystem implements IManageSystem<Food> {

    private final double ZERO = 0.0;

    private Map<Food, Double> dataBase = new LinkedHashMap<Food, Double>();

    public Food save(Food obj, double price) {
        dataBase.put(obj, price);
        return obj;
    }

    public Food save(Food obj) {
        if (dataBase.containsKey(obj)) {
            return obj;
        } else dataBase.put(obj, ZERO);
        return obj;
    }

    public void delete(Food obj) {
        dataBase.remove(obj);
    }

    public void deleteById(int id) {
        Iterator<Food> iterator = dataBase.keySet().iterator();
        while (iterator.hasNext()) {
            Food next = iterator.next();
            if (id == next.getId()) {
                iterator.remove();
                return;
            }
        }
        System.out.println("В базе нет такого ID!");
    }

    public Food get(int id) {
        Food res = null;
        for (Food food : dataBase.keySet()) {
            if (food.getId() == id) {
                res = food;
            }
        }
        return res;
    }

    public Double getPrice(Food obj) {
        return dataBase.get(obj);
    }

    public Set getProducts() {
        return dataBase.keySet();
    }

    public List<Double> getPrices() {
        return new ArrayList<Double>(dataBase.values());
    }

    public void printProductsSortedByName() {
        Map<Food, Double> sortedMap = new TreeMap<Food, Double>(new Comparator<Food>() {
            public int compare(Food o1, Food o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        sortedMap.putAll(dataBase);
        System.out.println("Все продукты отсортированные по имени:");
        for (Map.Entry<Food, Double> foodDoubleEntry : sortedMap.entrySet()) {
            System.out.println(foodDoubleEntry);
        }
    }

    public void printProductsSortedByPrice() {
        System.out.println("Все продукты отсортированы по цене:");
        List list = new ArrayList(dataBase.entrySet());
        Collections.sort(list, new Comparator<Map.Entry<Food, Double>>() {
            public int compare(Map.Entry<Food, Double> o1, Map.Entry<Food, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });
        for (Object o : list) {
            System.out.println(o);
        }
    }
}