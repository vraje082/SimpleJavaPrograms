package crackingCodingInterview.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 1) Given a m*n array find middle element
 * 2)find the even numbers column wise and return the numbers in array list column wise
 */
public class ArrayExcercises {
    int index = 0;

    public int findMiddleElement(int[][] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input[0].length; j++) {
                index = index + 1;
                if (index == (input.length * input[0].length) / 2) {
                    return input[i][j];
                }
            }
        }
        return 0;
    }

    public List<Integer> findEvenColumnNumbers(int[][] input) {
        List<Integer> list = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        List<List<Integer>> listOfList = new ArrayList<>();

        for (int i = 0; i < input[0].length; i++) {
            for (int j = 0; j < input.length; j++) {
                if (input[j][i] % 2 == 0) {
                    list.add(input[j][i]);
                }

            }
            listOfList.add(list);
            list = new ArrayList<>();

        }
        for (List<Integer> l : listOfList) {
            if (l.size() > max) max = l.size();
        }

        for (List<Integer> l1 : listOfList) {
            if (l1.size() == max) return l1;
        }
        return null;
    }

    @Test
    public void test() {


        int[][] input = new int[5][5];
        input[0][0] = 1;
        input[0][1] = 2;
        input[0][2] = 3;
        input[0][3] = 4;
        input[0][4] = 5;
        input[1][0] = 6;
        input[1][1] = 7;
        input[1][2] = 8;
        input[1][3] = 9;
        input[1][4] = 10;
        input[2][0] = 11;
        input[2][1] = 12;
        input[2][2] = 13;
        input[2][3] = 14;
        input[2][4] = 15;
        input[3][0] = 16;
        input[3][1] = 17;
        input[3][2] = 18;
        input[3][3] = 19;
        input[3][4] = 20;
        input[4][0] = 21;
        input[4][1] = 22;
        input[4][2] = 23;
        input[4][3] = 24;
        input[4][4] = 25;

        List<Integer> list = findEvenColumnNumbers(input);

        list.forEach(item -> System.out.println(item));
    }
}
