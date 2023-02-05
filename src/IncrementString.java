import java.math.BigInteger;

public class IncrementString {

    public static String incrementString(String str) {
        if (str.length() < 1) {
            return str + 1;
        }

        if (!Character.isDigit(str.charAt(str.length() - 1))) {
            return str + "1";
        }

        String num = "";
        int count = 0;

        for (int i = str.length() - 1; i >= 0; i--) {
            if (Character.isDigit(str.charAt(i))) {
                num = str.charAt(i) + num;
                count++;
            } else {
                break;
            }
        }

        String subStr = str.substring(0, str.length() - num.length());
        String numbs = new BigInteger(num).add(new BigInteger("1")).toString();

        if (numbs.length() != count) {
            int n = count - numbs.length();
            for (int s = 0; s < n; s++) {
                numbs = "0" + numbs;
            }
        }
        return subStr + numbs;
    }

    public static void main(String[] args) {
        System.out.println(incrementString("foobar0001"));
    }
}
