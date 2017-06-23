package arraysAndString;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-21.
 */
public class StringCompression {


    public String compress(String input) {
        char[] array = input.toCharArray();
        char temp;
        int index = 1;
        StringBuffer buffer = new StringBuffer();
        temp = input.charAt(0);
        for (int i = 0; i < input.length(); i++) {
            if (i > 0) {
                if (array[i] == temp) {
                    index = index + 1;
                    temp = array[i];
                    if (i == input.length() - 1) {
                        buffer.append(temp).append(index);
                    }
                } else {
                    buffer.append(temp).append(index);
                    index = 1;
                    temp = array[i];

                }
            }

        }
        if (buffer.toString().length() > input.length()) {
            return input;
        }
        return buffer.toString();
    }

    @Test
    public void test() {
        System.out.println(compress("aabcccccaaa"));
    }
}
