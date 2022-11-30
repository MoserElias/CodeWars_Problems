public class ArithmeticFunction {

    public static int arithmetic(int a, int b, String operator) {
        if (operator == "add") {
            return a + b;
        } else if (operator == "subtract") {
            return a - b;
        } else if (operator == "multiply") {
            return a * b;
        } else {
            return a / b;
        }
    }

    public static void main(String[] args) {
        System.out.println(arithmetic(5,2, "add"));
    }
}
