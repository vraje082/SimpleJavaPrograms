package linkedlist;

/**
 * Created by Vasanth on 2017-05-31.
 */
public class Node {

    private int data;
    private Node nextNode;

    public Node(int data) {
        this.data = data;
        this.nextNode = null;
    }

    public void setData(int data) {
        this.data = data;
    }

    public int getData() {
        return this.data;
    }

    public void setNextNode(Node node) {
        this.nextNode = node;
    }

    public Node getNextNode() {
        return this.nextNode;
    }

    @Override
    public String toString() {
        return "[data : " + this.data + " ]";
    }
}
