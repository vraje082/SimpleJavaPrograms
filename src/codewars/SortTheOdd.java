package codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Vasanth on 2017-06-09.
 */
public class SortTheOdd {
    public static int[] sortArray(int[] array) {

        int index = 0;
        for (int k = 0; k < array.length; k++) {
            if (array[k] % 2 != 0) index = index + 1;
        }
        int[] newArray = new int[index];
        for (Integer i : array) {
            if (i % 2 != 0) {
                newArray[index] = i;
                index = index + 1;
            }
        }
        index = 0;
        Arrays.sort(newArray);
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 != 0) {
                array[j] = newArray[index];
                index = index + 1;
            }
        }

        return array;
    }

    @Test
    public void exampleTest1() {
        assertArrayEquals(new int[]{1, 3, 2, 8, 5, 4}, SortTheOdd.sortArray(new int[]{5, 3, 2, 8, 1, 4}));
    }

    @Test
    public void exampleTest2() {
        assertArrayEquals(new int[]{1, 3, 5, 8, 0}, SortTheOdd.sortArray(new int[]{5, 3, 1, 8, 0}));
    }

    @Test
    public void exampleTest3() {
        assertArrayEquals(new int[]{}, SortTheOdd.sortArray(new int[]{}));
    }
}

