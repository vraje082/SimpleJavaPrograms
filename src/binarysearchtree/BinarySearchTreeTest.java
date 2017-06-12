package binarysearchtree;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-11.
 */
public class BinarySearchTreeTest {

    @Test
    public void test() {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.add(50);
        binarySearchTree.add(25);
        binarySearchTree.add(75);
        binarySearchTree.add(15);
        binarySearchTree.add(30);
        binarySearchTree.add(75);
        binarySearchTree.add(70);
        binarySearchTree.add(80);
        binarySearchTree.add(79);
        binarySearchTree.add(78);
        binarySearchTree.add(77);
        binarySearchTree.add(100);

        int n = binarySearchTree.printDistance(binarySearchTree.search(50), 15, 70);

        String s = "";

        // binarySearchTree.topView(binarySearchTree.search(47));

    }
}

