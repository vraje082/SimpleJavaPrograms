package tree.binarytree;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by vasanthan on 2017-06-30.
 */
public class BinaryTree {
    Node rootNode = null;

    public boolean isSubtree(Node dom, Node vdom) {
        return stringFromPreOrder(dom).indexOf(stringFromPreOrder(vdom)) > -1;
    }

    public String stringFromPreOrder(Node tree) {
        if (tree != null) {
            return "";
        }
        return tree.getData() + stringFromPreOrder(tree.getLeftNode()) + stringFromPreOrder(tree.getRightNode());
    }

    public void add(String data) {
        Node newNode = new Node(data);
        if (this.rootNode == null) {
            // No Nodes are Present, create one and assign it to rootNode
            rootNode = newNode;
        } else {
            //Nodes present, So checking vacant position for adding new Node in sequential fashion

            Queue<Node> q = new LinkedList<>();
            q.add(rootNode);
            while (!q.isEmpty()) {
                Node node = q.poll();
                if (node.getLeftNode() != null && node.getRightNode() != null) {
                    q.add(node.getLeftNode());
                    q.add(node.getRightNode());
                } else {
                    if (node.getLeftNode() == null) {
                        node.setLeftNode(newNode);
                    } else {
                        node.setRightNode(newNode);
                    }
                    break;
                }
            }
        }
    }

    public Node find(String value) {
        return findNode(this.rootNode, value);
    }

    public Node findNode(Node nodeToFind) {
        return findNode(this.rootNode, nodeToFind);
    }

    private Node findNode(Node root, Node nodeToFind) {
        if (root != null) {
            if (root.getData().equals(nodeToFind)) {
                return root;
            } else {
                findNode(root.getLeftNode(), nodeToFind);
            }

            findNode(root.getRightNode(), nodeToFind);

        }
        return root;
    }

    private Node findNode(Node root, String val) {

        Node result = null;

        if (root.getLeftNode() != null)
            result = findNode(root.getLeftNode(), val);

        if (root.getData().equals(val))
            return root;

        if (result == null && root.getRightNode() != null)
            result = findNode(root.getRightNode(), val);

        return result;

    }

    /*public Node findNode(Node root, String data) {
        if (root != null) {
            if (root.getData() == data) {
                return root;
            }

        }
    }*/

    @Test
    public void test() {
        Node domNode = new Node("root");
        domNode.setLeftNode(new Node("a"));
        domNode.setRightNode(new Node("b"));
        domNode.getLeftNode().setLeftNode(new Node("c"));
        domNode.getLeftNode().setRightNode(new Node("d"));
        domNode.getLeftNode().getLeftNode().setLeftNode(new Node("g"));
        domNode.getLeftNode().getLeftNode().setRightNode(new Node("h"));
        domNode.getLeftNode().setRightNode(new Node("d"));
        domNode.getLeftNode().getRightNode().setLeftNode(new Node("i"));

        domNode.getRightNode().setLeftNode(new Node("e"));
        domNode.getRightNode().setRightNode(new Node("f"));
        domNode.getRightNode().getLeftNode().setRightNode(new Node("j"));
        domNode.getRightNode().getLeftNode().getRightNode().setLeftNode(new Node("k"));
        domNode.getRightNode().getLeftNode().getRightNode().setRightNode(new Node("l"));

        Node vdomNode = new Node("a");
        vdomNode.setLeftNode(new Node("c"));
        vdomNode.setRightNode(new Node("d"));
        vdomNode.getLeftNode().setLeftNode(new Node("g"));
        vdomNode.getLeftNode().setRightNode(new Node("h"));
        vdomNode.getRightNode().setLeftNode(new Node("i"));

        //System.out.println(isSubtree(domNode,vdomNode));
    }

    @Test
    public void test1() {
        BinaryTree tree = new BinaryTree();
        tree.add("a");
        tree.add("b");
        tree.add("c");
        tree.add("d");

        Node node = tree.findNode(tree.rootNode.getRightNode());
        String c = "";
    }
}
