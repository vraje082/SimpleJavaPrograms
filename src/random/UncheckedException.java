package random;

/**
 * Created by vasanthan on 2017-06-17.
 */
public class UncheckedException extends RuntimeException {
    String message;

    public UncheckedException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
