import java.util.Arrays;

public class LengthAndTwoValues {

    public static String[] alternate(int n, String firstValue, String secondValue) {
        String[] result = new String[n];
        for (int i = 0; i < result.length; i++) {
            if (i % 2 == 0) {
                result[i] = firstValue;
            } else {
                result[i] = secondValue;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(alternate(10, "blue", "red")));
    }
}
