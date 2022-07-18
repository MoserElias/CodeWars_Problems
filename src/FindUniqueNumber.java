import java.util.Arrays;

public class FindUniqueNumber {
    public static double findUniq(double arr[]) {
        Arrays.sort(arr); //Tim Sort
        return arr[0] == arr[1] ? arr[arr.length - 1] : arr[0];
    }

    public static void main(String[] args) {
        System.out.println(findUniq(new double[]{1, 1, 1, 2, 1, 1}));
    }
}
