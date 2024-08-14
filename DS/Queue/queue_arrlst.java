package Queue;
import java.util.ArrayList;

public class queue_arrlst {
   
    private final ArrayList<Integer> list = new ArrayList<>();

    public void enqueue(int value) {
        list.add(value);
    }

    public int dequeue() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return list.remove(0);
    }

    public int peek() {
        if (isEmpty()) throw new RuntimeException("Queue is empty");
        return list.get(0);
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    public static void main(String[] args) {
        queue_arrlst queue = new queue_arrlst();

        // Enqueue elements
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.dequeue()); // 1

        // Peek at the front element without removing it
        System.out.println("Front element: " + queue.peek()); // 2

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // false
    }
}
