package BinaryTree;

/**
 * Created by vasanthan on 2017-06-24.
 */
public class Node {
    private int data;
    private Node rightNode;
    private Node leftNode;
    private Node parent;

    public Node(int data) {
        this.data = data;
    }

    public Node getParent() {
        return parent;
    }

    public void setParent(Node parent) {
        this.parent = parent;
    }

    public int getData() {

        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

}
