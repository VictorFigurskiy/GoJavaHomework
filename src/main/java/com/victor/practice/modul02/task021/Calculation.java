package com.victor.practice.modul02.task021;

import java.util.Arrays;

/**
 * Created by Sonikb on 30.01.2017.
 */
public class Calculation {
    public static void main(String[] args) {

        int[] arrayInt = {11, 4, 3, 25, -6, 12, 7, 10, 9, -9};
        double[] arrayDouble = {3.0, -2.6, 5.4, -9.7, 4.6, 9.1, 15.0, 22.1, -6.4, 1.8};

        Calculation sumInt = new Calculation();
        sumInt.sum(arrayInt);

        Calculation sumDouble = new Calculation();
        sumDouble.sum(arrayDouble);

        Calculation minInt = new Calculation();
        minInt.min(arrayInt);

        Calculation minDouble = new Calculation();
        minDouble.min(arrayDouble);

        Calculation maxInt = new Calculation();
        maxInt.max(arrayInt);

        Calculation maxDouble = new Calculation();
        maxDouble.max(arrayDouble);

        Calculation maxPositiveInt = new Calculation();
        maxPositiveInt.maxPositive(arrayInt);

        Calculation maxPositiveDouble = new Calculation();
        maxPositiveDouble.maxPositive(arrayDouble);

        Calculation multiplInt = new Calculation();
        multiplInt.multiplication(arrayInt);

        Calculation multiplDouble = new Calculation();
        multiplDouble.multiplication(arrayDouble);

        Calculation modulusInt = new Calculation();
        modulusInt.modulus(arrayInt);

        Calculation modulDouble = new Calculation();
        modulDouble.modulus(arrayDouble);

        Calculation secondLargestInt = new Calculation();
        secondLargestInt.secondLargest(arrayInt);

        Calculation secondLargestDouble = new Calculation();
        secondLargestDouble.secondLargest(arrayDouble);
    }

    public void sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма массива целых чисел = " + sum);
    }

    public void sum(double[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма массива дробных чисел = " + sum);
    }

    public void min(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (tmp > array[i]) {
                tmp = array[i];
            }
        }
        System.out.println("Минимальный элемент массива целых чисел = " + tmp);
    }

    public void min(double[] array) {
        double tmp = array[0];
        for (int i = 0; i < array.length; i++) {
            if (tmp > array[i]) {
                tmp = array[i];
            }
        }
        System.out.println("Минимальный элемент массива дробных чисел = " + tmp);
    }

    public void max(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (tmp < array[i]) {
                tmp = array[i];
            }
        }
        System.out.println("Максимальный элемент массива целых чисел = " + tmp);
    }

    public void max(double[] array) {
        double tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (tmp < array[i]) {
                tmp = array[i];
            }
        }
        System.out.println("Максимальный элемент массива дробных чисел = " + tmp);
    }

    public void maxPositive(int[] array) {
        int tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0) continue;
            if (tmp < array[i]) {
                tmp = array[i];
            }
        }
        System.out.println("Максимальный позитивный элемент массива целых чисел = " + tmp);
    }

    public void maxPositive(double[] array) {
        double tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < 0) continue;
            if (tmp < array[i]) {
                tmp = array[i];
            }
        }
        System.out.println("Максимальный позитивный элемент массива дробных чисел = " + tmp);
    }

    public void multiplication(int[] array) {
        int multi = 1;
        for (int i = 0; i < array.length; i++) {
            multi *= array[i];
        }
        System.out.println("Результат умножения элементов массива целых чисел = " + multi);
    }

    public void multiplication(double[] array) {
        double multi = 1;
        for (int i = 0; i < array.length; i++) {
            multi *= array[i];
        }
        System.out.println("Результат умножения элементов массива целых чисел = " + multi);
    }

    public void modulus(int[] array) {
        int modul = array[0] % array[array.length - 1];
        System.out.println("Модуль первого и последнего элемента массива целых чисел = " + modul);
    }

    public void modulus(double[] array) {
        double modul = array[0] % array[array.length - 1];
        System.out.println("Модуль первого и последнего элемента массива дробных чисел = " + modul);
    }

    public void secondLargest(int[] array) {
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        System.out.println("Второй по величине элемент массива целых чисел = " + array[array.length - 2]);
    }

    public void secondLargest(double[] array) {
        Arrays.sort(array);
        //System.out.println(Arrays.toString(array));
        System.out.println("Второй по величине элемент массива дробных чисел = " + array[array.length - 2]);
    }
}
