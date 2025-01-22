import java.util.*;

public class PostFixEval {

    protected static double evalPostfix(String express) {
        Stack<Double> stack = new Stack<>();
        // แยก postfix expression ตามช่องว่าง
        String[] tokens = express.split(" ");
        for (String token : tokens) {
            if (isNumeric(token)) {
                stack.push(Double.parseDouble(token));
            } else {

                // ตรวจสอบ operator คำนวณ
                double value1 = stack.pop();
                double value2 = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(value2 + value1);
                        break;
                    case "-":
                        stack.push(value2 - value1);
                        break;
                    case "*":
                        stack.push(value2 * value1);
                        break;
                    case "/":
                        stack.push(value2 / value1);
                        break;
                    default:
                        throw new IllegalArgumentException("Invalid operator: " + token);
                }
            }
        }
        return stack.pop();
    }
    // ตรวจสอบว่า string เป็นตัวเลข
    private static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter postfix expressions (type 'exit' to quit):");

        while (true) {
            System.out.print("> ");
            String input = in.nextLine();
            if (input.equalsIgnoreCase("exit")) {
                break;
            }

            try {
                double result = evalPostfix(input);
                System.out.println("Answer = " + result);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
        in.close();
    }
}
