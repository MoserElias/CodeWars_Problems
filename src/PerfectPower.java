import java.util.Arrays;

public class PerfectPower {

    public static int[] isPerfectPower(int n) {
        if (n < 0) {
            return null;
        }
        for (int i = 2; ; i++) {
            int root = Math.round(Math.round(Math.pow(n, 1.0 / i)));
            if (root < 2) {
                return null;
            } else if (Math.pow(root, i) == n) {
                return new int[]{root, i};
            }
        }
    }


    public static void main(String[] args) {
        System.out.println(Arrays.toString(isPerfectPower(9)));
    }
}
