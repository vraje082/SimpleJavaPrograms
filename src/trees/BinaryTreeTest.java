package trees;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-01.
 */
public class BinaryTreeTest {

    @Test
    public void test() {
        BinaryTree binaryTree = new BinaryTree();

        binaryTree.add(50);
        binaryTree.add(75);
        binaryTree.add(25);
        binaryTree.add(27);
        binaryTree.add(30);
        binaryTree.add(10);
        binaryTree.add(15);
        binaryTree.add(60);
        binaryTree.add(80);
        binaryTree.add(77);
        binaryTree.add(76);
        binaryTree.add(90);

        binaryTree.delete(50);
        //Node node = binaryTree.minLeftTraversalNode(binaryTree.find(75));
        System.out.println();
    }
}
