import java.util.*;
 
public class TestMyQueue {
    public static void main(String[] args) {
        MyQueue q = new MyQueue(10);
        for (int i = 1; i <= 5; i++) {
            q.enqueue(input());
        }
        System.out.println(q);
        System.out.println("dequeue:" + q.dequeue());
        System.out.println(q);
        System.out.println("dequeue: " + q.dequeue());
        System.out.println("dequeue: " + q.dequeue());
        System.out.println(q);
        q.enqueue(input());
        System.out.println(q);
    }
 
    private static Object input() {
        Scanner in = new Scanner(System.in);
        System.out.print("input string to MyQueue:");
        String s = in.nextLine();
        return s;
    }
}