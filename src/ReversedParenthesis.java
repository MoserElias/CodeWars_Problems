public class ReversedParenthesis {

    public static int solve(String s) {
        if (s.length() % 2 != 0) return -1;

        //remove valid parenthesis
        while (s.contains("()")) {
            s = s.replace("()", "");
        }
        System.out.println(s); //now only contains invalid parethesis
        int counter = 0;


        for (int i = 1; i < s.length(); i += 2) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                counter++;
            } else {
                counter += 2;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        System.out.println(solve("())((("));
    }
}
