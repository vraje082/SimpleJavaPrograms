package codewars;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

/**
 * Created by Vasanth on 2017-06-08.
 */
public class PrinterError {
    public static String printError(String s) {
        char[] inputArray = s.toCharArray();

        Map<Character , Integer> map = new HashMap<>();
        int index =0;

        for(int j=97;j<110;j++){
            map.put((char) j, 0);
        }


        for(int i=0;i<s.length();i++){
            if(!map.containsKey(inputArray[i])){
                index = index+1;
            }
        }

        return index+"/"+s.length();
    }

    @Test
    public void test() {
        System.out.println("printerError Fixed Tests");
        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        assertEquals("3/56", PrinterError.printError(s));
    }

}
