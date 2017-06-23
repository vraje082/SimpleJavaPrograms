package random;

import java.io.PrintWriter;

/**
 * Created by vasanthan on 2017-06-18.
 */
public class ExceptionExcercise {

    public int check(String s1, int input) throws CheckedException {
        if (input == 0) throw new CheckedException("Your input cannot be zero");
        if (input != 0 && !s1.isEmpty()) {
            return 1;
        }

        if (s1.isEmpty()) throw new UncheckedException("The string you are passing cannot be empty");
        else
            return -1;
    }
}
