package LinkedList;
import java.util.Scanner;


class SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode next;

    SinglyLinkedListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ll_merge {
    
      public static SinglyLinkedListNode mergeLists(SinglyLinkedListNode headA, SinglyLinkedListNode headB) {
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode current = dummy;

        while (headA != null && headB != null) {
            if (headA.data <= headB.data) {
                current.next = headA;
                headA = headA.next;
            } else {
                current.next = headB;
                headB = headB.next;
            }
            current = current.next;
        }

        if (headA != null) {
            current.next = headA;
        } else {
            current.next = headB;
        }

        return dummy.next;
    }

    public static void printList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static SinglyLinkedListNode createLinkedList(int[] values) {
        if (values.length == 0) {
            return null;
        }

        SinglyLinkedListNode head = new SinglyLinkedListNode(values[0]);
        SinglyLinkedListNode current = head;
        for (int i = 1; i < values.length; i++) {
            current.next = new SinglyLinkedListNode(values[i]);
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
          // Number of test cases
          try (Scanner scanner = new Scanner(System.in)) {
              // Number of test cases
              int t = scanner.nextInt();
              
              for (int i = 0; i < t; i++) {
                  // Read the first list
                  int n1 = scanner.nextInt();
                  int[] list1 = new int[n1];
                  for (int j = 0; j < n1; j++) {
                      list1[j] = scanner.nextInt();
                  }
                  
                  // Read the second list
                  int n2 = scanner.nextInt();
                  int[] list2 = new int[n2];
                  for (int j = 0; j < n2; j++) {
                      list2[j] = scanner.nextInt();
                  }
                  
                  // Create linked lists from input arrays
                  SinglyLinkedListNode headA = createLinkedList(list1);
                  SinglyLinkedListNode headB = createLinkedList(list2);
                  
                  // Merge the lists
                  SinglyLinkedListNode mergedHead = mergeLists(headA, headB);
                  
                  // Print the merged list
                  printList(mergedHead);
              } }
    }
}
