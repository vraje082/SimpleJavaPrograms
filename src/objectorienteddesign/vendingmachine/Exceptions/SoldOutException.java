package objectorienteddesign.vendingmachine.Exceptions;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class SoldOutException extends RuntimeException {
    private String message;

    public SoldOutException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
