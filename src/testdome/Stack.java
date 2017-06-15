package testdome;

/**
 * Created by Vasanth on 2017-06-15.
 */
public class Stack {
    long[] array = new long[10];
    int index =0;

    public void push(Long i) {
    array[index]=i;
    index = index+1;
    }

    public Long pop() {
        Long temp = null;
        if(index<=10) {
            temp = array[index - 1];
            array[index - 1] = ' ';
            index = index - 1;
            
        }
        return temp;
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1L);
        stack.push(2L);
        stack.push(3L);
        stack.push(4L);
        stack.push(5L);
        stack.push(6L);
        stack.push(7L);
        stack.push(8L);
        stack.push(9L);
        stack.push(10L);


        System.out.println(stack.pop());
    }
}
