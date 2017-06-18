package arraysAndString;

import org.junit.Test;

/**
 * Implement a function to reverse a null terminated string
 */
public class reverseString {
    int index = 0;

    public char[] reverseStringIteratively(char[] input) {
        char[] reverseArray = new char[input.length];
        int index = 0;
        for (int i = input.length - 1; i > -1; i--) {
            reverseArray[index] = input[i];
            index = index + 1;
        }
        return reverseArray;
    }

    public void reverseStringRecursively(char[] input) {
        recurse(input);

    }

    private void recurse(char[] input) {
        if (input.length - 1 == index) {
            System.out.print(input[index]);
        } else {
            ++index;
            recurse(input);
            System.out.print(input[--index]);
        }
    }

    @Test
    public void test() {
        // System.out.println(reverseStringIteratively("abc".toCharArray()));
        System.out.println("");
        reverseStringRecursively("abc".toCharArray());
    }
}
