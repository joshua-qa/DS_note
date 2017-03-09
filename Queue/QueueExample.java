package Queue;

/**
 * Created by jgchoi.qa on 2017. 3. 9..
 */
public class QueueExample {
    public static void main(String[] args) {

        LinkedListQueue queue = new LinkedListQueue();

        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        queue.enqueue(1);

        System.out.println(queue.isEmpty());
        System.out.println(queue.size());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
        System.out.println(queue.dequeue());
        System.out.println(queue.isEmpty());
    }
}
