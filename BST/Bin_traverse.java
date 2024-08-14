package BST;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    public  Node(int item) {
        data = item;
        left = right = null;
    }
}

class BinaryTree {

    Scanner scan = new Scanner(System.in);

    // Method to create the binary tree from user input
    public Node createTree() {
        int data = scan.nextInt();
        if (data == -1) {
            return null;
        }

        Node node = new Node(data);
        node.left = createTree();  // Create left subtree
        node.right = createTree(); // Create right subtree
        return node;
    }

    // Method to perform preorder traversal of the binary tree
    public void Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    public static void postOrder(Node root) {
        if(root==null){
            return;
        }
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+" ");
        
    }
    public static void inOrder(Node root) {
        
        if(root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);

    }
    public static void levelOrder(Node root) {
        if (root == null) {
            return;
        }
      Queue<Node> q=new LinkedList<>();
      
      
      q.add(root);
      while (!q.isEmpty()) {
            Node curr = q.remove();
      
              System.out.print(curr.data+ " ");
              
              if(curr.left!=null){
                  q.add(curr.left);
              }
              if(curr.right!=null){
                  q.add(curr.right);
              }
          }
}

    public static int height(Node root) {
        // Write your code here.
        if(root==null){
            return -1;
            }
            
        int lefthei=height(root.left);
        int righthei=height(root.right);
            
        return Math.max(lefthei, righthei)+1;
      }
}

public class Bin_traverse {
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Creating the binary tree from user input
        System.out.println("Enter the elements of the tree (-1 for null nodes):");
        Node root = tree.createTree();

        // Preorder traversal of the tree
        System.out.println("Preorder traversal:");
        tree.Preorder(root); // Expected output for the sample input: 1 2 5 3 4 6
    }
}
