package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class LinkedList {
    Node head;

    // Method to insert nodes at the end of the list
    public void insertNode(int data) {
        Node newNode = new Node(data); // Create a new node with the given data
        if (head == null) { // Check if the list is empty
            head = newNode; // If empty, set the new node as the head
        } else { 
            Node current = head; // Start from the head of the list
            while (current.next != null) { // Traverse to the end of the list
                current = current.next; // Move to the next node
            }
            current.next = newNode; // Insert the new node at the end of the list
        }
    }
    

    // Method to delete a node at a given position
    public void deleteNode(int position) {
        if (head == null) { // Check if the list is empty
            System.out.println("List is empty");
            return;
        }
    
        if (position == 0) { // Check if the position to delete is the head
            head = head.next; // Remove the head by moving the head reference to the next node
        } else {
            Node current = head; // Start from the head of the list
            for (int i = 0; i < position - 1 && current != null; i++) {
                current = current.next; // Traverse to the node just before the one to delete
            }
            if (current == null || current.next == null) {
                System.out.println("Position out of bounds");
                return;
            }
            current.next = current.next.next; // Bypass the node to be deleted
        }
    }
    

    // Method to print the linked list
    public void printList() {
        Node curr = head; // Start from the head of the list
        while (curr != null) { // Traverse the list
            System.out.print(curr.data + " "); // Print the data of the current node
            curr = curr.next; // Move to the next node
        }
    }
    
}

public class ll_del_insert {
    public static void main(String[] args) {
        LinkedList llist = new LinkedList();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.println("Enter the number of nodes to insert:");
            int n = scan.nextInt();
            
            System.out.println("Enter the nodes' data:");
            for (int i = 0; i < n; i++) {
                int data = scan.nextInt();
                llist.insertNode(data);
            }
            
            System.out.println("Enter the position of the node to delete:");
            int position = scan.nextInt();
            llist.deleteNode(position);
            
            llist.printList();
        }
    }
}
