public class BSTree {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    }// class Node

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                // System.out.println("Inserted "+value+" to left of "+ node.value);
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
                // System.out.println("Inserted "+value+" to right of "+ node.value);
                node.right = new Node(value);
            }
        }
    }

    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.print(" " + node.value);
            inOrder(node.right);
        }
    }

    // preOrder
    public void preOrder(Node mode ) {
        if (node != null) {
            System.out.print(node.value + " "); 
            preOrder (node.left); 
            preOrder(node.right);
        }
    }
    // postOrder
    public void postOrder(Node node){
        if (node != null){
            postOrder (node.left); 
            postOrder (node.right);
            System.out .print(node.value + " ");
        }
    }
    public static void main(String args[]) {
        BSTree tree = new BSTree();
        Node root = new Node(5);
        System.out.println("Binary Tree Example");
        System.out.println("Building tree with root value " + root.value);
        tree.insert(root, 2);
        tree.insert(root, 4);
        tree.insert(root, 8);
        tree.insert(root, 6);
        tree.insert(root, 7);
        tree.insert(root, 3);
        tree.insert(root, 9);
        System.out.println("+++ Traversing tree in order +++");
        tree.inOrder(root);
        System.out.println("\n+++ Traversing tree pre order +++ ");
         tree.preOrder(root);
        System.out.println("\n+++ Traversing tree post order +++");
         tree.postOrder(root);
    }
}