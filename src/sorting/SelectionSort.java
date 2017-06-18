package sorting;

import org.junit.Test;

/**
 * {7, 4, 5, 3, 1, 8, 2, 6}
 */
public class SelectionSort {

    public void sort(int[] input) {
        for (int i = 0; i < input.length; i++) {
            for (int j = i + 1; j < input.length; j++) {
                if (input[i] > input[j]) {
                    int temp = input[i];
                    input[i] = input[j];
                    input[j] = temp;
                }
            }
        }
        for(Integer i : input){
            System.out.print(i+" ");
        }
    }

    @Test
    public void test() {
        sort(new int[]{7, 4, 5, 3, 1, 8, 2, 6});
    }
}
