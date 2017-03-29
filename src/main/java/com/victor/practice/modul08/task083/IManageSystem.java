package com.victor.practice.modul08.task083;

import java.util.List;
import java.util.Set;

/**
 * Created by Sonikb on 28.03.2017.
 */
public interface IManageSystem<T> {
    T save(T obj, double price);

    T save(T obj);

    void delete(T obj);

    void deleteById(int id);

    T get(int id);

    Double getPrice(T obj);

    Set<T> getProducts();

    List<Double> getPrices();

    void printProductsSortedByName(); // выводит список «продукт-цена», отсортированных по имени продукта.

    void printProductsSortedByPrice(); // выводит список «продукт-цена», отсортированных по цене продукта (по возрастанию).


}
