package BST;

class Node{
    int data;
    Node left,right;

    public Node(int value){
        data=value;
        left=right=null;
    }
}

public class Bin_searchtree {
    
    Node insert(Node root,int data){
        if(root==null){
            root=new Node(data);
            return root;
        }

        if(data<root.data){
            root.left=insert(root.left, data);
        }
        if(data>root.data){
            root.right=insert(root.right, data);
        }
        return root;
    }

    void inorder(Node root){

        if(root!=null){
            inorder(root.left);
            System.out.print(root.data+" ");
            inorder(root.right);
        }
    }

    Node lowercommonansester(Node root,int v1,int v2){
        if(root==null){
            return  null;
        }
        if(root.data>v1 && root.data>v2){
            return lowercommonansester(root.left, v1, v2);
        }
        if(root.data<v1 && root.data<v2){
            return lowercommonansester(root.right, v1, v2);
        }
        return root;

    }

    public static void main(String[] args) {
        Bin_searchtree tree=new Bin_searchtree();

        Node root=new Node(4);
        tree.insert(root, 2);
        tree.insert(root, 7);
        tree.insert(root, 1);
        tree.insert(root, 3);

        tree.insert(root,6);
        tree.inorder(root);

        int v1 = 3, v2 = 6;
        Node lca=tree.lowercommonansester(root, v1, v2);
        System.out.println("LCA of "+v1+" and "+v2+" is " +lca.data );
        
    }
}
