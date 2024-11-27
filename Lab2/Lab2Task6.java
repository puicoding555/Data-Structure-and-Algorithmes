import java.util.Arrays;
public class Lab2Task6 {
    public static void main(String[] args) {
        char[][] ch = new char[3][];
        ch[0] = new char[1];
        ch[1] = new char[2];
        ch[2] = new char[3];
        Arrays.fill(ch[0], 'A');
        Arrays.fill(ch[1], 'B');
        Arrays.fill(ch[2], 'C');
        for (int i = 0; i < ch.length; i++) {
            System.out.println(printArr(ch[i]));
        }
    }

    static String printArr(char[] arr) {
        String ans = "";
        for (int i = 0; i < arr.length; i++) {
            ans += arr[i] + " ";
        }
        return ans.trim();
    }

}
