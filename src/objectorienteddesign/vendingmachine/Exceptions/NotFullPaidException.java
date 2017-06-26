package objectorienteddesign.vendingmachine.Exceptions;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class NotFullPaidException extends RuntimeException {

    private String message;

    public NotFullPaidException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
