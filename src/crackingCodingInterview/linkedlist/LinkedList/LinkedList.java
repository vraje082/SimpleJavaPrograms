package crackingCodingInterview.linkedlist.LinkedList;

/**
 * Created by vasanthan on 2017-06-25.
 */
public interface LinkedList<T> {

    void add(T data);
    Node search(T data);
    void delete(T data);
    void print();
    void reverse();
}
