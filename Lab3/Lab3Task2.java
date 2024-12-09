public class Lab3Task2 {
    public static void main(String[] args) {
        int n = 1000;
        int i, j, m = 0;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {

                //System.out.println(i+","+j);
                m = m + (i * j);
            }
        }
        System.out.println(m);
    }
}