package interview;

import org.junit.Test;

import java.util.*;

/**
 * String array of candidates are passed. SOrt them in descending order according to their votes.
 */
public class Vote {

    public void sortAccordingToVotes(String[] input) {
        Map<String, Integer> map = new TreeMap<>();
        List<String> list = new ArrayList<>();
        for (String s : input) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }

        List<Map.Entry<String, Integer>> list1 = new LinkedList<>(map.entrySet());
        Collections.sort(list1, new Comparator<Map.Entry<String, Integer>>() {
            @Override
            public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });

        Map<String, Integer> map1 = new HashMap<>();


    }

    public void chumma(Set<List<String>> set) {
        List<Set<List<String>>> list = new ArrayList<Set<List<String>>>();
        list.add(set);

        Collections.sort(list, new Comparator<Set<List<String>>>() {
            @Override
            public int compare(Set<List<String>> o1, Set<List<String>> o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });
    }

    @Test
    public void test() {
        String[] input = new String[10];
        input[0] = "vasanth";
        input[1] = "venkat";
        input[2] = "jegan";
        input[3] = "venkat";
        input[4] = "jagan";
        input[5] = "jagan";
        input[6] = "jagan";
        input[7] = "ritchie";
        input[8] = "jegan";
        input[9] = "jegan";
        sortAccordingToVotes(input);

        /*assertThat(list.get(0), is("jagan"));
        assertThat(list.get(1), is("ram"));*/
    }

    @Test
    public void test1() {
        List<String> map = new ArrayList<>();
        Set<List<String>> set = new HashSet<>();
        map.add("abc");
        map.add("def");
        map.add("abc");
        map.add(null);
        map.add(null);
        set.add(map);
        chumma(set);
    }
}
