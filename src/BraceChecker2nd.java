import java.util.Stack;

public class BraceChecker2nd {

    public static boolean isValid(String braces) {
        //crate a new stack
        Stack<Character> stack = new Stack<>();
        for (char c : braces.toCharArray()) {
            //if we have items in our stack and the first item and the current char c is open and closing, remove it
            if (stack.size() > 0 && isClosing(stack.peek(), c)) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }
        return stack.size() == 0;
    }

    private static boolean isClosing(char x, char c) {
        if (x == '{' && c == '}') {
            return true;
        } else if (x == '(' && c == ')') {
            return true;
        } else if (x == '[' && c == ']') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("[(])"));
    }

}
