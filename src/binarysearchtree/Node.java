package binarysearchtree;

/**
 * Created by Vasanth on 2017-06-11.
 */
public class Node {
    int data;
    Node leftNode;
    Node rightNode;
    Node parentNode;

    public Node(int data) {
        this.data = data;
    }
    public Node(){}

    public Node getParentNode() {
        return parentNode;
    }

    public void setParentNode(Node parentNode) {
        this.parentNode = parentNode;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public Node getRightNode() {
        return rightNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }
}
