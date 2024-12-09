import java.util.*;
public class Lab3Task3 {
    public static void main(String[] args) {
        int data[] = { 10, 12, 50, 45, 98, 32, 2, 78 };
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();
        System.out.println("the position is: " + search(data, n));
    }
    // .................. search() ...............\\
    static int search(int[] data, int n) {
        //int ans = 0;
        for (int i = 0; i < data.length; i++) {
            if (n==data[i]) {
                return i;
            }
        }
        return -1;
    }
}