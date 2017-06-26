package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

/**
 * Implement a function void reversefchar* str) in Cor C++ which reverses a null-terminated
 * string.
 */
public class Excercise2 {

    int index = 0;

    public void reverseString(String input) {
        if (index == input.length() - 1) {
            System.out.print(input.charAt(index));
        } else {
            ++index;
            reverseString(input);
            System.out.print(input.charAt(--index));
        }
    }

    @Test
    public void test() {
        reverseString("abc");
        reverseString("vasanth");
    }
}
