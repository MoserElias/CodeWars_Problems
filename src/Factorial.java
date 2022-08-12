public class Factorial {

    public static int factorial(int n) {
        //return n!
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
