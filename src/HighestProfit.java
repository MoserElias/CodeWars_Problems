import java.util.Arrays;

public class HighestProfit {

    public static int[] minMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return new int[]{min, max};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(minMax(new int[]{1, 2, 3, 4, 5})));
    }
}
