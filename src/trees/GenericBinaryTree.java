package trees;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 */
public class GenericBinaryTree<T> {
    GenericNode root;

    public void add(String data) {
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

    private void printTreeLevelOrder(GenericNode rootNode) {
        if (rootNode == null)
            return;
        Queue<GenericNode> q = new LinkedList<GenericNode>();
        q.add(rootNode);
        while (!q.isEmpty()) {
            GenericNode node = q.poll();
            System.out.print(node.getData() + " ");
            if (node.getLeftNode() != null)
                q.add(node.getLeftNode());
            if (node.getRightNode() != null)
                q.add(node.getRightNode());
        }

    }

    public boolean isSubtree(GenericNode dom, GenericNode vdom) {
        return stringFromPreOrder(dom).indexOf(stringFromPreOrder(vdom)) > -1;
    }

    public String stringFromPreOrder(GenericNode dom) {
        if (dom == null) {
            return "";
        }
        return dom.getData() + stringFromPreOrder(dom.getLeftNode()) + stringFromPreOrder(dom.getRightNode());
    }
}
