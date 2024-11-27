import java.util.Scanner;
public class Lab1Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input num
        System.out.print("Num: ");
        int num = scanner.nextInt();
 
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");  
            }
            System.out.println("*");
        }
 
        scanner.close();
    }
}