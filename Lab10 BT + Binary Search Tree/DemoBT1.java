public class DemoBT1 {
    public static void main(String[] args) {
        BT tree = new BT();
        tree.insert(5);
        tree.insert(2);
        tree.insert(6);
        tree.insert(1);
        tree.insert(8);
        tree.insert(4);
        System.out.println("no. nodes: " + tree.countNodes());
        System.out.println("search: " + tree.search(0));
        System.out.println("search: " + tree.search(5));
        System.out.println("++++ inorder travelsal ++++");
        tree.inorder();
        System.out.println("\n++++ preorder travelsal ++++");
         tree.preorder();
        System.out.println("\n++++ postorder travelsal ++++");
         tree.postorder();
    }
}