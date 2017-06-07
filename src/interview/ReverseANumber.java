package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class ReverseANumber {

    int index = 0;

    public void reverse(int[] input) {
        recurse(input, input[0]);
    }

    private void recurse(int[] input, int i) {
        if (index == input.length - 1) {
            System.out.print(input[index]);
        } else {
            int temp = input[index];
            index = index + 1;
            recurse(input, temp);
            System.out.print(temp);
        }
    }

    @Test
    public void test() {
        int[] temp = new int[6];
        temp[0] = 1;
        temp[1] = 2;
        temp[2] = 3;
        temp[3] = 4;
        temp[4] = 5;
        temp[5] = 6;

        reverse(temp);
    }
}
