package BST;

import java.util.LinkedList;
import java.util.Queue;

public class Bin_tree {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class Binary_tre {
        static int idx = -1;

        public static Node buildTree(int node[]) {
            idx++;
            if (node[idx] == -1) {
                return null;
            }
            Node newNode = new Node(node[idx]);
            newNode.left = buildTree(node);
            newNode.right = buildTree(node);
            return newNode;
        }
    }

    static void Preorder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        Preorder(root.left);
        Preorder(root.right);
    }

    static void Inorder(Node root) {
        if (root == null) {
            return;
        }
        Inorder(root.left);
        System.out.print(root.data + " ");
        Inorder(root.right);
    }

    static void Postorder(Node root) {
        if (root == null) {
            return;
        }
        Postorder(root.left);
        Postorder(root.right);
        System.out.print(root.data + " ");
    }

    static void Levelorder(Node root) {
        Queue<Node> q = new LinkedList<>();

        q.add(root);
        q.add(null);

        while (!q.isEmpty()) {
            Node curNode = q.remove();

            if (curNode == null) {
                System.out.println();
                if (q.isEmpty()) {
                    break;
                } else {
                    q.add(null);
                }
            } else {
                System.out.print(curNode.data + " ");

                if (curNode.left != null) {
                    q.add(curNode.left);
                }

                if (curNode.right != null) {
                    q.add(curNode.right);
                }
            }
        }
    }

    static int CountNode(Node root) {
        if (root == null) {
            return 0;
        }
        int leftNode = CountNode(root.left);
        int rightNode = CountNode(root.right);

        return leftNode + rightNode + 1;
    }

    static int Sum_Node(Node root) {
        if (root == null) {
            return 0;
        }
        int left_sum = Sum_Node(root.left);
        int right_sum = Sum_Node(root.right);

        return left_sum + right_sum + root.data;
    }

    static int Height_tree(Node root) {
        if (root == null) {
            return 0;
        }
        int left_heigh = Height_tree(root.left);
        int right_heigh = Height_tree(root.right);

        return Math.max(left_heigh, right_heigh) + 1;
    }

    static int diameter(Node root) {
        if (root == null) {
            return 0;
        }
        int dm_left = diameter(root.left);
        int dm_right = diameter(root.right);
        int dm_root = Height_tree(root.left) + Height_tree(root.right) + 1;

        return Math.max(dm_root, Math.max(dm_left, dm_right));
    }

    static class TreeInfo {
        int height;
        int diameter;

        TreeInfo(int height, int diameter) {
            this.height = height;
            this.diameter = diameter;
        }
    }

    static TreeInfo diamInfo(Node root) {
        if (root == null) {
            return new TreeInfo(0, 0);
        }
        TreeInfo left = diamInfo(root.left);
        TreeInfo right = diamInfo(root.right);

        int height = Math.max(left.height, right.height) + 1;
        int diameter = Math.max(left.height + right.height + 1, Math.max(left.diameter, right.diameter));

        return new TreeInfo(height, diameter);
    }

    static boolean isIdentical(Node root, Node subroot) {
        if (subroot == null && root == null) {
            return true;
        }

        if (subroot == null || root == null) {
            return false;
        }

        if (root.data == subroot.data) {
            return isIdentical(root.left, subroot.left) && isIdentical(root.right, subroot.right);
        }
        return false;
    }

    static boolean isSubtree(Node root, Node subRoot) {
        if (subRoot == null) {
            return true;
        }
        if (root == null) {
            return false;
        }
        if (isIdentical(root, subRoot)) {
            return true;
        }
        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }

    public static void main(String[] args) {
        int node[] = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};
        int subNode[] = {2, 4, -1, -1, 5, -1, -1}; // Subtree

        Node root = Binary_tre.buildTree(node);
        Binary_tre.idx = -1; // Reset index for building the subtree
        Node subRoot = Binary_tre.buildTree(subNode);

        System.out.println("Root: " + root.data);

        System.out.println("Preorder Traversal");
        Preorder(root);
        System.out.println();

        System.out.println("Inorder Traversal");
        Inorder(root);
        System.out.println();

        System.out.println("Postorder Traversal");
        Postorder(root);
        System.out.println();

        System.out.println("Levelorder Traversal");
        Levelorder(root);
        System.out.println();

        System.out.println("Count_Node= " + CountNode(root));
        System.out.println("Sum_Node= " + Sum_Node(root));
        System.out.println("Height_Tree= " + Height_tree(root));
        System.out.println("diameter_tree= " + diameter(root));
        System.out.println("Diameter using diamInfo= " + diamInfo(root).diameter);

        // Check if subRoot is a subtree of root
        boolean result = isSubtree(root, subRoot);
        System.out.println("Is subtree: " + result);
    }
}