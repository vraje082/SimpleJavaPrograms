package random;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * 1) convert the string array into list of list
 * 2) Traverse the listOfList
 * <p>
 * 1=> 100 95 100
 * 2=> 50 200 200
 * 3=> 63 105 170
 * 4=> 70 150 300
 */
public class HighestColumnValue {

    public String highest(String input) {
        List<Integer> list = new ArrayList<Integer>();
        List<List<Integer>> listOfList = new ArrayList<>();
        String[] temp = null;
        String[] split = input.split("\\|");
        StringBuffer buffer = new StringBuffer();
        int max = Integer.MIN_VALUE;
        for (String s : split) {
            temp = s.split(" ");
            for (String s1 : temp) {
                list.add(Integer.valueOf(s1));
            }
            listOfList.add(list);
            list = new ArrayList<>();
        }

        for (int i = 0; i < listOfList.get(0).size(); i++) {
            for (List<Integer> l : listOfList) {
                if (l.get(i) > max) {
                    max = l.get(i);
                }
            }
            buffer.append(max).append(" ");
            max = Integer.MIN_VALUE;
        }

        return buffer.toString();
    }

    @Test
    public void test() {
        System.out.println(highest("100 95 100|50 200 200|63 105 170|70 150 300"));
    }
}
