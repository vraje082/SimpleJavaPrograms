package crackingCodingInterview.arraysandstrings;

import org.junit.Test;

/**
 * Write a method to replace all spaces in a string with '%20'. You may assume that the
 * string has sufficient space at the end of the string to hold the additional characters,
 * and that you are given the "true" length of the string. (Note: if implementing in Java,
 * please use a character array so that you can perform this operation in place.)
 */
public class Excercise4 {

    public char[] replaceEmptySpace(String s1) {
        int index = 0;
        for (Character c : s1.toCharArray()) {
            if (c == ' ') {
                ++index;
            }
        }
        int newLength = s1.length() + (index * 2);
        char[] array = s1.toCharArray();
        char[] newArray = new char[newLength];
        newLength = newLength - 1;
        for (int i = s1.length() - 1; i > -1; i--) {
            if (array[i] != ' ') {
                newArray[newLength] = array[i];
                newLength = newLength - 1;
            } else {
                newArray[newLength] = '0';
                newArray[newLength - 1] = '2';
                newArray[newLength - 2] = '%';
                newLength = newLength - 3;
            }
        }
        return newArray;
    }

    @Test
    public void test() {
        System.out.print(replaceEmptySpace("I am vasanth"));
    }
}
