package Sorting;
import java.util.ArrayList;
import java.util.List;

public class count {
    public static List<Integer> countingSort(List<Integer> arr) {
        int maxVal = 0;
        
        // Find the maximum value in the input array
        for (int num : arr) {
            if (num > maxVal) {
                maxVal = num;
            }
        }
        
        // Initialize count array with size (maxVal + 1)
        int[] count = new int[maxVal + 1];
        
        // Populate count array
        for (int num : arr) {
            count[num]++;
        }
        
        // Generate the sorted list
        List<Integer> sortedArr = new ArrayList<>();
        for (int i = 0; i < count.length; i++) {
            while (count[i] > 0) {
                sortedArr.add(i);
                count[i]--;
            }
        }
        
        return sortedArr;
    }

    public static void main(String[] args) {
        // Sample input
        List<Integer> arr = List.of(63, 25, 73, 1, 98, 73, 56, 84, 86, 57, 16, 83, 8, 25, 81, 56, 9, 53, 98, 67);
        List<Integer> sortedArr = countingSort(arr);
        
        // Print sorted output
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}
 