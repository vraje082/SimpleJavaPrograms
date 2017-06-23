package random;

/**
 * Created by vasanthan on 2017-06-19.
 */
public class Test {

    public static void main(String args[]) {
        String str1 = "Strings are immutable";
        String str2 = new String("Strings are immutable");
        String str3 = new String("Strings are immutable");
        str3.concat("i");

        if(str2.equals(str3)){
            System.out.println("Str2 and str 3 are same");
        }
    }
}
