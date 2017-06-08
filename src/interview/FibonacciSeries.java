package interview;

import org.junit.Test;

/**
 * 0 1 1 2 3 5 8
 */
public class FibonacciSeries {


    public void printFibonacci(int n) {
        int first = 0;
        int second = 1;
        System.out.print(first);
        System.out.print(" ");
        System.out.print(second);

        for (int i = 2; i <= n; i++) {
            int third = first + second;
            System.out.print(" ");
            System.out.print(third);
            first = second;
            second = third;
        }
    }

    @Test
    public void test() {
        printFibonacci(10);
    }
}
