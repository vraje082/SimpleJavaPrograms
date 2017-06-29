package crackingCodingInterview.interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vasanthan on 2017-06-27.
 */
public class highestEvenConsecutiveNumbers {

    public List<Integer> findConsecutiveNumbers(List<Integer> list) {
        List<List<Integer>> bigList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        int max = Integer.MIN_VALUE;

        for (Integer i : list) {
            if (i % 2 == 0) tempList.add(i);
            else {
                bigList.add(tempList);
                tempList = new ArrayList<>();
            }
        }

        for (List<Integer> l2 : bigList) {
            if (l2.size() > max) {
                max = l2.size();
            }
        }
        for (List<Integer> l3 : bigList) {
            if (l3.size() == max) return l3;
        }

        return null;
    }

    @Test
    public void test() {
        List<Integer> l = findConsecutiveNumbers(Arrays.asList(22, 24, 71, 88, 64, 20, 33));
        l.forEach(item -> System.out.println(item));
    }
}
