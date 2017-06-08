package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class SwapWithoutTemp {

    public void swap(int a, int b) {
        System.out.println("Before change =======   A : "+a+" B : "+b);
        a = a + b; // a = -1
        b = a - b; // b = 5
        a = a - b; // a =
        System.out.println("After change ========   A : "+a+" B : "+b);
    }

    @Test
    public void test() {
        swap(5, 6);
    }
}
