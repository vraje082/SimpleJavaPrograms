package crackingCodingInterview.linkedlist.LinkedList;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class Node<T> {

    public Node(T data) {
        this.data = data;
    }

    private T data;

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }

    private Node nextNode;
}
