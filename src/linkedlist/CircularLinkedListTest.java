package linkedlist;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-04.
 */
public class CircularLinkedListTest {

    @Test
    public void test() {
        SingleLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(1);
        circularLinkedList.add(2);
        circularLinkedList.add(3);
        circularLinkedList.add(4);
        circularLinkedList.add(5);

        System.out.println("");
    }

    /**
     * f  c
     * 1->2->3->4->5
     */
    @Test
    public void testIfTheListIsCircular() {

        Node currentNode = null;
        Node followerNode = null;

        CircularLinkedList circularLinkedList = new CircularLinkedList();
        circularLinkedList.add(1);
        circularLinkedList.add(2);
        circularLinkedList.add(3);
        circularLinkedList.add(4);
        circularLinkedList.add(5);
        Node head = circularLinkedList.head;
        if (head != null) {
            currentNode = head.getNextNode();
            followerNode = head;
        }

        while (currentNode != null) {
            if (currentNode.getData() == followerNode.getData()) {
                System.out.println("The list is circular");
                break;
            } else {
                currentNode = currentNode.getNextNode().getNextNode();
                followerNode = followerNode.getNextNode();
            }
        }

        System.out.println("End of Search");
    }

}
