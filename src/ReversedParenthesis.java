public class ReversedParenthesis {

    public static int solve(String s) {
        //make balanced parenthesis
        int initialLength = s.length();
        int counter;
        if (s.length() <= 2) {
            counter = 0;
            if (s.charAt(0) == '(' && s.charAt(s.length() - 1) != ')') {
                counter += 1;
            } else if (s.charAt(0) != '(' && s.charAt(s.length() - 1) != ')') {
                counter += 2;
            } else if (s.charAt(0) != '(' && s.charAt(s.length() - 1) == ')') {
                counter += 1;
            }
        } else {
            counter = 0;
            while (s.length() > 1) {
                //System.out.println(s.charAt(0) + " " + s.charAt(s.length() - 1));
                if (s.charAt(0) == '(' && s.charAt(s.length() - 1) != ')') {
                    counter += 1;
                } else if (s.charAt(0) != '(' && s.charAt(s.length() - 1) != ')') {
                    counter += 2;
                } else if (s.charAt(0) != '(' && s.charAt(s.length() - 1) == ')') {
                    counter += 1;
                }
                s = s.substring(1, s.length() - 1);
            }
        }
        //System.out.println(counter);

        if (counter == 1 && initialLength <= 3) {
            return -1;
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(solve("())((("));
    }
}
