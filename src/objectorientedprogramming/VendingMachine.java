package objectorientedprogramming;

import java.util.List;

/**
 * Created by Vasanth on 2017-06-14.
 */
public interface VendingMachine {
    int selectProductAndGetPrice(Item item);
    void insertCoin(Coin coin);
    void reset();
    Bucket<Item, List<Coin>> collectItemAndChange();
    List<Coin> refund();

}
