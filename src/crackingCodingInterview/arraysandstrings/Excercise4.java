package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

/**
 * Write a method to replace all spaces in a string with'%20'. You may assume that
 * the string has sufficient space at the end of the string to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if implementing
 * in Java, please use a character array so that you can perform this operation
 * in place.)
 * EXAMPLE
 * Input: "Mr John Smith
 * Output: "Mr%20Dohn%20Smith"
 */
public class Excercise4 {
    public void replaceEmptySpaces(String s1) {
        int newLength = 0;
        char[] newArray = null;
        char[] array = s1.toCharArray();
        for (Character c : s1.toCharArray()) {
            if (c == ' ') {
                newLength = newLength + 1;
            }
        }
        newLength = s1.length() + (2 * (newLength));
        newArray = new char[newLength];
        newLength = newLength - 1;

        for (int i = array.length - 1; i > -1; i--) {
            if (array[i] != ' ') {
                newArray[newLength--] = array[i];

            } else {
                newArray[newLength] = '0';
                newArray[newLength - 1] = '2';
                newArray[newLength - 2] = '%';
                newLength = newLength - 3;
            }
        }
        for (Character ch : newArray) {
            System.out.print(ch);
        }
    }


    @Test
    public void test() {
        replaceEmptySpaces("I am vasanth");
    }
}
