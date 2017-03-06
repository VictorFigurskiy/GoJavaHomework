package com.victor.practice.modul06.task061;

import java.util.Arrays;

/**
 * Created by Sonikb on 05.03.2017.
 */
public final class ArraysUtils {
    private ArraysUtils() {
    }

    public static void sum(int[] array) {
        int sumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfArray += array[i];
        }
        System.out.println("Сумма массива целых чисел = " + sumOfArray);
    }

    public static void min(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (tmp > array[i]) {
                tmp = array[i];
            }
        }
        System.out.println("Минимальный элемент массива целых чисел = " + tmp);
    }

    public static void max(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (tmp < array[i]) {
                tmp = array[i];
            }
        }
        System.out.println("Максимальный элемент массива целых чисел = " + tmp);
    }

    public static void maxPositive(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (tmp < array[i]) {
                tmp = array[i];
            }
        }
        if (tmp >= 0) {
            System.out.println("Максимальное плюсовое число массива целых чисел = " + tmp);
        } else System.out.println("В данном массиве нет плюсовых чисел!!!");
    }

    public static void multiplication(int[] array) {
        long multiOfArray = 1;
        for (int i = 0; i < array.length; i++) {
            multiOfArray *= array[i];
        }
        System.out.println("Результат умножения элементов массива целых чисел = " + multiOfArray);
    }

    public static void modulus(int[] array) {
        System.out.println("Первый элемент по модулю масива целых чисел = " + Math.abs(array[0]));
        System.out.println("Последний элемент по модулю масива целых чисел = " + Math.abs(array[array.length - 1]));
    }

    public static void secondLargest(int[] array) {
        int[] newArray = array.clone();
        Arrays.sort(newArray);
        System.out.println("Второй по величине элемент массива целых чисел = " + newArray[newArray.length - 2]);
    }

    public static int[] reverse(int[] array) {
        int[] resultArray = new int[array.length];
        int inkrement = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            resultArray[inkrement] = array[i];
            inkrement++;
        }
        System.out.print("Реверс массива ");
        return resultArray;
    }

    public static int[] findEvenElements(int[] array) {
        int[] resultArray = new int[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                resultArray = addIntElementToArray(resultArray, array[i]);
            }
        }
        System.out.print("\nЧетные значения массива ");
        return resultArray;
    }

    public static int[] addIntElementToArray(int[] array, int newElement) {
        int[] newArray = Arrays.copyOf(array, array.length + 1);
        newArray[newArray.length - 1] = newElement;
        return newArray;
    }
}
