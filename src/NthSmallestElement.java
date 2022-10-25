import java.util.Arrays;

public class NthSmallestElement {
    public static int nthSmallest(final int[] arr, final int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }

    public static void main(String[] args) {
        System.out.println(nthSmallest(new int[]{2, 1, 3, 3, 1, 2}, 3));
    }
}
