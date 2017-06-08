package interview;

import org.junit.Test;

/**
 * 1 2 3 4
 * *
 * * *
 * * * *
 * * * * *
 */
public class PrintRightJustified {

    public void printStars(int n) {
        int index = 1;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < index; k++) {
                System.out.print("*");
            }
            ++index;
            System.out.println();
        }
    }

    @Test
    public void test() {
        printStars(4);
    }
}
