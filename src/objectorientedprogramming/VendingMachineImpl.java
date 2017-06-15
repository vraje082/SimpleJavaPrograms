package objectorientedprogramming;

import java.util.List;

/**
 * Created by Vasanth on 2017-06-14.
 */
public class VendingMachineImpl implements VendingMachine {
    @Override
    public int selectProductAndGetPrice(Item item) {

        return 0;
    }

    @Override
    public void insertCoin(Coin coin) {

    }

    @Override
    public void reset() {

    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange() {
        return null;
    }

    @Override
    public List<Coin> refund() {
        return null;
    }
}
