public class BTDemo {
    public static void main(String[] args) {
        BTNode p = new BTNode(5);
        p.left = new BTNode(7);
        p.right = new BTNode(8);
        // System.out.println(p);
        // System.err.println(p.data);
        // System.err.println(p.left.data);
         System.err.println(p.left.right.data); 
    }
}