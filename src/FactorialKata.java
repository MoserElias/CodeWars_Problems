public class FactorialKata {

    public static long factorial(int n) {
        //exit conditions from recursive call
        if (n == 0) {
            return 1;
        }
        //recursive call to calculate factorial
        return n * factorial(n - 1);
    }


    public static void main(String[] args) {
        System.out.println(factorial(3));
    }
}
