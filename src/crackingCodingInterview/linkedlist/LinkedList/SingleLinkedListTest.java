package crackingCodingInterview.linkedlist.LinkedList;

import org.junit.Test;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class SingleLinkedListTest {
    @Test
    public void testInteger(){
        LinkedList<Integer> list = new SingleLinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.print();
    }

    @Test
    public void testCharacter(){
        LinkedList<Character> list = new SingleLinkedList();
        list.add('a');
        list.add('b');
        list.add('c');
        list.add('d');
        list.add('e');
        list.print();
        list.delete('d');
        System.out.println("After deletion");
        list.print();
    }
}
