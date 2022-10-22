import java.util.Arrays;

public class ZywOo {
    public static int sumOfDifference(int[] arr) {
        Arrays.sort(arr);

        //reverse the string
        for (int i = 0; i < arr.length / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }

        int sum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            sum += arr[i] - arr[i + 1];
        }

        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDifference(new int[]{1, 1, 1, 1, 1}));
    }

}
