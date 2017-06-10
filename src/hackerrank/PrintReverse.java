package hackerrank;

import org.junit.Test;

import java.util.Scanner;

/**
 * Created by Vasanth on 2017-06-09.
 */
public class PrintReverse {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];

        for (int i = length - 1; i > -1; i--) {
            array[i] = scanner.nextInt();
        }

        for (Integer i : array) {
            System.out.print(i + " ");
        }
    }


}
