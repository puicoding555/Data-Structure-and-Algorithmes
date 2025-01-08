import java.util.*;

public class TestLinkedStack {
    public static void main(String[] args) {
        LinkedStack mydata = new LinkedStack();
        for (int i = 1; i <= 5; i++) {
            mydata.push(input());
        }
        System.out.println(mydata.toString());
        System.out.println("size = " + mydata.size());
        System.out.println(mydata.peek());
        System.out.println(mydata.pop());
        System.out.println(mydata);
        System.out.println("size = " + mydata.size());
        mydata.pop();
        mydata.pop();
        System.out.println(mydata);
    }

    private static Object input() {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        return s;
    }
}// class