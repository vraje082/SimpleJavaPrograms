package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class LargestAndSmallestNumber {

    public void printLargestAndSmallest(int[] input) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (Integer i : input) {
            if (i < smallest) {
                smallest = i;
            } else if (i > largest) {
                largest = i;
            }
        }

        System.out.println("Smallest Number : " + smallest);
        System.out.println("Largest Number : " + largest);
    }

    @Test
    public void test() {
        printLargestAndSmallest(new int[]{5,10,3,2000,1});
    }
}
