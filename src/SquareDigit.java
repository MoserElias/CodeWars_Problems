import java.util.Arrays;

public class SquareDigit {
    public static int squareDigits(int n) {
        String temp = Integer.toString(n);
        int[] myNumber = new int[temp.length()];

        for (int i = 0; i < temp.length(); i++) {
            myNumber[i] = temp.charAt(i) - '0';
        }

        for (int i = 0; i < myNumber.length; i++) {
            myNumber[i] = (int) Math.pow(myNumber[i], 2);
        }
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < myNumber.length; i++) {
            s.append(myNumber[i]);
        }
        return Integer.parseInt(s.toString());

    }

    public static void main(String[] args) {
        System.out.println(squareDigits(9119));
    }
}
