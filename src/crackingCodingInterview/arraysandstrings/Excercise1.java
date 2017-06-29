package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-27.
 */
public class Excercise1 {

    public boolean isUniqueCharacters(String input) {
        boolean[] array = new boolean[256];
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
        System.out.println(isUniqueCharacters("vasanth"));
        System.out.println(isUniqueCharacters("abc"));
    }
}
