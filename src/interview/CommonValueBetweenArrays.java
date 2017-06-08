package interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class CommonValueBetweenArrays {
    List<Character> list = new ArrayList<>();

    public void findCommonValues(char[] array1, char[] array2) {


        for (int i = 0; i < array2.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array2[i] == array1[j]) {
                    list.add(array2[j]);
                }
            }
        }
        for (Character c : list) {
            System.out.println(c);
        }
    }


    @Test
    public void test() {
        findCommonValues("abcd".toCharArray(), "defagh".toCharArray());
    }
}
