package tree.binarytree;

/**
 * Created by vasanthan on 2017-06-30.
 */
public class Node {
    Node(String data) {
        this.data = data;
    }

    private String data;
    private Node leftNode;
    private Node rightNode;

    public String getData() {
        return data;
    }

    public void setData(String data) {
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
