public class ValidParentheses {
    public static boolean validParentheses(String parens) {
        int count = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (parens.charAt(i) == '(' || (int) parens.charAt(i) == 40) {
                count++;
            } else if (parens.charAt(i) == ')' || (int) parens.charAt(i) == 41) {
                count--;
            }
            if (count < 0) return false;
        }
        return count == 0;
    }

    public static void main(String[] args) {
        System.out.println(validParentheses("(dsgdsg))2432"));
    }
}
