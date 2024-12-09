public class Lab3Task1 {
    public static void main(String[] args) {
        int n = 5;
        int count = 0;
        for (int i = 1; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                for (int k = j + 1; k <= n; k++) {

                    System.out.println(i + "," + j + "," + k + " ");
                    count++;

                }
            }
        }
        System.out.println("count= "+ count);
    }
}
