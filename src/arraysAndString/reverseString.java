package arraysAndString;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

/**
 * Created by vasanthan on 2017-06-20.
 */
public class reverseString {
    int index = 0;

    public String reverse1(String input) {
        char[] array = new char[input.length()];
        int index = 0;
        for (int i = input.length() - 1; i > -1; i--) {
            array[index] = input.charAt(i);
            index++;
        }
        return String.valueOf(array);
    }

    public void reverse3(String input) {
        reverse(input.toCharArray());
    }

    private void reverse(char[] input) {
        if (input.length - 1 == index) {
            System.out.print(input[index]);
        } else {
            ++index;
            reverse(input);
            System.out.print(input[--index]);
        }
    }

    @Test
    public void test() {
        String expected = "htnasav";
        //String actual = reverse2("vasanth");
        //assertEquals(expected, reverse1("vasanth"));
        //assertEquals(expected, reverse2("vasanth"));
        //assertEquals(expected,
        reverse3("vasanth");
    }
}
