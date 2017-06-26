package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

import java.util.Arrays;

/**
 * Given two strings, write a method to decide if one is a permutation of the other.
 */
public class Excercise3 {

    public boolean isPermutationOfEachOther(String s1, String s2) {
        char[] array1 = getArray(s1.toCharArray());
        char[] array2 = getArray(s2.toCharArray());

        if (Arrays.equals(array1, array2)) {
            return true;
        } else return false;
    }

    public char[] getArray(char[] input) {
        char[] temp = new char[256];
        for (Character c : input) {
            temp[c] = (char) (temp[c] + 1);
        }
        return temp;
    }

    @Test
    public void test() {
        System.out.println(isPermutationOfEachOther("abcde","cdeab"));
    }
}
