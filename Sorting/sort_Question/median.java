package sort_Question;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class median {
    public static int findMedian(List<Integer> arr) {
        // Step 1: Sort the list
        Collections.sort(arr);

        // Step 2: Find the middle element
        int middleIndex = arr.size() / 2;
        
        // Return the median
        return arr.get(middleIndex);
    }

    public static void main(String[] args) {
        // Sample input
        List<Integer> arr = Arrays.asList(0, 1, 2, 4, 6, 5, 3);
        
        // Finding the median
        int median = findMedian(arr);
        
        // Output the median
        System.out.println(median);  // Output: 3
    }
}
