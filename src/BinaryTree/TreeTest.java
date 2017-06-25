package BinaryTree;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-24.
 */
public class TreeTest {

    @Test
    public void test() {
        BinarySearchTree tree = new BinarySearchTree();
        tree.add(50);
        tree.add(25);
        tree.add(15);
        tree.add(30);
        tree.add(75);
        tree.add(70);
        tree.add(80);
        tree.add(79);
        tree.add(78);
        tree.add(77);
        tree.add(100);

        Node node = tree.search(70);
        System.out.println(node.getData());
        String s = "";


    }
}
