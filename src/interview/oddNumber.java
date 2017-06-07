package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class oddNumber {

    public boolean isOddNumber(int input) {
        for (int i = 2; i < 10; i++) {
            if (input % i == 0) return false;
        }
        return true;
    }

    @Test
    public void test() {
        System.out.println(isOddNumber(17));
        System.out.println(isOddNumber(75));
    }

}
