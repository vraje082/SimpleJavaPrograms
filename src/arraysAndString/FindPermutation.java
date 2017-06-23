package arraysAndString;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by vasanthan on 2017-06-21.
 */
public class FindPermutation {

    public boolean permutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();

        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2))
            return true;
        return false;
    }

    public boolean permutationUsingMap(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        if (Arrays.equals(getArray(s1.toCharArray()), getArray(s2.toCharArray())))
            return true;

        return false;
    }

    private char[] getArray(char[] c1) {
        char[] array = new char[256];

        for (Character c : c1) {
            array[c] = (char) (array[c] + 1);
        }
        return array;
    }

    @Test
    public void test() {
        System.out.println(permutationUsingMap("abc", "cba"));
    }
}
