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

    public void add_first(Object input) {
        Node firstNode = new Node(input);
        firstNode.next = head;
        head = firstNode;

        size++;
        if(head.next == null) {
            tail = head;
        }
    }

    public void add_last(Object input) {
        Node newNode = new Node(input);

        if(size == 0) {
            add_first(input);
        } else {
            tail.next = newNode;
            tail = newNode;
            size++;
        }
    }

    public void add(Object input, int index) {
        Node newNode = new Node(input);
        Node currentNode = get_node_at(index-1);
        Node tempNode = currentNode.next;

        currentNode.next = newNode;
        newNode.next = tempNode;

        size++;
        if(newNode.next == null) {
            tail = newNode;
        }
    }

    public Object delete_first() {
        Node tempNode = head;

        head = tempNode.next;
        Object returnData = tempNode.data;
        tempNode = null;
        size--;
        return returnData;
    }

    public Object delete(int index) {
        if (index == 0) {
            return delete_first();
        }

        Node tempNode = get_node_at(index-1);
        Node currentNode = tempNode.next;
        tempNode.next = currentNode.next;

        Object returnData = currentNode.data;
        currentNode = null;
        size--;
        return returnData;
    }

    Node get_node_at(int index) {
        Node x = head;
        for (int i = 0; i < index; i++) {
            x = x.next;
        }
        return x;
    }

    public void clear() {
        int index;
        for(index = 0; index < this.size; index++) {
            delete(index);
        }
    }

    public void display() {
        int index;
        Node currentNode = head;
        System.out.print("( ");

        for(index = 0; index < this.size; index++) {
            System.out.print(currentNode.data + " ");
            currentNode = currentNode.next;
        }
        System.out.print(")\n");
    }

    public int is_in_list(Object data) {
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

    public int get_length() {
        return this.size;
    }

    public Object get_entry(int index) {
        Node tempNode = get_node_at(index);
        return tempNode.data;
    }
}