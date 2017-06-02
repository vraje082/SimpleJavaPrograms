package linkedlist;

/**
 * Created by Vasanth on 2017-05-31.
 */
public interface LinkedList {

    public abstract void add(int data);

    public Node search(int data);

    public void print();

    public void delete(int data);

    public void reverseLinkedList();
}
