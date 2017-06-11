package trees;

/**
 * Created by Vasanth on 2017-06-01.
 * <p>
 *        5
 *   4         7
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
                nodeToAdd.setParentNode(node);
                node.setLeftNode(nodeToAdd);
            } else {
                traverseAndAddNode(node.getLeftNode(), nodeToAdd);
            }
        } else if (nodeToAdd.getData() > node.getData()) {
            if (node.getRightNode() == null) {
                nodeToAdd.setParentNode(node);
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
    public void preOrderTraversal(Node traversingNode) {

        System.out.println(traversingNode.getData());

        if (traversingNode.getLeftNode() != null) {
            preOrderTraversal(traversingNode.getLeftNode());
        }

        if (traversingNode.getRightNode() != null) {
            preOrderTraversal(traversingNode.getRightNode());
        }
    }

    //Left->Right->Root
    public void postOrderTraversal(Node traversingNode) {

        if (traversingNode.getLeftNode() != null) {
            postOrderTraversal(traversingNode.getLeftNode());
        }

        if (traversingNode.getRightNode() != null) {
            postOrderTraversal(traversingNode.getRightNode());
        }

        System.out.println(traversingNode.getData());
    }

    /**
     * 1. Node has no children
     * 2. Node has one children
     * 3. Node has two children
     */

    public boolean delete(int data) {

        Node nodeToBeDeleted = find(data);
        if (nodeToBeDeleted != null) {
            if (nodeToBeDeleted.getRightNode() == null && nodeToBeDeleted.getLeftNode() == null) {
                deleteCase1(nodeToBeDeleted);
            } else if (nodeToBeDeleted.getRightNode() != null && nodeToBeDeleted.getLeftNode() != null) {
                deleteCase3(nodeToBeDeleted);
            } else if (nodeToBeDeleted.getLeftNode() != null) {
                deleteCase2(nodeToBeDeleted);
            } else if (nodeToBeDeleted.getRightNode() != null) {
                deleteCase2(nodeToBeDeleted);
            }
        }
        return false;
    }

    private void deleteCase1(Node nodeToBeDeleted) {
        if (nodeToBeDeleted.getParentNode().getLeftNode() == nodeToBeDeleted) {
            nodeToBeDeleted.getParentNode().setLeftNode(null);
        } else if (nodeToBeDeleted.getParentNode().getRightNode() == nodeToBeDeleted) {
            nodeToBeDeleted.getParentNode().setRightNode(null);
        }
    }

    private void deleteCase2(Node nodeToBeDeleted) {
        if (nodeToBeDeleted.getParentNode().getLeftNode() == nodeToBeDeleted) {
            if (nodeToBeDeleted.getLeftNode() != null) {
                nodeToBeDeleted.getParentNode().setLeftNode(nodeToBeDeleted.getLeftNode());
            } else if (nodeToBeDeleted.getRightNode() != null) {
                nodeToBeDeleted.getParentNode().setLeftNode(nodeToBeDeleted.getRightNode());
            }
        } else if (nodeToBeDeleted.getParentNode().getRightNode() == nodeToBeDeleted) {
            if (nodeToBeDeleted.getLeftNode() != null) {
                nodeToBeDeleted.getParentNode().setRightNode(nodeToBeDeleted.getLeftNode());
            } else if (nodeToBeDeleted.getRightNode() != null) {
                nodeToBeDeleted.getParentNode().setRightNode(nodeToBeDeleted.getRightNode());
            }
        }
    }

    private void deleteCase3(Node nodeToBeDeleted) {


        Node minNode = minLeftTraversalNode(nodeToBeDeleted.getRightNode());
        deleteCase2(minNode);
        if (nodeToBeDeleted.getParentNode() == null) {
            minNode.setRightNode(root.getRightNode());
            minNode.setLeftNode(root.getLeftNode());
            root = minNode;
        } else {
            if (nodeToBeDeleted.getParentNode().getLeftNode() == nodeToBeDeleted) {
                nodeToBeDeleted.getParentNode().setLeftNode(minNode);
                minNode.setRightNode(nodeToBeDeleted.getRightNode());
                minNode.setLeftNode(nodeToBeDeleted.getLeftNode());
            } else if (nodeToBeDeleted.getParentNode().getRightNode() == nodeToBeDeleted) {
                nodeToBeDeleted.getParentNode().setRightNode(minNode);
                minNode.setLeftNode(nodeToBeDeleted.getLeftNode());
                minNode.setRightNode(nodeToBeDeleted.getRightNode());
            }
        }
    }

    public Node minLeftTraversalNode(Node node) {
        if (node.getLeftNode() == null) {
            return node;
        }
        return minLeftTraversalNode(node.getLeftNode());
    }

    public Node find(int data) {
        if (root != null) {
            return findNode(root, new Node(data));
        }
        return null;
    }

    private Node findNode(Node search, Node nodeToFind) {
        if (search == null) return null;
        if (search.getData() == nodeToFind.getData()) {
            return search;
        } else {
            Node returnNode = findNode(search.getLeftNode(), nodeToFind);
            if (returnNode == null) {
                returnNode = findNode(search.getRightNode(), nodeToFind);
            }
            return returnNode;
        }
    }
}