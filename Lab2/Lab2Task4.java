import java.util.Arrays;

public class Lab2Task4 {
    public static void main(String[] args) {
        int x[][] = { { 10, 12, 50 }, { 45, 98, 32, 2 }, { 78, 10 }, { 48, 45, 80 } };
        Arrays.sort(x[1]);
        System.out.println(printArr(x[1]));
    }

    static String printArr(int[] arr) {
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i] + " ";
        }
        return ans;
    }
}
