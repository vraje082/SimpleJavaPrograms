package javaTwoNovice;

import linkedlist.Node;
import linkedlist.SingleLinkedList;
import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-18.
 */
public class reverseSinglyLinkedList {
    Node tail = null;
    Node head = null;

    public void reverse(Node node) {
        if (node != null) {
            Node currentNode = node;
            Node previousNode = null;
            Node nextNode = null;
            tail = currentNode;
            while (currentNode != null) {
                nextNode = currentNode.getNextNode();
                currentNode.setNextNode(previousNode);
                previousNode = currentNode;
                if (nextNode == null) {
                    head = currentNode;
                }
                currentNode = nextNode;
            }
            printNode(head);
        }

    }

    private void printNode(Node node) {
        while (node != null) {
            System.out.print(node.getData() + " ");

            if (node.getNextNode() != null) {
                node = node.getNextNode();
            } else {
                node = null;
            }
        }
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

        reverse(singleLinkedList.search(1));
    }
}
