package crackingCodingInterview.interview;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 0 1 1 2 3 5 8 13 21 34
 */
public class Fibonacci {
    StringBuffer buffer = new StringBuffer();
    int first = 0;
    int second = 1;
    int third = 0;

    String findFibonacci(int n) {
        buffer.append(first).append(" ").append(second).append(" ");
        for (int i = 3; i <= n; i++) {
            third = first + second;
            buffer.append(third).append(" ");
            first = second;
            second = third;
        }
        return buffer.toString().trim();
    }

    @Test
    public void test() {
        assertThat(findFibonacci(10), is("0 1 1 2 3 5 8 13 21 34"));
    }
}
