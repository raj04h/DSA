package BST.Heap_BS;
import java.util.*;

public class sweetness_heap {
    public static int cookies(int k, List<Integer> A) {
        // Create a min-heap (PriorityQueue) to manage the cookie sweetness levels
        PriorityQueue<Integer> heap = new PriorityQueue<>(A);

        int operations = 0;

        // Continue combining cookies until the smallest sweetness is >= k
        while (heap.size() > 1 && heap.peek() < k) {
            // Extract the two least sweet cookies
            int leastSweet = heap.poll();
            int secondLeastSweet = heap.poll();

            // Combine them into a new cookie
            int newSweetness = leastSweet + 2 * secondLeastSweet;
            
            // Add the new cookie back into the heap
            heap.add(newSweetness);

            // Count this as one operation
            operations++;
        }

        // After the loop, check if the smallest cookie is >= k
        if (heap.peek() >= k) {
            return operations;
        } else {
            return -1; // Not possible to reach the desired sweetness
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read n (number of cookies) and k (minimum required sweetness)
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        // Read the array of sweetness values
        List<Integer> A = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            A.add(scanner.nextInt());
        }

        // Call the cookies method and store the result
        int result = cookies(k, A);

        // Print the result (number of operations or -1 if not possible)
        System.out.println(result);

        // Close the scanner
        scanner.close();

    
}
}
