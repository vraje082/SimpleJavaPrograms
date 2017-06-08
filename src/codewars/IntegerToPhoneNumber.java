package codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vasanth on 2017-06-08.
 */
public class IntegerToPhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
    StringBuffer stringBuffer = new StringBuffer();
    int index = 0;
    stringBuffer.append("(");
    for(Integer i : numbers){
        if(index ==3){
            stringBuffer.append(") ");
        }
        if(index==6){
            stringBuffer.append("-");
        }
        stringBuffer.append(i);
        index = index+1;
    }
    return stringBuffer.toString();
    }
    @Test
    public void test() {
        assertEquals("(123) 456-7890", IntegerToPhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));

    }
}
