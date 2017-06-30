package crackingCodingInterview.interview;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by vasanthan on 2017-06-28.
 */
public class Factorial {
    int fact = 1; // 20 + 12 + 6

    public int findFactorialIteratively(int number) {

        for (int i = number; i > 1; i--) {
            number = number * (i - 1);
        }
        return number;
    }

    public int findFactorialRecursively(int number) {
        if (number == 1) {
            return 1;
        }
        return number * findFactorialRecursively(number - 1);

    }

    @Test
    public void test() {
        assertThat(findFactorialIteratively(5), is(120));
        assertThat(findFactorialRecursively(5), is(120));
    }
}
