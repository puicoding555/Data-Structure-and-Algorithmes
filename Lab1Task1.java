import java.util.Scanner;

public class Lab1Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //input
        System.out.print("Day ");
        int day = scanner.nextInt();
        
        System.out.print("Month ");
        String month = scanner.next();
        
        System.out.print("Year ");
        int year = scanner.nextInt();
        
        //output
        System.out.println("Day: " + day);
        System.out.println("Month: " + month);
        System.out.println("Year: " + year);
        
        scanner.close();
    }
}