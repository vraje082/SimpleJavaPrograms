package interview;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-22.
 */
public class Stack {
    int[] array = new int[20];
    int index = 0;

    public void push(int input) {
        if (index < 20) {
            array[index++] = input;
        } else {
            System.out.println("Stack is full . No more items can be added at this moment");
        }
    }

    public void pop() {
        if (array.length > 0) {
            array[index-1] = Integer.parseInt(null);
            index = index - 1;
        } else {
            System.out.println("There are not enough items in the Stack to be popped");
        }

    }

    public void print() {
        for (int j = 0; j < index; j++) {
            System.out.println(array[j]);
        }
    }

    public int peek() {
        System.out.println(array[index-1]);
        return array[index-1];
    }

    @Test
    public void test() {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.print();
        stack.pop();
        System.out.println("After pop");
        stack.print();
        System.out.println("After peek");
        stack.peek();
    }
}
