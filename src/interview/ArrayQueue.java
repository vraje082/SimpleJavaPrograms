package interview;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-22.
 */
public class ArrayQueue {

    int[] array = new int[5];
    int enqueuIndex = 0;

    public void enque(int i) {
        array[enqueuIndex++] = i;
    }

    public void deque() {
        for (int i = 0; i < array.length; i++) {
            if (i < array.length - 1) {
                array[i] = array[i + 1];
            } else {
                array[i] = 0;
            }
        }
    }

    public int peek(int i) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] == i) return array[j];
        }
        return 0;
    }

    public void print() {
        System.out.println("Printing all the elements");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j]);
        }
    }

    @Test
    public void test() {
        ArrayQueue queue = new ArrayQueue();
        queue.enque(1);
        queue.enque(2);
        queue.enque(3);
        queue.enque(4);
        queue.enque(5);
        queue.print();
        queue.deque();
        queue.print();

    }
}
