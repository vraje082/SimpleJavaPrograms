package linkedlist;

/**
 * Created by Vasanth on 2017-05-31.
 * <p>
 * 1 2 3 4 5
 */
public class SingleLinkedList implements LinkedList {

    public Node head = null;
    public Node tail = null;
    Node temp = null;

    /**
     * 1) If the list is empty
     * 2) If the list is not empty
     */
    @Override
    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            temp = tail;
            tail = node;
            temp.setNextNode(tail);
        }
    }

    @Override
    public Node search(int data) {
        if (head != null) {
            temp = head;
        }
        while (temp != null) {

            if (temp.getData() == data) {
                System.out.println("Data found . " + temp.getData());
                return temp;
            }
            if (temp.getNextNode() != null)
                temp = temp.getNextNode();
            else {
                temp = null;
            }
        }
        System.out.println("The node you are searching for data " + data + " not found");
        return null;
    }

    @Override
    public void print() {
        if (head != null) {
            temp = head;
        }
        while (temp != null) {
            System.out.println(temp.getData());

            if (temp.getNextNode() != null) {
                temp = temp.getNextNode();
            } else {
                temp = null;
            }
        }
    }

    /**
     * 1) If head is the node to be deleted
     * 2) If tail is the node to be deleted
     * 3) If the node to be deleted is in the middle
     */
    @Override
    public void delete(int data) {

        if (head.getData() == data) {
            if (head.getNextNode() != null) {
                head = head.getNextNode();
            } else {
                head = null;
                tail = null;
            }
        } else if (tail.getData() == data) {
            if (tail != head) {
                Node node = getPreviousNode(data);
                tail = node;
                tail.setNextNode(null);
            } else {
                head = null;
                tail = null;
            }
        } else {
            if (head != null) {
                temp = head;
            }

            while (temp != null) {
                if (temp.getData() == data) {
                    Node node = getPreviousNode(data);
                    node.setNextNode(node.getNextNode().getNextNode());
                }
                if (temp.getNextNode() != null) {
                    temp = temp.getNextNode();
                } else {
                    temp = null;
                }
            }
        }
    }

    /**
     * // 1->2->3->4->5
     */

    public Node getPreviousNode(int data) {  // 4

        if (head != null) {
            temp = head;     // 1
        }

        while (temp != null) {      // 1 2 3
            if (temp.getNextNode().getData() == data) {  // 2 3
                return temp;
            }

            if (temp.getNextNode() != null) {       // 2 3
                temp = temp.getNextNode();          // 2 3
            } else {
                temp = null;
            }
        }


        return null;
    }

    /**
     * C
     * 1 2->3->4->5
     * P N
     */
    @Override
    public void reverseLinkedList() {
        if (head != null) {
            Node currentNode = head;
            Node nextNode = null;
            Node previousNode = null;
            tail = currentNode;
            while (currentNode != null) {
                nextNode = currentNode.getNextNode();
                currentNode.setNextNode(previousNode);
                previousNode = currentNode;
                if (nextNode == null) {
                    head = currentNode;
                }
                currentNode = nextNode;
            }
        }
    }
}
