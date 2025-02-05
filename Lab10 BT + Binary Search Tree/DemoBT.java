import java.util.*;

public class DemoBT {
    public static void main(String[] args)
   {
       Scanner scan = new Scanner(System.in);
       /* Creating object of BT */
       BT bt = new BT();
       /*  Perform tree operations  */
       System.out.println("Binary Tree Test\n");
       int choice = 0;
       do{
           System.out.println("\nBinary Tree Operations\n");
           System.out.println("1. insert ");
           System.out.println("2. search");
           System.out.println("3. count nodes");
           System.out.println("4. check empty");
           System.out.println("0. quit");
           System.out.print("Enter Choice: ");
           choice = scan.nextInt();
           switch (choice)
           {
            case 1 :
               System.out.print("Enter integer element to insert:");
               bt.insert( scan.nextInt() );
               break;
            case 2 :
               System.out.print("Enter integer element to search:");
               System.out.println("Search result : "+ bt.search( scan.nextInt() ));
               break;
            case 3 :
               System.out.println("Nodes = "+ bt.countNodes());
               break;
            case 4 :
               System.out.println("Empty status = "+ bt.isEmpty());
               break;
            case 0 : break;
            default :
               System.out.println("Wrong Entry \n ");
               break;
           }
           /*  Display tree  */
           System.out.print("\nPRe-order : ");
           bt.preorder();
           System.out.print("\nIn-order : ");
           bt.inorder();
           System.out.print("\nPost-order : ");
           bt.postorder();
           
       } while (choice != 0);
   }
}