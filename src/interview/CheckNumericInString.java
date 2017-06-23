package interview;

import org.junit.Test;

import java.util.regex.Pattern;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

/**
 * Created by vasanthan on 2017-06-22.
 */
public class CheckNumericInString {

    public boolean isStringNumeric(String str){
        Pattern pattern = Pattern.compile(".*\\D.*");
        if(!pattern.matcher(str).matches()){
            return true;
        }
        return false;
    }

    public int convert(String str){
        return Integer.valueOf(str);
    }
    @Test
    public void test(){

        System.out.println(isStringNumeric("123"));
        assertThat(convert("123"), is(123));
    }
}
