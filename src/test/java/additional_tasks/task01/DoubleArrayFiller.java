package additional_tasks.task01;

import java.util.Arrays;

/**
 * Created by Sonikb on 13.02.2017.
 */
public class DoubleArrayFiller {
    public static void main(String[] args) {
        DoubleArrayFiller doubleArray = new DoubleArrayFiller();
        int[][] testArray = doubleArray.getFilledArray(3, 3);
        for (int i = 0; i < testArray.length; i++) {
            System.out.println(Arrays.toString(testArray[i]));
        }
    }

    public int[][] getFilledArray(int x, int y) {
        int[][] resultArray = new int[y][x];
        int inkrement = 1;
        for (int i = 0; i < resultArray.length; i++) {
            for (int j = 0; j < resultArray[i].length; j++) {
                    resultArray[i][j]=inkrement++;
            }
        }
        return resultArray;
    }
}

