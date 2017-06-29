package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-27.
 */
public class Excercise5 {
    public String stringCompression(String input) {
        StringBuffer buffer = new StringBuffer();
        char[] array = input.toCharArray();
        int index = 1;
        char previous = input.charAt(0);

        for (int i = 1; i < input.length(); i++) {

            if (array[i] == previous) {
                index = index + 1;
                if (i == input.length() - 1) {
                    buffer.append(array[i]).append(index);
                }
            } else {
                buffer.append(previous).append(index);
                if (i == input.length() - 1 && i != previous) {
                    buffer.append(array[i]).append(index);
                    return buffer.toString().trim();
                }
                index = 1;
                previous = array[i];
            }
        }

        return buffer.toString().trim();
    }

    @Test
    public void test() {
        System.out.println(stringCompression("aabcccccaaa"));
        System.out.println(stringCompression("abcdaaer"));
    }
}
