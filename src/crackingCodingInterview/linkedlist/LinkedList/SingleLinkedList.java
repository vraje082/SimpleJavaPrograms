package crackingCodingInterview.linkedlist.LinkedList;

/**
 * Created by vasanthan on 2017-06-25.
 */
public class SingleLinkedList<T> implements LinkedList {

    Node head = null;
    Node tail = null;

    @Override
    public void add(Object data) {
        Node node = new Node(data);

        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNextNode(node);
            tail = node;
        }
    }

    @Override
    public Node search(Object data) {
        Node temp = null;
        if (head != null) {
            temp = head;
            while (temp != null) {
                if (temp.getData() == data | temp.getData().equals(data)) {
                    return temp;
                }
                if (temp.getNextNode() != null) {
                    temp = temp.getNextNode();
                } else {
                    temp = null;
                }
            }
        }
        return null;
    }

    @Override
    public void delete(Object data) {
        Node node = getNodeBefore(data);
        if (head.getData() == data | head.getData().equals(data)) {
            head = head.getNextNode();
        } else if (tail.getData() == data | tail.getData().equals(data)) {
            tail = node;
        } else {
            node.setNextNode(node.getNextNode().getNextNode());
        }
    }

    @Override
    public void print() {
        Node temp = null;
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

    @Override
    public void reverse() {
        if (head != null) {
            Node currentNode = head;
            Node nextNode = null;
            Node previousNode = null;
            this.tail = currentNode;
            while (currentNode != null) {
                nextNode = currentNode.getNextNode();
                currentNode.setNextNode(previousNode);
                previousNode = currentNode;
                if (nextNode == null) {
                    this.head = currentNode;
                }
                currentNode = nextNode;
            }
        }
    }

    private Node getNodeBefore(Object data) {
        Node currentNode = null;
        if (head != null) {
            currentNode = head;
            while (currentNode.getNextNode() != null) {
                if (currentNode.getNextNode().getData() == data | currentNode.getNextNode().getData().equals(data)) {
                    return currentNode;
                }
                if (currentNode.getNextNode() != null) {
                    currentNode = currentNode.getNextNode();
                } else {
                    currentNode = null;
                }
            }
        }
        return currentNode;
    }
}
