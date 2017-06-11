package hackerrank;

import org.junit.Test;

/**
 * Created by Vasanth on 2017-06-10.
 */


public class PrintLinkedList {
    public void print(Node head) {
        Node temp = null;

        if (head != null) {
            temp = head;
        }
        while (temp != null) {
            System.out.println(temp.data);
            if (temp.next != null) {
                temp = temp.next;
            } else {
                temp = null;
            }
        }

    }

    Node head = null;
    Node tail = null;

    public Node addNode(int input) {
        Node node = new Node(input);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.next = node;
            tail = node;
        }
        return head;
    }

    Node Insert(Node head, int data) {
        Node tail = null;
        Node node = new Node();
        node.data = data;
        Node temp = null;
        if (head != null) {
            temp = head;
        }
        while (temp != null) {
            if (temp.next != null) {
                temp = temp.next;
            } else {
                temp.next = node;
                tail = node;
                temp = null;
            }
        }
        return tail;
    }

    /**
     * N T
     * 0-1-2-4
     * 3
     */
    Node InsertNth(Node head, int data, int position) {
        int index = 0;
        Node node = new Node();
        node.data = data;
        Node temp = null;
        if (head != null) {
            temp = head;
        }
        while (temp != null) {
            if (position == 0) {
                node.next = temp;
                head = node;
                return head;

            }
            if (index == position - 1) {
                Node node1 = temp.next;
                temp.next = node;
                node.next = node1;
                return head;
            }
            if (temp.next != null) {
                temp = temp.next;
                index = index + 1;
            } else {
                temp = null;
            }
        }
        return head;
    }

    Node ReversePrint(Node head) {
        Node currentNode = head;
        Node nextNode = null;
        Node previousNode = null;
        Node tail = null;
        tail = currentNode;
        while (currentNode != null) {
            nextNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            if (nextNode == null) {
                head = currentNode;
            }
            currentNode = nextNode;
        }
        Node temp1 = null;
        if (head != null) {
        }
        temp1 = head;
        while (temp1 != null) {
            System.out.println(temp1.data);
            if (temp1.next != null) {
                temp1 = temp1.next;
            } else {
                temp1 = null;
            }
        }
        return head;
    }


    @Test
    public void test() {
        Node node1 = addNode(1);
        Node node2 = addNode(2);
        Node node3 = addNode(3);
        Node node4 = addNode(4);

        Node node5 = ReversePrint(node1);
        String s = "";
    }
}
