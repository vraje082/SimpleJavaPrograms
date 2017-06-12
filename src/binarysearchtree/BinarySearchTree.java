package binarysearchtree;

/**
 * Created by Vasanth on 2017-06-11.
 */
public class BinarySearchTree {
    Node root = null;

    /**
     * 1) If root is null
     * 2) If root is not null traverse and add
     */
    public void add(int data) {
        Node node = new Node(data);
        if (root == null) {
            root = node;
        } else {
            traverseAndAdd(root, node);
        }
    }

    private void traverseAndAdd(Node rootNode, Node nodeToBeAdded) {
        if (nodeToBeAdded.getData() < rootNode.getData()) {
            if (rootNode.getLeftNode() == null) {
                nodeToBeAdded.setParentNode(rootNode);
                rootNode.setLeftNode(nodeToBeAdded);
            } else {
                traverseAndAdd(rootNode.getLeftNode(), nodeToBeAdded);
            }
        }

        if (nodeToBeAdded.getData() > rootNode.getData()) {
            if (rootNode.getRightNode() == null) {
                nodeToBeAdded.setParentNode(rootNode);
                rootNode.setRightNode(nodeToBeAdded);
            } else {
                traverseAndAdd(rootNode.getRightNode(), nodeToBeAdded);
            }
        }
    }

    /**
     * 1) If the node to be searched is root
     * 2) If its other node
     * 3) If the node is not present
     * *
     */
    public Node search(int data) {
        Node searchingNode = null;
        if (root != null) {
            if (root.getData() == data) return root;
            else {
                searchingNode = traverseAndSearch(root, data);
            }
        }
        if (searchingNode == null) {
            System.out.println("The node you are trying to find is not present");
        }
        return searchingNode;
    }

    private Node traverseAndSearch(Node rootNode, int data) {
        if (data == rootNode.getData()) return rootNode;
        else if (data < rootNode.getData()) {
            return traverseAndSearch(rootNode.getLeftNode(), data);
        } else
            return traverseAndSearch(rootNode.getRightNode(), data);

    }

    public void print(String type) {
        switch (type) {
            case "inorder":
                inorderTraversal(this.root);
                break;
            case "postorder":
                postorderTraversal(this.root);
                break;
            case "preorder":
                preorderTraversal(this.root);
                break;
            default:
                inorderTraversal(this.root);
                break;
        }
    }

    // Left-Root-Right
    private void inorderTraversal(Node rootNode) {
        if (rootNode.getLeftNode() != null) {
            inorderTraversal(rootNode.getLeftNode());
        }

        System.out.println(rootNode.getData());

        if (rootNode.getRightNode() != null) {
            inorderTraversal(rootNode.getRightNode());
        }
    }

    // Root-left-right
    private void preorderTraversal(Node rootNode) {
        System.out.println(rootNode.getData());

        if (rootNode.getLeftNode() != null) {
            inorderTraversal(rootNode.getLeftNode());
        }

        if (rootNode.getRightNode() != null) {
            inorderTraversal(rootNode.getRightNode());
        }
    }

    // Left-Right-Root
    private void postorderTraversal(Node rootNode) {
        if (rootNode.getLeftNode() != null) {
            inorderTraversal(rootNode.getLeftNode());
        }

        if (rootNode.getRightNode() != null) {
            inorderTraversal(rootNode.getRightNode());
        }

        System.out.println(rootNode.getData());
    }

    /**
     * case 1 : If the Node has no children
     * case 2 : if the Node has one child
     * case 3 : if the Node has two children
     */
    public void delete(int data) {
        Node nodeToBeDeleted = search(data);

        if (nodeToBeDeleted.getLeftNode() == null && nodeToBeDeleted.getRightNode() == null) {
            deleteCase1(nodeToBeDeleted);
        } else if (nodeToBeDeleted.getLeftNode() != null && nodeToBeDeleted.getRightNode() != null) {
            deleteCase2(nodeToBeDeleted);
        } else if (nodeToBeDeleted.getLeftNode() != null || nodeToBeDeleted.getRightNode() != null) {
            deleteCase3(nodeToBeDeleted);
        }
    }

