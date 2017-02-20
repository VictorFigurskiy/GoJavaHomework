package additional_tasks.task02;

import java.util.Arrays;

/**
 * Created by Sonikb on 15.02.2017.
 */
public class DoubleArraySpiral {
    public static void main(String[] args) {
        DoubleArraySpiral doubleArraySpiral = new DoubleArraySpiral();
        int[][] testArray2 = doubleArraySpiral.getFilledSpiralArray(3, 3);
        for (int i = 0; i < testArray2.length; i++) {
            System.out.println(Arrays.toString(testArray2[i]));
        }
    }

    public int[][] getFilledSpiralArray(int x, int y) {
        int[][] resultArray = new int[y][x];
        int inkrement = 1;

        for (int i = 0; i < y; i++) {
            for (int j = 0; j < x; j++) {
                resultArray[i][j]=inkrement++;
                }
            }
        return resultArray;
    }
}
