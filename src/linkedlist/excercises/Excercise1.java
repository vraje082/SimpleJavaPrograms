package linkedlist.excercises;

import linkedlist.Node;
import linkedlist.SingleLinkedList;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * Write code to remove duplicates from unsorted linked list
 * <p>
 */
public class Excercise1 {
    public SingleLinkedList removeDuplicatesWithMap(SingleLinkedList singleLinkedList) {
        Map<Integer, Character> map = new HashMap<>();
        Node currentNode = singleLinkedList.head;
        while (currentNode != null) {
            if (!map.containsKey(currentNode.getData())) {
                map.put(currentNode.getData(), (char) 0);
            } else {
                singleLinkedList.delete(currentNode.getData());
            }
            if (currentNode.getNextNode() != null) {
                currentNode = currentNode.getNextNode();
            } else {
                currentNode = null;
            }
        }
        return singleLinkedList;
    }

    //1 2 3 4 5 6 4 7 2 9
    public void removeDuplicatesWithoutMap(SingleLinkedList singleLinkedList) {

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
        singleLinkedList.add(4);
        singleLinkedList.add(8);
        singleLinkedList.add(3);
        singleLinkedList.add(10);

        removeDuplicatesWithMap(singleLinkedList);
        System.out.println("Get");
    }
}
