/**
 * Created by jgchoi.qa on 2017. 3. 7..
 */
public class ArrayStack {
    private final static int CAPACITY = 100;
    private Object[] stack;
    private int size = -1;

    public ArrayStack() {
        this(CAPACITY);
    }
    public ArrayStack(int capacity) {
        stack = new Object[capacity];
    }

    public void push(Object E) {
        if (isFull()) {
            throw new ArrayIndexOutOfBoundsException();
        }
        stack[++size] = E;
    }

    public Object pop() {
        if(isEmpty()) {
            return null;
        }
        Object topValue = stack[size];
        stack[size--] = null;

        return topValue;
    }

    public boolean isEmpty() {
        return stack[0] == null;
    }

    public boolean isFull() {
        return stack.length-1 == size;
    }

    public Object top() {
        if(isEmpty()) {
            return null;
        }
        return stack[size];
    }

    public int size() {
        return size+1;
    }
}
