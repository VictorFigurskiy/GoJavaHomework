package com.victor.practice.modul06.task061;

/**
 * Created by Sonikb on 06.03.2017.
 */
public class ArrayMain {
    public static void main(String[] args) {
        int[] arrayInt = {11, -4, -3, 25, 6, 12, -7, 10, 9, -7};

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
}
