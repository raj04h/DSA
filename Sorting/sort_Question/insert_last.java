package sort_Question;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class insert_last {
    public static void insertionSort(int n, List<Integer> arr) {
        int valueToInsert = arr.get(n - 1);
        int lstele = n - 2; //last element
        // int shifttime=0;

        // Shift elements to the right to make space for the valueToInsert
        while (lstele >= 0 && arr.get(lstele) > valueToInsert) {
            arr.set(lstele + 1, arr.get(lstele));
            printList(arr); // Print the list after each shift
            lstele--;
            //shifttime++;
        }
        //return shifttime;
        // Insert the valueToInsert at the correct position
        arr.set(lstele + 1, valueToInsert);
        printList(arr); // Print the list after the final insertion
    }

    // Helper method to print the list
    public static void printList(List<Integer> arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter size of list:");
            int n=scan.nextInt();
            
            List<Integer> arr = new ArrayList<>();// Example list, should be mutable in real use
            System.out.println("Enter Element of list");
            
            for(int i=0;i<n;i++){
                arr.add(scan.nextInt());
            }
            insertionSort(n, arr);
        }
    }
}
