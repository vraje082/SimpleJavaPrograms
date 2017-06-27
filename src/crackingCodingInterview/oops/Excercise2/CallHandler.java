package crackingCodingInterview.oops.Excercise2;

/**
 * Created by vasanthan on 2017-06-26.
 */
public class CallHandler {

    private static CallHandler instance = null;

    public static CallHandler getInstance() {
        if (instance == null) {
            instance = new CallHandler();
        }
        return instance;
    }
}
