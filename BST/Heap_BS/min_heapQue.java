package BST.Heap_BS;

import java.util.PriorityQueue;
import java.util.Scanner;

public class min_heapQue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read the number of queries (Q)
        int q = scan.nextInt();

        // Create a PriorityQueue to function as our min-heap
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        // Loop through each query
        for (int i = 0; i < q; i++) {
            // Read the type of operation
            int type = scan.nextInt();

            // If type == 1, we add an element to the heap
            if (type == 1) {
                int element = scan.nextInt(); // Read the element to be added
                heap.add(element); // Add the element to the heap
                System.out.println("Added " + element + " to the heap.");
            }

            // If type == 2, we remove an element from the heap
            if (type == 2) {
                int element = scan.nextInt(); // Read the element to be removed
                heap.remove(element); // Remove the element from the heap
                System.out.println("Removed " + element + " from the heap.");
            }

            // If type == 3, we print the minimum element in the heap
            if (type == 3) {
                System.out.println("Current minimum: " + heap.peek());
            }
        }

        // Close the scanner to prevent resource leaks
        scan.close();
    }
    
    
}
