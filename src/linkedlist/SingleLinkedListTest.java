package linkedlist;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-05-31.
 */
public class SingleLinkedListTest {

    @Test
    public void test() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(1);
        singleLinkedList.add(2);
        singleLinkedList.add(3);
        singleLinkedList.add(4);
        singleLinkedList.add(5);

        singleLinkedList.print();



    }

}
