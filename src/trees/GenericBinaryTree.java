package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */
public class GenericBinaryTree<T> {
    GenericNode root;

    public void add(char data) {
        GenericNode node = new GenericNode(data);

        if (root == null) {
            // No Nodes are Present, create one and assign it to rootNode
            root = node;
        } else {
            //Nodes present, So checking vacant position for adding new Node in sequential fashion

            Queue<GenericNode> q = new LinkedList<GenericNode>();
            q.add(root);
            while (!q.isEmpty()) {
                GenericNode node1 = q.poll();
                if (node1.getLeftNode() != null && node1.getRightNode() != null) {
                    q.add(node1.getLeftNode());
                    q.add(node1.getRightNode());
                } else {
                    if (node1.getLeftNode() == null) {
                        node1.setLeftNode(node);
                    } else {
                        node1.setRightNode(node);
                    }
                    break;
                }
            }
        }
    }

    private void printTreeLevelOrder(Node rootNode) {
        if (rootNode == null)
            return;
        Queue<Node> q = new LinkedList<Node>();
        q.add(rootNode);
        while (!q.isEmpty()) {
            Node node = q.poll();
            System.out.print(node.getData() + " ");
            if (node.getLeftNode() != null)
                q.add(node.getLeftNode());
            if (node.getRightNode() != null)
                q.add(node.getRightNode());
        }

    }
}
