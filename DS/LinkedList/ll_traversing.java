package LinkedList;

import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linkedList {
    Node head;

    // Method to insert a node at the end of the list
    public void insertAtTail(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Method to insert a node at the head of the list
    public void insertAtHead(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class ll_traversing {
    public static void main(String[] args) {
        linkedList llist = new linkedList();
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = scan.nextInt();
            
            System.out.println("Enter the elements:");
            for (int i = 0; i < n; i++) {
                int data = scan.nextInt();
                llist.insertAtTail(data); // Inserting each element at the tail
            }
            
            // Print the linked list
            System.out.println("Linked list:");
            llist.printList();
        }
    }
}
