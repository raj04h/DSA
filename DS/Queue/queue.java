package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class queue {
     public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(1);
        queue.add(2);
        queue.add(3);

        // Dequeue elements
        System.out.println("Dequeued element: " + queue.poll()); // 1

        // Peek at the front element without removing it
        System.out.println("Front element: " + queue.peek()); // 2

        // Check if queue is empty
        System.out.println("Is queue empty? " + queue.isEmpty()); // false

        // Print all elements
        System.out.println("Queue elements: " + queue); // [2, 3]
    }
}
