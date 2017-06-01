package linkedlist;

/**
 * Created by Vasanth on 2017-05-31.
 */
public class SingleLinkedList implements LinkedList {

    Node head = null;
    Node tail = null;
    Node temp = null;

    /**
     * 1) If the list is empty
     * 2) If the list is not empty
     */
    @Override
    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            temp = tail;
            tail = node;
            temp.setNextNode(tail);
        }
    }

    @Override
    public Node search(int data) {
        if (head != null) {
            temp = head;
        }
        while (temp != null) {

            if (temp.getData() == data) {
                System.out.println("Data found . " + temp.getData());
                return temp;
            }
            if (temp.getNextNode() != null)
                temp = temp.getNextNode();
            else {
                temp = null;
            }
        }
        System.out.println("The node you are searching for data " + data + " not found");
        return null;
    }

    @Override
    public void print() {
        if (head != null) {
            temp = head;
        }
        while (temp != null) {
            System.out.println(temp.getData());

            if (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            } else {
                temp = null;
            }
        }
    }

    @Override
    public void delete(int data) {

    }

    @Override
    public LinkedList reverseLinkedList(LinkedList linkedList) {
        return null;
    }
}
