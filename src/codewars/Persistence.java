package codewars;

import org.junit.Test;

/**
 * Write a function, persistence, that takes in a positive parameter num and returns its
 * multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.
 * <p>
 * persistence(39) == 3 // because 3*9 = 27, 2*7 = 14, 1*4=4
 * // and 4 has only one digit
 * <p>
 * persistence(999) == 4 // because 9*9*9 = 729, 7*2*9 = 126,
 * // 1*2*6 = 12, and finally 1*2 = 2
 * <p>
 * persistence(4) == 0 // because 4 is already a one-digit number
 */
public class Persistence {

    static int times = 0;

    public static int persist(long n) {
        if (n < 10) return 0;
        char[] array = String.valueOf(n).toCharArray();
        int multiply = 1;
        times = times + 1;
        for (int i = 0; i < array.length; i++) {
            multiply = multiply * Character.getNumericValue(array[i]);
        }

        if (multiply < 10) return times;
        else {
            persist(multiply);
        }
        return times;
    }

    @Test
    public void test() {
        System.out.println(persist(25));
    }
}
