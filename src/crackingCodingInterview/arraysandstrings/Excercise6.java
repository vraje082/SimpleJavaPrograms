package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

/**
 * Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 * place?
 */
public class Excercise6 {

    public int[][] rotate(int[][] input) {
        return input;
    }


    @Test
    public void test() {
        int[][] input = new int[4][4];
        input[0][0] = 1;
        input[0][1] = 2;
        input[0][2] = 3;
        input[0][3] = 13;
        input[1][0] = 4;
        input[1][1] = 5;
        input[1][2] = 6;
        input[1][3] = 14;
        input[2][0] = 7;
        input[2][1] = 8;
        input[2][2] = 9;
        input[2][3] = 15;
        input[3][0] = 10;
        input[3][1] = 11;
        input[3][2] = 0;
        input[3][3] = 16;
    }
}
