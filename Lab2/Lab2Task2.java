import java.util.Arrays;

public class Lab2Task2 {
    public static void main(String[] args) {
        int[] x = { 10, 12, 50, 45, 98, 32, 2 };
        Arrays.sort(x);
        System.out.println(printArr(x));
    }

    static String printArr(int[] arr) {
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i] + " ";
        }
        return ans;
    }
}