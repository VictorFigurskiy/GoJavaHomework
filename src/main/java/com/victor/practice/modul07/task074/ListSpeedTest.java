package com.victor.practice.modul07.task074;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Sonikb on 16.03.2017.
 */
public class ListSpeedTest {
    public static void main(String[] args) {
        List<Integer> integersArListSmall = new ArrayList<Integer>(1000);
        List<Integer> integersArListBig = new ArrayList<Integer>(10000);
        List<Integer> integersLListSmall = new LinkedList<Integer>();
        List<Integer> integersLListBig = new LinkedList<Integer>();

        List<String> stringsArListSmall = new ArrayList<String>(1000);
        List<String> stringsArListBig = new ArrayList<String>(10000);
        List<String> stringsLListSmall = new LinkedList<String>();
        List<String> stringsLListBig = new LinkedList<String>();

        addNewIntegersToList(integersArListSmall, 1000);
        addNewIntegersToList(integersLListSmall, 1000);
        addNewIntegersToList(integersArListBig, 10000);
        addNewIntegersToList(integersLListBig, 10000);

        addNewStringsToList(stringsArListSmall, 1000);
        addNewStringsToList(stringsLListSmall, 1000);
        addNewStringsToList(stringsArListBig, 10000);
        addNewStringsToList(stringsLListBig, 10000);

        setNewElementToList(integersArListSmall, 1000);
        setNewElementToList(integersLListSmall, 1000);
        setNewElementToList(integersArListBig, 10000);
        setNewElementToList(integersLListBig, 10000);

        setNewElementToList(stringsArListSmall, 1000);
        setNewElementToList(stringsLListSmall, 1000);
        setNewElementToList(stringsArListBig, 10000);
        setNewElementToList(stringsLListBig, 10000);

        getElementFromList(integersArListSmall, 1000);
        getElementFromList(integersLListSmall, 1000);
        getElementFromList(integersArListBig, 10000);
        getElementFromList(integersLListBig, 10000);

        getElementFromList(stringsArListSmall, 1000);
        getElementFromList(stringsLListSmall, 1000);
        getElementFromList(stringsArListBig, 10000);
        getElementFromList(stringsLListBig, 10000);

        remuveElementsFromList(integersArListSmall, 1000);
        remuveElementsFromList(integersLListSmall, 1000);
        remuveElementsFromList(integersArListBig, 10000);
        remuveElementsFromList(integersLListBig, 10000);

        remuveElementsFromList(stringsArListSmall, 1000);
        remuveElementsFromList(stringsLListSmall, 1000);
        remuveElementsFromList(stringsArListBig, 10000);
        remuveElementsFromList(stringsLListBig, 10000);
    }

    private static void addNewStringsToList(List<String> list, int numberOfElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add("Test" + i);
        }
        long finishTime = System.nanoTime() - startTime;
        System.out.print("Добавление String, " + (list instanceof ArrayList ? "ArrayList из " : "LinkedList из ") + numberOfElements + " элементов. Время выполнения " + finishTime + " наносекунд или " + (finishTime / 1000000) + " милисекунды\n");
    }

    private static void addNewIntegersToList(List<Integer> list, int numberOfElements) {
        long startTime = System.nanoTime();
        for (int i = 0; i < numberOfElements; i++) {
            list.add(i);
        }
        long finishTime = System.nanoTime() - startTime;
        System.out.print("Добавление Integer, " + (list instanceof ArrayList ? "ArrayList из " : "LinkedList из ") + numberOfElements + " элементов. Время выполнения " + finishTime + " наносекунд или " + (finishTime / 1000000) + " милисекунды\n");
    }

    private static void setNewElementToList(List list, int numberOfElements) {
        if (list.isEmpty()) {
            System.out.println("Сначала нужно заполнмть список!");
            return;
        }
        if (list.get(0) instanceof String) {
            long startTime = System.nanoTime();
            for (int i = 0; i < numberOfElements; i++) {
                list.set(i, "New Text" + i);
            }
            long finishTime = System.nanoTime() - startTime;
            System.out.print("Задаем новые String, " + (list instanceof ArrayList ? "ArrayList из " : "LinkedList из ") + numberOfElements + " элементов. Время выполнения " + finishTime + " наносекунд или " + (finishTime / 1000000) + " милисекунды\n");
        }
        if (list.get(0) instanceof Integer) {
            long startTime = System.nanoTime();
            for (int i = 0; i < numberOfElements; i++) {
                list.set(i, numberOfElements - i);
            }
            long finishTime = System.nanoTime() - startTime;
            System.out.print("Задаем новые Integer, " + (list instanceof ArrayList ? "ArrayList из " : "LinkedList из ") + numberOfElements + " элементов. Время выполнения " + finishTime + " наносекунд или " + (finishTime / 1000000) + " милисекунды\n");
        }
    }

    private static void getElementFromList(List list, int numberOfElements) {
        if (list.isEmpty()) {
            System.out.println("Список пуст");
            return;
        }
        if (list.get(0) instanceof String) {
            long startTime = System.nanoTime();
            for (int i = 0; i < numberOfElements; i++) {
                list.get(i);
            }
            long finishTime = System.nanoTime() - startTime;
            System.out.print("Получаем значения по индексу от String, " + (list instanceof ArrayList ? "ArrayList из " : "LinkedList из ") + numberOfElements + " элементов. Время выполнения " + finishTime + " наносекунд или " + (finishTime / 1000000) + " милисекунды\n");
        }
        if (list.get(0) instanceof Integer) {
            long startTime = System.nanoTime();
            for (int i = 0; i < numberOfElements; i++) {
                list.get(i);
            }
            long finishTime = System.nanoTime() - startTime;
            System.out.print("Получаем значения по индексу от Integer, " + (list instanceof ArrayList ? "ArrayList из " : "LinkedList из ") + numberOfElements + " элементов. Время выполнения " + finishTime + " наносекунд или " + (finishTime / 1000000) + " милисекунды\n");
        }
    }

    private static void remuveElementsFromList(List list, int numberOfElements) {
        if (list.isEmpty()) {
            System.out.println("Нечего удалать, список пуст!");
            return;
        }
        if (!(list.isEmpty()) && list.get(0) instanceof String) {
            long startTime = System.nanoTime();
            Iterator<String> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
            long finishTime = System.nanoTime() - startTime;
            System.out.print("Удаляем элементы списка String, " + (list instanceof ArrayList ? "ArrayList из " : "LinkedList из ") + numberOfElements + " элементов. Время выполнения " + finishTime + " наносекунд или " + (finishTime / 1000000) + " милисекунды\n");
        }
        if (!(list.isEmpty()) && list.get(0) instanceof Integer) {
            long startTime = System.nanoTime();
            Iterator<Integer> iterator = list.iterator();
            while (iterator.hasNext()) {
                iterator.next();
                iterator.remove();
            }
            long finishTime = System.nanoTime() - startTime;
            System.out.print("Удаляем элементы списка Integer, " + (list instanceof ArrayList ? "ArrayList из " : "LinkedList из ") + numberOfElements + " элементов. Время выполнения " + finishTime + " наносекунд или " + (finishTime / 1000000) + " милисекунды\n");
        }
    }
}
