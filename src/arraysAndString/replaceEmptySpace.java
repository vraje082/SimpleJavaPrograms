package arraysAndString;

import org.junit.Test;

/**
 * Write a method to replace all empty spaces in a string with %20
 */
public class replaceEmptySpace {

    public char[] insertCharactersInbetween(char[] input) {
        int index = 0;
        for (Character ch : input) {
            if (ch == ' ') {
                index = index + 1;
            }
        }
        int newLength = input.length + (2 * index);
        char[] charArray = new char[newLength];
        newLength = newLength - 1;
        for (int i = input.length - 1; i > -1; i--) {
            if (input[i] != ' ') {
                charArray[newLength] = input[i];
                newLength = newLength - 1;
            } else if (input[i] == ' ') {
                charArray[newLength] = '0';
                charArray[newLength - 1] = '2';
                charArray[newLength - 2] = '%';
                newLength = newLength - 3;
            }
        }
        return charArray;
    }

    public StringBuffer insertCharactersInString(String input) {
        String[] newString = input.split(" ");
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < newString.length; i++) {
            if (i != newString.length - 1) {
                stringBuffer.append(newString[i]).append("%20");
            } else {
                if (i == newString.length - 1) {
                    stringBuffer.append(newString[i]);
                }
            }
        }
        return stringBuffer;
    }

    @Test
    public void test() {
        //  System.out.println(insertCharactersInbetween("I am vasanth".toCharArray()));
        System.out.println(insertCharactersInString("I am vasanth"));
    }
}
