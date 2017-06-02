package linkedlist;

/**
 * Created by Vasanth on 2017-05-31.
 */
public class DoubleLinkedList extends LinkedList {

    Node head = null;
    Node tail = null;
    Node temp = null;

    /**
     * 1<=>2<=>3<=>4<=>5
     */
    @Override
    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNextNode(node);
            node.setPreviousNode(tail);
            tail = node;
        }

    }

    @Override
    public Node search(int data) {
        if (head != null) {
            temp = head;
            while (temp != null) {
                if (temp.getData() == data) {
                    System.out.println("Data found");
                    return temp;
                }

                if (temp.getNextNode() != null) {
                    temp = temp.getNextNode();
                } else {
                    temp = null;
                }
            }
        }
        System.out.println("Data not found");
        return null;
    }

    @Override
    public void print() {
        if (head != null) {
            temp = head;
            while (temp != null) {
                System.out.println(temp.getData());

                if (temp.getNextNode() != null) {
                    temp = temp.getNextNode();
                } else {
                    temp = null;
                }
            }
        }
    }

    // 1 2 3 4 5
    @Override
    public void delete(int data) {
        if (head.getData() == data) {
            if (head != tail) {
                head = head.getNextNode();
            } else {
                head = null;
                tail = null;
            }
        } else if (tail.getData() == data) {
            if (head != tail) {
                tail = tail.getPreviousNode();
                tail.setNextNode(null);
            } else {
                head = null;
                tail = null;
            }
        } else {
            Node node = search(data);
            node.getPreviousNode().setNextNode(node.getNextNode());
            node.getNextNode().setPreviousNode(node.getPreviousNode());
        }
    }

    @Override
    public void reverseLinkedList() {
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
