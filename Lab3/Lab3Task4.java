import java.util.*;
 
public class Lab3Task4 {
    public static void main(String[] args) {
        int data[] = { 10, 12, 50, 45, 98, 32, 2, 78 };
        Arrays.sort(data);
        for (int i: data){
            System.out.print(i + ", ");
        }
        Scanner sc = new Scanner(System.in);
        System.out.print("number: ");
        int n = sc.nextInt();
        System.out.println("the position is: " + binarySearch(data, 0, data.length - 1, n));
    }
 
    static int binarySearch(int arr[], int l, int r, int x) {
 
        if (r >= l) {
 
            int mid = l + (r - l) / 2;
            if (arr[mid] == x)
 
                return mid;
 
            if (arr[mid] > x)
 
                return binarySearch(arr, l, mid - 1, x);
 
            return binarySearch(arr, mid + 1, r, x);
        }
        return -1;
    }
}
