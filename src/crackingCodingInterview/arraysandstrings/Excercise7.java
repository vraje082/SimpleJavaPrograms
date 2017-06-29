package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row
 * and column are set to 0.
 */
public class Excercise7 {

    public int[][] replace(int[][] input) {
        int i1 = input.length;
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                if (input[i][j] == 0) {
                    input = replaceWithZero(input, i, j);
                }
            }
        }
        return input;
    }

    private int[][] replaceWithZero(int[][] input, int rowNumber, int columnNumber) {
        for (int i = 0; i < input.length; i++) {
            input[i][columnNumber] = 0;
        }

        for (int j = 0; j < input[0].length; j++) {
            input[rowNumber][j] = 0;
        }
        return input;
    }


    @Test
    public void test() {
        int[][] input = new int[4][3];
        input[0][0] = 1;
        input[0][1] = 2;
        input[0][2] = 3;
        input[1][0] = 4;
        input[1][1] = 5;
        input[1][2] = 6;
        input[2][0] = 7;
        input[2][1] = 8;
        input[2][2] = 9;
        input[3][0] = 10;
        input[3][1] = 11;
        input[3][2] = 0;

        input = replace(input);
        System.out.println(input);
    }
}
