package objectorienteddesign.vendingmachine;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class Inventory<T> {
    Map<T, Integer> map = new HashMap<>();

    public int getQuantity(T item) {
        if (map.containsKey(item)) {
            return map.get(item);
        } else return 0;
    }

    public void add(T item) {
        map.put(item, map.get(item) + 1);
    }

    public void deduct(T item) {
        if (hasItem(item)) {
            map.put(item, map.get(item) - 1);
        }
    }

    public boolean hasItem(T item) {
        return map.get(item) > 0;
    }

    public void clear() {
        map.clear();
    }

    public void put(T item, int quantity) {
        map.put(item, quantity);
    }
}
