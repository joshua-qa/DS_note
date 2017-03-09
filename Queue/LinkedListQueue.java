package Queue;

import java.util.LinkedList;

/**
 * Created by jgchoi.qa on 2017. 3. 9..
 */
public class LinkedListQueue {
    LinkedList<Object> listQueue;
    public LinkedListQueue() {
        listQueue = new LinkedList();
    }

    public void enqueue(Object E) {
        listQueue.addLast(E);
    }

    public Object dequeue() {
        return listQueue.removeFirst();
    }

    public boolean isEmpty() {
        return listQueue.isEmpty();
    }

    public int size() {
        return listQueue.size();
    }

    public Object top() {
        return listQueue.getFirst();
    }
}
