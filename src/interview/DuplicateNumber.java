package interview;

import org.junit.Test;

/**
 * Find duplicate number from 1-n where 1 number is repeated
 */
public class DuplicateNumber {

    public void findDuplicateNumber(int[] input) {
        int size = input.length ;
        int result = size * (size - 1) / 2; // 15
        int addition = addNumbers(input);    // 18
        result = addition - result;

        System.out.println(result);
    }

    private int addNumbers(int[] input) {
        int sum = 0;

        for (Integer i : input) {
            sum = sum + i;
        }
        return sum;
    }

    @Test
    public void test() {
        findDuplicateNumber(new int[]{1, 2, 3, 4, 5, 5});
    }
}
