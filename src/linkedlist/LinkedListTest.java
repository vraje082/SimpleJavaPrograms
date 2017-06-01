package linkedlist;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-05-31.
 */
public class LinkedListTest {

    @Test
    public void test() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(1);
        singleLinkedList.add(2);
        singleLinkedList.add(3);
        singleLinkedList.add(4);
        singleLinkedList.add(5);

        singleLinkedList.print();
        System.out.println("");
        singleLinkedList.delete(5);
        singleLinkedList.reverseLinkedList();
        singleLinkedList.print();
    }

    @Test
    public void doubleLinkedListTest() {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();

        doubleLinkedList.add(1);
        doubleLinkedList.add(2);
        doubleLinkedList.add(3);
        doubleLinkedList.add(4);
        doubleLinkedList.add(5);

        doubleLinkedList.print();
        System.out.println("");
        doubleLinkedList.reverseLinkedList();
        doubleLinkedList.print();

    }

}
