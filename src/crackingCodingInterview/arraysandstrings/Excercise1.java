package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if
 * you cannot use additional data structures?
 */
public class Excercise1 {

    boolean[] array = new boolean[256];

    public boolean isAllUniqueCharacters(String input) {
        for (Character c : input.toCharArray()) {
            if (array[c] == true) {
                return false;
            } else {
                array[c] = true;
            }
        }
        return true;
    }

    @Test
    public void test() {
        System.out.println(isAllUniqueCharacters("abc"));
        System.out.println(isAllUniqueCharacters("vasanth"));
    }
}
