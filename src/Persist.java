
public class Persist {
    public static int persistence(long n) {
        int count = 0;
        int result = 1;

        String numbers = String.valueOf(n);
        char[] digits = numbers.toCharArray();
        System.out.println(digits);

        while(digits.length > 1) {
            for (int i = 0; i < digits.length; i++) {
                result *= digits[i] - '0';
            }
            numbers = String.valueOf(result);
            digits = numbers.toCharArray();
            count++;
            result = 1;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(persistence(25));
    }

}
