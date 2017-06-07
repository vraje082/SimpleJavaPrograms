package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class StringReverse {
    int index = 0;

    public void reverseString(char[] input) {
        recurse(input, input[0]);
    }

    private void recurse(char[] input, char c) {
        if (index == input.length - 1) {
            System.out.print(input[index]);
        } else {
            char temp = input[index];
            index = index + 1;
            recurse(input, temp);
            System.out.print(temp);
        }
    }

    @Test
    public void test() {
        reverseString("abc".toCharArray());
    }
}
