package interview;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-22.
 */
public class TryCatch {

    public void check() {
        try {
            int i = 0;
            System.out.println("Inside try block");
            int j = 9/0;
        } catch (Exception e) {
            System.out.println("Inside catch block");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Inside finally block");
        }
    }

    @Test
    public void test() {
        check();
    }
}
