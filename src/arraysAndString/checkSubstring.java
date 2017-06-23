package arraysAndString;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-21.
 */
public class checkSubstring {

    public boolean isSubString(String s1, String s2) {
        if (s1.contains(s2)) {
            return true;
        }
        return false;
    }

    @Test
    public void test() {
        System.out.println(isSubString("waterbottle", "erb"));
    }
}
