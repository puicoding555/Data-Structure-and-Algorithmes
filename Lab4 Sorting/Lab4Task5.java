import java.util.*;
public class Lab4Task5 {
    public static void main(String[] args) {
        int data[]= getData(8);
        int[] d1 = data.clone();
        int[] d2 = data.clone();
        int[] d3 = data.clone();

        System.out.println("++++ boubble sort ++++");
        Lab4Task3.bbSort(d1);
        System.out.println("++++ Selection sort ++++");
        Lab4Task3.selectionSort(d2);
        System.out.println("++++ insert sort ++++");
        Lab4Task3.insertSort(d2);
    }

    public static int[] getData(int n) {
        int[] ans = new int[n];
        Scanner in = new Scanner(System.in); // import java.util.*;
        for (int i = 0; i < ans.length; i++) {
            ans[i] = in.nextInt();
        }
        return ans;
    }// getData
}// class