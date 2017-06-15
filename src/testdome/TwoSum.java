package testdome;

/**
 * Created by Vasanth on 2017-06-15.
 */
public class TwoSum {
    public static int[] findTwoSum(int[] list, int sum) {
        int[] array = new int[2];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (i != j) {
                    if ((list[i] + list[j]) == sum) {
                        array[0] = i;
                        array[1] = j;
                        return array;
                    }
                }
            }
        }
        if (array[0] != ' ') return array;
        else return null;
    }

    public static void main(String[] args) {
        int[] indices = findTwoSum(new int[]{1, 3, 5, 7, 9}, 12);
        System.out.println(indices[0] + " " + indices[1]);
    }
}
