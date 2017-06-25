package BinaryTree;

/**
 * Created by vasanthan on 2017-06-24.
 */
public interface Tree {
    public void add(int data);

    public Node search(int data);

    public void delete(int data);

    public void print();

    public void traversal(String typeOfTraversal);
}
