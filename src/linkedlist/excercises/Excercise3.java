package linkedlist.excercises;

import linkedlist.Node;
import linkedlist.SingleLinkedList;
import org.junit.Test;

/**
 * Implement an algorithm to delete a node in the middle of a single linked list , given only access to that node
 * <p>   N ->
 * 1->2->4 4->5
 */
public class Excercise3 {
    public void deleteNodeInTheLinkList(Node node) {
        node.setData(node.getNextNode().getData());
        node.getNextNode().setNextNode(null);
        node.setNextNode(node.getNextNode().getNextNode());
    }

    @Test
    public void test() {
        SingleLinkedList singleLinkedList = new SingleLinkedList();
        singleLinkedList.add(1);
        singleLinkedList.add(2);
        singleLinkedList.add(3);

        deleteNodeInTheLinkList(singleLinkedList.head.getNextNode());
        String s = "";
    }
}
