package arraysAndString;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-21.
 */
public class Anagram {

    public boolean isAnagram(String s1) {
        int index = s1.length() - 1;
        char[] array = s1.toCharArray();
        for (int i = 0; i <= s1.length() / 2; i++) {
            if (array[i] != array[index--]) return false;
        }
        return true;
    }

    @Test
    public void test() {
        System.out.println(isAnagram("liril"));
        System.out.println(isAnagram("vasanth"));
    }
}
