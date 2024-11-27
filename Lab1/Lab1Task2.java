import java.util.Scanner;
 
public class Lab1Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //input number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
 
        //input even
        System.out.println("Odd numbers less than " + num + ":");
       
        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) { 
                System.out.print(i + " "); //output even
            }
        }
       
        //close scanner
        scanner.close();
    }
}