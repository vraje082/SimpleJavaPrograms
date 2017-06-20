package trees;

/**
 *
 */
public class GenericBinaryTree<T> {
    GenericNode root;

    public void add(char data) {
        GenericNode node = new GenericNode(data);

        if (root == null) {
            root = node;
        } else {
            traverseAndAdd(root, node);
        }

    }

    public void traverseAndAdd(GenericNode root, GenericNode nodeToAdd) {

        if (root != null) {
            if (root.getLeftNode() == null) {
                root.setLeftNode(nodeToAdd);
                return;

            } else if (root.getRightNode() == null) {
                root.setRightNode(nodeToAdd);
                return;
            } else {
                traverseAndAdd(root.getLeftNode(), nodeToAdd);
                traverseAndAdd(root.getRightNode(), nodeToAdd);
            }
        }
    }
}
