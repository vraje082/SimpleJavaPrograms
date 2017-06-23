package interview;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by vasanthan on 2017-06-22.
 */
public class LongestEvenNumber {

    public List<Integer> findNumber(List<Integer> list) {
        List<Integer> newList = new ArrayList<>();
        StringBuffer strbuffer = new StringBuffer();
        String[] str = new String[list.size()];
        int index = 0;
        int max = Integer.MIN_VALUE;

        for (Integer i : list) {
            if (i % 2 == 0) {
                strbuffer.append(i);
            } else {
                if (!strbuffer.toString().equals("")) {
                    str[index++] = strbuffer.toString();
                    strbuffer = new StringBuffer();
                }
            }
        }

        for (String s : str) {
            if (s != null) {
                if (s.length() > max) max = s.length();
            }
        }

        for (String s1 : str) {
            if (s1 != null) {
                if (s1.length() == max) {
                    for (Character c : s1.toCharArray()) {
                        newList.add(Character.getNumericValue(c));
                    }
                }
            }
        }
        return newList;
    }

    public List<Integer> findEvenNumber(List<Integer> list) {
        StringBuffer strbuffer = new StringBuffer();
        String[] strarray = new String[list.size()];
        int index = 0;
        int[] intArray = new int[list.size()];
        String[] sr = null;
        int max = Integer.MIN_VALUE;
        List<Integer> arrayList = new ArrayList<>();

        for (Integer i : list) {
            if (i % 2 == 0) {
                arrayList.add(i);
            } else {
                arrayList.add(-1);
            }
        }
        for (Integer i1 : arrayList) {
            if (i1 != -1) {
                strbuffer.append(i1).append(",");
            } else {
                String temp = strbuffer.toString();
                if (!temp.equals("")) {
                    strarray[index++] = temp.substring(0, temp.length() - 1);
                    strbuffer = new StringBuffer();
                }
            }
        }

        for (String s2 : strarray) {
            if (s2 != null) {
                if (s2.length() > max) max = s2.length();
            }
        }
        for (String s2 : strarray) {
            if (s2 != null) {
                if (s2.length() == max) {
                    sr = s2.split(",");
                }
            }
        }
        arrayList.clear();

        for (String s3 : sr) {
            if (s3 != null) {
                arrayList.add(Integer.valueOf(s3));
            }
        }

        return arrayList;
    }

    public List<Integer> findEvenNumberWithList(List<Integer> list) {
        List<List<Integer>> arrayList = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        int max = Integer.MIN_VALUE;
        for (Integer i : list) {
            if (i % 2 == 0) {
                tempList.add(i);
            } else {
                if (!tempList.isEmpty()) {
                    arrayList.add(tempList);
                    tempList = new ArrayList<>();
                }
            }
        }

        for (List<Integer> i : arrayList) {
            if (i.size() > max) max = i.size();
        }

        for (List<Integer> i : arrayList) {
            if (i.size() == max) return i;
        }
        return null;
    }

    @Test
    public void test() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 40, 20, 7, 3, 80, 20, 40, 9)); // (-1,40,20,-1,-1,80,20,40,-1)
        //  list = findNumber(list);
        list = findEvenNumberWithList(list);
        list.forEach(item -> System.out.println(item));
    }
}
