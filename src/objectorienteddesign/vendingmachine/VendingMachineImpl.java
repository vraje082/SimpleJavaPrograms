package objectorienteddesign.vendingmachine;

import objectorienteddesign.vendingmachine.Exceptions.NotFullPaidException;
import objectorienteddesign.vendingmachine.Exceptions.NotSuffiecientChangeException;
import objectorienteddesign.vendingmachine.Exceptions.SoldOutException;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class VendingMachineImpl implements VendingMachine {

    private Inventory<Coin> coinInventory = new Inventory<>();
    private Inventory<Item> itemInventory = new Inventory<>();
    private int currentBalance;
    private Item currentItem;
    private int remainingBalance;

    public VendingMachineImpl() {
        for (Coin coin : Coin.values()) {
            coinInventory.put(coin, 5);
        }

        for (Item item : Item.values()) {
            itemInventory.put(item, 5);
        }
    }

    @Override
    public long selectItemAndGetPrice(Item item) {
        if (itemInventory.hasItem(item)) {
            currentItem = item;
            return item.getPrice();
        } else {
            throw new SoldOutException("Item sold out. Please choose another item.");
        }
    }

    private boolean isFullPaid() {
        if (currentBalance >= currentItem.getPrice()) {
            return true;
        } else return false;
    }

    private Item collectItem() {
        if (isFullPaid()) {
            if (hasSufficientChange()) {
                itemInventory.deduct(currentItem);
                return currentItem;
            }
            throw new NotSuffiecientChangeException("Not sufficient change in inventory. Please try another item");
        }
        remainingBalance = currentBalance - currentItem.getPrice();
        return currentItem;
    }

    private boolean hasSufficientChange() throws NotSuffiecientChangeException {
        return hasSufficientChangeForAmount(currentBalance - currentItem.getPrice());
    }

    private boolean hasSufficientChangeForAmount(int amount) {
        boolean hasChange = true;
        try {
            getChange(amount);
        } catch (NotSuffiecientChangeException e) {
            hasChange = false;
        }

        return hasChange;
    }

    private List<Coin> getChange(int amount) {
        List<Coin> list = null;
        if (amount > 0) {
            int balance = amount;
            list = new ArrayList<>();
            while (balance > 0) {
                if (balance > Coin.QUARTER.getDenomination()) {
                    list.add(Coin.QUARTER);
                    coinInventory.deduct(Coin.QUARTER);
                    balance = balance - Coin.QUARTER.getDenomination();
                    continue;
                } else if (balance > Coin.DIME.getDenomination()) {
                    list.add(Coin.DIME);
                    coinInventory.deduct(Coin.DIME);
                    balance = balance - Coin.DIME.getDenomination();
                    continue;
                } else if (balance > Coin.NICKEL.getDenomination()) {
                    list.add(Coin.NICKEL);
                    coinInventory.deduct(Coin.NICKEL);
                    balance = balance - Coin.NICKEL.getDenomination();
                    continue;
                } else {
                    throw new NotSuffiecientChangeException("Not sufficient change in the inventory. Please try another product.");
                }
            }
        }
        return list;
    }

    @Override
    public void insertCoin(Coin coin) {
        currentBalance = currentBalance + coin.getDenomination();
        coinInventory.add(coin);
    }

    @Override
    public List<Coin> refund() {
        return getChange(currentBalance);
    }

    @Override
    public Bucket<Item, List<Coin>> collectItemAndChange() throws NotFullPaidException, NotSuffiecientChangeException {
        Item item = collectItem();
        return new Bucket<>(item, collectChange());
    }

    private List<Coin> collectChange() {
        int changeAmount = currentBalance - currentItem.getPrice();
        return getChange(changeAmount);
    }

    @Override
    public void reset() {
        coinInventory.clear();
        itemInventory.clear();
        currentBalance = 0;
        currentItem = null;
        remainingBalance = 0;
    }
}
