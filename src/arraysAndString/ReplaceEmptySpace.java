package arraysAndString;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-21.
 */
public class ReplaceEmptySpace {
    public char[] replace(String input) {
        char[] array = input.toCharArray();
        int length = 0;
        for (Character c : array) {
            if (c == ' ') {
                length = length + 1;
            }
        }

        char[] newArray = new char[input.length() + (2 * length)];
        length = input.length() + (2 * length) - 1;

        for (int i = input.length() - 1; i > -1; i--) {
            if (array[i] != ' ') {
                newArray[length--] = array[i];
            } else {
                newArray[length] = '0';
                newArray[length - 1] = '2';
                newArray[length - 2] = '%';
                length = length - 3;
            }
        }
        return newArray;
    }

    @Test
    public void test() {
        char[] c = replace("I am vasanth");
        for (Character c1 : c) {
            System.out.print(c1);
        }
    }
}
