package BST;

import java.util.ArrayList;

public class Build_BST {

    static class Node {
        int data;
        Node left;
        Node right;
        private Object leaf;
        

        Node(int data) {
            this.data = data;
        }
    }

    static Node insert(Node root, int val) {
        if (root == null) {
            root = new Node(val);
            return root;
        }

        if (root.data > val) {
            root.left = insert(root.left, val);
        } else {
            root.right = insert(root.right, val);
        }

        return root;
    }

    static void inorder(Node root) {
        if (root == null) {
            return;
        }

        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    static boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }
        if (root.data == key) {
            return true;
        }

        if (root.data > key) {
            return search(root.left, key);
        } else {
            return search(root.right, key);
        }
    }

    static Node inorderSuccessor(Node root) {
        while (root != null && root.left != null) {
            root = root.left;
        }
        return root;
    }

    static Node delete(Node root, int val) {
        if (root == null) {
            return null;
        }

        if (root.data > val) {
            root.left = delete(root.left, val);
        } else if (root.data < val) {
            root.right = delete(root.right, val);
        } else { // root.data == val

            // case 1: no child
            if (root.left == null && root.right == null) {
                return null;
            }

            // case 2: one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // case 3: two children
            else {
                Node successor = inorderSuccessor(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);
            }
        }
        return root;
    }

    static void printrange(Node root,int x,int y){
        if(root==null){
            return;
        }

        if(root.data>=x && root.data<=y){
            printrange(root.left, x, y);
            System.out.print(root.data + " ");
            printrange(root.right, x, y);
        }

        else if(root.data>=y){
            printrange(root.left, x, y);
        }
        else{
            printrange(root.right, x, y);
        }
    }

    static void printPath(ArrayList<Integer>path){
        for (int i=0; i<path.size();i++){
            System.out.print(path.get(i)+ "->");
        }
        System.out.println();
    }

    static void printroot2leaf(Node root,ArrayList<Integer>path){
        if (root==null){
            return;
        }
        path.add(root.data);

        //leaf
        if(root.leaf==null && root.right==null){
            printPath(path);
        }
        else{ //non leaf node
            printroot2leaf(root.left, path);
            printroot2leaf(root.right, path);
        }
        path.remove(path.size()-1);
    }

    public static void main(String[] args) {
        int values[] = {8, 5, 3, 1, 4, 6, 10, 11, 14};

        Node root = null;
        for (int i = 0; i < values.length; i++) {
            root = insert(root, values[i]);
        }
        System.out.println("Inorder traversal:");
        inorder(root);
        System.out.println();

        if (search(root, 1)) {
            System.out.println("1 is found");
        } else {
            System.out.println("1 is not found");
        }
        if (search(root, 7)) {
            System.out.println("7 is found");
        } else {
            System.out.println("7 is not found");
        }

        root = delete(root, 4); // Update the root after deletion
        System.out.println("Inorder traversal after deleting 4:");
        inorder(root);
        System.out.println();

        /* root = delete(root, 5); // Update the root after deletion
        System.out.println("Inorder traversal after deleting 5:");
        inorder(root);
        System.out.println();
        */
        printrange(root, 6, 10);
        System.out.println(" ");


        printroot2leaf(root, new ArrayList<>());
    }
}
