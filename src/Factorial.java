public class Factorial {

    public static int factorial(int n) {
        //return n!
        //throw exception if n < 0 or n > 12
        if (n < 0 || n > 12) {
            throw new IllegalArgumentException("n must be between 0 and 12");
        }

        if (n == 0) {
            return 1;
        }

        //recursive call to calculate n!
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
