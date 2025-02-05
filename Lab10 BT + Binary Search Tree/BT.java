class BTNode {
    int data;
    BTNode left, right;
    public BTNode(int item) {
        data = item;
        left = right = null;
    }
 }
 // คลาส BST
 public class BT {
    private BTNode root;
    public BT() { // constructor
        root = null;
    }
    public boolean isEmpty() {
        return root == null;
    }
    public void insert(int data) { // insert
        root = insert(root, data);
    }
    private BTNode insert(BTNode node, int data) {
        if (node == null) {
            return new BTNode(data);
        }
        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;
    }
    public int countNodes() { // count nodes
        return countNodes(root);
    }
    private int countNodes(BTNode r) {
        if (r == null)
            return 0;
        return 1 + countNodes(r.left) + countNodes(r.right);
    }
    public boolean search(int val) {
        return search(root, val);
    }
    private boolean search(BTNode r, int val) {
        if (r == null) return false;
        if (r.data == val) return true;
        return val < r.data ? search(r.left, val) : search(r.right, val);
    }
    public void inorder() {
        inorder(root);
        System.out.println();
    }
    private void inorder(BTNode r) {
        if (r != null) {
            inorder(r.left);
            System.out.print(r.data + " ");
            inorder(r.right);
        }
    }
    public void preorder() {
        preorder(root);
        System.out.println();
    }
    private void preorder(BTNode r) {
        if (r != null) {
            System.out.print(r.data + " ");
            preorder(r.left);
            preorder(r.right);
        }
    }
    public void postorder() {
        postorder(root);
        System.out.println();
    }
    private void postorder(BTNode r) {
        if (r != null) {
            postorder(r.left);
            postorder(r.right);
            System.out.print(r.data + " ");
        }
    }
    public static void main(String[] args) {
        BT tree = new BT();
        int[] values = {15, 16, 12, 32, 17, 26, 25, 20};
        for (int value : values) {
            tree.insert(value);
        }
        System.out.println("In-order Traversal:");
        tree.inorder();
        System.out.println("Pre-order Traversal:");
        tree.preorder();
        System.out.println("Post-order Traversal:");
        tree.postorder();
        System.out.println("Total nodes: " + tree.countNodes());
        System.out.println("Search 17: " + tree.search(17)); // true
        System.out.println("Search 50: " + tree.search(50)); // false
    }
 }