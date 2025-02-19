import java.util.Scanner;

public class DemoAVL { // TASK5
     public static void main(String[] args) { // TASK5 add Scanner
        AVLTree tree = new AVLTree();
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 8 ;i++){
            tree.root = tree.insert(tree.root, sc.nextInt());
        }
        /* Constructing tree given in the above figure // TASK1-4
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 30);
        tree.root = tree.insert(tree.root, 40);
        tree.root = tree.insert(tree.root, 50);
        tree.root = tree.insert(tree.root, 25);
        tree.root = tree.insert(tree.root, 70); //TASK4 add num 70
        tree.root = tree.insert(tree.root, 15); //TASK4 add num 15
        tree.root = tree.insert(tree.root, 45); //TASK4 add num 45 */
        System.out.println("+++Preorder traversal+++");
        tree.preOrder(tree.root);
        System.out.println("\n+++Inorder traversal+++");
        tree.inOrder(tree.root);
        System.out.println("\n+++Postorder traversal+++");
        tree.postOrder(tree.root);

        System.out.println("\nHeight = "+ tree.height(tree.root));
    } 
}
