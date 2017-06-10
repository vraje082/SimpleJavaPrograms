package hackerrank;

import org.junit.Test;

import java.util.Scanner;

/**
 * Sample Input
 * 1 1 1 0 0 0
 * 0 1 0 0 0 0
 * 1 1 1 0 0 0
 * 0 0 2 4 4 0
 * 0 0 0 2 0 0
 * 0 0 1 2 4 0
 */
public class TwoDimensionalArray {

    public void sumOfElements(int[][] array) {
        int max = Integer.MIN_VALUE;
        int sum = 0;
        int rows = 6;
        int column = 6;


        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < column - 2; j++) {
                System.out.println("Checking index : (" + i + "," + j + ")");
                System.out.println("HourGlass");
                System.out.println(array[i][j] + " " + array[i][j + 1] + " " + array[i][j + 2]);
                System.out.println("  " + array[i + 1][j + 1]);
                System.out.println(array[i + 2][j] + " " + array[i + 2][j + 1] + " " + array[i + 2][j + 2]);
                sum = array[i][j] + array[i][j + 1] + array[i][j + 2] + array[i + 1][j + 1] + array[i + 2][j] + array[i + 2][j + 1] + array[i + 2][j + 2];
                System.out.println("Sum is : " + sum);
                if (sum > max) {
                    max = sum;
                }
            }

        }

        System.out.println("Result = " + max);
    }

    @Test
    public void test() {
        int[][] input = new int[6][6];
        input[0][0] = 1;
        input[0][1] = 1;
        input[0][2] = 1;
        input[0][3] = 0;
        input[0][4] = 0;
        input[0][5] = 0;
        input[1][0] = 0;
        input[1][1] = 1;
        input[1][2] = 0;
        input[1][3] = 0;
        input[1][4] = 0;
        input[1][5] = 0;
        input[2][0] = 1;
        input[2][1] = 1;
        input[2][2] = 1;
        input[2][3] = 0;
        input[2][4] = 0;
        input[2][5] = 0;
        input[3][0] = 0;
        input[3][1] = 0;
        input[3][2] = 2;
        input[3][3] = 4;
        input[3][4] = 4;
        input[3][5] = 0;
        input[4][0] = 0;
        input[4][1] = 0;
        input[4][2] = 0;
        input[4][3] = 2;
        input[4][4] = 0;
        input[4][5] = 0;
        input[5][0] = 0;
        input[5][1] = 0;
        input[5][2] = 1;
        input[5][3] = 2;
        input[5][4] = 4;
        input[5][5] = 0;

        sumOfElements(input);
    }
}
