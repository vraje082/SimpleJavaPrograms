package arraysAndString;

import org.junit.Test;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you cannot use additional data structures.
 */
public class UniqueCharacters {

    public boolean checkIfTheStringIsUnique(char[] input) {
        boolean[] array = new boolean[256];
        for (int i = 0; i < input.length; i++) {
            char temp = input[i];
            if (array[temp] == true) return false;
            array[temp] = true;
        }

        return true;
    }

    @Test
    public void test() {
        System.out.println(checkIfTheStringIsUnique("vasanth".toCharArray()));
        System.out.println(checkIfTheStringIsUnique("abcdef".toCharArray()));
    }
}
