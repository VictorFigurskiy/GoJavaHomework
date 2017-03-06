package com.victor.practice.modul02.task021;

import com.victor.practice.modul06.task061.ArraysUtils;

import java.util.Arrays;

/**
 * Created by Sonikb on 30.01.2017.
 */
public class Calculation {
    public static void main(String[] args) {

        int[] arrayInt = {11, -4, -3, 25, 6, 12, -7, 10, 9, -7};
        double[] arrayDouble = {-3.0, 2.6, -5.4, 9.8, 12.2, 9.1, 15.0, 22.1, -6.4, 1.7};

        Calculation calculation = new Calculation();
        calculation.sum(arrayInt);
        calculation.sum(arrayDouble);
        calculation.min(arrayInt);
        calculation.min(arrayDouble);
        calculation.max(arrayInt);
        calculation.max(arrayDouble);
        calculation.maxPositive(arrayInt);
        calculation.maxPositive(arrayDouble);
        calculation.multiplication(arrayInt);
        calculation.multiplication(arrayDouble);
        calculation.modulus(arrayInt);
        calculation.modulus(arrayDouble);
        calculation.secondLargest(arrayInt);
        calculation.secondLargest(arrayDouble);

        System.out.println("\nHomeWork 6");
        ArraysUtils.sum(arrayInt);
        ArraysUtils.min(arrayInt);
        ArraysUtils.max(arrayInt);
        ArraysUtils.maxPositive(arrayInt);
        ArraysUtils.multiplication(arrayInt);
        ArraysUtils.modulus(arrayInt);
        ArraysUtils.secondLargest(arrayInt);

        for (int i : ArraysUtils.reverse(arrayInt)) {
            System.out.print(i + " ");
        }

        for (int i : ArraysUtils.findEvenElements(arrayInt)) {
            System.out.print(i + " ");
        }

    }

    public void sum(int[] array) {
        int sumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfArray += array[i];
        }
        System.out.println("Сумма массива целых чисел = " + sumOfArray);
    }

    public void sum(double[] array) {
        double sumOfArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumOfArray += array[i];
        }
        System.out.println("Сумма массива дробных чисел = " + sumOfArray);
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
        for (int i = 1; i < array.length; i++) {
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
            if (tmp < array[i]) {
                tmp = array[i];
            }
        }
        if (tmp >= 0) {
            System.out.println("Максимальное плюсовое число массива целых чисел = " + tmp);
        } else System.out.println("В данном массиве нет плюсовых чисел!!!");
    }

    public void maxPositive(double[] array) {
        double tmp = array[0];
        for (int i = 1; i < array.length; i++) {
            if (tmp < array[i]) {
                tmp = array[i];
            }
        }
        if (tmp >= 0) {
            System.out.println("Максимальное плюсовое число массива дробных чисел = " + tmp);
        } else System.out.println("В данном массиве нет плюсовых чисел!!!");
    }

    public void multiplication(int[] array) {
        long multiOfArray = 1;
        for (int i = 0; i < array.length; i++) {
            multiOfArray *= array[i];
        }
        System.out.println("Результат умножения элементов массива целых чисел = " + multiOfArray);
    }

    public void multiplication(double[] array) {
        double multiOfArray = 1;
        for (int i = 0; i < array.length; i++) {
            multiOfArray *= array[i];
        }
        System.out.println("Результат умножения элементов массива целых чисел = " + multiOfArray);
    }

    public void modulus(int[] array) {
        System.out.println("Первый элемент по модулю масива целых чисел = " + Math.abs(array[0]));
        System.out.println("Последний элемент по модулю масива целых чисел = " + Math.abs(array[array.length - 1]));
    }

    public void modulus(double[] array) {
        System.out.println("Первый элемент по модулю масива дробных чисел = " + Math.abs(array[0]));
        System.out.println("Последний элемент по модулю масива дробных чисел = " + Math.abs(array[array.length - 1]));
    }

    public void secondLargest(int[] array) {
        int[] newArray = array.clone();
        Arrays.sort(newArray);
        System.out.println("Второй по величине элемент массива целых чисел = " + newArray[newArray.length - 2]);
    }

    public void secondLargest(double[] array) {
        double[] newArray = array.clone();
        Arrays.sort(newArray);
        System.out.println("Второй по величине элемент массива дробных чисел = " + newArray[newArray.length - 2]);
    }
}
