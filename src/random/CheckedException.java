package random;

/**
 * Created by vasanthan on 2017-06-17.
 */
public class CheckedException extends Exception {

    String message;

    public CheckedException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
