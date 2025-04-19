package LinkedList;
import java.util.*;

class Node {
    int data;
    Node next;

    // Constructor to create a new node
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Result {
    // Method to remove duplicates from the linked list
    static Node condense(Node head) {
        if (head == null) {
            return null;
        }

        HashSet<Integer> seen = new HashSet<>();
        Node curr = head;
        Node prev = null;

        // Traverse the list
        while (curr != null) {
            // If we have already seen the data, skip the node
            if (seen.contains(curr.data)) {
                prev.next = curr.next; // Remove the current node by linking the previous to the next
            } else {
                seen.add(curr.data); // Add the data to the set
                prev = curr;         // Update the previous node
            }
            curr = curr.next;        // Move to the next node
        }
        return head; // Return the modified list
    }

    // Method to print the linked list
    static void printList(Node head) {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
        System.out.println();
    }
}

public class removeCommon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Read number of elements
        int n = scan.nextInt();

        // Create the linked list
        Node head = null;
        Node tail = null;
        for (int i = 0; i < n; i++) {
            int data = scan.nextInt();
            Node newNode = new Node(data);

            // If list is empty, set head and tail to the new node
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                // Append to the end of the list
                tail.next = newNode;
                tail = newNode;
            }
        }

        // Condense the list to remove duplicates
        head = Result.condense(head);

        // Print the result
        Result.printList(head);

        scan.close();
    }
}
