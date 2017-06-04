package linkedlist;

/**
 * Created by Vasanth on 2017-06-04.
 */
public class CircularLinkedList extends SingleLinkedList {

    Node head = null;
    Node tail = null;

    @Override
    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNextNode(node);
            tail = node;
            tail.setNextNode(head);
        }
    }

    public Node getHead() {
        return this.head;
    }
}
