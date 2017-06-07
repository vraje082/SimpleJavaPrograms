package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class DecimalToBinary {
    StringBuffer stringBuffer = new StringBuffer();
    int quotient = 0;
    int remainder = 0;

    public void convert(int input) {
        if (quotient == 1) {
            stringBuffer.append(quotient);
            System.out.println(stringBuffer);
        } else {
            quotient = getQuotient(input); // 12   | 6  | 3
            remainder = getRemainder(input);
            stringBuffer.append(remainder);// 1  | 0  | 0
            input = quotient;           // 12      | 6
            convert(input);// 12      | 6
        }


    }

    public int getQuotient(int input) {
        return input / 2;
    }

    public int getRemainder(int input) {
        return input % 2;
    }

    @Test
    public void test() {
        convert(25);
    }
}
