package objectorientedprogramming;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Vasanth on 2017-06-14.
 */
public class Inventory<T> {

    Map<T, Integer> map = new HashMap<>();

    public int getQuantity(T item) {
        if (hasItem(item)) {
            return map.get(item);
        }
        throw new ItemSoldOutException("Currently the Item is out of stock.");
    }

    public void add(T item) {
        if (!map.containsKey(item)) {
            map.put(item, 1);
        } else {
            map.put(item, map.get(item) + 1);
        }
    }

    public void deduct(T item) {
        if (hasItem(item)) {
            map.put(item, map.get(item) - 1);
        } else {
            throw new InsufficientBalanceInAccountException("You dont have enough money to purchase this product");
        }
    }

    public boolean hasItem(T item) {
        if (map.get(item) > 0)
            return true;
        return false;
    }

    public void clear() {
        map.clear();
    }

    public void put(T item, int quantity) {
        if (!map.containsKey(item)) {
            map.put(item, 1);
        } else {
            map.put(item, map.get(item) + 1);
        }
    }
}
