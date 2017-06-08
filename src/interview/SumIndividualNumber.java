package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class SumIndividualNumber {

    public void sum(int n) {
        String str = String.valueOf(n);
        char[] array = str.toCharArray();
        int index = 0;
        int sum = 0;
        int[] intArray = new int[array.length];
        for (Character c : array) {
            intArray[index] = Character.getNumericValue(c);
            ++index;
        }

        for (Integer i : intArray) {
            sum = sum + i;
        }
        System.out.println(sum);

    }

    @Test
    public void test() {
        sum(233);
    }
}
