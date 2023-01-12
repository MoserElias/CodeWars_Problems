import java.util.Arrays;

public class AreSame {

    public static boolean comp(int[] a, int[] b) {

        if (a == null || b == null) return false;
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            a[i] = a[i] * a[i];
        }

        //sort both arrays
        Arrays.sort(a);
        Arrays.sort(b);

        //search if different
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
    }
}
