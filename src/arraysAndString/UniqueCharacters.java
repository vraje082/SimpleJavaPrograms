package arraysAndString;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertFalse;

/**
 * Created by vasanthan on 2017-06-20.
 */
public class UniqueCharacters {
    boolean[] array;

    public boolean check(String input) {
        array = new boolean[256];
        if (input == null || input.isEmpty() || input.equals("")) {
            return false;
        } else {
            for (Character c : input.toCharArray()) {
                if (array[c] == false) array[c] = true;
                else if (array[c] == true) return false;
            }
        }
        return true;
    }

    @Test
    public void test() {
        assertFalse(check("vasanth"));
        assertFalse(check(null));
        assertTrue(check("abc"));
    }
}
