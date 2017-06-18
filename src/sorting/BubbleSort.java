package sorting;

import org.junit.Test;

/**
 * [7, 4, 5, 3, 1, 8, 2, 6]
 */
public class BubbleSort {

    public void sort(int[] input) {

        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                if ((i != j) && (j != input.length - 1)) {
                    System.out.println("j : " + input[j] + ", j+1 " + input[j + 1]);
                    if (input[j] > input[j + 1]) {
                        int temp = input[j];
                        input[j] = input[j + 1];
                        input[j + 1] = temp;
                    }
                }
            }
        }

        for (Integer i : input) {
            System.out.print(i + " ");
        }
    }

    @Test
    public void test() {
        sort(new int[]{7, 4, 5, 3, 1, 8, 2, 6});
    }
}
