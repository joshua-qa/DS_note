package Queue;

/**
 * Created by jgchoi.qa on 2017. 3. 9..
 */
public class ArrayQueue {
    private final static int CAPACITY = 100;
    private Object[] queue;
    private int size = 0;
    private int queueFront = 0;
    private int current = 0;

    public ArrayQueue() {
        this(CAPACITY);
    }
    public ArrayQueue(int capacity) {
        queue = new Object[capacity];
    }

    public void enqueue(Object E) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        current = (queueFront + size) % queue.length;
        queue[current] = E;
        size++;
    }

    public Object dequeue() {
        if(isEmpty()) {
            return null;
        }
        Object value = queue[queueFront];
        queue[queueFront] = null;
        queueFront = (queueFront + 1) % queue.length;
        size--;

        return value;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public boolean isFull() {
        return size == queue.length - 1;
    }

    public Object top() {
        if(isEmpty()) {
            return null;
        }
        return queue[queueFront];
    }

    public int size() {
        return size;
    }
}
