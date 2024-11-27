import java.util.Arrays;
import java.util.Scanner;
public class Lab2Extra {
    public static void main(String[] args) {
        int max=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("input: ");
        String data = sc.nextLine();
        String[] arr = data.split(",");
        int[] nums = new int[arr.length];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(nums);
       
        System.out.println("Output: " + nums[nums.length-1]);
    }
}
