package interview;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by vasanthan on 2017-06-22.
 */
public class RemoveDuplicateCharacters {
    StringBuffer buffer = new StringBuffer();
    Map<Character, Integer> map = new HashMap<>();

    public String remove(String s1) {
        for (Character c : s1.toCharArray()) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
                buffer.append(c);
            }
        }
        return buffer.toString();
    }

    @Test
    public void test() {
        assertThat(remove("bananas"), is("bans"));
    }
}