    private void deleteCase1(Node nodeToBeDeleted) {
        if (nodeToBeDeleted == nodeToBeDeleted.getParentNode().getLeftNode()) {
            nodeToBeDeleted.getParentNode().setLeftNode(null);
        } else if (nodeToBeDeleted == nodeToBeDeleted.getParentNode().getRightNode()) {
            nodeToBeDeleted.getParentNode().setRightNode(null);
        }
    }

    private void deleteCase2(Node nodeToBeDeleted) {
        if (nodeToBeDeleted == nodeToBeDeleted.getParentNode().getLeftNode()) {
            if (nodeToBeDeleted.getLeftNode() != null) {
                nodeToBeDeleted.getParentNode().setLeftNode(nodeToBeDeleted.getLeftNode());
            } else if (nodeToBeDeleted.getRightNode() != null) {
                nodeToBeDeleted.getParentNode().setRightNode(nodeToBeDeleted.getRightNode());
            }
        }
        if (nodeToBeDeleted == nodeToBeDeleted.getParentNode().getRightNode()) {
            if (nodeToBeDeleted.getLeftNode() != null) {
                nodeToBeDeleted.getParentNode().setRightNode(nodeToBeDeleted.getLeftNode());
            } else if (nodeToBeDeleted.getRightNode() != null) {
                nodeToBeDeleted.getParentNode().setRightNode(nodeToBeDeleted.getRightNode());
            }
        }
    }

    private void deleteCase3(Node nodeToBeDeletd) {
        Node minNode = minNode(nodeToBeDeletd.getRightNode());
        if (nodeToBeDeletd == root) {
            root = minNode;
        }
        if (nodeToBeDeletd == nodeToBeDeletd.getParentNode().getLeftNode()) {
            deleteCase1(minNode);
            minNode.setLeftNode(nodeToBeDeletd.getLeftNode());
            minNode.setRightNode(nodeToBeDeletd.getRightNode());
            minNode.setParentNode(nodeToBeDeletd.getParentNode());
            nodeToBeDeletd.getParentNode().setLeftNode(minNode);
        }

        if (nodeToBeDeletd == nodeToBeDeletd.getParentNode().getRightNode()) {
            deleteCase1(minNode);
            minNode.setLeftNode(nodeToBeDeletd.getLeftNode());
            minNode.setRightNode(nodeToBeDeletd.getRightNode());
            minNode.setParentNode(nodeToBeDeletd.getParentNode());
            nodeToBeDeletd.getParentNode().setRightNode(minNode);
        }
    }

    public Node minNode(Node minNode) {
        while (minNode.getLeftNode() != null) {
            minNode = minNode.getLeftNode();
        }
        return minNode;
    }

    int left = 1;
    int right = 1;

    public int heightOfTheTree(Node rootNode) {

        if (rootNode == null) {
            return -1;
        }
        return 1 + Math.max(heightOfTheTree(rootNode.getLeftNode()), heightOfTheTree(rootNode.getRightNode()));
    }

    public void topView(Node rootNode) {
        if (rootNode != null) {
            System.out.print(rootNode.getData() + " ");
        }
        if (rootNode.getRightNode() != null) {
            topView(rootNode.getRightNode());
        }
    }

    public int printDistance(Node root, int n1, int n2) {
        int x = Pathlength(root, n1) - 1;
        int y = Pathlength(root, n2) - 1;
        int lcaData = findLCA(root, n1, n2).data;
        int lcaDistance = Pathlength(root, lcaData) - 1;
        return (x + y) - 2 * lcaDistance;
    }
    public int Pathlength(Node root, int n1) {
        if (root != null) {
            int x = 0;
            if ((root.data == n1) || (x = Pathlength(root.getLeftNode(), n1)) > 0
                    || (x = Pathlength(root.getRightNode(), n1)) > 0) {
                // System.out.println(root.data);
                return x + 1;
            }
            return 0;
        }
        return 0;
    }

    public Node findLCA(Node root, int n1, int n2) {
        if (root != null) {
            if (root.data == n1 || root.data == n2) {
                return root;
            }
            Node left = findLCA(root.getLeftNode(), n1, n2);
            Node right = findLCA(root.getRightNode(), n1, n2);

            if (left != null && right != null) {
                return root;
            }
            if (left != null) {
                return left;
            }
            if (right != null) {
                return right;
            }
        }
        return null;
    }

}
