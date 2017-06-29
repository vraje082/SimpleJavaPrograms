package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

import java.util.Arrays;

/**
 * Created by vasanthan on 2017-06-27.
 */
public class Excercise3 {

    public boolean isPermutationOfEachOther(String s1, String s2) {
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        if (Arrays.equals(c1, c2)) {
            return true;
        }
        return false;
    }

    @Test
    public void test() {
        System.out.println(isPermutationOfEachOther("abc", "cba"));
        System.out.println(isPermutationOfEachOther("abc", "cbad"));
    }
}
