package arraysAndString;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by vasanthan on 2017-06-21.
 */
public class DuplicateSubstring {

    public int dupSubstring(String s1) {
        String[] array = new String[10];
        StringBuffer buffer = new StringBuffer();
        List<Character> list = new ArrayList<>();
        Map<Character, Integer> map = new HashMap<>();
        int index = 0;
        int index1 = 0;
        int max = Integer.MIN_VALUE;
        for (Character c1 : s1.toCharArray()) {
            if (!map.containsKey(c1)) {
                map.put(c1, 1);
                list.add(c1);
            } else {
                char temp = c1;
                for (Character c2 : list) {
                    buffer.append(c2);
                }
                array[index1++] = buffer.toString();
                buffer = new StringBuffer();
                map.clear();
                map.put(c1, 1);
                list.clear();
            }
        }

        for (int j = 0; j < array.length; j++) {
            if(array[j]!= null) {
                if (array[j].length() > max) {
                    max = array[j].length();
                }
            }
        }
        return max;
    }

    @Test
    public void test() {
        System.out.println(dupSubstring("abcdaghbda"));
    }
}
