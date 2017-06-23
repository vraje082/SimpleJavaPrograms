package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 * <p>
 * 1 2 3 4 5
 *     *
 *   * * *
 * * * * * *
 */
public class PrintPyramid {

    public void print(int n) {
        int index = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <n-i; j++) {
                System.out.print(" ");
            }
            if (index < n) {
                for (int k = 0; k < index; k++) {
                    System.out.print("* ");
                }
                index = index + 1;
                System.out.println();
            }
        }
    }

    @Test
    public void test() {
        print(5);
    }
}
