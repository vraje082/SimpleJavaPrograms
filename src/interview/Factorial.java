package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 * 5*4*3*2*1
 */
public class Factorial {
    int fact = 1;

    public int findFactorialRecursively(int n) {
        if (n == 1) {
            return 1;
        }
        for (int i = n; i > 0; i--) {
            fact = n * findFactorialRecursively(n - 1);
        }
        return fact;
    }

    public void findFactorialIteratively(int n) {
        int fact =1;
        for(int i=n;i>0;i--){
            fact = fact*i;
        }

        System.out.println(fact);
    }

    @Test
    public void test() {
      //  System.out.println(findFactorialRecursively(5));
        findFactorialIteratively(5);
    }
}
