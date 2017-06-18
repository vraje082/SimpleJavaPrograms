package arraysAndString;

import org.junit.Test;

import java.util.Arrays;

/**
 * Given two strings , check if one string is permutation of one another
 */
public class stringPermutation {
    public boolean checkIfTheStringIsPermutationOfOther(String input1, String input2) {
        char[] array1 = getCharacterCount(input1);
        char[] array2 = getCharacterCount(input2);

        if (Arrays.equals(array1, array2)) {
            return true;
        }
        return false;
    }

    private char[] getCharacterCount(String input) {
        char[] charArray = input.toCharArray();
        char[] newArray = new char[256];
        for (Character ch : charArray) {
            newArray[ch] = (char) (newArray[ch] + 1);
        }
        return newArray;
    }

    @Test
    public void test() {
        System.out.println(checkIfTheStringIsPermutationOfOther("abc", "ccc"));
        System.out.println(checkIfTheStringIsPermutationOfOther("abc", "cba"));
    }
}
