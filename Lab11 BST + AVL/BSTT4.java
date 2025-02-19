import java.util.Scanner;

public class BSTT4 {
    static class Node {
        int value;
        Node left, right;

        Node(int value) {
            this.value = value;
            left = null;
            right = null;
        }
    } // class Node

    public void insert(Node node, int value) {
        if (value < node.value) {
            if (node.left != null) {
                insert(node.left, value);
            } else {
                node.left = new Node(value);
            }
        } else if (value > node.value) {
            if (node.right != null) {
                insert(node.right, value);
            } else {
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

    public void preOrder(Node node) {
        if (node != null) {
            System.out.print(" " + node.value);
            preOrder(node.left);
            preOrder(node.right);
        }
    }

    public void postOrder(Node node) {
        if (node != null) {
            postOrder(node.left);
            postOrder(node.right);
            System.out.print(" " + node.value);
        }
    }

    public static void main(String args[]) {
        BSTT4 tree = new BSTT4();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter 8 integers to build the BST: ");
        int firstValue = scanner.nextInt();
        Node root = new Node(firstValue);

        for (int i = 1; i < 8; i++) {
            int value = scanner.nextInt();
            tree.insert(root, value);
        }

        System.out.println("+++ Traversing tree in order +++");
        tree.inOrder(root);
        System.out.println("\n+++ Traversing tree pre order +++");
        tree.preOrder(root);
        System.out.println("\n+++ Traversing tree post order +++");
        tree.postOrder(root);

        scanner.close();
    }
}
