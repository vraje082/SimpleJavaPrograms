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

    /*public boolean isSubtree(GenericNode dom, GenericNode vdom) {
        dom = preprocessString(dom);
        vdom = preprocessString(vdom);
        return stringFromPreOrder(dom).indexOf(stringFromPreOrder(vdom)) > -1;
    }*/


    boolean areIdentical(GenericNode root1, GenericNode root2) {

        /* base cases */
        if (root1 == null && root2 == null)
            return true;

        if (root1 == null || root2 == null)
            return false;

        /* Check if the data of both roots is same and data of left and right
           subtrees are also same */
        return (root1.getData().equals(root2.getData())
                && areIdentical(root1.getLeftNode(), root2.getLeftNode())
                && areIdentical(root1.getRightNode(), root2.getRightNode()));
    }

    boolean isSubtree(GenericNode treeRootNode, GenericNode subtreeRootNode) {
        /* base cases */
        if (subtreeRootNode == null)
            return true;

        if (treeRootNode == null)
            return false;

        /* Check the tree with root as current node */
        if (areIdentical(treeRootNode, subtreeRootNode))
            return true;

        /* If the tree with root as current node doesn't match then
           try left and right subtrees one by one */
        return isSubtree(treeRootNode.getLeftNode(), subtreeRootNode) || isSubtree(treeRootNode.getRightNode(), subtreeRootNode);
    }

    public GenericNode preprocessString(GenericNode node) {
        node.setData(node.getData().toLowerCase());
        if (node.getData().startsWith(" ") | node.getData().endsWith(" ")) {
            node.setData(node.getData().trim());
        }

        if (node.getLeftNode() != null) {
            preprocessString(node.getLeftNode());
        }

        if (node.getRightNode() != null) {
            preprocessString(node.getRightNode());
        }
        return node;
    }

    public String stringFromPreOrder(GenericNode dom) {
        if (dom == null) {
            return "";
        }
        return dom.getData() + stringFromPreOrder(dom.getLeftNode()) + stringFromPreOrder(dom.getRightNode());
    }
}
