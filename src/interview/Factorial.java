package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 * 5*4*3*2*1
 */
public class Factorial {
    int fact = 1;

    public int findFactorialRecursively(int n) {
        if (n == 1) return 1;
        else {
            fact = n * findFactorialRecursively(n - 1);
        }
        return fact;
    }

    public int findFactorialIteratively(int n) {
        fact = n;
        for (int i = n; i > 1; i--) {
            fact = fact*(i - 1);
        }
        return fact;
    }

    @Test
    public void test() {
        //  System.out.println(findFactorialRecursively(5));
        // System.out.println(findFactorialRecursively(5));
        System.out.println(findFactorialIteratively(5));
    }
}
