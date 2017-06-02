package trees;

/**
 * Created by Vasanth on 2017-06-01.
 * <p>
 * 5
 * 4         7
 * 3   1     6   9
 */
public class BinaryTree {

    Node root = null;

    public void add(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            traverseAndAddNode(root, node);
        }
    }

    private void traverseAndAddNode(Node node, Node nodeToAdd) {
        if (nodeToAdd.getData() < node.getData()) {
            if (node.getLeftNode() == null) {
                node.setLeftNode(nodeToAdd);
            } else {
                traverseAndAddNode(node.getLeftNode(), nodeToAdd);
            }
        } else if (nodeToAdd.getData() > node.getData()) {
            if (node.getRightNode() == null) {
                node.setRightNode(nodeToAdd);
            } else {
                traverseAndAddNode(node.getRightNode(), nodeToAdd);
            }
        }
    }


    public void traversel(String type) {
        if (root != null) {
            Node nodeToTraverse = root;
            switch (type) {
                case "inorder":
                    inOrderTraversal(nodeToTraverse);
                    break;
                case "postorder":
                    postOrderTraversal(nodeToTraverse);
                    break;
                case "preorder":
                    preOrderTraversal(nodeToTraverse);
            }
        }
        if (root.getLeftNode() == null || root.getRightNode() == null) {
            System.out.println(root.getData());
        }
    }

    // Left -> Root -> Right
    public void inOrderTraversal(Node traversingNode) {
        if (traversingNode.getLeftNode() != null) {
            inOrderTraversal(traversingNode.getLeftNode());
        }

        System.out.println(traversingNode.getData());

        if (traversingNode.getRightNode() != null) {
            inOrderTraversal(traversingNode.getRightNode());
        }

    }

    // Root->Left->Right
    public void preOrderTraversal(Node nodeToTraverse) {

    }

    //Left->Right->Root
    public void postOrderTraversal(Node nodeToTraverse) {
    }

    public void print() {
    }

    public void delete() {
    }
}
