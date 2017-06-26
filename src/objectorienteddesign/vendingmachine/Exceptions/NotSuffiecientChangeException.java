package objectorienteddesign.vendingmachine.Exceptions;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class NotSuffiecientChangeException extends RuntimeException {
    private String message;

    public NotSuffiecientChangeException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
