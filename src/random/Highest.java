package random;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * 100 95 100|
 * 50 200 200|
 * 63 105 170|
 * 70 150 300|
 */
public class Highest {

    public String findHighest(String input) {
        return null;
    }

    @Test
    public void test() {
        assertThat(findHighest("100 95 100 |50 200 200 |63 105 170 |70 150 300 "), is("100 200 300"));
    }
}
