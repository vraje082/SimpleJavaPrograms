package BinaryTree;

/**
 * Created by vasanthan on 2017-06-24.
 */
public class BinarySearchTree implements Tree {

    Node root = null;


    @Override
    public void add(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            traverseAndAdd(root, node);
        }
    }

    private void traverseAndAdd(Node root, Node nodeToBeAdded) {
        if (nodeToBeAdded.getData() < root.getData()) {
            if (root.getLeftNode() == null) {
                nodeToBeAdded.setParent(root);
                root.setLeftNode(nodeToBeAdded);
            } else {
                traverseAndAdd(root.getLeftNode(), nodeToBeAdded);
            }
        } else if (nodeToBeAdded.getData() > root.getData()) {
            if (root.getRightNode() == null) {
                nodeToBeAdded.setParent(root);
                root.setRightNode(nodeToBeAdded);
            } else {
                traverseAndAdd(root.getRightNode(), nodeToBeAdded);
            }
        }
    }

    @Override
    public Node search(int data) {
        Node node = new Node(data);
        return searchAndReturnNode(this.root, node);
    }

    private Node searchAndReturnNode(Node root, Node nodeToBeSearched) {
        if (root.getData() == nodeToBeSearched.getData()) {
            return root;
        }
        if (root.getLeftNode() != null) {
            return searchAndReturnNode(root.getLeftNode(), nodeToBeSearched);
        }

        if (root.getRightNode() != null) {
            return searchAndReturnNode(root.getRightNode(), nodeToBeSearched);
        }

        return root;
    }

    @Override
    public void delete(int data) {

    }

    @Override
    public void print() {

    }

    @Override
    public void traversal(String typeOfTraversal) {
        switch (typeOfTraversal) {
            case "preorder":
                preorder(root);
                break;
            case "inorder":
                inorder(root);
                break;
            case "postorder":
                postorder(root);
                break;
            default:
                inorder(root);
                break;
        }
    }

    private void inorder(Node root) {
        if (root.getLeftNode() != null) {
            inorder(root.getLeftNode());
        }
        System.out.println(root.getData());
        if (root.getRightNode() != null) {
            inorder(root.getRightNode());
        }

    }

    private void preorder(Node root) {
        System.out.println(root.getData());
        if (root.getLeftNode() != null) {
            inorder(root.getLeftNode());
        }

        if (root.getRightNode() != null) {
            inorder(root.getRightNode());
        }
    }

    private void postorder(Node root) {
        if (root.getLeftNode() != null) {
            inorder(root.getLeftNode());
        }

        if (root.getRightNode() != null) {
            inorder(root.getRightNode());
        }
        System.out.println(root.getData());
    }
}
