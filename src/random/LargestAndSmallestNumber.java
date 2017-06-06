package random;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-05.
 */
public class LargestAndSmallestNumber {

    public void findTheLargestAndSmallest(int[] input) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (int i = 0; i < input.length; i++) {
            if (input[i] < smallest) {
                smallest = input[i];
            } else {
                largest = input[i];
            }
        }
        System.out.println(smallest);
        System.out.println(largest);
    }

    @Test
    public void test() {
        int[] input = {100, 20, 53, 94, 55, 16, 7, 88, 909, 10000};
        findTheLargestAndSmallest(input);
    }
}
