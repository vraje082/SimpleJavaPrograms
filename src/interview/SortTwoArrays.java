package interview;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class SortTwoArrays {

    public void sortAndInsert(int[] array1, int[] array2) {
        int index = 0;
        int[] newArray = new int[array1.length + array2.length];

        for (Integer i : array1) {
            newArray[index] = i;
            ++index;
        }

        for (Integer j : array2) {
            newArray[index] = j;
            ++index;
        }

        Set<Integer> set = new TreeSet<>();
        for (Integer i : newArray) {
            set.add(i);
        }

        for (Integer k : set) {
            System.out.println(k);
        }
    }

    @Test
    public void test() {
        int[] array1 = new int[5];
        int[] array2 = new int[5];
        array1[0] = 10;
        array1[1] = 2;
        array1[2] = 4;
        array1[3] = 9;
        array1[4] = 6;
        array2[0] = 5;
        array2[1] = 7;
        array2[2] = 8;
        array2[3] = 3;
        array2[4] = 1;

        sortAndInsert(array1, array2);
    }
}
