package trees;

/**
 * Created by vasanthan on 2017-06-19.
 */
public class GenericNode {
    private char data;
    private GenericNode leftNode;
    private GenericNode rightNode;

    public GenericNode(char data) {
        this.data = data;
    }

    public char getData() {
        return data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public GenericNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(GenericNode leftNode) {
        this.leftNode = leftNode;
    }

    public GenericNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(GenericNode rightNode) {
        this.rightNode = rightNode;
    }

}
