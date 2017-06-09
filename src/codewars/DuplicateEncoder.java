package codewars;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vasanth on 2017-06-08.
 */
public class DuplicateEncoder {
    static String encode(String word) {
        Map<Character, Integer> map = new HashMap<>();
        StringBuffer stringBuffer = new StringBuffer();

        for (Character c : word.toLowerCase().toCharArray())
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }

        for (Character c : word.toLowerCase().toCharArray()) {
            if (map.get(c) > 1) stringBuffer.append(")");
            else {
                stringBuffer.append("(");
            }

        }

        return stringBuffer.toString();
    }


    @Test
    public void test() {
        assertEquals(")()())()(()()(",DuplicateEncoder.encode("Prespecialized"));
        assertEquals("))))())))", DuplicateEncoder.encode("   ()(   "));
    }
}
