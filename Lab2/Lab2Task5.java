import java.util.HashSet;
import java.util.Scanner;

public class Lab2Task5 {
    public static void main(String[] args) {
        HashSet<String> coupon = new HashSet<String>();
        coupon.add("A001"); coupon.add("A002"); coupon.add("A003"); coupon.add("A004"); coupon.add("A005"); 
        coupon.add("A006"); coupon.add("A007"); coupon.add("A008"); coupon.add("A009"); coupon.add("A010");
        String menuList[] = { "Thai Coffee", "Latte", "Espresso", "Mocha", "Cappucino" };
        int price[] = { 50, 60, 70, 80, 85 };
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("======= Coffee List ======= ");
            for (int i = 0; i < menuList.length; i++) {
                System.out.println("[" + (i + 1) + "] " + menuList[i] + "\t---- " + price[i] + " Baht");
            }
            System.out.println("[6] Exit");

            System.out.print("Press number: ");
            int choice = in.nextInt();
            if (choice == 6) {
                break;
            } else {
                System.out.print("Discount Code (Don't have please 0):");
                String code = in.next();
                if (coupon.contains(code)) {
                    System.err.println("Total price: " + (0.9 * price[choice]) + " Baht");
                    coupon.remove(code);
                } else {
                    System.err.println("Total price: " + (price[choice - 1]) + " Baht");

                }
            }
        }
        System.out.println("----Good Bye----");
    }
}