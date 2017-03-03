package Joshua.DS.List;

/**
 * Created by Joshua on 2017-03-04.
 */
public class LinkedList {
    private Node head;
    private Node tail;
    private int size = 0;

    private class Node {
        private Object data;

        private Node next;
        public Node(Object input) {
            this.data = input;
            this.next = null;
        }
    }

    public void addFirst(Object input) {
        Node firstNode = new Node(input);
        firstNode.next = head;
        head = firstNode;

        size++;
        if(head.next == null) {
            tail = head;
        }
    }

    public void addLast(Object input) {
        Node newNode = new Node(input);

        if(size == 0) {
            addFirst(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    Node find(int index) {
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void addNode(Object input, int index) {
        Node newNode = new Node(input);
        Node currentNode = find(index-1);
        Node tempNode = currentNode.next;

        currentNode.next = newNode;
        newNode.next = tempNode;

        size++;
        if(newNode.next == null) {
            tail = newNode;
        }
    }

    public Object deleteFirst() {
        Node temp = head;

        head = temp.next;
        Object returnData = temp.data;
        temp = null;
        size--;
        return returnData;
    }

    public Object deleteNode(int index) {
        if (index == 0) {
            return deleteFirst();
        }

        Node temp = find(index-1);
        Node currentNode = temp.next;
        temp.next = currentNode.next;

        Object returnData = currentNode.data;
        currentNode = null;
        size--;
        return returnData;
    }

    public int size() {
        return this.size;
    }

    public Object get(int index) {
        Node temp = find(index);
        return temp.data;
    }

    public int indexOf(Object data) {
        Node temp = head;

        int index = 0;

        while(temp.data != data) {
            temp = temp.next;
            index++;

            if(temp == null) {
                return -1;
            }
        }

        return index;
    }
}