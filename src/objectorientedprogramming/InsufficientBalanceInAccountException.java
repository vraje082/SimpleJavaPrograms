package objectorientedprogramming;

/**
 * Created by Vasanth on 2017-06-14.
 */
public class InsufficientBalanceInAccountException extends RuntimeException {

    private String message;

    public InsufficientBalanceInAccountException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
