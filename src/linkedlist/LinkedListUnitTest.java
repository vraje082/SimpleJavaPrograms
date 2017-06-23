package linkedlist;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


/**
 * Created by vasanthan on 2017-06-20.
 */
public class LinkedListUnitTest {

    private LinkedList linkedList;

    @Before
    public void setup() {
        linkedList = new SingleLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
    }

    @Test
    public void test() {
        Node expectedNode = new Node(5);
        Node actualNode = linkedList.search(5);
        Assert.assertTrue(actualNode instanceof Node);
    }


}
