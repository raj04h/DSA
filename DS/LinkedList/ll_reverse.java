package LinkedList;

import java.util.Scanner;


public class ll_reverse {

    public static void main(String[] args) {
        try (Scanner scan = new Scanner(System.in)) {
            System.out.print("Enter the number of elements: ");
            int n = scan.nextInt();
            
            System.out.println("Enter the elements:");
            LinkedList llist = new LinkedList(); // Create an empty LinkedList
            for (int i = 0; i < n; i++) {
                int data = scan.nextInt();
                llist.insertNode(data);
            }
            
            // Reverse the linked list
            llist.head = llist.reverse(llist.head);
            
            // Print the reversed linked list
            System.out.println("Reversed linked list:");
            llist.printList(llist.head);
        }
    }

    static class LinkedList {
        Node head;  // Head node of the Linked List

        static class Node {
            int data;
            Node next;

            Node(int d) {
                data = d;
                next = null;
            }
        }

        public void insertNode(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public void printList(Node node) {
            while (node != null) {
                System.out.print(node.data + " ");
                node = node.next;
            }
        }

        // Function to reverse the linked list (Iterative approach)
        public Node reverse(Node node) {
            Node prev = null;
            Node current = node;
            while (current != null) {
                Node nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }
            return prev;
        }
    }
}
