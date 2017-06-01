package linkedlist;

/**
 * Created by Vasanth on 2017-05-31.
 */
public class Node {

    private int data;
    private Node nextNode;
    private Node previousNode;

    public Node(int data) {
        this.data = data;
        this.nextNode = null;
        this.previousNode = null;
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

    public Node getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "[data : " + this.data + " ]";
    }
}
