package javaTwoNovice;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vasanthan on 2017-06-18.
 */
public class FindDuplicateNumber {

    public int findDuplicate(List<Integer> list) {

        int size = list.size();
        int sum = 0;
        int duplicate = 0;
        for (Integer i : list) {
            sum = sum + i;
        }
        duplicate = sum - (size * (size - 1)) / 2 ;
        return duplicate;

    }

    @Test
    public void test() {
        List list = new ArrayList<>();
        for (int i = 1; i < 30; i++) {
            list.add(i);
        }

        list.add(22);
        System.out.println(findDuplicate(list));
    }
}
