package objectorientedprogramming;

/**
 * Created by Vasanth on 2017-06-14.
 */
public class ItemSoldOutException extends RuntimeException {
    private String message;

    ItemSoldOutException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return this.message;
    }
}
