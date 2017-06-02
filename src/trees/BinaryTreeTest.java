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
        binaryTree.add(25);
        binaryTree.add(75);
        binaryTree.add(30);
        binaryTree.add(10);
        binaryTree.add(100);

        binaryTree.traversel("inorder");


    }
}
