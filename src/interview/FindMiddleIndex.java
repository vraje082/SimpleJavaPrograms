package interview;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-06.
 */
public class FindMiddleIndex {

    public int findTheIndex(int[] input) throws Exception {
        int endIndex = input.length - 1;
        int startIndex = 0;
        int sumLeft = 0;
        int sumRight = 0;
        while (true) {
            if (sumLeft > sumRight) {
                sumRight = sumRight + input[endIndex--];
            } else {
                sumLeft = sumLeft + input[startIndex++];
            }
            if (startIndex > endIndex) {
                if (sumLeft == sumRight) {
                    break;
                } else {
                    throw new Exception(
                            "Please pass proper array to match the requirement");
                }
            }
        }
        return endIndex;
    }

    public int findCustom(int[] input) {
        int[] firstArray = getArray(input, 0, input.length / 2);
        int[] secondArray = getArray(input, (input.length / 2), input.length - 1);

        if (sum(firstArray) == sum(secondArray)) {
            return (input.length / 2) - 1;
        }

        return 0;
    }

    private int[] getArray(int[] input, int start, int end) {
        int[] temp = new int[input.length / 2];

        for (int i = start; i < end; i++) {
            temp[i] = input[i];
        }
        return temp;
    }

    private int sum(int[] input) {
        int sum = 0;
        for (Integer i : input) {
            sum = sum + i;
        }
        return sum;
    }

    @Test
    public void test() throws Exception {


        System.out.println("Index starting from 0 to " + findTheIndex(new int[]{2, 4, 4, 5, 4, 1}) + " are equal");
    }
}
