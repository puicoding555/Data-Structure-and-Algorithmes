import java.util.*;

public class BracketCheck {
    static boolean isBalanced(String expr) {
        Stack<Character> stack = new Stack<Character>();
        // Traversing the Expression
        for (int i = 0; i < expr.length(); i++) {
            char x = expr.charAt(i); // Push the element in the stack
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue;
            }
            // If character is not opening bracket, then must be closing.
            // So stack cannot be empty at this point.
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check == '{' || check == '[')
                        return false;
                    break;
                case '}':
                    check = stack.pop();
                    if (check == '(' || check == '[')
                        return false;
                    break;
                case ']':
                    check = stack.pop();
                    if (check == '(' || check == '{')
                        return false;
                    break;
            }
        }
        // Check Empty Stack
        return (stack.isEmpty());
    }

    // Driver code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr = sc.nextLine(); /* "([{})]";*/  //"({]}";
        if (isBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}