package trees;

/**
 * Created by vasanthan on 2017-06-19.
 */
public class SubTree {

    public boolean isSubTree(Node node, Node vNode) {
        return stringFromPreOrder(node).indexOf(stringFromPreOrder(vNode)) > -1;
    }

    public String stringFromPreOrder(Node node) {
        if (node == null) {
            return "";
        }
        return node.getData() + stringFromPreOrder(node.getLeftNode()) + stringFromPreOrder(node.getRightNode());
    }
}
