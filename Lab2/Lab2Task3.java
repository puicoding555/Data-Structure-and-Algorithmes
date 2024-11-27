import java.util.Arrays;

public class Lab2Task3 {
    public static void main(String[] args) {
        int x[] = { 10, 12, 50, 45, 98, 32, 2 };
        System.out.println(Arrays.binarySearch(x, 2));
        Arrays.sort(x);
        System.out.println(Arrays.binarySearch(x, 2));
    }

    static String printArr(int[] arr) {
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i] + " ";
        }
        return ans;
    }
}