package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vasanth on 2017-06-08.
 */
public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        for (Integer i : args) {
            if (i < smallest)
                smallest = i;
        }
        return smallest;
    }


    @Test
    public void example1() {
        int expected = 11;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, 232, 12, 11, 43});
        assertEquals(expected, actual);
    }


    @Test
    public void example2() {
        int expected = -33;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78, 56, -2, 12, 8, -33});
        assertEquals(expected, actual);
    }

    @Test
    public void example3() {
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0, Integer.MIN_VALUE, Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }
}
