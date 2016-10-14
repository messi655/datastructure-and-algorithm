package com.datastructure;

/**
 * Created by tinhv on 12/09/2016.
 */
public class BalanceTree {

    public static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }

        public Node(){};
    }

    public Node insert(int data, Node root){
        if(root == null){
            return new Node(data);
        }

        if(data > root.data){
            root.right = insert(data, root.right);
        }
        if(data < root.data){
            root.left = insert(data,root.left);
        }
        return root;
    }

    public int height(Node root){
        if(root == null){
            return -1;
        }
        else{
            int lDepth = height(root.left);
            int rDepth = height(root.right);

            if(lDepth > rDepth){
                return lDepth + 1;
            }
            else{
                return rDepth + 1;
            }
        }

    }

    public void innerOrder(Node root){
        if(root != null){
            innerOrder(root.left);
            System.out.print(root.data + " ");
            innerOrder(root.right);
        }
    }

    public boolean isBalanced(Node root) {
        if (root == null)
            return true;

        if (getHeight(root) == -1)
            return false;

        return true;
    }

    public int getHeight(Node root) {
        if (root == null)
            return 0;

        int left = getHeight(root.left);
        int right = getHeight(root.right);

        if (left == -1 || right == -1)
            return -1;

        if (Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;

    }

    public void preOrder(Node root){
        if(root != null){
            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }
    }

    public void postOrder(Node root){
        if(root != null){
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");
        }
    }

    public static void main(String[] args) {

        Node root = new Node(4);
        BalanceTree bl = new BalanceTree();


        bl.insert(4,root);
        bl.insert(2,root);
        bl.insert(1,root);
        bl.insert(3,root);
        bl.insert(7,root);
        bl.insert(6,root);
        bl.insert(8,root);
        bl.insert(9,root);
        bl.insert(10,root);
        bl.insert(11,root);
        bl.insert(12,root);




        System.out.print("Post Order: ");
        bl.postOrder(root);

        System.out.println();
        System.out.print("Pre Order: ");
        bl.preOrder(root);


        System.out.println();
        System.out.print("Inner Order: ");
        bl.innerOrder(root);

        System.out.println();
        System.out.println(bl.getHeight(root));

        System.out.println();
        System.out.println(bl.isBalanced(root));


    }


}
