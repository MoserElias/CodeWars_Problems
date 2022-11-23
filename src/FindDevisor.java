public class FindDevisor {

    public static long numberOfDevisors(int n) {
        long result = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                result++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(numberOfDevisors(5));
    }

}
