package linkedlist.excercises;

import linkedlist.Node;
import linkedlist.SingleLinkedList;
import org.junit.Test;

/**
 * Implement an algorithm to find the kth to the last element of a singly linked list
 */
public class Excercise2 {

    public Node findTheElement(int input, SingleLinkedList singleLinkedList) {
        Node currentNode = singleLinkedList.head;
        Node followerNode = singleLinkedList.head;

        for (int i = 1; i <= input; i++) {
            if (i != 1) {
                currentNode = currentNode.getNextNode();
            }
        }

        while (currentNode != null) {
            if (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
                followerNode = followerNode.getNextNode();
            } else {
                currentNode = null;
            }
        }
        return followerNode;
    }

    @Test
    public void test() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(1);
        singleLinkedList.add(2);
        singleLinkedList.add(3);
        singleLinkedList.add(4);
        singleLinkedList.add(5);
        singleLinkedList.add(6);
        singleLinkedList.add(7);
        singleLinkedList.add(8);
        singleLinkedList.add(9);
        singleLinkedList.add(10);

        System.out.println(findTheElement(3, singleLinkedList));

    }
}
