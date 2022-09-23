public class SumOfNumbers {
    private static int GetSum(int a, int b) {
        int sum = 0;

        for (int i = Math.min(a, b); i <= Math.max(a, b); i++) {
            sum += i;
        }
        return a == b ? a : sum;
        //if a == b, return a else return sum
    }


    public static void main(String[] args) {
        System.out.println(GetSum(1, 5));
    }
}
